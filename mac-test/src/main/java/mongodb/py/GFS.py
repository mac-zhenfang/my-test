#encoding=utf-8 

from pymongo import Connection
from gridfs import *
from pymongo.code import Code
import StringIO 
import threading, time 
class GFS:
    # initialization
    c = None
    db = None
    fs = None
    instance = None
    host = None
    port = None
    locker = threading.Lock()
    
    def __init__(self, host, port):
        print "__GFS init__"
        self.host  = host
        self.port = port
        GFS._connect(host, port)
        print "server info " + " * " * 40 
        print GFS.c.server_info
    #Singleton
    @staticmethod
    def getInstance(host, port):
        GFS.locker.acquire()
        try:
            GFS.instance
            if not GFS.instance:
                GFS.instance = GFS(host, port)
            return GFS.instance
        finally:
            GFS.locker.release()
    #write image
    def put(self,name,imageUrl,format="png",mime="image"):
        gf = None
        data = None
        try:
            f = file(imageUrl, "r")
            data  = f.read()
            name = "%s.%s" % (name,format)
            args = {}
            args["_id"] = name
            args["name"] = name
            args["files_id"] = name
            args["file_id"] = name
            args["filename"] = name
            args["md5"] = name
            args["content_type"] = "%s/%s" % (mime,format)
            print "name is %s" % name
            GFS.fs.put(data, **args)
        except Exception,e:
            print e
        finally: 
            try:  
                if f:
                    f.close()  
            finally:  
                GFS.c = None  
                GFS._connect(self.host, self.port) 
    #get image
    def get(self, _id):
        gf = None
        try:
            gf  = GFS.fs.get(_id)
            print "get grif fs" + gf
            im = gf.read()
            description = {}
            description["name"] = name
            description["upload_date"] = gf.upload_date
            description["content_type"] = gf.content_type 
            description["metadata"] = gf.metadata
            return (im, description)
        except Exception, e:
            print e
            return (None, None)
        finally:
            if gf and not gf.closed:
                gf.close()
    #get image list
    def list(self):
        return GFS.fs.list()
    #remove file
    def remove(self, name):
        GFS.fs.remove(name)

    @staticmethod 
    def _connect(host, port):
        if  not GFS.c:
            GFS.c = Connection(host,port)
            GFS.db = GFS.c["gfs"]
            GFS.fs = GridFS(GFS.db) 
def main():
    gfs = GFS.getInstance("10.224.178.104", 27019)
    gfs.put("fakeimage555", "F:/2.png")
    print gfs.list()
    print gfs.get("fakeimage555")
main()


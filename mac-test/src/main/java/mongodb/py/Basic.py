from pymongo import Connection
from pymongo import collection
from pymongo.code import Code
from Conn import Conn
class Basic:
    conn = None
    host = "10.224.178.104"
    port = 27019
    # 1 mill mp user
    # 0.002 mill mp2 user2
    dbName = "mp2"
    connectionName = "user2"

    db = None
    collection = None;
    def __init__(self):
        self.conn = Conn.getInstance(self.host, self.port);
        self.db = self.conn.getDB(self.dbName);
        self.collection = self.db[self.connectionName];
    def testList(self):
        print self.collection.count();
#        for user in self.collection.find():
#            print user
    def testQuery(self):
        for item in self.collection.find():
            print item;
    def prepareData(self):        
        i=0;
        while i<20000:
            post = {"name" : "daniel", "gender": "male", "userid":i};
            i+=1;
            self.collection.insert(post) 
        #print alist
        print "insert done";
    def basic_map_reduce_test(self):
        map = Code(open('./map.js','r').read());        
        reduce = Code(open('./reduce.js','r').read());
        result = self.collection.map_reduce(map, reduce, {"query":{}});
       # result = self.collection.map_reduce(map, reduce);
        print result;
        collection = self.db[result["result"]];
        for item in collection.find():
            print item;
        
basic = Basic();

#basic.prepareData();
basic.testList();
basic.basic_map_reduce_test();
#basic.testQuery();
        
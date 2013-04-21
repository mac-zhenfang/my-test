from pymongo import Connection
from pymongo.code import Code
import StringIO 
import threading, time
class ConnectionException(Exception):
    def __init__(self, comment):
        Exception.__init__(self);
class Conn:
    host = None
    port = None
    instance = None
    conn = None
    locker = threading.Lock()
    def __init__(self, host, port):
        self.host = host;
        self.port = port;
        self._connect();
    @staticmethod
    def getInstance(host, port):
        Conn.locker.acquire()
        try:
            Conn.instance
            if not Conn.instance:
                Conn.instance = Conn(host, port)
            return Conn.instance
        finally:
            Conn.locker.release()
    def _connect(self):
        if self.host == None or self.port == None:
            raise ConnectionException("host or port is null.")
        self.conn = Connection(self.host,self.port)
    def getDB(self, dbName):
        if self.conn == None:
            raise ConnectionException("fail to get connection.")
        db = self.conn[dbName]
        return db;
        
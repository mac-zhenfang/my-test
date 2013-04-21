
from gearman import *
import gearman, os, StringIO, time
#import SofficeDoc2Pdf

class gearmanBase():

   # def __init__(self):
       # self.worker = None
       # self.job_type=None

    def connect_woker(self):
        self.worker=gearman.GearmanWorker(["127.0.0.1"])

    def send_percent(self, numerator=5):
        self.job.status(int(numerator), 100)

    def register_function(self):
        self.worker.register_function(self.job_type, self.job_run)

    def start_work(self):
        self.worker.work()

    def job_run(self, job=None):
        """overide"""
        
        ### get the source file's path from job's arg
        path  = job.arg
        
        print path
        print '-----------------------------------------'

        count = path.rindex('/', 0, len(path))
        directory = path[0: count+1]
        fileName = path[count+1:len(path)]
        SWFFilePath = '/usr/local/apache-tomcat/webapps/wbxdmi/files/'+fileName + '.swf'

        print directory
        print fileName

        try:
		if not path.endswith('.pdf'):
		    ######## convert to .pdf format ########
		    command = "unoconv -f pdf -o "+directory + "pdf " + path
		    print command
		    starttime = time.time() * 1000
		    os.system(command)
		    endtime = time.time() * 1000
		    print job.arg + " convert to pdf, waste time is %dms!!" % (endtime - starttime)
		else:
		    command = 'cp ' + path + ' ' + directory + 'pdf/tmp.pdf'
		    print command
		    os.system(command)

		######## convert to .swf format ########
		buf = StringIO.StringIO()
		command = "pdf2swf " + directory +"pdf/*.pdf " + SWFFilePath
		print command
		starttime = time.time() * 1000
		os.system(command)  ###### execute the command ######
		endtime = time.time() * 1000
		print path + " convert to swf, waste time is %dms!!" % (endtime - starttime)
	       
		######## delete the pdf file. ########
	        command = "rm -f " + directory +"pdf/*"
	        os.system(command)
	      
              #	fp = open(SWFFilePath, 'r')

	      # return 'E:/test.swf'
	      #	return fp.read()
	        return 'files/'+fileName+'.swf'
        except Exception:
	       print 'Converting meet error...'

    def set_job_type(self):
        self.job_type="preview"

    def run(self):
        self.set_job_type()
        self.connect_woker()
        self.register_function()
        self.start_work()

worker=gearmanBase()
worker.run()

import os
import time
import fnmatch
import string

from pyExcelerator import *
# A interesting script Used to serperate the log from server to server to date to date.
# Author: Mac Fang
logSourceFolder = "F:\\DMS\\log\\log_per_date"
logTargetFolder = ""
error_patterns = [
	"WAPIHelper: Exception: nullsession Failed",
	"WAPIHelper: cloneSession: cloneSession Failed",
	"WBXCJournal: Lock held by",
	"ExportContextImpl: ClientAbortException",
	"WBXCConnectionRecoveryManager: could not execute statement",
	"WBXCDbDataStore: error loading datastore record sql data",
	"WBXCDefaultHandler: setModifiedProp failed",
	"WAPIService: Null Session Failed",
	"WBXCLoginModule: Exception: Exception: null"
]

# errors collection
#find all folders of a server under the log folder
def findServers(parentFolder, ws):
	#sourcefolder = "F:\\DMS\\log\\log_per_date"
	folderList = os.listdir(parentFolder)
	for folderName in folderList:
		findFiles(parentFolder + "\\" + folderName, ws)
	return 0
def findDate(parentFolder, w):
	
	folderList = os.listdir(parentFolder)
	for folderName in folderList:
		ws = w.add_sheet(folderName)
		findServers(parentFolder + "\\" + folderName, ws)
	return 1
# find all the logs in the folder
def findFiles(folderName, ws):
	fileList = os.listdir(folderName)
	for filename in fileList:
		absoluteFolderName = folderName + "\\" + filename
		if filename.find("error") > -1:
			print absoluteFolderName
			exportToExcel(absoluteFolderName, ws)
	return 1
# count all errors from one log
def findErrors(sourcefile):
	result = [0,0,0,0,0,0,0,0,0];
	#sourcefile = "F:\\DMS\\log\\log_per_date\\2009-02-17\\11\\wbxdms.error.2009-02-17.log"
	#test_target_file = "F:\\DMS\\log\\result.txt"
	f = file(sourcefile, "r")
	k = 0;
	while 1:
		line = f.readline()

		for i, _pattern in enumerate(error_patterns):
				#print (i)
				if line.find(_pattern) > -1:
					result[i]+=1
		#print (k)
		#if k%5000==0:
		#	print (result)
		#if result[0] >=158:
			#print ("issue ? " + line)
		#print (k)
		k+=1
		if not line: 
			break
	
	f.close()
	
	return result

#setup Excel
def exportToExcel(sourcefile, ws):
	
	
	
	
	#output = []

	server = sourcefile.split("\\")[5]
	
	if server.find("0")==0:
		server = server[1:]
	server = int(server) - 1
	
	#if server
	file = sourcefile.split("\\")[6]
	#if os.path.isfile(sourcefile) == False:
	
	result = findErrors(sourcefile)
		
	#output.append('===================================================================\n')
	#output.append(date + "\n")
	#output.append('Server: '+server + "\n")
	#output.append('------------------------------\n')
	for i, value in enumerate(result):
		
		#_error = error_patterns[i]
		_frequen = str(result[i])
		ws.write(server, i, result[i])
		#output.append('ERROR: ' + _error + "\n")
		#output.append("Frenquency: " + _frequen + "\n")
		#_content+= 'ERROR: ' + _error + "\n"
		#_content+= "Frenquency: " + _frequen + "\n"
	
	#output.append('------------------------------\n')
	#output.append('===================================================================\n')
	#print(output.tostring())
	#output = string.join(output, "\n")
	
	#f.write(output);
	#f.close()
	
	print ("Done file : " +sourcefile )
	return 1
#start finding
def main():
	
	print ("start excel ")
	#w = Workbook()
	#ws = w.add_sheet('1')
	#ws.write(0, 1, "2")
	#w.save('mini.xls')
	
	#exportToExcel()
	w = Workbook()
	test_target_file = "F:\\DMS\\log\\result.xls"
	
	sourcefile = "F:\\DMS\\log\\log_per_date"
	findDate(sourcefile, w)
	w.save(test_target_file)
	#outstr = writeToFile(sourcefile, test_target_file)
	#text = ["1","2","3","4"]
	#text = string.join(text, '\n')

	#print outstr
	#folder = sourcefile.split("\\")[5]
	#file= sourcefile.split("\\")[6]
	#print (folder)
	#print (file)
	#sourcefolder = "F:\\DMS\\log\\log_per_date"
	#findDate(sourcefolder)
	return True
	
main()
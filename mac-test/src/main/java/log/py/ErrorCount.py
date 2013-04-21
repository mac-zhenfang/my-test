import os
import time
import fnmatch
import string
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
def findServers(parentFolder):
	#sourcefolder = "F:\\DMS\\log\\log_per_date"
	folderList = os.listdir(parentFolder)
	for folderName in folderList:
		findFiles(parentFolder + "\\" + folderName)
	return 0
def findDate(parentFolder):
	
	folderList = os.listdir(parentFolder)
	for folderName in folderList:
		findServers(parentFolder + "\\" + folderName)
	return 1
# find all the logs in the folder
def findFiles(folderName):
	fileList = os.listdir(folderName)
	for filename in fileList:
		absoluteFolderName = folderName + "\\" + filename
		if filename.find("error") > -1:
			print absoluteFolderName
			writeToFile(absoluteFolderName, "F:\\DMS\\log\\result.txt")
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
#write result into file
def writeToFile(sourcefile, filetarget):
	output = []
	date = sourcefile.split("\\")[4]
	server = sourcefile.split("\\")[5]
	file = sourcefile.split("\\")[6]
	#if os.path.isfile(sourcefile) == False:
	f = open(filetarget, "a+w")
	result = findErrors(sourcefile)
		
	
	
	#_content= ""
	#_content += date + "\n"
	#_content += '===================================================================\n'
	#_content += 'Server: '+server
	#_content += '------------------------------\n'
	output.append('===================================================================\n')
	output.append(date + "\n")
	output.append('Server: '+server + "\n")
	output.append('------------------------------\n')
	for i, value in enumerate(result):
	
		_error = error_patterns[i]
		_frequen = str(result[i])
		output.append('ERROR: ' + _error + "\n")
		output.append("Frenquency: " + _frequen + "\n")
		#_content+= 'ERROR: ' + _error + "\n"
		#_content+= "Frenquency: " + _frequen + "\n"
	
	output.append('------------------------------\n')
	output.append('===================================================================\n')
	#print(output.tostring())
	output = string.join(output, "\n")
	f.write(output);
	f.close()
	print ("Done file : " +sourcefile )
	return 1

#start finding
def main():
	print ("start")
	test_target_file = "F:\\DMS\\log\\result.txt"
	
	#sourcefile = "F:\\DMS\\log\\log_per_date\\2009-02-17\\11\\wbxdms.error.2009-02-17.log"
	
	#outstr = writeToFile(sourcefile, test_target_file)
	#text = ["1","2","3","4"]
	#text = string.join(text, '\n')

	#print outstr
	#folder = sourcefile.split("\\")[5]
	#file= sourcefile.split("\\")[6]
	#print (folder)
	#print (file)
	sourcefolder = "F:\\DMS\\log\\log_per_date"
	findDate(sourcefolder)
	return True
	
main()
import os
import time
import fnmatch

# A interesting script Used to serperate the log from server to server to date to date.
# Author: Mac Fang
logSourceFolder = "D:\\DMS\\log\\prod_Log_2009_02_19"
logTargetFolder = "D:\\DMS\\log\\test_prod"

startTime = time.strftime('%Y%m%d')
if os.path.isdir(logSourceFolder) != True:
	print ("Error: %s is not a directory" % (logSourceFolder))
	exit()

# get the file list from source folder
folderList = os.listdir(logSourceFolder)
#print(folderList)
#print("Has files %s in the source folder %s " & logSourceFolder, filelist)
for folderName in folderList:
	absoluteFolderName = logSourceFolder + "\\" + folderName
	#print(absoluteFolderName)
	if os.path.isdir(absoluteFolderName):
		fileList = os.listdir(absoluteFolderName)
		#print (fileList)
		for name in fileList:
			# start create the folder D:\\DMS\\log\\test_prod\\2009-02-19
				if name.find("error") == -1:
					dateName = name.split(".")[1]
					print ("date time is " + dateName)
					destinationDir = logTargetFolder + "\\" + dateName
					if os.path.isdir(destinationDir) == False:
						os.mkdir(destinationDir)
					print (destinationDir)
					# now start to create D:\\DMS\\log\\test_prod\\2009-02-19\\01
					if os.path.isdir(destinationDir) == True:
						destFolderName = destinationDir + "\\" + folderName
					if os.path.isdir(destFolderName) == False:
						os.mkdir(destFolderName)
				# End create folder	
print (" ======================== Folder created ========================")		

print (" ======================== Start Copy ========================")		

for folderName2 in folderList:
	absoluteFoldername2 = logSourceFolder + "\\" + folderName2
	if os.path.isdir(absoluteFoldername2): 
		fileList2 = os.listdir(absoluteFoldername2)
		for name2 in fileList2:
			if name2.find('wbxdms') != -1 and name2.find('log')!= -1:
				print (name2)
				theDateTimePr = ""
				if name2.find("error") == -1:
					theDateTimePr = name2.split(".")[1]
				else :
					theDateTimePr = name2.split(".")[2]
				# start copy
				if os.path.isdir(logTargetFolder + "\\" + theDateTimePr + "\\" + folderName2):
					srcFilename2 = absoluteFoldername2 + "\\" + name2
					if os.path.isfile(srcFilename2):
						desFilename2 = logTargetFolder + "\\" + theDateTimePr + "\\" + folderName2 + "\\" + name2
						copy_command = "copy %s %s" % (srcFilename2, desFilename2)
						if os.system(copy_command) == 0:
							print ('Successful backup to copy from', srcFilename2, 'to' ,desFilename2)
						else:
							print ('Fail to copy' + srcFilename2 + 'to' + desFilename2)
		print ("====================== done folder ================ " + folderName2)						
print (" ======================== Done ========================")		



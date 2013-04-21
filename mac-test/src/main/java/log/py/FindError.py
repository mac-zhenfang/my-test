def findErrors(sourcefile, targetFile):
	#result = [0,0,0,0,0,0,0,0,0];
	print "start"
	result = [];
	#sourcefile = "F:\\DMS\\log\\log_per_date\\2009-02-17\\11\\wbxdms.error.2009-02-17.log"
	#test_target_file = "F:\\DMS\\log\\result.txt"
	f = file(sourcefile, "r")
	f2 = open(targetFile, "a+w")
	k = 0;
	while 1:
		line = f.readline()
		#print line;
		if line.find("[RMI TCP Connection(16087)-10.224.95.42]") > -1:
			f2.write(line);	
		#if line.find("[RMI TCP Connection(66)-10.224.95.41]") > -1:
			#f2.write(line);
		#if line.find("[RMI TCP Connection(84)-10.224.95.41]") > -1:
			#f2.write(line);	
		#if line.find("[RMI TCP Connection(4)-10.224.95.41]") > -1:
			#f2.write(line);	
		#if line.find("success acquire wirte Lock") > -1:
			#f2.write(line);	
		#print (k)
		#if k%5000==0:
		#	print (result)
		#if result[0] >=158:
			#print ("issue ? " + line)
		#print (k)
		if not line: 
			break
	print "end"
	f.close()
	
def main():
	findErrors("F:\\EP-Logs\\wbxdms.2009-11-06.log", "F:\\EP-Logs\\result-rmi.2009-11-06.RMI_16042.log");

main()
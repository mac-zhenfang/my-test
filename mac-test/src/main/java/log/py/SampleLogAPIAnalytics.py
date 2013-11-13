import os
import fnmatch
import string
import random
import time

sampleLog = "1381450441,SM,S,202.12.23.34,meetings-api.webex.com,beea24c7e93c56007a7eb4428bdba198,7c4861d75c6c71811337.6259e658a4e04430,WebEx11_7c4861d75c6c71811337.6259e658a4e04430_2,http://www.webex.com/signup.html,Jakarta Commons-HttpClient/3.1,43B12854320E11E3ACE53B5D6188709B,UB3AR9JK516SFOLGVU9CWI6XA8-1BZ,GE,operatorSiteURL,UB3AR9JK516SFOLGVU9CWI6XA8-1BZ,GE,csgalpha-w11-api.webex.com,mt,M9SD09H2HGZS8RYEL0BOVHN0GY-1BZ,S,WAPI,200,TokenInvalid,3000";
event_type_list = ["SM", "AINV", "VOT", "LATT", "Aatt", "Acbh", "Acon", "Ainv", "DMC", "Dpcn"]
eventTerm = "S"
client_ips = ["202.12.23.31", "202.12.23.32", "202.12.23.33"]
client_ids = ["beea24c7e93c56007a7eb4428bdba198", "beea24c7e93c56007a7eb4428bdba197", "beea24c7e93c56007a7eb4428bdba196"]
req_dns = "meetings-api.webex.com"
transaction_ids = ["7c4861d75c6c71811337.6259e658a4e04430", "7c4861d75c6c71811337.6259e658a4e04431", "7c4861d75c6c71811337.6259e658a4e04432"]
tracking_codes = ["WebEx11_7c4861d75c6c71811337.6259e658a4e04430_1", "WebEx11_7c4861d75c6c71811337.6259e658a4e04430_2", "WebEx11_7c4861d75c6c71811337.6259e658a4e04430_3"]
referer = "http://www.webex.com/signup.html"
agent = "Jakarta Commons-HttpClient/3.1"
GUID = "43B12854320E11E3ACE53B5D6188709B"
operatorUserID = "UB3AR9JK516SFOLGVU9CWI6XA8-1BZ"
operatorOrgID = "GE"
operatorSiteURL = "csgalpha-w11-api.webex.com"
targetUserID = "UB3AR9JK516SFOLGVU9CWI6XA8-1BZ"
targetOrgID = "GE"
targetSiteURL = "csgalpha-w11-api.webex.com"
targetObjectType = "mt"
targetObjectID = "M9SD09H2HGZS8RYEL0BOVHN0GY-1BZ"
targetObjectDesc = "S"
downstream = "WAPI"
responseCode = "200"
ExceptionKey = "TokenInvalid"
costTime = "300"
def genRandomByArrLen(arrLen):
    return random.randint(0, arrLen - 1)
def getRandDomFromArr(arr):
    #print (arr, len(arr));
    return arr[genRandomByArrLen(len(arr))]
def printLog():
    a = [int(time.time()), getRandDomFromArr(event_type_list), eventTerm, getRandDomFromArr(client_ips), getRandDomFromArr(client_ids), req_dns, getRandDomFromArr(transaction_ids), getRandDomFromArr(tracking_codes), referer, agent, GUID, operatorUserID, operatorOrgID, operatorSiteURL, targetUserID, targetOrgID, targetSiteURL, targetObjectType, targetObjectID, targetObjectDesc, downstream, responseCode, ExceptionKey, costTime]
    retStr = "%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s" % tuple(a)
    retStr+="\r\n"
    return retStr;
def writeLog(filetarget, infinite, timesToStop,sleepTime):
    f = open(filetarget, "w")
    i=0;
    while 1:
        i+=1;
        time.sleep(sleepTime);
        str = printLog();
        f.write(str);
        timesToPrint = 1 / sleepTime
        if(i % timesToPrint == 0):
            print ("lines write into" , infinite, timesToStop, i)
        if(infinite==False and  i >= timesToStop):
            print("i am here");
            break
    f.close()
    return 1
def main():
    log_target =  raw_input('input the place you want to write the log into: \n')
    lines = int(raw_input('how many lines do you want to input into the log (0 euals infinite): \n'))
    timesToSleep = int(raw_input('What is the speed you want to have, 1 means in KB/s, 2 means in MB/s (default as KB/s): \n'))
    sleepTime = 0.1
    if(timesToSleep == 2):
        sleepTime = 0.001;
    print("Example Log", printLog());
    infinite = False
    if(lines == 0):
        infinite = True
    writeLog(log_target,infinite,lines, sleepTime)
    return True;
main();

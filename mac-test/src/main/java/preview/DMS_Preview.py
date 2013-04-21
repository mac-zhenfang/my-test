import uno,os,time,datetime
from com.sun.star.beans import PropertyValue
import web, string, StringIO, time
""" 
    Here is the sequence of things the lines do:
    1.  convert the file into pdf
    2.  convert the pdf into swf
    *if the input is a.doc
    *the pdf will be a.pdf
    *the swf will be a.swf
"""

class preview:
    localContext = None
    resolver = None
    export_format = 'writer_pdf_Export'
    smgr = None
    desktop = None
    loader = None
    doc = None
    url_input=None
    url_output=None
    def __init__(self):
        self.url_input=input
        self.url_output=output
        self.localContext = uno.getComponentContext()
        self.resolver = self.localContext.ServiceManager.createInstanceWithContext(
                "com.sun.star.bridge.UnoUrlResolver", self.localContext)
        self.ctx = self.resolver.resolve("uno:socket,host=localhost,port=8100;urp;StarOffice.ComponentContext")
        self.smgr = self.ctx.ServiceManager
        self.desktop = self.smgr.createInstanceWithContext("com.sun.star.frame.Desktop", self.ctx)
    def convert2Pdf(self, input, output):
        #load files
        properties = []
        p=PropertyValue()
        p.Name = "Hidden"
        p.Value = True
        properties.append(p)
        self.doc = self.desktop.loadComponentFromURL(input, "_default", 0, tuple(properties))
        outproperties = (
            PropertyValue( "FilterName" , 0, self.export_format , 0 ),
            PropertyValue( "Overwrite" , 0, True , 0 ),
            PropertyValue( "Hidden",0, True,0))
        #save to pdf
        try:
            self.doc.storeToURL(output, outproperties)
        except:
            print "Error !!!"
        finally:
            self.doc.dispose()
    def convert2Swf(self, pdfUrl, swfUrl):
        os.system("pdf2swf " + pdfUrl + " " + swfUrl)
    def post(self, url):
        start = time.time()
        ps = url[10:].split('&')
        path = ""
        inputPath = ""
        pdfPath = ""
        swfPath = ""
        for s in ps:
            ##### get the physical path from url ####
            if(s.startswith('path')):
                inputPath = s.split('=')[1]
                continue
        if(path.endswith('\.(.*)')):
             path = inputPath.split('.')[0]
        pdfPath = path + ".pdf"
        swfPath = path + ".swf"
        print "start to convert to PDF"
        self.convert2Pdf(inputPath, pdfPath)
        print "----------- done PDF ----------------" + time.time() - start
        start = time.time()
        print "start to convert to swf"
        self.convert2Pdf(pdfPath, swfPath)
        print "----------- done swf ----------------" + time.time() - start
        return swfPath
urls = ('/preview', 'preview')

webApp = web.application(urls, globals())
application = webApp.wsgifunc()
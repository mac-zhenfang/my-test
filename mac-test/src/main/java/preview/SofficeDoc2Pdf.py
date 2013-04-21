import uno,os,time,datetime
from com.sun.star.beans import PropertyValue

class SofficeDoc2Pdf:
    """ Here is the sequence of things the lines do:
    1.  get Desktop of Openoffice line 25
    2.  convert """
    localContext = None
    resolver = None
    export_format = 'writer_pdf_Export'
    smgr = None
    desktop = None
    loader = None
    doc = None
    url_input=None
    url_output=None
    def __init__(self, input, output):
        self.url_input=input
        self.url_output=output
        self.localContext = uno.getComponentContext()
        self.resolver = self.localContext.ServiceManager.createInstanceWithContext(
                "com.sun.star.bridge.UnoUrlResolver", self.localContext)
        self.ctx = self.resolver.resolve("uno:socket,host=localhost,port=8100;urp;StarOffice.ComponentContext")
        self.smgr = self.ctx.ServiceManager
        self.desktop = self.smgr.createInstanceWithContext("com.sun.star.frame.Desktop", self.ctx)
        #self.loader = self.smgr.createInstanceWithContext("com.sun.star.frame.XComponentLoader", self.desktop)
        #load files
        properties = []
        p=PropertyValue()
        p.Name = "Hidden"
        p.Value = True
        properties.append(p)
        
        self.doc = self.desktop.loadComponentFromURL(self.url_input, "_default", 0, tuple(properties))
    def convert2pdf(self):
        starttime = time.time() * 1000
        outproperties = (
            PropertyValue( "FilterName" , 0, self.export_format , 0 ),
            PropertyValue( "Overwrite" , 0, True , 0 ),
            PropertyValue( "Hidden",0, True,0))
        #save files
        try:
            self.doc.storeToURL(self.url_output, outproperties)
            endtime = time.time() * 1000
            
            print endtime - starttime
        except:
            print "Error !!!"
        finally:
            self.doc.dispose()
    def convert2swf(self):
        swftime = time.time() * 1000
        os.system("pdf2swf /home/mac/preview/test1111.pdf /home/mac/preview/HiveHBase-HUG10.swf");
        endtime = time.time() * 1000
            
        print endtime - swftime
tool = SofficeDoc2Pdf("file:///home/mac/preview/HiveHBase-HUG10.ppt","file:///home/mac/preview/test1112.pdf")
            
tool.convert2pdf()
tool.convert2swf()
""" 
    This class is responsible for get the http request dispatched by Nginx server,
    and then convert according to url's information, response back.

    Copyright (c) WebEx Inc. All Rights Reserved.
    Author: Truman.
    Since:  2010-12-7
    Version: 1.0

"""

from PIL import Image
import web, string, StringIO, time

class convert:

    def POST(self, url):
        
        start = time.time()
        ps = url[10:].split('&')

        for s in ps:
            ##### get the physical path from url ####
            if(s.startswith('path')):
                path = s.split('=')[1]
                continue

            #### get the target thumbnail's height ####
            if(s.startswith('height')):
                height = string.atoi(s.split('=')[1])
                continue

            #### get the target thumbnail's width ####
            if(s.startswith('width')):
                width = string.atoi(s.split('=')[1])
                continue

        size = (height, width)
        buf = StringIO.StringIO()
        srcImage = Image.open(path)
#        srcImage.thumbnail(size, Image.ANTIALIAS)
#        srcImage.save(buf, "PNG")

        #### resize to 'height*width' ####
        thumbanail =  srcImage.resize(size, Image.ANTIALIAS)
        thumbanail.save(buf, "PNG")

        print time.time()-start

        #### return the thumbnail's string value ####
        return buf.getvalue()


urls = ('/(.*)', 'convert')

webApp = web.application(urls, globals())
application = webApp.wsgifunc()


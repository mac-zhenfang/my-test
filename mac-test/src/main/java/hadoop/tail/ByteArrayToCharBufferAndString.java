/**
 * 
 */
package hadoop.tail;

import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * @author root
 *
 */
 /** 
  * @contributor guoyun 
  */  
 public class ByteArrayToCharBufferAndString implements CharSequence,Closeable{  
     private CharBuffer charBuffer=null;  
     public static final String DEFAULT_ENCODING="ISO8859_1";  
       
     /** 
      * @param buffer        byte数组 
      * @param start         开始位置 
      * @param size          长度 
      * @param encoding      编码 
      */  
     public ByteArrayToCharBufferAndString(byte[] buffer,long start,long size,String encoding){  
         super();  
         charBuffer=byteArrayToCharBuffer(buffer,start,size,encoding);  
     }  
       
     private CharBuffer byteArrayToCharBuffer(byte[] buffer,long start,long size,String encoding){  
         ByteBuffer bb=ByteBuffer.wrap(buffer);  
         bb.position((int)start);  
         bb.limit((int)size);  
           
         Charset charset=null;  
         try {  
             charset=Charset.forName(encoding);  
         } catch (RuntimeException e) {  
             charset=Charset.forName(DEFAULT_ENCODING);  
         }  
           
         return charset.decode(bb).asReadOnlyBuffer();       
     }  
   
     public char charAt(int index) {  
         return this.charBuffer==null?null:this.charBuffer.charAt(index);  
     }  
   
     public int length() {  
         return this.charBuffer==null?0:this.charBuffer.limit();  
     }  
   
     public CharSequence subSequence(int start, int end) {  
         return new CharSubSequence(this, start, end);  
     }  
   
     public void close() {  
        if(this.charBuffer!=null){  
            this.charBuffer.clear();  
            this.charBuffer=null;  
        }      
     }  
       
     @Override  
     public String toString() {  
         StringBuffer sb = new StringBuffer(length());  
         sb.append(this);  
         return sb.toString();  
     }  
   
     /** 
      * @param args 
      * @throws UnsupportedEncodingException  
      */  
     public static void main(String[] args) throws UnsupportedEncodingException {  
        //String str="123456789abcdefghijklmnopqrstuvwxyz";  
        String str="我宣布,中华人民共和国,成立了!中华人民共和国,从此站起来了!";  
        byte[] buffer=str.getBytes("UTF-8");  
          
        ByteArrayToCharBufferAndString test=null;  
        try {  
         test=new ByteArrayToCharBufferAndString(buffer,0,buffer.length,"UTF-8");  
            System.out.println("转换成String:"+test.toString());  
            System.out.println("长度:"+test.length());  
            System.out.println("获取字符,位置5:"+test.charAt(5)+",位置15:"+test.charAt(15));  
         } catch (Exception e) {  
             e.printStackTrace();  
         }finally{  
             if(test!=null){  
                 test.close();  
             }  
         }  
          
   
     }  
   
 }  

/**
 * this package is to image convert to create thumbnail.
 */
package image;

import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.io.IOException;

import magick.ImageInfo;
import magick.MagickException;
import magick.MagickImage;

import org.apache.commons.lang.StringUtils;

/**
 * the JMagick implement of ImageConvert. JMagick is an open source Java interface of ImageMagick. It is implemented in
 * the form of a thin Java Native Interface (JNI) layer into the ImageMagick API.
 * 
 * @author truman
 * @since 2010-6-7
 * @version 1.8
 * @see ImageConvert
 */
public final class JMagickImageConvert {

	/******************************************************
	 * resize the image to create thumbnail of width*height.
	 * 
	 * @param String
	 *            imgagePath
	 * @param int width
	 * @param int height
	 * @return byte[] an array that contents the image format
	 * @throws ImageConvertException
	 * @throws FileNotFoundException 
	 **/
	/*
	public static void resizeImage(String imgagePath, String tgtPaht, int tgtWidth,
			int tgtHeight) throws ImageConvertException, FileNotFoundException {
		ImageInfo info = null;
		MagickImage sourceImage = null;
		MagickImage tgtImage = null;

		try {
			// bug: 440141 
			if (StringUtils.isEmpty(imgagePath) || !((new File(imgagePath)).exists())) { // parasoft-suppress BD.SECURITY.TDFNAMES-1 "Confirmed with security team that imgagePath is secure"
				throw new FileNotFoundException(imgagePath + " not found.");
			}

			// Corresponds to the ImageMagick ImageInfo structure.
			info = new ImageInfo(imgagePath);

			// Read the image specified in the ImageInfo object.
			sourceImage = new MagickImage();
			sourceImage.readImage(info);

			// modified by Truman at 2011-2-23 for image distortion.
			int srcWidth = sourceImage.getDimension().width;
			int srcHeight = sourceImage.getDimension().height;

			double ratio;
			
			if(srcWidth <= 0 || tgtWidth <= 0 || srcHeight <= 0 || tgtHeight <= 0){
				throw new ImageConvertException("illegal paramter, srcWidth=" + srcWidth + ", tgtWidth=" + tgtWidth 
						+ ", srcHeight=" + srcHeight + ", tgtHeight=" + tgtHeight +".");
			}else if (srcWidth <= tgtWidth && srcHeight <= tgtHeight) {
				tgtWidth = srcWidth;
				tgtHeight = srcHeight;
			} else if (srcHeight >= srcWidth) {
				ratio = (double) srcWidth / (double) srcHeight;

				// for fixed bug 433357.
				if (ratio < ImageConstants.MIN_RATIO_THUMB) {
					ratio = ImageConstants.MIN_RATIO_THUMB;
				}

				tgtWidth = (int) (tgtHeight * ratio);
			} else {
				ratio = (double) srcHeight / (double) srcWidth;

				if (ratio < ImageConstants.MIN_RATIO_THUMB) {
					ratio = ImageConstants.MIN_RATIO_THUMB;
				}

				tgtHeight = (int) (tgtWidth * ratio);
			}

			// designed by xiaolong.
			if (tgtHeight <= 0) {
				tgtHeight = 1;
			}
			if (tgtWidth <= 0) {
				tgtWidth = 1;
			}

			// Return a new image that is a scaled version of the original.
			tgtImage = sourceImage.scaleImage(tgtWidth, tgtHeight);
			tgtImage.setImageFormat(ImageConstants.IMAGE_FORMAT);
			tgtImage.profileImage("*", null);
			tgtImage.setDepth(8);
			tgtImage.setFileName(tgtPaht);
			
			ImageInfo tgtInfo = new ImageInfo();
			
			// set the quality of image.
			tgtInfo.setQuality(ImageConstants.IMAGE_QUALITY);
			
			tgtImage.writeImage(tgtInfo);
			
			// Returns an array that contents the image format.
//			return tgtImage.imageToBlob(tgtInfo);
		} catch (MagickException e) {
			throw new ImageConvertException(e);
		} finally {
			if (sourceImage != null) {
				// Called by finalize to deallocate the image handle.
				sourceImage.destroyImages();
			}

			if (tgtImage != null) {
				tgtImage.destroyImages();
			}
		}
	}
	*/
	public static byte[] resize(String imgagePath, int trgWidth,
			int tgtHeight) throws MagickException{
		ImageInfo info = null;
		MagickImage sourceImage = null;
		info = new ImageInfo(imgagePath);
		sourceImage = new MagickImage(info);
		sourceImage.profileImage("*", null);
		return sourceImage.imageToBlob(info);
		
		
	}
	

	public static void resizeImage(String srcPath, String newPath, int width, int height) throws IOException, InterruptedException, IM4JavaException {
		IMOperation op = new IMOperation();
		op.addImage(srcPath);
		op.quality(85.0);

		op.thumbnail(width, height);
		op.depth(8);
		op.addImage(newPath);
		
		ConvertCmd convert = new ConvertCmd();
		//convert.setSearchPath(IMAGE_MAGICK_PATH);
		
		System.out.println(convert.isAsyncMode());
		
		convert.setAsyncMode(false);
		System.out.println(convert.isAsyncMode());
		convert.run(op);
	}
	
	
	/**
	 * do image crop according to the filepath and rectangle.
	 * 
	 * @param filePath
	 * @param rect
	 * @return
	 */
	public static byte[] cropImage(String filePath, Rectangle rect) {
		MagickImage image = null;
		MagickImage cropped = null;

		try {
			if (StringUtils.isEmpty(filePath)) {
				return null;
			}

			ImageInfo imageInfo = new ImageInfo(filePath);

			image = new MagickImage(imageInfo);
			cropped = image.cropImage(rect);

			// set the image format.
			cropped.setImageFormat("PNG");
			return cropped.imageToBlob(imageInfo);
		} catch (MagickException e) {
			return null;
		} finally {
			if (image != null) {
				image.destroyImages();
			}

			if (cropped != null) {
				cropped.destroyImages();
			}
		}
	}

	private JMagickImageConvert() {
	}

	public static final String IMAGE_MAGICK_PATH = "";

}

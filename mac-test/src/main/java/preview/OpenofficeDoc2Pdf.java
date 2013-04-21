/**
 * 
 */
package preview;

import java.io.File;

import org.codehaus.jackson.map.deser.impl.PropertyValue;

/**
 * @author macf
 * @version Dec 6, 2010
 * @since mac-test
 */
public class OpenofficeDoc2Pdf {

	private static XComponentContext createContext() throws Exception {
		// get the remote office component context, "127.0.0.1", 8100
		return BootstrapSocketConnector.bootstrap("/usr/bin/");
	}

	private static XComponentLoader createLoader(XComponentContext context)
			throws Exception {
		// get the remote office service manager
		XMultiComponentFactory mcf = context.getServiceManager();
		Object desktop = mcf.createInstanceWithContext(
				"com.sun.star.frame.Desktop", context);
		return (XComponentLoader) UnoRuntime.queryInterface(
				XComponentLoader.class, desktop);
	}

	private static Object loadDocument(XComponentLoader loader,
			String inputFilePath) throws Exception {
		// Preparing properties for loading the document
		PropertyValue[] propertyValues = new PropertyValue[1];

		// Composing the URL by replacing all backslashs
		File inputFile = new File(inputFilePath);
		String inputUrl = "file:///"
				+ inputFile.getAbsolutePath().replace('\\', '/');
		System.out.println(inputUrl);
		return loader.loadComponentFromURL(inputUrl, "_blank", 0,
				propertyValues);
	}

	private static void convertDocument(Object doc, String outputFilePath,
			String convertType) throws Exception {
		System.out.println(doc);
		// Preparing properties for converting the document
		PropertyValue[] propertyValues = new PropertyValue[2];
		// Setting the flag for overwriting
		propertyValues[0] = new PropertyValue();
		propertyValues[0].Name = "Overwrite";
		propertyValues[0].Value = new Boolean(true);
		// Setting the filter name
		propertyValues[1] = new PropertyValue();
		propertyValues[1].Name = "FilterName";
		propertyValues[1].Value = convertType;

		// Composing the URL by replacing all backslashs
		File outputFile = new File(outputFilePath);

		XModel xModel = (XModel) UnoRuntime.queryInterface(XModel.class, doc);
		XFrame xFrame = xModel.getCurrentController().getFrame();
		xFrame.activate();
		// Getting an object that will offer a simple way to store
		// a document to a URL.
		XStorable storable = (XStorable) UnoRuntime.queryInterface(
				XStorable.class, doc);
		// Storing and converting the document
		// storable.storeAsURL(outputUrl, propertyValues);
		String outputUrl = "file:///"
				+ outputFile.getAbsolutePath().replace('\\', '/');
		System.out.println(outputUrl);
		// storable.storeAsURL(outputUrl, propertyValues);
		storable.storeToURL(outputUrl, propertyValues);
	}

	private static void closeDocument(Object doc) throws Exception {
		// Closing the converted document. Use XCloseable.clsoe if the
		// interface is supported, otherwise use XComponent.dispose
		XCloseable closeable = (XCloseable) UnoRuntime.queryInterface(
				XCloseable.class, doc);

		if (closeable != null) {
			closeable.close(false);
		} else {
			XComponent component = (XComponent) UnoRuntime.queryInterface(
					XComponent.class, doc);
			component.dispose();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// String inputFilePath = "/home/macf/Downloads/test.txt";
		// String outputFilePath = "out.pdf";
		//
		// // the given type to convert to 97 Word
		// // String convertType = "swriter: MS Word 97";
		// // convert into PDF
		// String convertType = " writer_pdf_Export";
		//
		// try {
		// XComponentContext context = createContext();
		// System.out.println("connected to a running office ...");
		//
		// XComponentLoader compLoader = createLoader(context);
		// System.out.println("loader created ...");
		//
		// Object doc = loadDocument(compLoader, inputFilePath);
		// System.out.println("document loaded ...");
		//
		// convertDocument(doc, outputFilePath, convertType);
		// System.out.println("document converted ...");
		//
		// closeDocument(doc);
		// System.out.println("document closed ...");
		//
		// System.exit(0);
		// } catch (Exception e) {
		// e.printStackTrace(System.err);
		// System.exit(1);
		// }
		for (int i = 0; i < 1; i++) {
			long start = System.currentTimeMillis();
			testExport();
			System.out.println(System.currentTimeMillis() - start);
		}
		System.exit(0);
	}

	public static void testExport() throws Exception {
		PropertyValue propertyLoad = new PropertyValue();
		propertyLoad.Name = "Hidden";
		propertyLoad.Value = new Boolean(true);
		PropertyValue[] loadProperties = new PropertyValue[] { propertyLoad };

		XComponent srcDocument = null;
		// load a document

		try {
			XComponentContext context = createContext();
			srcDocument = loadComponent(context,
					"file:///home/mac/preview/ETL_Deployment_Instruction.docx",
					loadProperties);

			// save as pdf
			PropertyValue propertyExport = new PropertyValue();
			propertyLoad.Name = "FilterName";
			propertyLoad.Value = "writer_pdf_Export";

			XStorable xStorable = (XStorable) UnoRuntime.queryInterface(
					XStorable.class, srcDocument);
			xStorable.storeToURL("file:///home/mac/preview/" + Math.random()
					+ ".pdf", new PropertyValue[] { propertyExport,
					propertyLoad });
		} finally {
			closeDocument(srcDocument);

		}
	}

	public static XComponent loadComponent(XComponentContext xContext,
			String sURL, PropertyValue[] aMediaDescriptor) {
		XComponent xComp = null;
		try {
			XComponentLoader xComponentLoader = (XComponentLoader) UnoRuntime
					.queryInterface(
							XComponentLoader.class,
							xContext.getServiceManager()
									.createInstanceWithContext(
											"com.sun.star.frame.Desktop",
											xContext));
			xComp = xComponentLoader.loadComponentFromURL(sURL, "_default", 0,
					aMediaDescriptor);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return xComp;
	}

}

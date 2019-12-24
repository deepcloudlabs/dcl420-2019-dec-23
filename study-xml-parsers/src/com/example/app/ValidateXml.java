package com.example.app;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.w3c.dom.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidateXml {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setValidating(true);
		factory.setNamespaceAware(true);
		File schemaFile = new File("resources", "otomobil.xsd");
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = schemaFactory.newSchema(schemaFile);
		factory.setSchema(schema);

		DocumentBuilder builder = factory.newDocumentBuilder();
		builder.setErrorHandler(new ErrorHandler() {

			@Override
			public void warning(SAXParseException exception) throws SAXException {
				System.err.println(exception.getLineNumber() + ": " + exception.getMessage());
			}

			@Override
			public void fatalError(SAXParseException exception) throws SAXException {
				System.err.println(exception.getLineNumber() + ": " + exception.getMessage());
			}

			@Override
			public void error(SAXParseException exception) throws SAXException {
				System.err.println(exception.getLineNumber() + ": " + exception.getMessage());
			}
		});
		Document document = builder.parse(new File("resources", "otomobil.xml"));
		System.out.println("Document is valid!");
	}

}

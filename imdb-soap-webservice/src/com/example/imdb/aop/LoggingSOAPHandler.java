package com.example.imdb.aop;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LoggingSOAPHandler implements SOAPHandler<SOAPMessageContext> {

	@Override
	public void close(MessageContext context) {
		context.entrySet().forEach(System.out::println);
	}

	@SuppressWarnings("unused")
	@Override
	public boolean handleFault(SOAPMessageContext context) {
		try {
			SOAPBody soapBody = context.getMessage().getSOAPBody();
			SOAPHeader soapHeader = context.getMessage().getSOAPHeader();
			context.getMessage().writeTo(System.err);
		} catch (SOAPException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@SuppressWarnings("unused")
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		try {
			SOAPBody soapBody = context.getMessage().getSOAPBody();
			SOAPHeader soapHeader = context.getMessage().getSOAPHeader();
			context.getMessage().writeTo(System.out);
		} catch (SOAPException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}

package com.example.app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.example.domain.OlcuTipi;
import com.example.domain.Otomobiller;

public class ReadOtomobillerFromXml {

	public static void main(String[] args) throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(Otomobiller.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Otomobiller otomobiller = (Otomobiller) unmarshaller.unmarshal(new File("resources", "otomobil.xml"));
		otomobiller.getOtomobil().forEach(oto -> {
			OlcuTipi motorHacmi = oto.getMotorHacmi();
			System.out.println(String.format("%s %s -- %f %s", oto.getMarka(), oto.getModel(), motorHacmi.getValue(),
					motorHacmi.getBirim()));
		});
	}

}

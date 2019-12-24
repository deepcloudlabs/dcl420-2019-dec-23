package com.example.ui;

import static org.joox.JOOX.$;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.joox.Match;

import com.example.domain.Movie;
import com.example.domain.MovieCollection;

public class StudyJoox {

	public static void main(String[] args) throws Exception {
		JAXBContext context= JAXBContext.newInstance(MovieCollection.class);
		Unmarshaller unmarshaller= context.createUnmarshaller();
		Marshaller marshaller= context.createMarshaller();
		marshaller.setProperty(
			Marshaller.JAXB_FORMATTED_OUTPUT, true
		);
		File file= new File("src/main/resources","movies.xml");
		MovieCollection collection=
				(MovieCollection) unmarshaller.unmarshal(file);
		Match match= $(collection)
				     .xpath(
				    	 "//movie[number(year)> 1970 "
				            + "and number(year)<1980 "
				            + "and genres/genre='Drama']"
				    );
		List<Movie> searchResult= match.unmarshal(Movie.class);
		File outfile= new File("src/main/resources","result.xml");
		MovieCollection outCollection= new MovieCollection();
		outCollection.setMovies(searchResult);
		marshaller.marshal(outCollection, outfile);
	}

}

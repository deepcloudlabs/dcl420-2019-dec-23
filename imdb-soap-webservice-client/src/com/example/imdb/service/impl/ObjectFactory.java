
package com.example.imdb.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.imdb.service.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindAllMoviesByCriteria_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByCriteria");
    private final static QName _FindAllMoviesByDirectorId_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByDirectorId");
    private final static QName _FindAllMoviesByGenre_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByGenre");
    private final static QName _FindGenreByName_QNAME = new QName("http://impl.service.imdb.example.com/", "findGenreByName");
    private final static QName _FindMovieByIdResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findMovieByIdResponse");
    private final static QName _AddMovie_QNAME = new QName("http://impl.service.imdb.example.com/", "addMovie");
    private final static QName _AddMovieResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "addMovieResponse");
    private final static QName _Genre_QNAME = new QName("http://impl.service.imdb.example.com/", "genre");
    private final static QName _PopulateResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "populateResponse");
    private final static QName _FindGenreByNameResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findGenreByNameResponse");
    private final static QName _FindMovieById_QNAME = new QName("http://impl.service.imdb.example.com/", "findMovieById");
    private final static QName _FindAllGenresResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllGenresResponse");
    private final static QName _FindAllMoviesResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesResponse");
    private final static QName _FindAllMoviesByYearRangeAndGenreResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByYearRangeAndGenreResponse");
    private final static QName _FindAllMoviesByYearRangeResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByYearRangeResponse");
    private final static QName _FindAllGenres_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllGenres");
    private final static QName _FindAllMoviesByDirectorIdResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByDirectorIdResponse");
    private final static QName _FindAllDirectors_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllDirectors");
    private final static QName _FindAllMoviesByCriteriaResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByCriteriaResponse");
    private final static QName _FindAllMoviesByGenreResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByGenreResponse");
    private final static QName _FindAllMoviesByYearRange_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByYearRange");
    private final static QName _FindAllMovies_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMovies");
    private final static QName _FindAllDirectorsResponse_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllDirectorsResponse");
    private final static QName _Populate_QNAME = new QName("http://impl.service.imdb.example.com/", "populate");
    private final static QName _FindAllMoviesByYearRangeAndGenre_QNAME = new QName("http://impl.service.imdb.example.com/", "findAllMoviesByYearRangeAndGenre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.imdb.service.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllMoviesByGenre }
     * 
     */
    public FindAllMoviesByGenre createFindAllMoviesByGenre() {
        return new FindAllMoviesByGenre();
    }

    /**
     * Create an instance of {@link FindGenreByName }
     * 
     */
    public FindGenreByName createFindGenreByName() {
        return new FindGenreByName();
    }

    /**
     * Create an instance of {@link FindMovieByIdResponse }
     * 
     */
    public FindMovieByIdResponse createFindMovieByIdResponse() {
        return new FindMovieByIdResponse();
    }

    /**
     * Create an instance of {@link FindAllMoviesByCriteria }
     * 
     */
    public FindAllMoviesByCriteria createFindAllMoviesByCriteria() {
        return new FindAllMoviesByCriteria();
    }

    /**
     * Create an instance of {@link FindAllMoviesByDirectorId }
     * 
     */
    public FindAllMoviesByDirectorId createFindAllMoviesByDirectorId() {
        return new FindAllMoviesByDirectorId();
    }

    /**
     * Create an instance of {@link FindMovieById }
     * 
     */
    public FindMovieById createFindMovieById() {
        return new FindMovieById();
    }

    /**
     * Create an instance of {@link FindAllMoviesResponse }
     * 
     */
    public FindAllMoviesResponse createFindAllMoviesResponse() {
        return new FindAllMoviesResponse();
    }

    /**
     * Create an instance of {@link FindAllGenresResponse }
     * 
     */
    public FindAllGenresResponse createFindAllGenresResponse() {
        return new FindAllGenresResponse();
    }

    /**
     * Create an instance of {@link FindGenreByNameResponse }
     * 
     */
    public FindGenreByNameResponse createFindGenreByNameResponse() {
        return new FindGenreByNameResponse();
    }

    /**
     * Create an instance of {@link AddMovie }
     * 
     */
    public AddMovie createAddMovie() {
        return new AddMovie();
    }

    /**
     * Create an instance of {@link AddMovieResponse }
     * 
     */
    public AddMovieResponse createAddMovieResponse() {
        return new AddMovieResponse();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link PopulateResponse }
     * 
     */
    public PopulateResponse createPopulateResponse() {
        return new PopulateResponse();
    }

    /**
     * Create an instance of {@link FindAllDirectors }
     * 
     */
    public FindAllDirectors createFindAllDirectors() {
        return new FindAllDirectors();
    }

    /**
     * Create an instance of {@link FindAllMoviesByDirectorIdResponse }
     * 
     */
    public FindAllMoviesByDirectorIdResponse createFindAllMoviesByDirectorIdResponse() {
        return new FindAllMoviesByDirectorIdResponse();
    }

    /**
     * Create an instance of {@link FindAllGenres }
     * 
     */
    public FindAllGenres createFindAllGenres() {
        return new FindAllGenres();
    }

    /**
     * Create an instance of {@link FindAllMoviesByYearRangeAndGenreResponse }
     * 
     */
    public FindAllMoviesByYearRangeAndGenreResponse createFindAllMoviesByYearRangeAndGenreResponse() {
        return new FindAllMoviesByYearRangeAndGenreResponse();
    }

    /**
     * Create an instance of {@link FindAllMoviesByYearRangeResponse }
     * 
     */
    public FindAllMoviesByYearRangeResponse createFindAllMoviesByYearRangeResponse() {
        return new FindAllMoviesByYearRangeResponse();
    }

    /**
     * Create an instance of {@link FindAllDirectorsResponse }
     * 
     */
    public FindAllDirectorsResponse createFindAllDirectorsResponse() {
        return new FindAllDirectorsResponse();
    }

    /**
     * Create an instance of {@link FindAllMoviesByYearRangeAndGenre }
     * 
     */
    public FindAllMoviesByYearRangeAndGenre createFindAllMoviesByYearRangeAndGenre() {
        return new FindAllMoviesByYearRangeAndGenre();
    }

    /**
     * Create an instance of {@link Populate }
     * 
     */
    public Populate createPopulate() {
        return new Populate();
    }

    /**
     * Create an instance of {@link FindAllMovies }
     * 
     */
    public FindAllMovies createFindAllMovies() {
        return new FindAllMovies();
    }

    /**
     * Create an instance of {@link FindAllMoviesByGenreResponse }
     * 
     */
    public FindAllMoviesByGenreResponse createFindAllMoviesByGenreResponse() {
        return new FindAllMoviesByGenreResponse();
    }

    /**
     * Create an instance of {@link FindAllMoviesByCriteriaResponse }
     * 
     */
    public FindAllMoviesByCriteriaResponse createFindAllMoviesByCriteriaResponse() {
        return new FindAllMoviesByCriteriaResponse();
    }

    /**
     * Create an instance of {@link FindAllMoviesByYearRange }
     * 
     */
    public FindAllMoviesByYearRange createFindAllMoviesByYearRange() {
        return new FindAllMoviesByYearRange();
    }

    /**
     * Create an instance of {@link CriteriaBean }
     * 
     */
    public CriteriaBean createCriteriaBean() {
        return new CriteriaBean();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Director }
     * 
     */
    public Director createDirector() {
        return new Director();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByCriteria")
    public JAXBElement<FindAllMoviesByCriteria> createFindAllMoviesByCriteria(FindAllMoviesByCriteria value) {
        return new JAXBElement<FindAllMoviesByCriteria>(_FindAllMoviesByCriteria_QNAME, FindAllMoviesByCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByDirectorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByDirectorId")
    public JAXBElement<FindAllMoviesByDirectorId> createFindAllMoviesByDirectorId(FindAllMoviesByDirectorId value) {
        return new JAXBElement<FindAllMoviesByDirectorId>(_FindAllMoviesByDirectorId_QNAME, FindAllMoviesByDirectorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByGenre")
    public JAXBElement<FindAllMoviesByGenre> createFindAllMoviesByGenre(FindAllMoviesByGenre value) {
        return new JAXBElement<FindAllMoviesByGenre>(_FindAllMoviesByGenre_QNAME, FindAllMoviesByGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGenreByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findGenreByName")
    public JAXBElement<FindGenreByName> createFindGenreByName(FindGenreByName value) {
        return new JAXBElement<FindGenreByName>(_FindGenreByName_QNAME, FindGenreByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovieByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findMovieByIdResponse")
    public JAXBElement<FindMovieByIdResponse> createFindMovieByIdResponse(FindMovieByIdResponse value) {
        return new JAXBElement<FindMovieByIdResponse>(_FindMovieByIdResponse_QNAME, FindMovieByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "addMovie")
    public JAXBElement<AddMovie> createAddMovie(AddMovie value) {
        return new JAXBElement<AddMovie>(_AddMovie_QNAME, AddMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "addMovieResponse")
    public JAXBElement<AddMovieResponse> createAddMovieResponse(AddMovieResponse value) {
        return new JAXBElement<AddMovieResponse>(_AddMovieResponse_QNAME, AddMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "genre")
    public JAXBElement<Genre> createGenre(Genre value) {
        return new JAXBElement<Genre>(_Genre_QNAME, Genre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PopulateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "populateResponse")
    public JAXBElement<PopulateResponse> createPopulateResponse(PopulateResponse value) {
        return new JAXBElement<PopulateResponse>(_PopulateResponse_QNAME, PopulateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindGenreByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findGenreByNameResponse")
    public JAXBElement<FindGenreByNameResponse> createFindGenreByNameResponse(FindGenreByNameResponse value) {
        return new JAXBElement<FindGenreByNameResponse>(_FindGenreByNameResponse_QNAME, FindGenreByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindMovieById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findMovieById")
    public JAXBElement<FindMovieById> createFindMovieById(FindMovieById value) {
        return new JAXBElement<FindMovieById>(_FindMovieById_QNAME, FindMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllGenresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllGenresResponse")
    public JAXBElement<FindAllGenresResponse> createFindAllGenresResponse(FindAllGenresResponse value) {
        return new JAXBElement<FindAllGenresResponse>(_FindAllGenresResponse_QNAME, FindAllGenresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesResponse")
    public JAXBElement<FindAllMoviesResponse> createFindAllMoviesResponse(FindAllMoviesResponse value) {
        return new JAXBElement<FindAllMoviesResponse>(_FindAllMoviesResponse_QNAME, FindAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByYearRangeAndGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByYearRangeAndGenreResponse")
    public JAXBElement<FindAllMoviesByYearRangeAndGenreResponse> createFindAllMoviesByYearRangeAndGenreResponse(FindAllMoviesByYearRangeAndGenreResponse value) {
        return new JAXBElement<FindAllMoviesByYearRangeAndGenreResponse>(_FindAllMoviesByYearRangeAndGenreResponse_QNAME, FindAllMoviesByYearRangeAndGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByYearRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByYearRangeResponse")
    public JAXBElement<FindAllMoviesByYearRangeResponse> createFindAllMoviesByYearRangeResponse(FindAllMoviesByYearRangeResponse value) {
        return new JAXBElement<FindAllMoviesByYearRangeResponse>(_FindAllMoviesByYearRangeResponse_QNAME, FindAllMoviesByYearRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllGenres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllGenres")
    public JAXBElement<FindAllGenres> createFindAllGenres(FindAllGenres value) {
        return new JAXBElement<FindAllGenres>(_FindAllGenres_QNAME, FindAllGenres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByDirectorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByDirectorIdResponse")
    public JAXBElement<FindAllMoviesByDirectorIdResponse> createFindAllMoviesByDirectorIdResponse(FindAllMoviesByDirectorIdResponse value) {
        return new JAXBElement<FindAllMoviesByDirectorIdResponse>(_FindAllMoviesByDirectorIdResponse_QNAME, FindAllMoviesByDirectorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllDirectors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllDirectors")
    public JAXBElement<FindAllDirectors> createFindAllDirectors(FindAllDirectors value) {
        return new JAXBElement<FindAllDirectors>(_FindAllDirectors_QNAME, FindAllDirectors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByCriteriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByCriteriaResponse")
    public JAXBElement<FindAllMoviesByCriteriaResponse> createFindAllMoviesByCriteriaResponse(FindAllMoviesByCriteriaResponse value) {
        return new JAXBElement<FindAllMoviesByCriteriaResponse>(_FindAllMoviesByCriteriaResponse_QNAME, FindAllMoviesByCriteriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByGenreResponse")
    public JAXBElement<FindAllMoviesByGenreResponse> createFindAllMoviesByGenreResponse(FindAllMoviesByGenreResponse value) {
        return new JAXBElement<FindAllMoviesByGenreResponse>(_FindAllMoviesByGenreResponse_QNAME, FindAllMoviesByGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByYearRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByYearRange")
    public JAXBElement<FindAllMoviesByYearRange> createFindAllMoviesByYearRange(FindAllMoviesByYearRange value) {
        return new JAXBElement<FindAllMoviesByYearRange>(_FindAllMoviesByYearRange_QNAME, FindAllMoviesByYearRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMovies")
    public JAXBElement<FindAllMovies> createFindAllMovies(FindAllMovies value) {
        return new JAXBElement<FindAllMovies>(_FindAllMovies_QNAME, FindAllMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllDirectorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllDirectorsResponse")
    public JAXBElement<FindAllDirectorsResponse> createFindAllDirectorsResponse(FindAllDirectorsResponse value) {
        return new JAXBElement<FindAllDirectorsResponse>(_FindAllDirectorsResponse_QNAME, FindAllDirectorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Populate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "populate")
    public JAXBElement<Populate> createPopulate(Populate value) {
        return new JAXBElement<Populate>(_Populate_QNAME, Populate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllMoviesByYearRangeAndGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.service.imdb.example.com/", name = "findAllMoviesByYearRangeAndGenre")
    public JAXBElement<FindAllMoviesByYearRangeAndGenre> createFindAllMoviesByYearRangeAndGenre(FindAllMoviesByYearRangeAndGenre value) {
        return new JAXBElement<FindAllMoviesByYearRangeAndGenre>(_FindAllMoviesByYearRangeAndGenre_QNAME, FindAllMoviesByYearRangeAndGenre.class, null, value);
    }

}

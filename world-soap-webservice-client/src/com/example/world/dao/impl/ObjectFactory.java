
package com.example.world.dao.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.world.dao.impl package. 
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

    private final static QName _FindCountryByCodeResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findCountryByCodeResponse");
    private final static QName _CreateCities1_QNAME = new QName("http://impl.dao.world.example.com/", "createCities1");
    private final static QName _GetAllContinents_QNAME = new QName("http://impl.dao.world.example.com/", "getAllContinents");
    private final static QName _FindAllCountries_QNAME = new QName("http://impl.dao.world.example.com/", "findAllCountries");
    private final static QName _CreateCountries_QNAME = new QName("http://impl.dao.world.example.com/", "createCountries");
    private final static QName _RemoveCityResponse_QNAME = new QName("http://impl.dao.world.example.com/", "removeCityResponse");
    private final static QName _FindCitiesByCountryCode_QNAME = new QName("http://impl.dao.world.example.com/", "findCitiesByCountryCode");
    private final static QName _CreateCities3000Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities3000Response");
    private final static QName _FindAllCities_QNAME = new QName("http://impl.dao.world.example.com/", "findAllCities");
    private final static QName _FindCountriesByContinent_QNAME = new QName("http://impl.dao.world.example.com/", "findCountriesByContinent");
    private final static QName _CreateCities1Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities1Response");
    private final static QName _CreateCities3600_QNAME = new QName("http://impl.dao.world.example.com/", "createCities3600");
    private final static QName _FindCityById_QNAME = new QName("http://impl.dao.world.example.com/", "findCityById");
    private final static QName _UpdateCity_QNAME = new QName("http://impl.dao.world.example.com/", "updateCity");
    private final static QName _FindCountriesByContinentResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findCountriesByContinentResponse");
    private final static QName _FindCitiesByCountryCodeResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findCitiesByCountryCodeResponse");
    private final static QName _CreateCities1000_QNAME = new QName("http://impl.dao.world.example.com/", "createCities1000");
    private final static QName _FindAllCountriesResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findAllCountriesResponse");
    private final static QName _CreateCities2000Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities2000Response");
    private final static QName _CreateCities3000_QNAME = new QName("http://impl.dao.world.example.com/", "createCities3000");
    private final static QName _GetAllContinentsResponse_QNAME = new QName("http://impl.dao.world.example.com/", "getAllContinentsResponse");
    private final static QName _CreateCities3600Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities3600Response");
    private final static QName _RemoveCountryResponse_QNAME = new QName("http://impl.dao.world.example.com/", "removeCountryResponse");
    private final static QName _CreateCountriesResponse_QNAME = new QName("http://impl.dao.world.example.com/", "createCountriesResponse");
    private final static QName _AddCityResponse_QNAME = new QName("http://impl.dao.world.example.com/", "addCityResponse");
    private final static QName _RemoveCity_QNAME = new QName("http://impl.dao.world.example.com/", "removeCity");
    private final static QName _UpdateCityResponse_QNAME = new QName("http://impl.dao.world.example.com/", "updateCityResponse");
    private final static QName _AddCountryResponse_QNAME = new QName("http://impl.dao.world.example.com/", "addCountryResponse");
    private final static QName _CreateCities2500Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities2500Response");
    private final static QName _UpdateCountryResponse_QNAME = new QName("http://impl.dao.world.example.com/", "updateCountryResponse");
    private final static QName _CreateCities1000Response_QNAME = new QName("http://impl.dao.world.example.com/", "createCities1000Response");
    private final static QName _FindCityByIdResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findCityByIdResponse");
    private final static QName _FindCountryByCode_QNAME = new QName("http://impl.dao.world.example.com/", "findCountryByCode");
    private final static QName _CreateCities2500_QNAME = new QName("http://impl.dao.world.example.com/", "createCities2500");
    private final static QName _RemoveCountry_QNAME = new QName("http://impl.dao.world.example.com/", "removeCountry");
    private final static QName _FindAllCitiesResponse_QNAME = new QName("http://impl.dao.world.example.com/", "findAllCitiesResponse");
    private final static QName _AddCity_QNAME = new QName("http://impl.dao.world.example.com/", "addCity");
    private final static QName _AddCountry_QNAME = new QName("http://impl.dao.world.example.com/", "addCountry");
    private final static QName _Init_QNAME = new QName("http://impl.dao.world.example.com/", "init");
    private final static QName _UpdateCountry_QNAME = new QName("http://impl.dao.world.example.com/", "updateCountry");
    private final static QName _CreateCities2000_QNAME = new QName("http://impl.dao.world.example.com/", "createCities2000");
    private final static QName _InitResponse_QNAME = new QName("http://impl.dao.world.example.com/", "initResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.world.dao.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCity }
     * 
     */
    public UpdateCity createUpdateCity() {
        return new UpdateCity();
    }

    /**
     * Create an instance of {@link FindCityById }
     * 
     */
    public FindCityById createFindCityById() {
        return new FindCityById();
    }

    /**
     * Create an instance of {@link FindCitiesByCountryCodeResponse }
     * 
     */
    public FindCitiesByCountryCodeResponse createFindCitiesByCountryCodeResponse() {
        return new FindCitiesByCountryCodeResponse();
    }

    /**
     * Create an instance of {@link FindCountriesByContinentResponse }
     * 
     */
    public FindCountriesByContinentResponse createFindCountriesByContinentResponse() {
        return new FindCountriesByContinentResponse();
    }

    /**
     * Create an instance of {@link CreateCities2000Response }
     * 
     */
    public CreateCities2000Response createCreateCities2000Response() {
        return new CreateCities2000Response();
    }

    /**
     * Create an instance of {@link CreateCities3000 }
     * 
     */
    public CreateCities3000 createCreateCities3000() {
        return new CreateCities3000();
    }

    /**
     * Create an instance of {@link GetAllContinentsResponse }
     * 
     */
    public GetAllContinentsResponse createGetAllContinentsResponse() {
        return new GetAllContinentsResponse();
    }

    /**
     * Create an instance of {@link CreateCities1000 }
     * 
     */
    public CreateCities1000 createCreateCities1000() {
        return new CreateCities1000();
    }

    /**
     * Create an instance of {@link FindAllCountriesResponse }
     * 
     */
    public FindAllCountriesResponse createFindAllCountriesResponse() {
        return new FindAllCountriesResponse();
    }

    /**
     * Create an instance of {@link FindAllCities }
     * 
     */
    public FindAllCities createFindAllCities() {
        return new FindAllCities();
    }

    /**
     * Create an instance of {@link FindCountriesByContinent }
     * 
     */
    public FindCountriesByContinent createFindCountriesByContinent() {
        return new FindCountriesByContinent();
    }

    /**
     * Create an instance of {@link CreateCities3600 }
     * 
     */
    public CreateCities3600 createCreateCities3600() {
        return new CreateCities3600();
    }

    /**
     * Create an instance of {@link CreateCities1Response }
     * 
     */
    public CreateCities1Response createCreateCities1Response() {
        return new CreateCities1Response();
    }

    /**
     * Create an instance of {@link FindAllCountries }
     * 
     */
    public FindAllCountries createFindAllCountries() {
        return new FindAllCountries();
    }

    /**
     * Create an instance of {@link FindCitiesByCountryCode }
     * 
     */
    public FindCitiesByCountryCode createFindCitiesByCountryCode() {
        return new FindCitiesByCountryCode();
    }

    /**
     * Create an instance of {@link CreateCountries }
     * 
     */
    public CreateCountries createCreateCountries() {
        return new CreateCountries();
    }

    /**
     * Create an instance of {@link RemoveCityResponse }
     * 
     */
    public RemoveCityResponse createRemoveCityResponse() {
        return new RemoveCityResponse();
    }

    /**
     * Create an instance of {@link CreateCities3000Response }
     * 
     */
    public CreateCities3000Response createCreateCities3000Response() {
        return new CreateCities3000Response();
    }

    /**
     * Create an instance of {@link FindCountryByCodeResponse }
     * 
     */
    public FindCountryByCodeResponse createFindCountryByCodeResponse() {
        return new FindCountryByCodeResponse();
    }

    /**
     * Create an instance of {@link CreateCities1 }
     * 
     */
    public CreateCities1 createCreateCities1() {
        return new CreateCities1();
    }

    /**
     * Create an instance of {@link GetAllContinents }
     * 
     */
    public GetAllContinents createGetAllContinents() {
        return new GetAllContinents();
    }

    /**
     * Create an instance of {@link CreateCities2000 }
     * 
     */
    public CreateCities2000 createCreateCities2000() {
        return new CreateCities2000();
    }

    /**
     * Create an instance of {@link AddCountry }
     * 
     */
    public AddCountry createAddCountry() {
        return new AddCountry();
    }

    /**
     * Create an instance of {@link Init }
     * 
     */
    public Init createInit() {
        return new Init();
    }

    /**
     * Create an instance of {@link UpdateCountry }
     * 
     */
    public UpdateCountry createUpdateCountry() {
        return new UpdateCountry();
    }

    /**
     * Create an instance of {@link InitResponse }
     * 
     */
    public InitResponse createInitResponse() {
        return new InitResponse();
    }

    /**
     * Create an instance of {@link CreateCities2500 }
     * 
     */
    public CreateCities2500 createCreateCities2500() {
        return new CreateCities2500();
    }

    /**
     * Create an instance of {@link RemoveCountry }
     * 
     */
    public RemoveCountry createRemoveCountry() {
        return new RemoveCountry();
    }

    /**
     * Create an instance of {@link FindAllCitiesResponse }
     * 
     */
    public FindAllCitiesResponse createFindAllCitiesResponse() {
        return new FindAllCitiesResponse();
    }

    /**
     * Create an instance of {@link AddCity }
     * 
     */
    public AddCity createAddCity() {
        return new AddCity();
    }

    /**
     * Create an instance of {@link CreateCities2500Response }
     * 
     */
    public CreateCities2500Response createCreateCities2500Response() {
        return new CreateCities2500Response();
    }

    /**
     * Create an instance of {@link UpdateCountryResponse }
     * 
     */
    public UpdateCountryResponse createUpdateCountryResponse() {
        return new UpdateCountryResponse();
    }

    /**
     * Create an instance of {@link CreateCities1000Response }
     * 
     */
    public CreateCities1000Response createCreateCities1000Response() {
        return new CreateCities1000Response();
    }

    /**
     * Create an instance of {@link FindCityByIdResponse }
     * 
     */
    public FindCityByIdResponse createFindCityByIdResponse() {
        return new FindCityByIdResponse();
    }

    /**
     * Create an instance of {@link FindCountryByCode }
     * 
     */
    public FindCountryByCode createFindCountryByCode() {
        return new FindCountryByCode();
    }

    /**
     * Create an instance of {@link CreateCities3600Response }
     * 
     */
    public CreateCities3600Response createCreateCities3600Response() {
        return new CreateCities3600Response();
    }

    /**
     * Create an instance of {@link RemoveCountryResponse }
     * 
     */
    public RemoveCountryResponse createRemoveCountryResponse() {
        return new RemoveCountryResponse();
    }

    /**
     * Create an instance of {@link CreateCountriesResponse }
     * 
     */
    public CreateCountriesResponse createCreateCountriesResponse() {
        return new CreateCountriesResponse();
    }

    /**
     * Create an instance of {@link AddCityResponse }
     * 
     */
    public AddCityResponse createAddCityResponse() {
        return new AddCityResponse();
    }

    /**
     * Create an instance of {@link RemoveCity }
     * 
     */
    public RemoveCity createRemoveCity() {
        return new RemoveCity();
    }

    /**
     * Create an instance of {@link UpdateCityResponse }
     * 
     */
    public UpdateCityResponse createUpdateCityResponse() {
        return new UpdateCityResponse();
    }

    /**
     * Create an instance of {@link AddCountryResponse }
     * 
     */
    public AddCountryResponse createAddCountryResponse() {
        return new AddCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link City }
     * 
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountryByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCountryByCodeResponse")
    public JAXBElement<FindCountryByCodeResponse> createFindCountryByCodeResponse(FindCountryByCodeResponse value) {
        return new JAXBElement<FindCountryByCodeResponse>(_FindCountryByCodeResponse_QNAME, FindCountryByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities1")
    public JAXBElement<CreateCities1> createCreateCities1(CreateCities1 value) {
        return new JAXBElement<CreateCities1>(_CreateCities1_QNAME, CreateCities1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContinents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "getAllContinents")
    public JAXBElement<GetAllContinents> createGetAllContinents(GetAllContinents value) {
        return new JAXBElement<GetAllContinents>(_GetAllContinents_QNAME, GetAllContinents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCountries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findAllCountries")
    public JAXBElement<FindAllCountries> createFindAllCountries(FindAllCountries value) {
        return new JAXBElement<FindAllCountries>(_FindAllCountries_QNAME, FindAllCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCountries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCountries")
    public JAXBElement<CreateCountries> createCreateCountries(CreateCountries value) {
        return new JAXBElement<CreateCountries>(_CreateCountries_QNAME, CreateCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "removeCityResponse")
    public JAXBElement<RemoveCityResponse> createRemoveCityResponse(RemoveCityResponse value) {
        return new JAXBElement<RemoveCityResponse>(_RemoveCityResponse_QNAME, RemoveCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCitiesByCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCitiesByCountryCode")
    public JAXBElement<FindCitiesByCountryCode> createFindCitiesByCountryCode(FindCitiesByCountryCode value) {
        return new JAXBElement<FindCitiesByCountryCode>(_FindCitiesByCountryCode_QNAME, FindCitiesByCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities3000Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities3000Response")
    public JAXBElement<CreateCities3000Response> createCreateCities3000Response(CreateCities3000Response value) {
        return new JAXBElement<CreateCities3000Response>(_CreateCities3000Response_QNAME, CreateCities3000Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findAllCities")
    public JAXBElement<FindAllCities> createFindAllCities(FindAllCities value) {
        return new JAXBElement<FindAllCities>(_FindAllCities_QNAME, FindAllCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountriesByContinent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCountriesByContinent")
    public JAXBElement<FindCountriesByContinent> createFindCountriesByContinent(FindCountriesByContinent value) {
        return new JAXBElement<FindCountriesByContinent>(_FindCountriesByContinent_QNAME, FindCountriesByContinent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities1Response")
    public JAXBElement<CreateCities1Response> createCreateCities1Response(CreateCities1Response value) {
        return new JAXBElement<CreateCities1Response>(_CreateCities1Response_QNAME, CreateCities1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities3600 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities3600")
    public JAXBElement<CreateCities3600> createCreateCities3600(CreateCities3600 value) {
        return new JAXBElement<CreateCities3600>(_CreateCities3600_QNAME, CreateCities3600 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCityById")
    public JAXBElement<FindCityById> createFindCityById(FindCityById value) {
        return new JAXBElement<FindCityById>(_FindCityById_QNAME, FindCityById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "updateCity")
    public JAXBElement<UpdateCity> createUpdateCity(UpdateCity value) {
        return new JAXBElement<UpdateCity>(_UpdateCity_QNAME, UpdateCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountriesByContinentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCountriesByContinentResponse")
    public JAXBElement<FindCountriesByContinentResponse> createFindCountriesByContinentResponse(FindCountriesByContinentResponse value) {
        return new JAXBElement<FindCountriesByContinentResponse>(_FindCountriesByContinentResponse_QNAME, FindCountriesByContinentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCitiesByCountryCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCitiesByCountryCodeResponse")
    public JAXBElement<FindCitiesByCountryCodeResponse> createFindCitiesByCountryCodeResponse(FindCitiesByCountryCodeResponse value) {
        return new JAXBElement<FindCitiesByCountryCodeResponse>(_FindCitiesByCountryCodeResponse_QNAME, FindCitiesByCountryCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities1000 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities1000")
    public JAXBElement<CreateCities1000> createCreateCities1000(CreateCities1000 value) {
        return new JAXBElement<CreateCities1000>(_CreateCities1000_QNAME, CreateCities1000 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findAllCountriesResponse")
    public JAXBElement<FindAllCountriesResponse> createFindAllCountriesResponse(FindAllCountriesResponse value) {
        return new JAXBElement<FindAllCountriesResponse>(_FindAllCountriesResponse_QNAME, FindAllCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities2000Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities2000Response")
    public JAXBElement<CreateCities2000Response> createCreateCities2000Response(CreateCities2000Response value) {
        return new JAXBElement<CreateCities2000Response>(_CreateCities2000Response_QNAME, CreateCities2000Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities3000 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities3000")
    public JAXBElement<CreateCities3000> createCreateCities3000(CreateCities3000 value) {
        return new JAXBElement<CreateCities3000>(_CreateCities3000_QNAME, CreateCities3000 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContinentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "getAllContinentsResponse")
    public JAXBElement<GetAllContinentsResponse> createGetAllContinentsResponse(GetAllContinentsResponse value) {
        return new JAXBElement<GetAllContinentsResponse>(_GetAllContinentsResponse_QNAME, GetAllContinentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities3600Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities3600Response")
    public JAXBElement<CreateCities3600Response> createCreateCities3600Response(CreateCities3600Response value) {
        return new JAXBElement<CreateCities3600Response>(_CreateCities3600Response_QNAME, CreateCities3600Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "removeCountryResponse")
    public JAXBElement<RemoveCountryResponse> createRemoveCountryResponse(RemoveCountryResponse value) {
        return new JAXBElement<RemoveCountryResponse>(_RemoveCountryResponse_QNAME, RemoveCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCountriesResponse")
    public JAXBElement<CreateCountriesResponse> createCreateCountriesResponse(CreateCountriesResponse value) {
        return new JAXBElement<CreateCountriesResponse>(_CreateCountriesResponse_QNAME, CreateCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "addCityResponse")
    public JAXBElement<AddCityResponse> createAddCityResponse(AddCityResponse value) {
        return new JAXBElement<AddCityResponse>(_AddCityResponse_QNAME, AddCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "removeCity")
    public JAXBElement<RemoveCity> createRemoveCity(RemoveCity value) {
        return new JAXBElement<RemoveCity>(_RemoveCity_QNAME, RemoveCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "updateCityResponse")
    public JAXBElement<UpdateCityResponse> createUpdateCityResponse(UpdateCityResponse value) {
        return new JAXBElement<UpdateCityResponse>(_UpdateCityResponse_QNAME, UpdateCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "addCountryResponse")
    public JAXBElement<AddCountryResponse> createAddCountryResponse(AddCountryResponse value) {
        return new JAXBElement<AddCountryResponse>(_AddCountryResponse_QNAME, AddCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities2500Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities2500Response")
    public JAXBElement<CreateCities2500Response> createCreateCities2500Response(CreateCities2500Response value) {
        return new JAXBElement<CreateCities2500Response>(_CreateCities2500Response_QNAME, CreateCities2500Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "updateCountryResponse")
    public JAXBElement<UpdateCountryResponse> createUpdateCountryResponse(UpdateCountryResponse value) {
        return new JAXBElement<UpdateCountryResponse>(_UpdateCountryResponse_QNAME, UpdateCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities1000Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities1000Response")
    public JAXBElement<CreateCities1000Response> createCreateCities1000Response(CreateCities1000Response value) {
        return new JAXBElement<CreateCities1000Response>(_CreateCities1000Response_QNAME, CreateCities1000Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCityByIdResponse")
    public JAXBElement<FindCityByIdResponse> createFindCityByIdResponse(FindCityByIdResponse value) {
        return new JAXBElement<FindCityByIdResponse>(_FindCityByIdResponse_QNAME, FindCityByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountryByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findCountryByCode")
    public JAXBElement<FindCountryByCode> createFindCountryByCode(FindCountryByCode value) {
        return new JAXBElement<FindCountryByCode>(_FindCountryByCode_QNAME, FindCountryByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities2500 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities2500")
    public JAXBElement<CreateCities2500> createCreateCities2500(CreateCities2500 value) {
        return new JAXBElement<CreateCities2500>(_CreateCities2500_QNAME, CreateCities2500 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "removeCountry")
    public JAXBElement<RemoveCountry> createRemoveCountry(RemoveCountry value) {
        return new JAXBElement<RemoveCountry>(_RemoveCountry_QNAME, RemoveCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "findAllCitiesResponse")
    public JAXBElement<FindAllCitiesResponse> createFindAllCitiesResponse(FindAllCitiesResponse value) {
        return new JAXBElement<FindAllCitiesResponse>(_FindAllCitiesResponse_QNAME, FindAllCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "addCity")
    public JAXBElement<AddCity> createAddCity(AddCity value) {
        return new JAXBElement<AddCity>(_AddCity_QNAME, AddCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "addCountry")
    public JAXBElement<AddCountry> createAddCountry(AddCountry value) {
        return new JAXBElement<AddCountry>(_AddCountry_QNAME, AddCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Init }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "init")
    public JAXBElement<Init> createInit(Init value) {
        return new JAXBElement<Init>(_Init_QNAME, Init.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "updateCountry")
    public JAXBElement<UpdateCountry> createUpdateCountry(UpdateCountry value) {
        return new JAXBElement<UpdateCountry>(_UpdateCountry_QNAME, UpdateCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCities2000 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "createCities2000")
    public JAXBElement<CreateCities2000> createCreateCities2000(CreateCities2000 value) {
        return new JAXBElement<CreateCities2000>(_CreateCities2000_QNAME, CreateCities2000 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.dao.world.example.com/", name = "initResponse")
    public JAXBElement<InitResponse> createInitResponse(InitResponse value) {
        return new JAXBElement<InitResponse>(_InitResponse_QNAME, InitResponse.class, null, value);
    }

}


package com.example.world.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.world.dao package. 
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

    private final static QName _UpdateCountryResponse_QNAME = new QName("http://dao.world.example.com/", "updateCountryResponse");
    private final static QName _FindCityByIdResponse_QNAME = new QName("http://dao.world.example.com/", "findCityByIdResponse");
    private final static QName _FindCountryByCode_QNAME = new QName("http://dao.world.example.com/", "findCountryByCode");
    private final static QName _RemoveCountryResponse_QNAME = new QName("http://dao.world.example.com/", "removeCountryResponse");
    private final static QName _AddCountryResponse_QNAME = new QName("http://dao.world.example.com/", "addCountryResponse");
    private final static QName _AddCityResponse_QNAME = new QName("http://dao.world.example.com/", "addCityResponse");
    private final static QName _RemoveCity_QNAME = new QName("http://dao.world.example.com/", "removeCity");
    private final static QName _UpdateCityResponse_QNAME = new QName("http://dao.world.example.com/", "updateCityResponse");
    private final static QName _AddCountry_QNAME = new QName("http://dao.world.example.com/", "addCountry");
    private final static QName _UpdateCountry_QNAME = new QName("http://dao.world.example.com/", "updateCountry");
    private final static QName _RemoveCountry_QNAME = new QName("http://dao.world.example.com/", "removeCountry");
    private final static QName _AddCity_QNAME = new QName("http://dao.world.example.com/", "addCity");
    private final static QName _FindAllCitiesResponse_QNAME = new QName("http://dao.world.example.com/", "findAllCitiesResponse");
    private final static QName _FindCitiesByCountryCode_QNAME = new QName("http://dao.world.example.com/", "findCitiesByCountryCode");
    private final static QName _RemoveCityResponse_QNAME = new QName("http://dao.world.example.com/", "removeCityResponse");
    private final static QName _FindAllCountries_QNAME = new QName("http://dao.world.example.com/", "findAllCountries");
    private final static QName _FindCountryByCodeResponse_QNAME = new QName("http://dao.world.example.com/", "findCountryByCodeResponse");
    private final static QName _GetAllContinents_QNAME = new QName("http://dao.world.example.com/", "getAllContinents");
    private final static QName _UpdateCity_QNAME = new QName("http://dao.world.example.com/", "updateCity");
    private final static QName _FindCityById_QNAME = new QName("http://dao.world.example.com/", "findCityById");
    private final static QName _GetAllContinentsResponse_QNAME = new QName("http://dao.world.example.com/", "getAllContinentsResponse");
    private final static QName _FindAllCountriesResponse_QNAME = new QName("http://dao.world.example.com/", "findAllCountriesResponse");
    private final static QName _FindCitiesByCountryCodeResponse_QNAME = new QName("http://dao.world.example.com/", "findCitiesByCountryCodeResponse");
    private final static QName _FindCountriesByContinentResponse_QNAME = new QName("http://dao.world.example.com/", "findCountriesByContinentResponse");
    private final static QName _FindCountriesByContinent_QNAME = new QName("http://dao.world.example.com/", "findCountriesByContinent");
    private final static QName _FindAllCities_QNAME = new QName("http://dao.world.example.com/", "findAllCities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.world.dao
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
     * Create an instance of {@link GetAllContinentsResponse }
     * 
     */
    public GetAllContinentsResponse createGetAllContinentsResponse() {
        return new GetAllContinentsResponse();
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
     * Create an instance of {@link RemoveCityResponse }
     * 
     */
    public RemoveCityResponse createRemoveCityResponse() {
        return new RemoveCityResponse();
    }

    /**
     * Create an instance of {@link FindCountryByCodeResponse }
     * 
     */
    public FindCountryByCodeResponse createFindCountryByCodeResponse() {
        return new FindCountryByCodeResponse();
    }

    /**
     * Create an instance of {@link GetAllContinents }
     * 
     */
    public GetAllContinents createGetAllContinents() {
        return new GetAllContinents();
    }

    /**
     * Create an instance of {@link AddCountry }
     * 
     */
    public AddCountry createAddCountry() {
        return new AddCountry();
    }

    /**
     * Create an instance of {@link UpdateCountry }
     * 
     */
    public UpdateCountry createUpdateCountry() {
        return new UpdateCountry();
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
     * Create an instance of {@link UpdateCountryResponse }
     * 
     */
    public UpdateCountryResponse createUpdateCountryResponse() {
        return new UpdateCountryResponse();
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
     * Create an instance of {@link RemoveCountryResponse }
     * 
     */
    public RemoveCountryResponse createRemoveCountryResponse() {
        return new RemoveCountryResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "updateCountryResponse")
    public JAXBElement<UpdateCountryResponse> createUpdateCountryResponse(UpdateCountryResponse value) {
        return new JAXBElement<UpdateCountryResponse>(_UpdateCountryResponse_QNAME, UpdateCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCityByIdResponse")
    public JAXBElement<FindCityByIdResponse> createFindCityByIdResponse(FindCityByIdResponse value) {
        return new JAXBElement<FindCityByIdResponse>(_FindCityByIdResponse_QNAME, FindCityByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountryByCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCountryByCode")
    public JAXBElement<FindCountryByCode> createFindCountryByCode(FindCountryByCode value) {
        return new JAXBElement<FindCountryByCode>(_FindCountryByCode_QNAME, FindCountryByCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "removeCountryResponse")
    public JAXBElement<RemoveCountryResponse> createRemoveCountryResponse(RemoveCountryResponse value) {
        return new JAXBElement<RemoveCountryResponse>(_RemoveCountryResponse_QNAME, RemoveCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCountryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "addCountryResponse")
    public JAXBElement<AddCountryResponse> createAddCountryResponse(AddCountryResponse value) {
        return new JAXBElement<AddCountryResponse>(_AddCountryResponse_QNAME, AddCountryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "addCityResponse")
    public JAXBElement<AddCityResponse> createAddCityResponse(AddCityResponse value) {
        return new JAXBElement<AddCityResponse>(_AddCityResponse_QNAME, AddCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "removeCity")
    public JAXBElement<RemoveCity> createRemoveCity(RemoveCity value) {
        return new JAXBElement<RemoveCity>(_RemoveCity_QNAME, RemoveCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "updateCityResponse")
    public JAXBElement<UpdateCityResponse> createUpdateCityResponse(UpdateCityResponse value) {
        return new JAXBElement<UpdateCityResponse>(_UpdateCityResponse_QNAME, UpdateCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "addCountry")
    public JAXBElement<AddCountry> createAddCountry(AddCountry value) {
        return new JAXBElement<AddCountry>(_AddCountry_QNAME, AddCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "updateCountry")
    public JAXBElement<UpdateCountry> createUpdateCountry(UpdateCountry value) {
        return new JAXBElement<UpdateCountry>(_UpdateCountry_QNAME, UpdateCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "removeCountry")
    public JAXBElement<RemoveCountry> createRemoveCountry(RemoveCountry value) {
        return new JAXBElement<RemoveCountry>(_RemoveCountry_QNAME, RemoveCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "addCity")
    public JAXBElement<AddCity> createAddCity(AddCity value) {
        return new JAXBElement<AddCity>(_AddCity_QNAME, AddCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findAllCitiesResponse")
    public JAXBElement<FindAllCitiesResponse> createFindAllCitiesResponse(FindAllCitiesResponse value) {
        return new JAXBElement<FindAllCitiesResponse>(_FindAllCitiesResponse_QNAME, FindAllCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCitiesByCountryCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCitiesByCountryCode")
    public JAXBElement<FindCitiesByCountryCode> createFindCitiesByCountryCode(FindCitiesByCountryCode value) {
        return new JAXBElement<FindCitiesByCountryCode>(_FindCitiesByCountryCode_QNAME, FindCitiesByCountryCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "removeCityResponse")
    public JAXBElement<RemoveCityResponse> createRemoveCityResponse(RemoveCityResponse value) {
        return new JAXBElement<RemoveCityResponse>(_RemoveCityResponse_QNAME, RemoveCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCountries }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findAllCountries")
    public JAXBElement<FindAllCountries> createFindAllCountries(FindAllCountries value) {
        return new JAXBElement<FindAllCountries>(_FindAllCountries_QNAME, FindAllCountries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountryByCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCountryByCodeResponse")
    public JAXBElement<FindCountryByCodeResponse> createFindCountryByCodeResponse(FindCountryByCodeResponse value) {
        return new JAXBElement<FindCountryByCodeResponse>(_FindCountryByCodeResponse_QNAME, FindCountryByCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContinents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "getAllContinents")
    public JAXBElement<GetAllContinents> createGetAllContinents(GetAllContinents value) {
        return new JAXBElement<GetAllContinents>(_GetAllContinents_QNAME, GetAllContinents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "updateCity")
    public JAXBElement<UpdateCity> createUpdateCity(UpdateCity value) {
        return new JAXBElement<UpdateCity>(_UpdateCity_QNAME, UpdateCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCityById")
    public JAXBElement<FindCityById> createFindCityById(FindCityById value) {
        return new JAXBElement<FindCityById>(_FindCityById_QNAME, FindCityById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllContinentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "getAllContinentsResponse")
    public JAXBElement<GetAllContinentsResponse> createGetAllContinentsResponse(GetAllContinentsResponse value) {
        return new JAXBElement<GetAllContinentsResponse>(_GetAllContinentsResponse_QNAME, GetAllContinentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCountriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findAllCountriesResponse")
    public JAXBElement<FindAllCountriesResponse> createFindAllCountriesResponse(FindAllCountriesResponse value) {
        return new JAXBElement<FindAllCountriesResponse>(_FindAllCountriesResponse_QNAME, FindAllCountriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCitiesByCountryCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCitiesByCountryCodeResponse")
    public JAXBElement<FindCitiesByCountryCodeResponse> createFindCitiesByCountryCodeResponse(FindCitiesByCountryCodeResponse value) {
        return new JAXBElement<FindCitiesByCountryCodeResponse>(_FindCitiesByCountryCodeResponse_QNAME, FindCitiesByCountryCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountriesByContinentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCountriesByContinentResponse")
    public JAXBElement<FindCountriesByContinentResponse> createFindCountriesByContinentResponse(FindCountriesByContinentResponse value) {
        return new JAXBElement<FindCountriesByContinentResponse>(_FindCountriesByContinentResponse_QNAME, FindCountriesByContinentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCountriesByContinent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findCountriesByContinent")
    public JAXBElement<FindCountriesByContinent> createFindCountriesByContinent(FindCountriesByContinent value) {
        return new JAXBElement<FindCountriesByContinent>(_FindCountriesByContinent_QNAME, FindCountriesByContinent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.world.example.com/", name = "findAllCities")
    public JAXBElement<FindAllCities> createFindAllCities(FindAllCities value) {
        return new JAXBElement<FindAllCities>(_FindAllCities_QNAME, FindAllCities.class, null, value);
    }

}

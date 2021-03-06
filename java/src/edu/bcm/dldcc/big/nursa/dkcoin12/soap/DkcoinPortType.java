
package edu.bcm.dldcc.big.nursa.dkcoin12.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "dkcoinPortType", targetNamespace = "urn:dkcoin")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DkcoinPortType {


    /**
     * Updates collections.  If a collection does not yet exist then it is created
     * 
     * @param myKey
     * @param collection
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeCollectionResult>
     */
    @WebMethod(action = "#updateCollection")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "updateCollection", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeCollections")
    @ResponseWrapper(localName = "updateCollectionResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeCollectionResults")
    public List<TypeCollectionResult> updateCollection(
    	@WebParam(header = true, name = "session") TypeSession myKey,
        @WebParam(name = "collection", targetNamespace = "urn:dkcoin")
        List<TypeCollection> collection);

    /**
     * Deletes collections.
     * 
     * @param myKey
     * @param collection
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeCollectionResult>
     */
    @WebMethod(action = "#deleteCollection")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "deleteCollection", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeDeleteCollections")
    @ResponseWrapper(localName = "deleteCollectionResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeDeleteCollectionResults")
    public List<TypeCollectionResult> deleteCollection(
    	@WebParam(header = true, name = "session") TypeSession myKey,
        @WebParam(name = "collection", targetNamespace = "urn:dkcoin")
        List<TypeDeleteCollection> collection);

    /**
     * Updates resources.  If a resource does not yet exist then it is created
     * 
     * @param myKey
     * @param resource
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceResult>
     */
    @WebMethod(action = "#updateResource")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "updateResource", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeResources")
    @ResponseWrapper(localName = "updateResourceResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceResults")
    public List<TypeResourceResult> updateResource(
    	@WebParam(header = true, name = "session") TypeSession myKey,
        @WebParam(name = "resource", targetNamespace = "urn:dkcoin")
        List<TypeResource> resource);

    /**
     * Appends resources.  If a resource does not yet exist then it is created
     * 
     * @param myKey
     * @param resource
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceResult>
     */
    @WebMethod(action = "#appendResource")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "appendResource", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeResources")
    @ResponseWrapper(localName = "appendResourceResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceResults")
    public List<TypeResourceResult> appendResource(
    	@WebParam(header = true, name = "session") TypeSession myKey,
        @WebParam(name = "resource", targetNamespace = "urn:dkcoin")
        List<TypeResource> resource);

    /**
     * Deletes resources.
     * 
     * @param myKey
     * @param resource
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceResult>
     */
    @WebMethod(action = "#deleteResource")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "deleteResource", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeDeleteResources")
    @ResponseWrapper(localName = "deleteResourceResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeDeleteResourceResults")
    public List<TypeResourceResult> deleteResource(
    	@WebParam(header = true, name = "session") TypeSession myKey,
        @WebParam(name = "resource", targetNamespace = "urn:dkcoin")
        List<TypeDeleteResource> resource);

    /**
     * Starts an authenticated session
     * 
     * @param sessionkey
     * @param result
     * @param accountName
     * @param password
     * @param ipAddress
     */
    @WebMethod(action = "#startSession")
    @RequestWrapper(localName = "startSession", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeStartSession")
    @ResponseWrapper(localName = "startSessionResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeStartSessionResults")
    public void startSession(
        @WebParam(name = "account_name", targetNamespace = "urn:dkcoin")
        String accountName,
        @WebParam(name = "password", targetNamespace = "urn:dkcoin")
        String password,
        @WebParam(name = "ip_address", targetNamespace = "urn:dkcoin")
        List<String> ipAddress,
        @WebParam(name = "result", targetNamespace = "urn:dkcoin", mode = WebParam.Mode.OUT)
        Holder<String> result,
        @WebParam(name = "sessionkey", targetNamespace = "urn:dkcoin", mode = WebParam.Mode.OUT)
        Holder<String> sessionkey);

    /**
     * Ends an authenticated session
     * 
     * @param sessionkey
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "#endSession")
    @WebResult(name = "result", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "endSession", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeEndSession")
    @ResponseWrapper(localName = "endSessionResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeEndSessionResults")
    public String endSession(
        @WebParam(name = "sessionkey", targetNamespace = "urn:dkcoin")
        String sessionkey);

    /**
     * Searches the resources and returns the matching resources
     * 
     * @param params
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceSearchResult>
     */
    @WebMethod(action = "#searchResource")
    @WebResult(name = "resource", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "searchResource", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeSearchResource")
    @ResponseWrapper(localName = "searchResourceResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeSearchResourceResults")
    public List<TypeResourceSearchResult> searchResource(
        @WebParam(name = "params", targetNamespace = "urn:dkcoin")
        List<TypeSearchResourceParams> params);

    /**
     * Searches all entities and returns the matches
     * 
     * @param params
     * @return
     *     returns java.util.List<edu.bcm.dldcc.big.nursa.dkcoin12.TypeSearchResultEntity>
     */
    @WebMethod(action = "#searchKeyword")
    @WebResult(name = "entity", targetNamespace = "urn:dkcoin")
    @RequestWrapper(localName = "searchKeyword", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeSearchKeyword")
    @ResponseWrapper(localName = "searchKeywordResults", targetNamespace = "urn:dkcoin", className = "edu.bcm.dldcc.big.nursa.dkcoin12.TypeSearchKeywordResults")
    public List<TypeSearchResultEntity> searchKeyword(
        @WebParam(name = "params", targetNamespace = "urn:dkcoin")
        List<TypeSearchKeywordParams> params);

    /**
     * Returns a list of sources
     * 
     * @param parameters
     * @return
     *     returns edu.bcm.dldcc.big.nursa.dkcoin12.TypeSourcesResults
     */
    @WebMethod(action = "#getSources")
    @WebResult(name = "getSourcesResults", targetNamespace = "urn:dkcoin", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public TypeSourcesResults getSources(
        @WebParam(name = "getSources", targetNamespace = "urn:dkcoin", partName = "parameters")
        Object parameters);

    /**
     * Returns a list of valid resource types
     * 
     * @param parameters
     * @return
     *     returns edu.bcm.dldcc.big.nursa.dkcoin12.TypeResourceTypesResults
     */
    @WebMethod(action = "#getResourceTypes")
    @WebResult(name = "getResourceTypesResults", targetNamespace = "urn:dkcoin", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public TypeResourceTypesResults getResourceTypes(
        @WebParam(name = "getResourceTypes", targetNamespace = "urn:dkcoin", partName = "parameters")
        Object parameters);

}

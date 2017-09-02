
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OGService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://localhost:8733/Design_Time_Addresses/OpenGloveWCF/OGService/?singleWsdl")
public class OGService
    extends Service
{

    private final static URL OGSERVICE_WSDL_LOCATION;
    private final static WebServiceException OGSERVICE_EXCEPTION;
    private final static QName OGSERVICE_QNAME = new QName("http://tempuri.org/", "OGService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8733/Design_Time_Addresses/OpenGloveWCF/OGService/?singleWsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OGSERVICE_WSDL_LOCATION = url;
        OGSERVICE_EXCEPTION = e;
    }

    public OGService() {
        super(__getWsdlLocation(), OGSERVICE_QNAME);
    }

    public OGService(WebServiceFeature... features) {
        super(__getWsdlLocation(), OGSERVICE_QNAME, features);
    }

    public OGService(URL wsdlLocation) {
        super(wsdlLocation, OGSERVICE_QNAME);
    }

    public OGService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OGSERVICE_QNAME, features);
    }

    public OGService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OGService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IOGService
     */
    @WebEndpoint(name = "BasicHttpBinding_IOGService")
    public IOGService getBasicHttpBindingIOGService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOGService"), IOGService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOGService
     */
    @WebEndpoint(name = "BasicHttpBinding_IOGService")
    public IOGService getBasicHttpBindingIOGService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOGService"), IOGService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OGSERVICE_EXCEPTION!= null) {
            throw OGSERVICE_EXCEPTION;
        }
        return OGSERVICE_WSDL_LOCATION;
    }

}
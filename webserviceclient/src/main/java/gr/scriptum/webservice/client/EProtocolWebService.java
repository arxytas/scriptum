
package gr.scriptum.webservice.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "EProtocolWebService", targetNamespace = "http://wserver.eprotocol.scriptum.gr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EProtocolWebService {


    /**
     * 
     * @param message
     * @return
     *     returns gr.scriptum.webservice.client.ProtocolReceipt
     * @throws ProtocolWebServiceFault
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "receiveOutgoingProtocol", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.ReceiveOutgoingProtocol")
    @ResponseWrapper(localName = "receiveOutgoingProtocolResponse", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.ReceiveOutgoingProtocolResponse")
    public ProtocolReceipt receiveOutgoingProtocol(
        @WebParam(name = "message", targetNamespace = "")
        OutgoingProtocolMessage message)
        throws ProtocolWebServiceFault
    ;

    /**
     * 
     * @param query
     * @return
     *     returns java.util.List<gr.scriptum.webservice.client.ProtocolInfo>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inquireProtocols", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.InquireProtocols")
    @ResponseWrapper(localName = "inquireProtocolsResponse", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.InquireProtocolsResponse")
    public List<ProtocolInfo> inquireProtocols(
        @WebParam(name = "query", targetNamespace = "")
        ProtocolQuery query)
        throws Exception_Exception
    ;

    /**
     * 
     * @param message
     * @return
     *     returns gr.scriptum.webservice.client.ProtocolReceipt
     * @throws ProtocolWebServiceFault
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "receiveIncomingProtocol", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.ReceiveIncomingProtocol")
    @ResponseWrapper(localName = "receiveIncomingProtocolResponse", targetNamespace = "http://wserver.eprotocol.scriptum.gr/", className = "gr.scriptum.webservice.client.ReceiveIncomingProtocolResponse")
    public ProtocolReceipt receiveIncomingProtocol(
        @WebParam(name = "message", targetNamespace = "")
        IncomingProtocolMessage message)
        throws ProtocolWebServiceFault
    ;

}
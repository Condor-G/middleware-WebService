/**
 * TraditionalSimplifiedWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public class TraditionalSimplifiedWebServiceLocator extends org.apache.axis.client.Service implements cn.com.WebXml.TraditionalSimplifiedWebService {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>���ļ�����<->������ת�� WEB ����</strong><br />�����ļ�����<->������ת��Web Services�벻Ҫ�����κ���ҵĿ�ģ�������Ҫ��<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">��ϵ����</a>����ӭ����������
 * QQ��8409035<br /><strong>ʹ�ñ�վ WEB ������ע�������ӱ�վ��http://www.webxml.com.cn/
 * ��л��ҵ�֧��</strong>��<br /><br />&nbsp;
 */

    public TraditionalSimplifiedWebServiceLocator() {
    }


    public TraditionalSimplifiedWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TraditionalSimplifiedWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TraditionalSimplifiedWebServiceSoap
    private java.lang.String TraditionalSimplifiedWebServiceSoap_address = "http://ws.webxml.com.cn/WebServices/TraditionalSimplifiedWebService.asmx";

    public java.lang.String getTraditionalSimplifiedWebServiceSoapAddress() {
        return TraditionalSimplifiedWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TraditionalSimplifiedWebServiceSoapWSDDServiceName = "TraditionalSimplifiedWebServiceSoap";

    public java.lang.String getTraditionalSimplifiedWebServiceSoapWSDDServiceName() {
        return TraditionalSimplifiedWebServiceSoapWSDDServiceName;
    }

    public void setTraditionalSimplifiedWebServiceSoapWSDDServiceName(java.lang.String name) {
        TraditionalSimplifiedWebServiceSoapWSDDServiceName = name;
    }

    public cn.com.WebXml.TraditionalSimplifiedWebServiceSoap getTraditionalSimplifiedWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TraditionalSimplifiedWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTraditionalSimplifiedWebServiceSoap(endpoint);
    }

    public cn.com.WebXml.TraditionalSimplifiedWebServiceSoap getTraditionalSimplifiedWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.com.WebXml.TraditionalSimplifiedWebServiceSoapStub _stub = new cn.com.WebXml.TraditionalSimplifiedWebServiceSoapStub(portAddress, this);
            _stub.setPortName(getTraditionalSimplifiedWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTraditionalSimplifiedWebServiceSoapEndpointAddress(java.lang.String address) {
        TraditionalSimplifiedWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.com.WebXml.TraditionalSimplifiedWebServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.com.WebXml.TraditionalSimplifiedWebServiceSoapStub _stub = new cn.com.WebXml.TraditionalSimplifiedWebServiceSoapStub(new java.net.URL(TraditionalSimplifiedWebServiceSoap_address), this);
                _stub.setPortName(getTraditionalSimplifiedWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TraditionalSimplifiedWebServiceSoap".equals(inputPortName)) {
            return getTraditionalSimplifiedWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webxml.com.cn/", "TraditionalSimplifiedWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webxml.com.cn/", "TraditionalSimplifiedWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TraditionalSimplifiedWebServiceSoap".equals(portName)) {
            setTraditionalSimplifiedWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}


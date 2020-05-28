package cn.com.WebXml;

public class TraditionalSimplifiedWebServiceSoapProxy implements cn.com.WebXml.TraditionalSimplifiedWebServiceSoap {
  private String _endpoint = null;
  private cn.com.WebXml.TraditionalSimplifiedWebServiceSoap traditionalSimplifiedWebServiceSoap = null;
  
  public TraditionalSimplifiedWebServiceSoapProxy() {
    _initTraditionalSimplifiedWebServiceSoapProxy();
  }
  
  public TraditionalSimplifiedWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTraditionalSimplifiedWebServiceSoapProxy();
  }
  
  private void _initTraditionalSimplifiedWebServiceSoapProxy() {
    try {
      traditionalSimplifiedWebServiceSoap = (new cn.com.WebXml.TraditionalSimplifiedWebServiceLocator()).getTraditionalSimplifiedWebServiceSoap();
      if (traditionalSimplifiedWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)traditionalSimplifiedWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)traditionalSimplifiedWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (traditionalSimplifiedWebServiceSoap != null)
      ((javax.xml.rpc.Stub)traditionalSimplifiedWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.com.WebXml.TraditionalSimplifiedWebServiceSoap getTraditionalSimplifiedWebServiceSoap() {
    if (traditionalSimplifiedWebServiceSoap == null)
      _initTraditionalSimplifiedWebServiceSoapProxy();
    return traditionalSimplifiedWebServiceSoap;
  }
  
  public java.lang.String toSimplifiedChinese(java.lang.String sText) throws java.rmi.RemoteException{
    if (traditionalSimplifiedWebServiceSoap == null)
      _initTraditionalSimplifiedWebServiceSoapProxy();
    return traditionalSimplifiedWebServiceSoap.toSimplifiedChinese(sText);
  }
  
  public java.lang.String toTraditionalChinese(java.lang.String sText) throws java.rmi.RemoteException{
    if (traditionalSimplifiedWebServiceSoap == null)
      _initTraditionalSimplifiedWebServiceSoapProxy();
    return traditionalSimplifiedWebServiceSoap.toTraditionalChinese(sText);
  }
  
  
}
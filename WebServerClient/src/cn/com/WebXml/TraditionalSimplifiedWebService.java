/**
 * TraditionalSimplifiedWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface TraditionalSimplifiedWebService extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>中文简体字<->繁体字转换 WEB 服务</strong><br />此中文简体字<->繁体字转换Web Services请不要用于任何商业目的，若有需要请<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。
 * QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持</strong>！<br /><br />&nbsp;
 */
    public java.lang.String getTraditionalSimplifiedWebServiceSoapAddress();

    public cn.com.WebXml.TraditionalSimplifiedWebServiceSoap getTraditionalSimplifiedWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public cn.com.WebXml.TraditionalSimplifiedWebServiceSoap getTraditionalSimplifiedWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}


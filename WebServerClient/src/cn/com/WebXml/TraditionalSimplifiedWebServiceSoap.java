/**
 * TraditionalSimplifiedWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.com.WebXml;

public interface TraditionalSimplifiedWebServiceSoap extends java.rmi.Remote {

    /**
     * <br /><h3>繁体字转换为简体字</h3><p>输入参数：sText = 字符串； 返回数据：字符串。</p><br
     * />
     */
    public java.lang.String toSimplifiedChinese(java.lang.String sText) throws java.rmi.RemoteException;

    /**
     * <br /><h3>简体字转换为繁体字</h3><p>输入参数：sText = 字符串； 返回数据：字符串。</p><br
     * />
     */
    public java.lang.String toTraditionalChinese(java.lang.String sText) throws java.rmi.RemoteException;
}

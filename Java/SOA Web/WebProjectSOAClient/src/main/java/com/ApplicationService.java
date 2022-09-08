/**
 * ApplicationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface ApplicationService extends javax.xml.rpc.Service {
    public java.lang.String getApplicationAddress();

    public com.Application getApplication() throws javax.xml.rpc.ServiceException;

    public com.Application getApplication(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

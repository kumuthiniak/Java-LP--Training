package com;

public class ApplicationProxy implements com.Application {
  private String _endpoint = null;
  private com.Application application = null;
  
  public ApplicationProxy() {
    _initApplicationProxy();
  }
  
  public ApplicationProxy(String endpoint) {
    _endpoint = endpoint;
    _initApplicationProxy();
  }
  
  private void _initApplicationProxy() {
    try {
      application = (new com.ApplicationServiceLocator()).getApplication();
      if (application != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)application)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)application)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (application != null)
      ((javax.xml.rpc.Stub)application)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Application getApplication() {
    if (application == null)
      _initApplicationProxy();
    return application;
  }
  
  public java.lang.String cal(int in0, int in1, int in2) throws java.rmi.RemoteException{
    if (application == null)
      _initApplicationProxy();
    return application.cal(in0, in1, in2);
  }
  
  
}
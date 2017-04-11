package com.cesar20991.service;

public class DemoProxy implements com.cesar20991.service.Demo {
  private String _endpoint = null;
  private com.cesar20991.service.Demo demo = null;
  
  public DemoProxy() {
    _initDemoProxy();
  }
  
  public DemoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDemoProxy();
  }
  
  private void _initDemoProxy() {
    try {
      demo = (new com.cesar20991.service.impl.DemoImplServiceLocator()).getDemoImplPort();
      if (demo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)demo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (demo != null)
      ((javax.xml.rpc.Stub)demo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cesar20991.service.Demo getDemo() {
    if (demo == null)
      _initDemoProxy();
    return demo;
  }
  
  public java.lang.String mostrar() throws java.rmi.RemoteException{
    if (demo == null)
      _initDemoProxy();
    return demo.mostrar();
  }
  
  public java.lang.String saludar(java.lang.String arg0) throws java.rmi.RemoteException{
    if (demo == null)
      _initDemoProxy();
    return demo.saludar(arg0);
  }
  
  
}
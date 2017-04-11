package com.cesar20991.service;

public class IPersonaServiceProxy implements com.cesar20991.service.IPersonaService {
  private String _endpoint = null;
  private com.cesar20991.service.IPersonaService iPersonaService = null;
  
  public IPersonaServiceProxy() {
    _initIPersonaServiceProxy();
  }
  
  public IPersonaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIPersonaServiceProxy();
  }
  
  private void _initIPersonaServiceProxy() {
    try {
      iPersonaService = (new com.cesar20991.service.impl.PersonaServiceImplServiceLocator()).getPersonaServiceImplPort();
      if (iPersonaService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iPersonaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iPersonaService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iPersonaService != null)
      ((javax.xml.rpc.Stub)iPersonaService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cesar20991.service.IPersonaService getIPersonaService() {
    if (iPersonaService == null)
      _initIPersonaServiceProxy();
    return iPersonaService;
  }
  
  public com.cesar20991.service.Persona[] listar() throws java.rmi.RemoteException{
    if (iPersonaService == null)
      _initIPersonaServiceProxy();
    return iPersonaService.listar();
  }
  
  
}
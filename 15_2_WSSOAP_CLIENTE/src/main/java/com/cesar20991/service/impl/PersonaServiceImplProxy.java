package com.cesar20991.service.impl;

public class PersonaServiceImplProxy implements com.cesar20991.service.impl.PersonaServiceImpl {
  private String _endpoint = null;
  private com.cesar20991.service.impl.PersonaServiceImpl personaServiceImpl = null;
  
  public PersonaServiceImplProxy() {
    _initPersonaServiceImplProxy();
  }
  
  public PersonaServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonaServiceImplProxy();
  }
  
  private void _initPersonaServiceImplProxy() {
    try {
      personaServiceImpl = (new com.cesar20991.service.impl.PersonaServiceImplServiceLocator()).getPersonaServiceImpl();
      if (personaServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personaServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personaServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personaServiceImpl != null)
      ((javax.xml.rpc.Stub)personaServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cesar20991.service.impl.PersonaServiceImpl getPersonaServiceImpl() {
    if (personaServiceImpl == null)
      _initPersonaServiceImplProxy();
    return personaServiceImpl;
  }
  
  public void registrar(com.cesar20991.model.Persona per) throws java.rmi.RemoteException{
    if (personaServiceImpl == null)
      _initPersonaServiceImplProxy();
    personaServiceImpl.registrar(per);
  }
  
  
}
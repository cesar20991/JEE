/**
 * PersonaServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cesar20991.service.impl;

public class PersonaServiceImplServiceLocator extends org.apache.axis.client.Service implements com.cesar20991.service.impl.PersonaServiceImplService {

    public PersonaServiceImplServiceLocator() {
    }


    public PersonaServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PersonaServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PersonaServiceImpl
    private java.lang.String PersonaServiceImpl_address = "http://localhost:8080/15_1_WSSOAP_CRUD/services/PersonaServiceImpl";

    public java.lang.String getPersonaServiceImplAddress() {
        return PersonaServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PersonaServiceImplWSDDServiceName = "PersonaServiceImpl";

    public java.lang.String getPersonaServiceImplWSDDServiceName() {
        return PersonaServiceImplWSDDServiceName;
    }

    public void setPersonaServiceImplWSDDServiceName(java.lang.String name) {
        PersonaServiceImplWSDDServiceName = name;
    }

    public com.cesar20991.service.impl.PersonaServiceImpl getPersonaServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PersonaServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPersonaServiceImpl(endpoint);
    }

    public com.cesar20991.service.impl.PersonaServiceImpl getPersonaServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cesar20991.service.impl.PersonaServiceImplSoapBindingStub _stub = new com.cesar20991.service.impl.PersonaServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getPersonaServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPersonaServiceImplEndpointAddress(java.lang.String address) {
        PersonaServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cesar20991.service.impl.PersonaServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cesar20991.service.impl.PersonaServiceImplSoapBindingStub _stub = new com.cesar20991.service.impl.PersonaServiceImplSoapBindingStub(new java.net.URL(PersonaServiceImpl_address), this);
                _stub.setPortName(getPersonaServiceImplWSDDServiceName());
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
        if ("PersonaServiceImpl".equals(inputPortName)) {
            return getPersonaServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.cesar20991.com", "PersonaServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.cesar20991.com", "PersonaServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PersonaServiceImpl".equals(portName)) {
            setPersonaServiceImplEndpointAddress(address);
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

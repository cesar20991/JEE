package com.cesar20991.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cesar20991.app.Documento;

public class DocumentoUnit {

	@Test
	public void buscarPersonaCP1() {		
		assertTrue(Documento.buscarPersona("DNI","72301306").equalsIgnoreCase("OK"));		
	}

	@Test
	public void buscarPersonaCP2() {		
		assertTrue(Documento.buscarPersona("RUC","0").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP3() {		
		assertTrue(Documento.buscarPersona("DNI","100000000").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP4() {		
		assertTrue(Documento.buscarPersona("DNI","CERO").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP5() {		
		assertTrue(Documento.buscarPersona("DNI","CU4TR0").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP6() {		
		assertTrue(Documento.buscarPersona("DNI",null).equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP7() {		
		assertTrue(Documento.buscarPersona("159","72301306").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP8() {		
		assertTrue(Documento.buscarPersona("H0L4","72301306").equalsIgnoreCase("ERROR"));		
	}
	
	@Test
	public void buscarPersonaCP9() {		
		assertTrue(Documento.buscarPersona(null,"0").equalsIgnoreCase("ERROR"));		
	}
}

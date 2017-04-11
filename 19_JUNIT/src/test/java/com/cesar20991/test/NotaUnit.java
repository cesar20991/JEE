package com.cesar20991.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cesar20991.app.Nota;

public class NotaUnit {

	@Test
	public void mostrarNotaCP1() {		
		assertTrue(Nota.evaluarNota("0").equalsIgnoreCase("DESAPROBADO"));		
	}
	
	@Test
	public void mostrarNotaCP2() {
		assertTrue(Nota.evaluarNota("11").equalsIgnoreCase("APROBADO"));
	}
	
	@Test
	public void mostrarNotaCP3() {
		assertTrue(Nota.evaluarNota("21").equalsIgnoreCase("NO VALIDO"));
	}

	@Test
	public void mostrarNotaCP4() {
		assertTrue(Nota.evaluarNota("-1").equalsIgnoreCase("NO VALIDO"));
	}
	
	@Test
	public void mostrarNotaCP5() {
		assertTrue(Nota.evaluarNota("CERO").equalsIgnoreCase("NO VALIDO"));
	}
	
	@Test
	public void mostrarNotaCP6() {
		assertTrue(Nota.evaluarNota("CU4TR0").equalsIgnoreCase("NO VALIDO"));
	}
	
	@Test
	public void mostrarNotaCP7() {
		assertTrue(Nota.evaluarNota(null).equalsIgnoreCase("NO VALIDO"));
	}
}

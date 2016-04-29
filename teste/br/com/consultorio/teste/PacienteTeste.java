package br.com.consultorio.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.consultorio.Paciente;

public class PacienteTeste {

	@Test
	public void baixaPesoMuitoGraveTeste() {
		Paciente pc1 = new Paciente(50, 1.83);
		assertEquals(14, pc1.calcularImc(), 1);
		assertEquals("Baixo peso muito grave", pc1.diagnostico());
	}
	
	@Test
	public void baixaPesoGraveTeste() {
		Paciente pc1 = new Paciente(55, 1.83);
		assertEquals(16, pc1.calcularImc(), 1);
		assertEquals("Baixo peso grave", pc1.diagnostico());
	}
	
	@Test
	public void baixaPesoTeste() {
		Paciente pc1 = new Paciente(60, 1.83);
		assertEquals(17, pc1.calcularImc(), 1);
		assertEquals("Baixo peso", pc1.diagnostico());
	}
	
	@Test
	public void pesoNormalTeste() {
		Paciente pc1 = new Paciente(65, 1.83);
		assertEquals(19, pc1.calcularImc(), 1);
		assertEquals("Peso normal", pc1.diagnostico());
	}
	
	@Test
	public void sobrepesoTeste() {
		Paciente pc1 = new Paciente(85, 1.83);
		assertEquals(25, pc1.calcularImc(), 1);
		assertEquals("Sobrepeso", pc1.diagnostico());
	}
	
	@Test
	public void obesidadeGrauUmTeste() {
		Paciente pc1 = new Paciente(105, 1.83);
		assertEquals(31, pc1.calcularImc(), 1);
		assertEquals("Obesidade grau I", pc1.diagnostico());
	}
	
	@Test
	public void obesidadeGrauDoisTeste() {
		Paciente pc1 = new Paciente(120, 1.83);
		assertEquals(35, pc1.calcularImc(), 1);
		assertEquals("Obesidade grau II", pc1.diagnostico());
	}
	
	@Test
	public void obesidadeGrauTresTeste() {
		Paciente pc1 = new Paciente(150, 1.83);
		assertEquals(44, pc1.calcularImc(), 1);
		assertEquals("Obesidade grau III (obesidade mórbida)", pc1.diagnostico());
	}
}

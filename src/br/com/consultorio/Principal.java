package br.com.consultorio;

public class Principal {

	public static void main(String[] args) {
		
		Paciente pc1 = new Paciente(85, 1.83);
		System.out.println(pc1.calcularImc());
		System.out.println(pc1.diagnostico());
		
		Paciente pc2 = new Paciente(120, 1.95);
		System.out.println(pc2.calcularImc());
		System.out.println(pc2.diagnostico());
		
		Paciente pc3 = new Paciente(60, 1.80);
		System.out.println(pc3.calcularImc());
		System.out.println(pc3.diagnostico());
	}
	
}

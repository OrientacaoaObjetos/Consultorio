package br.com.consultorio;

public class Paciente {
	
	private double pesoQuilos;
	private double alturaMetros;

	public Paciente(double pesoQuilos, double alturaMetros) {
		this.pesoQuilos = pesoQuilos;
		this.alturaMetros = alturaMetros;
	}
	
	public double calcularImc() {
		return this.pesoQuilos / (this.alturaMetros * this.alturaMetros);
	}
	
	public String diagnostico() {
		
		double imc = calcularImc();
		
		if (imc < 16) {
			return "Baixo peso muito grave";
		} else if (imc >= 16 && imc < 17) {
			return "Baixo peso grave";
		} else if (imc >= 17 && imc < 18.50) {
			return "Baixo peso";
		} else if (imc >= 18.50 && imc < 25) {
			return "Peso normal";
		} else if (imc >= 25 && imc < 30) {
			return "Sobrepeso";
		} else if (imc >= 30 && imc < 35) {	
			return "Obesidade grau I";
		} else if (imc >= 35 && imc < 40) {
			return "Obesidade grau II";
		} else if (imc >= 40) {
			return "Obesidade grau III (obesidade mórbida)";
		}
		
		return "";
		
	}
}

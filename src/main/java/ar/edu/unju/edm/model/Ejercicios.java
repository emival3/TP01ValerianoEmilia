package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Ejercicios {
private int numero;
	
	public Ejercicios() {
		// TODO Auto-generated constructor stub
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	

	// EJERCICIOS
	
	//PUNTO 01
	
	public int factorial() {
		int factorial=1;
		
		while(numero!=0) {
			factorial*=numero;
			numero--;
		}
		
		return factorial;
	}
	
	//PUNTO 02
	
	public boolean bisiesto() {
		boolean esbisiesto=true;
		
		if(numero%4 != 0 || (numero%100 == 0 && numero%400 != 0)) {
			esbisiesto=false;
		}
		
		return esbisiesto;
	}
	
	//PUNTO 03
	
	public String par() {
		String resultado=" no es par";
		
		if (numero%2==0) {
			resultado=" es par";
		}
		return resultado;
	}
	
	//PUNTO 04
	
	public String mes() {
		String esmes="el numero ingresado no corresponde a un mes";
		
		if(numero>0 && numero<13) {
			esmes="el numero ingresado corresponde a un mes del anio";
		}
		
		return esmes;
	}
		
	// PUNTO 06
		
	public String evaluarCondicion() {
		String condicion="";
		
		if(numero>=7 && numero<=10) {
			condicion="Promociona";
		}else {
			if(numero==6) {
				condicion="Regulariza";
			}else {
				if(numero<6 && numero>=1) {
					condicion="Desaprueba";
				}else {
					condicion="VALOR NO PERMITDO";
				}
			}
		}
		
		return condicion;
	}
	
	// PUNTO 08
	
		public String secuencia() {
			String resultadoString="";
			int resultadoInteger=1;
			int factorMultiplicador=1;
			
			do {
				
				resultadoInteger = numero * factorMultiplicador;
				factorMultiplicador += 1;
				resultadoString += Integer.toString(resultadoInteger) + " - ";
				
			}while((resultadoInteger+numero) < 100);
			
			return resultadoString;
		}
		
	// PUNTO 9
		
		public String mostrarNumerosFor() {
			String resultado="";
		
			for(int i=320; i>=160; i=i-20) {
				resultado += Integer.toString(i) + " - ";
			}
			
			return resultado;
		}
		
	// PUNTO 10
		
		public String mostrarNumerosWhile() {
			String resultado="";
			int i=320;
			
			while(i>=160) {
				resultado += Integer.toString(i) + " - ";
				i-=20;
			}
			
			return resultado;
		}
		
	// PUNTO 11
		
		public String mostrarNumerosDoWhile() {
			String resultado="";
			int i=320;
			
			do {
				resultado += Integer.toString(i) + " - ";
				i-=20;
			}while(i>=160);
			
			return resultado;
		}
		
	// PUNTO 12
		
		public String calculoTiempo() {
			double tiempo = Math.sqrt((2*numero)/9.81);
			return Double.toString(tiempo);
		}

}


package ar.com.codoacodo;

public class Auto {
	
	/*
	 atributos
	 */
	boolean encendido;
	float velocidad; // alt + shift + r = renombrar variable en todos lados
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//todas las clases tienen un constructor por defecto
	// constructor por defecto / explicito
	Auto(){
		//aca va el codifo cuando nace el auto
		this.encendido = false;
		this.velocidadMaxima = 200;
		this.velocidad = 0;
	}
	
	Auto(final float velocidadMaxima){
		// this. // f6 (para seguir debug)
		this.velocidadMaxima = velocidadMaxima;
		this.velocidad = 0;
	}
	
	//metodos
	void encender() {
		if(!encendido) {
		System.out.println("Run Run");
		encendido = true;
		}else {
			System.out.println("Ya encendiste el auto muchacho");
		}
	}
	
	void apagar(){
		if (this.encendido) {
			this.encendido = false;
			this.detener();
		} else {
			System.out.println("Ya esta apagado");
		}
		
	}
	
	void acelerar(){
		if(encendido) {
			
			if(this.velocidad < velocidadMaxima) {
				//ctrl + shift + i
				System.out.println("marchando");
				this.velocidad ++;
			}else {
				System.out.println("se quema el auto");
			}
			
		} else {
			System.out.println("encienda el auto");
		}
		
	}
	
	void frenar(){
	//	if(this.encendido) {
			if(this.velocidad > 0) {
				System.out.println("Frenando");
				this.velocidad --;
			} else {
				System.out.println("No te estas moviendo");
			}
	//	} else {
	//		System.out.println("no esta encendido");
	//	}
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
	//ctrl + shift + i para inspeccionar logicas
	
	void aFondo(){
		if(encendido) {
			while(this.velocidad < velocidadMaxima) {
				System.out.println("marchando");
				this.velocidad ++;				
			} 
			System.out.println("se quema el auto");				
		} else {
			System.out.println("encienda el auto");
		}
		
	}

	public void detener() {
		while (this.velocidad > 0) {
			this.frenar();
		}
		System.out.println("Te detuviste");
	}
	
	
	
}

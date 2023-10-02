package flujoControl;

import java.util.Scanner;

public class EstructurasDeControl {//Debe coincidir la clase con el nombre de nuestro documento
	
	public static void main(String[] args) {//Todo nuestro código dentro de mi método main
		
		//recordar que para que algo se ejecute siempre debe ir dentro del método principal	
		
		//Primero declaramos una variable del tipo String donde almaceno un dato
		
		Scanner scanner = new Scanner(System.in);
		
		
		String citaProgramada = null;//Dejamos en null y después lo cambiamos a una fecha "28-09-23"
		citaProgramada = "28-09-23";
		
		if (citaProgramada != null) {
			System.out.println("Hay una cita programada el día: " + citaProgramada);
		}else {
			System.out.println("Puede registrar su cita.");
		}
		
		System.out.println("****************************************");
		
		//Seleccionando una opción y almacenando la variable opcion
		
		int op = scanner.nextInt();
		
		//Creamos el menu
		System.out.println("Menu del consultorio El Diente Feliz");
		System.out.println("1.Programar cita");
		System.out.println("2.Verificar cita");
		System.out.println("3.Cancelar cita");
		System.out.println("4.Mover cita");
		System.out.println("5.Salir");
		System.out.println("Seleccione una opcion del menu (1 - 4)");
		
		switch(op) {
		
		case 1:
			System.out.println("Usted ha seleccionado la opcion Programar cita");//Agrega la lógica para programar una cita
			break;
		
		case 2:
			System.out.println("Usted ha seleccionado la opcion Verificar cita");
			break;
			
		case 3:
			System.out.println("Usted ha seleccionado la opcion Cancelar cita");
			break;
			
		case 4:
			System.out.println("Usted ha seleccionado la opcion Mover cita");
			break;
			
		case 5:
			System.out.println("Usted ha seleccionado la opcion Salir");
			break;
			
		default:
			System.out.println("Opcion no valida");
			break;
		}//fin del switch
		
		
		
		
		
		
		
		
		
		
		
		}//Fin de main

}//Fin clase

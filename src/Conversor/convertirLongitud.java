package Conversor;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class convertirLongitud {
	//Variables globales
		private static double cifra;
		private static String opConversion;

		//Metodo que muestra los datos que se necesita para hacer la conversión
		public static void datosConvertir() {
				//Seleccionar la opción de conversión
				Object seleccionOpcion = JOptionPane.showInputDialog(null, "Elije las temperaturas a la que deseas convertir"
						, "Temperaturas", JOptionPane.QUESTION_MESSAGE, 
						null, new Object[] {"De Metros a Pies", "De Pies a Metros",
								"De Pulgadas a Centímetros", "De Centímetros a Pulgadas", 
								"De Pulgadas a Pies", "De Pies a Pulgadas"}, "Seleccione");
				//Sin este if el programa no cierra al presionar "cancelar"
				if(seleccionOpcion == null) {
					System.exit(0);
				}
				try {
					String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad"
							+ "de dinero que deseas convertir:");
					if(cantidad == null) {
						System.exit(0);
					}
					//Cantidad a convertir
					cifra = Double.parseDouble(cantidad);
				}
				catch (Exception e){
					//Si el espacio esta en blanco o un valor no valido salta  la advertencia y lanza el m
					JOptionPane.showMessageDialog(null, "Valor no válido");
					datosConvertir();
				}		
				//Divisa a convertir
				opConversion = seleccionOpcion.toString();
			
		}
		
		//Metodo que hace la conversión
		public static void calcular() {
			//Limita el total a 2 decimales
			DecimalFormat df = new DecimalFormat("0.00");
			//Variable que almacena el valor a mostrar
			double total = 0;
			
			//Switch que contiene todas las conversiones
			switch(opConversion) {
			case "De Metros a Pies":
				total = cifra * 3.2808;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Pies");
				break;
			case "De Pies a Metros":
				total = cifra / 3.2808;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Metros");
				break;
			case "De Pulgadas a Centímetros":
				total = cifra / 0.39370;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Centímetros");
				break;
			case "De Centímetros a Pulgadas":
				total = cifra * 0.39370;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Pulgadas");
				break;
			case "De Pulgadas a Pie":
				total = cifra * 0.083333;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Pie");
				break;
			case "De Pies a Pulgadas":
				total = cifra * 12;
				JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Pulgadas");
				break;
			}

		}
		
		//Metodo para saber si el usuario continuara o no utilizando el programa
		public static void continuar() {
			//Muestra y almacena el valor de las opciones
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "", 0);
			
			//Inicializa la clase main
			if(respuesta == 0) {
				conversor.main(null);
			}
			//Cierra el programa despues de mostrar un mensaje
			if(respuesta == 1) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}
		}
}

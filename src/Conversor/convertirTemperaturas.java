package Conversor;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class convertirTemperaturas {
	//Variables globales
	private static double cifra;
	private static String opConversion;

	//Metodo que muestra los datos que se necesita para hacer la conversión
	public static void datosConvertir() {
			//Seleccionar la opción de conversión
			Object seleccionOpcion = JOptionPane.showInputDialog(null, "Elije las temperaturas a la que deseas convertir"
					, "Temperaturas", JOptionPane.QUESTION_MESSAGE, 
					null, new Object[] {"De Celsius a Kelvin", "De Celsius a Fahrenheit",
							"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Celsius",
							"De Fahrenheit a Kelvin"}, "Seleccione");
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
		//Limita el "total" a 2 decimales
		DecimalFormat df = new DecimalFormat("0.00");
		//Variable que almacena el valor a mostrar
		double total = 0;
		
		//Switch que contiene todas las conversiones
		switch(opConversion) {
		case "De Celsius a Kelvin":
			total = cifra + 273.15;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Kelvin");
			break;
		case "De Celsius a Fahrenheit":
			total = cifra * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Fahrenheit");
			break;
		case "De Kelvin a Celsius":
			total = cifra - 273.15;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Celsius");
			break;
		case "De Kelvin a Fahrenheit":
			total = (cifra - 273.15) * 1.8 + 32;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Fahrenheit");
			break;
		case "De Fahrenheit a Celsius":
			total = (cifra - 32) / 1.8;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Celsius");
			break;
		case "De Fahrenheit a Kelvin":
			total = (cifra - 32) / 1.8 + 273.15;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Kelvin");
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

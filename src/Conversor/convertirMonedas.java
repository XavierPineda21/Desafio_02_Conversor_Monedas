package Conversor;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class convertirMonedas {
	//Variables globales
	private static double monto;
	private static String divisa;

	//Metodo que muestra los datos que se necesita para hacer la conversión
	public static void convDinero(String opcion) {
		
		//IF para verificar si selecciono está opción
		if(opcion == "Conversor de monedas") {
			
			//Seleccionar la opción de conversión
			Object divisas = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir"
					+ " tu dinero ", "Monedas", JOptionPane.QUESTION_MESSAGE, 
					null, new Object[] {"De Dólar a Euro", "De Dólar a Libras Esterlinas", 
							"De Dólar a Yen Japonés", "De Dólar a Won Surcoreano",
							"De Euro a Dólar", "De Libras Esterlinas a Dólar", "De Yen Japonés a Dólar",
							"De Won Surcoreano a Dólar"}, "Seleccione");
			try {
				double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad"
						+ "de dinero que deseas convertir:"));
				//Cantidad a convertir
				monto = cantidad;
			}
			catch (Exception e){
				JOptionPane.showMessageDialog(null, "Valor no válido");
				convDinero(opcion);
			}		
			//Divisa a convertir
			divisa = divisas.toString();
		}
	}
	
	//Metodo que hace la conversión
	public static void calcular() {
		//Limita el total a 2 decimales
		DecimalFormat df = new DecimalFormat("0.00");
		//Variable que almacena el valor a mostrar
		double total = 0;
		
		//Switch que contiene todas las conversiones
		switch(divisa) {
		case "De Dólar a Euro":
			total = monto * 0.89;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Euros");
			break;
		case "De Dólar a Libras Esterlinas":
			total = monto * 0.77;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Libras Esterlinas");
			break;
		case "De Dólar a Yen Japonés":
			total = monto * 140.09;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Yen Japonés");
			break;
		case "De Dólar a Won Surcoreano":
			total = monto * 1277.68;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Won Surcoreano");
			break;
		case "De Euro a Dólar":
			total = monto * 1.11;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Libras Esterlinas a Dólar":
			total = monto * 1.29;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Yen Japonés a Dólar":
			total = monto * 0.0071;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Won Surcoreano a Dólar":
			total = monto * 0.00078;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
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

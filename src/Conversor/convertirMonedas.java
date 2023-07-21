package Conversor;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class convertirMonedas {
	//Variables globales
	private static double cifra;
	private static String opConversion;

	//Metodo que muestra los datos que se necesita para hacer la conversión
	public static void datosConvertir() {		
			//Seleccionar la opción de conversión
			Object seleccionOpcion = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir"
					+ " tu dinero ", "Monedas", JOptionPane.QUESTION_MESSAGE, 
					null, new Object[] {"De Dólar a Euro", "De Dólar a Libras Esterlinas", 
							"De Dólar a Yen Japonés", "De Dólar a Won Surcoreano",
							"De Euro a Dólar", "De Libras Esterlinas a Dólar", "De Yen Japonés a Dólar",
							"De Won Surcoreano a Dólar"}, "Seleccione");
			//Sin este if el programa no cierra al presionar "cancelar"
			if(seleccionOpcion == null) {
				System.exit(0);
			}
			try {
				String cantidad = JOptionPane.showInputDialog("Ingrese la cantidad"
						+ "de dinero que deseas convertir:");
				//Sin este if en esta posición el programa no cierra al presionar "cancelar" en agregar cantidad
				if(cantidad == null) {
					System.exit(0);
				}
				//Cantidad a convertir
				cifra = Double.parseDouble(cantidad);
			}
			catch (Exception e){
				//Si el espacio esta en blanco o un valor no valido salta  la advertencia y lanza el menu
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
		case "De Dólar a Euro":
			total = cifra * 0.89;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Euros");
			break;
		case "De Dólar a Libras Esterlinas":
			total = cifra * 0.77;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Libras Esterlinas");
			break;
		case "De Dólar a Yen Japonés":
			total = cifra * 140.09;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Yen Japonés");
			break;
		case "De Dólar a Won Surcoreano":
			total = cifra * 1277.68;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Won Surcoreano");
			break;
		case "De Euro a Dólar":
			total = cifra * 1.11;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Libras Esterlinas a Dólar":
			total = cifra * 1.29;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Yen Japonés a Dólar":
			total = cifra * 0.0071;
			JOptionPane.showMessageDialog(null, "Equivale a " + df.format(total) + " Dólares");
			break;
		case "De Won Surcoreano a Dólar":
			total = cifra * 0.00078;
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

package Conversor;
import javax.swing.JOptionPane;

public class conversor {
	public static String menu;

	public static void main(String[] args) {		
		//Panel para seleccionar el tipo de conversor
		Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
				"Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de monedas", 
						"Conversor de Temperatura", "Conversor de Longitudes"}, "Seleccione");
		
		if(menu != null) {
			String opcionEscogida = menu.toString();
			switch(opcionEscogida) {
			case "Conversor de monedas":
				convertirMonedas.datosConvertir();
				convertirMonedas.calcular();
				convertirMonedas.continuar();
				break;
			case "Conversor de Temperatura":		
				convertirTemperaturas.datosConvertir();
				convertirTemperaturas.calcular();
				convertirTemperaturas.continuar();
				break;
			case "Conversor de Longitudes":
				convertirLongitud.datosConvertir();
				convertirLongitud.calcular();
				convertirLongitud.continuar();
			}

		}		

	}
	
}

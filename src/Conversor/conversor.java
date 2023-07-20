package Conversor;
import javax.swing.JOptionPane;

public class conversor {
	public static String menu;

	public static void main(String[] args) {
		
		//Instancia de la clase convertirMonedas
		convertirMonedas convertirM = new convertirMonedas();
		
		//Panel para seleccionar el tipo de conversor
		Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", 
				"Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de monedas", 
						"Conversor de Temperatura"}, "Seleccione");
		
		if(menu != null) {
			String opcionEscogida = menu.toString();
			convertirM.convDinero(opcionEscogida);
			convertirM.calcular();
			convertirM.continuar();
		}		

	}
	
}

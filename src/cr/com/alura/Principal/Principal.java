package cr.com.alura.Principal;

import javax.swing.*;
import javax.swing.event.SwingPropertyChangeSupport;

import cr.com.alura.ConversorMonedas.Function;

public class Principal {
	static Object[] possibleValues = { "First", "Second", "Third" };
	
	public static void main(String[] args) {
		
		Function monedas = new Function();
		 String opciones = (JOptionPane.showInputDialog(null,
		             "Seleccione una opcion de conversión", "Menú",
		             JOptionPane.QUESTION_MESSAGE, null,
		             new Object[] {"Conversor de moneda","Conversor de temperatura"}, "Seleccion")).toString();
		 
		             switch (opciones) {
					case "Conversor de moneda":{
						String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
						double valorRecibido = Double.parseDouble(input);
						monedas.ConvertirMonedas(valorRecibido);
						int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
						if(JOptionPane.OK_OPTION == seleccion) {
							System.out.println("Selecciona opción afirmativa");
						}else {
							JOptionPane.showConfirmDialog(null, "Programa Terminado");
						}
					}
						break;
					/*case "Conversor de temperatura":{
						
					}
					default:
						break;*/ 
					}
	}
	
}	


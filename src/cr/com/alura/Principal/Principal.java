package cr.com.alura.Principal;

import javax.swing.*;
import cr.com.alura.ConversorMonedas.Function;

public class Principal {

	public static void main(String[] args) {

		Function monedas = new Function();

		try {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de moneda", "Conversor de temperatura" }, "Seleccion")).toString();
			switch (opciones) {
			case "Conversor de moneda": {
				try {
					int input = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para convertir"));
					double valorRecibido = (double) input;
					monedas.ConvertirMonedas(valorRecibido);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ingresa la informacion y selecciona ok");
					main(args);
					throw new NumberFormatException(e + "No puede estar vacio");
				}
				int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
				if (JOptionPane.OK_OPTION == seleccion || JOptionPane.CANCEL_OPTION == seleccion) {
					main(args);
				} else {
					JOptionPane.showMessageDialog(null, "Programa terminado");
					System.exit(0);
				}

			}
				break;
			/*
			 * case "Conversor de temperatura":{
			 * 
			 * } default: break;
			 */

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
			throw new NullPointerException(e + "no puede estar vacío");
		}
	}

}

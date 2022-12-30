package cr.com.alura.Principal;

import javax.swing.*;

import cr.com.alura.ConversorDistancia.FunctionDistance;
import cr.com.alura.ConversorMonedas.FunctionCoins;

public class Principal {
	
	public static  ImageIcon icono = new ImageIcon ("C:\\Users\\jairo O\\git\\repository2\\Conversor-de-moneda-en-java\\src\\cr\\com\\alura\\Principal\\carita.png");

	public static void main (String[] args) {
		
		FunctionCoins monedas = new FunctionCoins();
		FunctionDistance distancia = new FunctionDistance();
		try {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
					JOptionPane.QUESTION_MESSAGE, icono,
					new Object[] { "Conversor de moneda", "Conversor de distancia" }, "Seleccion")).toString();
			switch (opciones) {
			case "Conversor de moneda": {
				try {
					int input = Integer.parseInt
							(JOptionPane.showInputDialog(null,"Ingrese valor para convertir","Bienvenido",JOptionPane.PLAIN_MESSAGE));
					double valorRecibido = (double) input;
					monedas.ConvertirMonedas(valorRecibido);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Ingresa la información y selecciona ok");
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
			case "Conversor de distancia": {
				try {
					int input = Integer.parseInt
							(JOptionPane.showInputDialog(null,"Ingrese valor para convertir","Bienvenido!",JOptionPane.PLAIN_MESSAGE));
					double valorRecibido = (double) input;
					distancia.ConvertirDistancias(valorRecibido);
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

			}default:
				break;
			
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
			throw new NullPointerException(e + "no puede estar vacío");
		}
	}

}

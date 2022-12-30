package cr.com.alura.ConversorDistancia;

import javax.swing.JOptionPane;

import cr.com.alura.Principal.Principal;

public class FunctionDistance extends Principal {

	ConversorDistancia distancia = new ConversorDistancia();

	public void ConvertirDistancias(double ValorRecibido) {

	   
		String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
				JOptionPane.PLAIN_MESSAGE, icono,
				new Object[] { "De Kilometros a Metros", "De Kilometros a Decimetros", "De Kilometros a Centimetros",
						"De Kilometros a Milimetros", "De Metros a Kilometros", "De Decimetros a Kilometros",
						"De Centimetros a Kilometros", "De Milimetros a Kilometros" }, "Seleccion")).toString();
		
		switch (opcion) {
		case "De Kilometros a Metros": {
			distancia.ConvertirKilometrosAMetros(ValorRecibido);
		}
			break;
		case "De Kilometros a Decimetros": {
			distancia.ConvertirKilometrosADecimetros(ValorRecibido);
		}
			break;
		case "De Kilometros a Centimetros": {
			distancia.ConvertirKilometrosACentimetros(ValorRecibido);
		}
			break;
		case "De Kilometros a Milimetros": {
			distancia.ConvertirKilometrosAMilimetros(ValorRecibido);
		}
			break;
		case "De Metros a Kilometros": {
			distancia.ConvertirMetrosAKilometros(ValorRecibido);
		}
			break;
		case "De Decimetros a Kilometros": {
			distancia.ConvertirDecimetrosAKilometros(ValorRecibido);
		}
			break;
		case "De Centimetros a Kilometros": {
			distancia.ConvertirCentimetrosAKilometros(ValorRecibido);
		}
			break;
		case "De Milimetros a Kilometros": {
			distancia.ConvertirMilimetrosAKilometros(ValorRecibido);
		}

		default:
			break;
		}
	}
}

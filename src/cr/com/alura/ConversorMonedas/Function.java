package cr.com.alura.ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {

	ConversorMonedas monedas = new ConversorMonedas();
	public void ConvertirMonedas(double ValorRecibido) {
		
		String opcion = (JOptionPane.showInputDialog(null,
	             "Seleccione una opcion de conversión", "Menú",
	             JOptionPane.PLAIN_MESSAGE, null,
	             new Object[] {"De Pesos a Dólar","De Pesos a Euro", "De pesos a libras", "De pesos a Yenes", "De pesos a Won koreano", "De dólar a Pesos", "De euro a Pesos", "De libras a Pesos", "De yen a Pesos", "De Won coreano a Pesos"}, "Seleccion")).toString();
	    switch (opcion) {
		case "De Pesos a Dólar":{
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
		}
		    break;
		case "De Pesos a Euro":{
			monedas.ConvertirPesosColombianosEuro(ValorRecibido);
		}
			break;

		default:
			break;
		}
	}
}

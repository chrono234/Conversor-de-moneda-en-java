package cr.com.alura.ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {

	ConversorMonedas monedas = new ConversorMonedas();

	public void ConvertirMonedas(double ValorRecibido) {

		String opcion = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Peso Colombiano a Dólar", "De Peso Colombiano a Euro", "De Peso Colombiano a libras",
						"De Peso Colombiano a Yenes", "De Peso Colombiano a Won Coreano", "De Dólar a Peso Colombiano",
						"De Euro a De Peso Colombiano", "De libras a Peso Colombiano", "De yen a Peso Colombiano",
						"De Won coreano a Peso Colombiano" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Peso Colombiano a Dólar": {
			monedas.ConvertirPesosColombianosADolar(ValorRecibido);
		}
			break;
		case "De Peso Colombiano a Euro": {
			monedas.ConvertirPesosColombianosAEuro(ValorRecibido);
		}
			break;
		case "De Peso Colombiano a Libra": {
			monedas.ConvertirPesosColombianosALibras(ValorRecibido);
		}
			break;
		case "De Peso Colombiano a Yenes": {
			monedas.ConvertirPesosColombianosAYenes(ValorRecibido);
		}
			break;
		case "De Peso Colombiano a Won Coreano": {
			monedas.ConvertirPesosColombianosAWonCoreano(ValorRecibido);
		}
			break;
		case "De Dólar a Peso Colombiano": {
			monedas.ConvertirDolarApesoColombiano(ValorRecibido);
		}
			break;
		case "De Euro a De Peso Colombiano": {
			monedas.ConvertirEuroApesoColombiano(ValorRecibido);
		}
			break;
		case "De libras a Peso Colombiano": {
			monedas.ConvertirLibrasApesoColombiano(ValorRecibido);
		}
			break;
		case "De yen a Peso Colombiano": {
			monedas.ConvertirYenesApesoColombiano(ValorRecibido);
		}
			break;
		case "De Won coreano a Peso Colombiano": {
			monedas.ConvertirWonCoreanoApesoColombiano(ValorRecibido);
		}
		default:
			break;
		}
	}
}

package cr.com.alura.ConversorMonedas;

import javax.swing.JOptionPane;

public class ConversorMonedas {

	public void ConvertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4729.75;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100; //lo divide y lo reduce en 2 decimales
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " Dolares");
	}
	public void ConvertirPesosColombianosEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 5022.23;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100; //lo divide y lo reduce en 2 decimales
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " Euro");
	}
}

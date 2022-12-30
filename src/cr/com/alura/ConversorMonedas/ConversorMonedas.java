package cr.com.alura.ConversorMonedas;

import javax.swing.JOptionPane;

import cr.com.alura.Principal.Principal;

public class ConversorMonedas extends Principal {

	public void ConvertirPesosColombianosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 4729.75;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaDolar + " Dolares", "Felicidades!", 0, icono);
	}
	public void ConvertirPesosColombianosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 5022.23;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaEuro + " Euro", "Felicidades!", 0, icono);
	}
	public void ConvertirPesosColombianosALibras(double valorRecibido) {
		double monedaLibra = valorRecibido /  5731.6580;
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaLibra + " Libra", "Felicidades!", 0, icono);
	}
	public void ConvertirPesosColombianosAYenes(double valorRecibido) {
		double monedaYenes = valorRecibido /  36.1695;
		monedaYenes = (double) Math.round(monedaYenes * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaYenes + " Yenes", "Felicidades!", 0, icono);
	}
	public void ConvertirPesosColombianosAWonCoreano(double valorRecibido) {
		double monedaWonCoreano = valorRecibido /  3.7088;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaWonCoreano + " Won Coreano", "Felicidades!", 0, icono);
	}
	public void ConvertirDolarApesoColombiano(double valorRecibido) {
		double monedaPesos =  valorRecibido * 4729.75 ;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPesos + " Pesos", "Felicidades!", 0, icono);
	}
	public void ConvertirEuroApesoColombiano(double valorRecibido) {
		double monedaPesos =  valorRecibido * 5022.23 ;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPesos + " Pesos", "Felicidades!", 0, icono);
	}
	public void ConvertirLibrasApesoColombiano(double valorRecibido) {
		double monedaPesos =  valorRecibido * 5731.6580 ;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPesos + " Pesos", "Felicidades!", 0, icono);
	}
	public void ConvertirYenesApesoColombiano(double valorRecibido) {
		double monedaPesos =  valorRecibido * 36.1695 ;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPesos + " Pesos", "Felicidades!", 0, icono);
	}
	public void ConvertirWonCoreanoApesoColombiano(double valorRecibido) {
		double monedaPesos =  valorRecibido * 3.7088;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $ " + monedaPesos + " Pesos", "Felicidades!", 0, icono);
	}
	
	
}

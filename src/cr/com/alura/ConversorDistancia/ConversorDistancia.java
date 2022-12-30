package cr.com.alura.ConversorDistancia;

import javax.swing.JOptionPane;

import cr.com.alura.Principal.Principal;

public class ConversorDistancia extends Principal {
	
	public void ConvertirKilometrosAMetros(double valorRecibido) {
		double cantidadMetros = valorRecibido * 1000;
		cantidadMetros = (double) Math.round(cantidadMetros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadMetros + " metros", "Muy bien!", 0, icono);
	}
	
	public void ConvertirKilometrosADecimetros(double valorRecibido) {
		double cantidadDecimetros = valorRecibido * 10000;
		cantidadDecimetros = (double) Math.round(cantidadDecimetros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadDecimetros + " Decimetros", "Muy bien!", 0, icono);
	}
	
	public void ConvertirKilometrosACentimetros(double valorRecibido) {
		double cantidadCentimetros = valorRecibido * 100000;
		cantidadCentimetros = (double) Math.round(cantidadCentimetros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadCentimetros + " Centimetros", "Muy bien!", 0, icono);
	}
	
	public void ConvertirKilometrosAMilimetros(double valorRecibido) {
		double cantidadMilimetros = valorRecibido * 1000000;
		cantidadMilimetros = (double) Math.round(cantidadMilimetros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadMilimetros + " milimetros", "Muy bien!", 0, icono);
	}
	
	public void ConvertirMetrosAKilometros(double valorRecibido) {
		double cantidadKilometros = valorRecibido / 0.001;
		cantidadKilometros = (double) Math.round(cantidadKilometros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadKilometros + " kilometros", "Muy bien!", 0, icono);
	}
	public void ConvertirDecimetrosAKilometros(double valorRecibido) {
		double cantidadKilometros = valorRecibido / 0.0001;
		cantidadKilometros = (double) Math.round(cantidadKilometros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadKilometros + " kilometros", "Muy bien!", 0, icono);
	}
	public void ConvertirCentimetrosAKilometros(double valorRecibido) {
		double cantidadKilometros = valorRecibido / 0.00001;
		cantidadKilometros = (double) Math.round(cantidadKilometros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadKilometros + " kilometros", "Muy bien!", 0, icono);
	}
	public void ConvertirMilimetrosAKilometros(double valorRecibido) {
		double cantidadKilometros = valorRecibido / 0.000001;
		cantidadKilometros = (double) Math.round(cantidadKilometros * 100d)/100;
		JOptionPane.showMessageDialog(null, "La distancia son " + cantidadKilometros + " kilometros", "Muy bien!", 0, icono);
	}
}

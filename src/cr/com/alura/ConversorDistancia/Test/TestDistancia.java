package cr.com.alura.ConversorDistancia.Test;

import cr.com.alura.ConversorDistancia.ConversorDistancia;

public class TestDistancia {

	public static void main(String[] args) {
		
		ConversorDistancia conversor = new ConversorDistancia();
		
		double valorRecibido = 1000;
		
		conversor.ConvertirDecimetrosAKilometros(valorRecibido);
		
	}
}

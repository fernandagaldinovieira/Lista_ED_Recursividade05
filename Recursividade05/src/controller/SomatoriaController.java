package controller;

public class SomatoriaController {

	public SomatoriaController() {
		super();
	}

	public double Somatoria(int n) {
		// Condição de parada: Se n for 1, a somatória é igual a 1
		
		if (n == 1) {
			return 1;
			
		} else {
			// A somatória é igual a 1/n + a soma dos termos anteriores
			return 1/ (double) n + Somatoria(n - 1);
		}
	}
	
}

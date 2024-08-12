package view;

import javax.swing.JOptionPane;

import controller.SomatoriaController;

public class Principal {

	public static void main(String[] args) {

		SomatoriaController somatoriaController = new SomatoriaController();
		
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		double resultado = somatoriaController.Somatoria(n);
		System.out.println("A somatória é igual a: " + resultado);
	}
}

package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteVetor {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal(Produto[] p, int i) {
		double total = 0;
		for (int contador = 0; contador < i; contador++) {
			total += p[contador].getValor();
		}
		return total;
	}
	
	public static void main(String[] args) {
		Produto[] vetorProduto = new Produto[3];
		
		int indice = 0;
		do {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setNome(texto("Digite o nome"));
			vetorProduto[indice].setMarca(texto("Digite a marca"));
			vetorProduto[indice].setValor(inteiro("Digite o valor"));
			
			indice ++;
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (int contador = 0; contador < indice; contador++) {
			System.out.println("========== " + (contador + 1));
			System.out.println("Nome: " + vetorProduto[contador].getNome());
			System.out.println("Marca: " + vetorProduto[contador].getMarca());
			System.out.println("Valor: " + vetorProduto[contador].getValor() + "\n");
		}
		
		System.out.println("Valor Total: " + valorTotal(vetorProduto, indice));
	}
}

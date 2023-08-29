package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteArray {
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	static double valorTotal (List<Produto> arrayProduto, Produto produto) {
		double total = 0;
		
		for(Produto p : arrayProduto) {
			total += p.getValor();
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		List<Produto> arrayProduto = new ArrayList<Produto>();
		
		Produto objProduto;
		
		do {
			objProduto = new Produto();
			objProduto.setNome(texto("Digite o nome"));
			objProduto.setMarca(texto("Digite a marca"));
			objProduto.setValor(inteiro("Digite o valor"));
			arrayProduto.add(objProduto);
			
		}while(JOptionPane.showConfirmDialog(null, "Adicionar produto no carrinho?", "Carrinho de Compras",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
		
		for (Produto p : arrayProduto) {
			System.out.println("==========");
			System.out.println("Nome: " + p.getNome());
			System.out.println("Marca: " + p.getMarca());
			System.out.println("Valor: " + p.getValor() + "\n");
		}
		
		System.out.println("Valor Total: " + valorTotal(arrayProduto, objProduto));
	}

}

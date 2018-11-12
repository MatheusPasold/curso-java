package br.com.cursojava.lamb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploDesktop {

	public static void main(String[] args) {
		JFrame tela = new JFrame("Tela do sistema");
		JButton botao = new JButton("Click Aqui");
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Olá, Eu sou o Goku!!!!");
				
			}
			
				
		});
		
		tela.add(botao);
		tela.setSize(200, 200);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		
	
	}
}

package frontbarraca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Janela extends JFrame {
	private Central janela;
    private JanelaBotoes botoesCima;
    
	public Janela() {
		organizarJanela();
		setTitle("Barraquinha");
		setSize(800,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(new Color(255,255,153));
		setVisible(true);
	}
	
	public void organizarJanela() {
		
		janela = new Central();
		janela.setLayout(new GridLayout(7,2,0,5));
		janela.setPreferredSize(new Dimension(100,606));
		add(janela, BorderLayout.SOUTH);
	
		botoesCima = new JanelaBotoes (janela);
		botoesCima.setPreferredSize(new Dimension(100,606));

		add(botoesCima,BorderLayout.NORTH);
		this.getContentPane().setBackground(new Color(255,255,153));
		
	}
	public static void main(String[] args) {
		Janela novaJanela = new Janela();
	}
}

package frontbarraca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JanelaBotoes extends JPanel implements ActionListener{
	private JLabel titulo;
	private Central opcoes;
	private JButton botao;

	public JanelaBotoes(Central opcoes) {
		this.opcoes =  opcoes;
		
		titulo = new JLabel();
		titulo.setBackground(new Color(0, 191, 255));
		titulo.setFont(new Font("arial",Font.BOLD,40));
		this.setBackground(new Color(65, 105, 225));
		add(titulo);
		
		Botao botao = criarBotao("Realizar Vendas", new Color(255, 140, 0));
		add(botao);
		add(criarBotao("Listar Vendas",new Color(255, 140, 0)));
		add(criarBotao("Mostrar Relatorio",new Color(255, 140, 0)));
		add(criarBotao("Listar clientes",new Color(255, 140, 0)));
	}
	public Botao criarBotao(String texto,Color cor) {
		Botao botao = new Botao(texto,cor);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		botao.setPreferredSize(new Dimension(185,40));
		return botao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(botao.getText().equals("Realizar Vendas") ) {
			
		}
		
		
	}
	

}

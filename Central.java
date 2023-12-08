package frontbarraca;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Central extends JPanel{
	
	private JLabel label;
    private JTextField texto1;
    private JTextField texto2;
    private JComboBox<String> op1;
    private JComboBox<String> op2;
    private JComboBox<String> op3;
    private PainelSelecao selecao;
	
	public Central() {
		texto1 = new JTextField();
		texto2 = new JTextField();
		
		String[] opcoes = {"","Prato","Mussarela","Parmesão","Coalho"};
		op1 = new JComboBox<>(opcoes);
		String[] opcoes2 = {"","Salsicha","Linguiça","Frango","Bacon"};
		op2 = new JComboBox<>(opcoes2);
		String[] opcoes3 = {"","Coca-Cola","Del Rio","Suco do Chaves"};
		op3 = new JComboBox<>(opcoes3);
		selecao = new PainelSelecao();
		
		label = new JLabel();
		label.setBackground(new Color(0, 191, 255));
		label.setFont(new Font("arial",Font.BOLD, 150));
		this.setBackground(new Color(65, 105, 225));
		
		add(new JLabel("Nome cliente: "));
		add(texto1);
		add(new JLabel("Matrícula: "));
		add(texto2);
		add(new JLabel("Opcao de queijo: "));
		add(op1);
		add(new JLabel("Opcao de proteina: "));
		add(op2);
		add(new JLabel("Escolha a opção de queijo: "));
		add(selecao);
		add(new JLabel("Bebida: "));
		add(op3);
		add(new JLabel());
		
		add(novoBotao("Realizar venda", new Color(255, 140, 0)));
		this.setBackground(new Color(65, 105, 225));
		setVisible(true);
	}
	public Botao novoBotao(String texto, Color cor) {
		Botao a = new Botao(texto, cor);
		a.setPreferredSize(new Dimension(185, 40));
		return a;
	}
}

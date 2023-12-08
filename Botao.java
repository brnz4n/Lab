package frontbarraca;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class Botao extends JButton {
	
	public Botao(String texto,Color cor) {
		setFont(new Font("arial",Font.BOLD,17));
		setBackground(cor);
		setOpaque(true);
		setText(texto);
	}
	
}

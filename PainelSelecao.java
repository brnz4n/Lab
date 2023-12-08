package frontbarraca;

import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PainelSelecao extends JPanel {
	
	public PainelSelecao() {
		setLayout(new GridLayout(2,2));
		String[] opcoes = {"Maionese","Ketchup","Ovo","Batata Palha"};
		JCheckBox[] checkboxes = new JCheckBox[opcoes.length];
		
		for(int i = 0; i < opcoes.length; i++) {
			checkboxes[i] = new JCheckBox(opcoes[i]);
			add(checkboxes[i]);
		}
	}
}

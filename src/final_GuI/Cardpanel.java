package final_GuI;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Cardpanel extends JPanel{
	private SearchPage searchpanel = new SearchPage();
//	private ResultPage resultpanel = new ResultPage();
//	private String inputString;
	public JPanel returnthis() {
		return this;
	}
	public Cardpanel() {
		setLayout(new CardLayout());
		class SearchListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
//				resultpanel.getString(searchpanel.returnText().getText());  
				add("result",new ResultPage(searchpanel.returnText().getText()));  //�b�ഫ������A��Ҥ�resultpage�A�o�˥i�H�NInput����r�O�d�U�ӡC
				CardLayout cardLayout = (CardLayout)(returnthis().getLayout());
				cardLayout.show(returnthis(), "result");
			}
		}
//		setBounds(x, y, width, height);
		ActionListener listener = new SearchListener();
		searchpanel.returnButton().addActionListener(listener);
		add("search",searchpanel);
//		add("result",resultpanel);
	}
}

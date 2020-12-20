package final_GuI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SearchPage extends JPanel{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int FIELD_WIDTH = 10;
	private JTextField inputField;
	private JButton searchBtn;
	private JLabel label;
	public JPanel createLabel() {
		label = new JLabel("¶}½c¸ê°T·j´M:");
		label.setFont(new Font("Serif",Font.BOLD,15));
		JPanel labelpanel = new JPanel();
		labelpanel.add(label);
		labelpanel.setBounds(380, 310, 100, 100);
		return labelpanel;
	}
	public JButton returnButton() {
		return searchBtn;
	}
	public JPanel createSearchPanel() {
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension( 500, 40 ));
		searchBtn = new JButton("Search");
		
//		class SearchListener implements ActionListener {
//			public void actionPerformed(ActionEvent e) {
//				JPanel panel = new ResultPage();
//				panel.setVisible(true);
//				setVisible(false);
//			}
//		}
//		ActionListener listener = new SearchListener();
//		searchBtn.addActionListener(listener);
		JPanel searchpanel = new JPanel();
		searchpanel.add(inputField);
		searchpanel.add(searchBtn);
		searchpanel.setBounds(20, 300,screenSize.width,200);
		return searchpanel;
	}
	public SearchPage() {
//		setLayout(new CardLayout());
		setLayout(null);
//		setTitle("Search Page");
		setSize(screenSize.width, screenSize.height);
		add(createLabel(), BorderLayout.NORTH);
		add(createSearchPanel(), BorderLayout.CENTER);
	}
	public JTextField returnText() {
		return inputField;
	}
	
}

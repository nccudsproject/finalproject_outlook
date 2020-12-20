package final_GuI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ResultPage extends JPanel{
	private static final int FRAME_WIDTH = 760;
	private static final int FRAME_HEIGHT = 720;
	private String output;
	SearchPage SP = new SearchPage();
	public void getString(String s) {
		output=s;
	}
	public ResultPage(String s) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenSize.width, screenSize.height);
		setLayout(null);
		JLabel testLabel = new JLabel(s);
		testLabel.setFont(new Font("Serif",Font.BOLD,30));
		JPanel labelpanel = new JPanel();
		labelpanel.add(testLabel);
		labelpanel.setBounds(380, 310, 500, 100);
		add(labelpanel);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
}

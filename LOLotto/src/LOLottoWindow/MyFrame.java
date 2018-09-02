package LOLottoWindow;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame () {
		super("Hello WOrld");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 500);
		setLocation(50, 50);
		setLayout(new FlowLayout());
		setLayout(new GridLayout(1, 3));
		
		
		
		add(new JButton("ButtonTop"));
		add(new JButton("ButtonMid"));
		add(new JButton("ButtonBot"));
		add(new JButton("ButtonJungle"));
		
		setVisible(true);
		
	}

}

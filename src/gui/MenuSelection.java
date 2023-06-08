package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;


public class MenuSelection extends JPanel{
	//panel로 바꾸고 windowframe으로 연결, 레이아웃을 BorderLayout으로 설정
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame= frame;
		this.setLayout(new BorderLayout());
	
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("MenuSelection");
		
		JButton button1 = new JButton("Add a PTMember");
		JButton button2 = new JButton("Delete a PTMember");
		JButton button3 = new JButton("Edit a PTMember");
		JButton button4 = new JButton("Veiw PTMembers");
		JButton button5 = new JButton("Exit");
		
		//adder, viewer 상호작용 버튼 추가 
		button1.addActionListener(new ButtonAddListener(frame));
		button4.addActionListener(new ButtonViewListener(frame));
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
		
		
		
	}
}

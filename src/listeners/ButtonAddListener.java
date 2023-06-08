package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import gui.PTMemberAdder;
import gui.PTMemberViewer;
import gui.WindowFrame;
public class ButtonAddListener implements ActionListener {
	//add button을 눌러 adder로 가도록 상호작용하는 클래스 추가, windowframe으로 연결
	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		PTMemberAdder viewer = frame.getAdder();
		frame.setupPanel(viewer);
		
	}

}

package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import gui.PTMemberViewer;
import gui.WindowFrame;
public class ButtonViewListener implements ActionListener {
	//button 눌러서 viewer로 가도록 상호작용하는 클래스 추가, windowframe과 연결
	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton) e.getSource();
		PTMemberViewer viewer = frame.getViewer();
		frame.setupPanel(viewer);
		
	}

}

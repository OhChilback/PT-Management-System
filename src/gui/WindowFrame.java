package gui;

import javax.swing.*;

//프레임 전용 클래스 추가

import menuManager.PtMemberManager;


//menu, add ,view 클래스를 호출해서 panel들을 frame에 배치 하고 manager와 연결
public class WindowFrame extends JFrame{
	PtMemberManager ptmemberManager;
	
	MenuSelection menuselection ;
	PTMemberAdder adder;
	PTMemberViewer viewer;
	

	public WindowFrame(PtMemberManager ptmemberManager) {
		this.ptmemberManager = ptmemberManager;
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.menuselection = new MenuSelection(this);
		this.adder = new PTMemberAdder(this);
		this.viewer = new PTMemberViewer(this, this.ptmemberManager);
		this.ptmemberManager = ptmemberManager;
		
		this.setupPanel(menuselection);
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public PTMemberAdder getAdder() {
		return adder;
	}

	public void setAdder(PTMemberAdder adder) {
		this.adder = adder;
	}

	public PTMemberViewer getViewer() {
		return viewer;
	}

	public void setViewer(PTMemberViewer viewer) {
		this.viewer = viewer;
	}
}

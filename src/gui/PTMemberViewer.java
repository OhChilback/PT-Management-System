package gui;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import menuManager.PtMemberManager;
import ptMember.UserScan;

import java.util.Vector;

public class PTMemberViewer extends JPanel{
	//panel로 바꾼 후 windowframe과 연결
	WindowFrame frame;
	
	PtMemberManager ptmemberManager;
	
	public PTMemberViewer(WindowFrame frame, PtMemberManager ptmemberManager) {
		this.frame= frame;
		this.ptmemberManager = ptmemberManager;
		
		System.out.println("***" + ptmemberManager.size() + "***" );
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Height");
		model.addColumn("Weight");
		model.addColumn("Age");
		model.addColumn("Birthday");
		model.addColumn("Gender");
		model.addColumn("Address");
		model.addColumn("PhoneNumber");
		model.addColumn("Calories");
		model.addColumn("Contact Info.");
		
		//저장한 정보 viewer에 나타나도록 설정하기
		for(int i=0; i<ptmemberManager.size(); i++){
			Vector row = new Vector();
			UserScan us = ptmemberManager.get(i);
			row.add(us.getId());
			row.add(us.getHeight());
			row.add(us.getWeight());
			row.add(us.getAge());
			row.add(us.getBirthday());
			row.add(us.getGender());
			row.add(us.getCalories());
			row.add(us.getName());
			row.add(us.getAddress());
			row.add(us.getPhoneNumber());
			row.add(us.getCalories());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}
}

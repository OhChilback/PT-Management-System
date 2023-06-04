package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

//총 10개의 행을 추가하였고, 기본PT_info는 총 9개이다. JFrame 과 격자를 이용하여 위치를 선정하였다. 
public class PTMemberAdder extends JFrame{

	public PTMemberAdder() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelHeight = new JLabel("Height: ", JLabel.TRAILING);
		JTextField fieldHeight = new JTextField(10);
		labelID.setLabelFor(fieldHeight);
		panel.add(labelHeight);
		panel.add(fieldHeight);
		
		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelID.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelAge = new JLabel("Age: ", JLabel.TRAILING);
		JTextField fieldAge = new JTextField(10);
		labelID.setLabelFor(fieldAge);
		panel.add(labelAge);
		panel.add(fieldAge);
		
		JLabel labelBirthday = new JLabel("Birthday: ", JLabel.TRAILING);
		JTextField fieldBirthday = new JTextField(10);
		labelID.setLabelFor(fieldBirthday);
		panel.add(labelBirthday);
		panel.add(fieldBirthday);
		
		JLabel labelGender = new JLabel("Gender: ", JLabel.TRAILING);
		JTextField fieldGender = new JTextField(10);
		labelID.setLabelFor(fieldGender);
		panel.add(labelGender);
		panel.add(fieldGender);
		
		JLabel labelAddress = new JLabel("Address: ", JLabel.TRAILING);
		JTextField fieldAddress = new JTextField(10);
		labelID.setLabelFor(fieldAddress);
		panel.add(labelAddress);
		panel.add(fieldAddress);
		
		JLabel labelPhoneNumber = new JLabel("PhoneNumber: ", JLabel.TRAILING);
		JTextField fieldPhoneNumber = new JTextField(10);
		labelID.setLabelFor(fieldPhoneNumber);
		panel.add(labelPhoneNumber);
		panel.add(fieldPhoneNumber);
		
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancle"));
		
		
		
		SpringUtilities.makeCompactGrid(panel,10,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}

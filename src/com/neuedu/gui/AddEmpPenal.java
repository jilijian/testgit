package com.neuedu.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmpPenal extends JPanel {
	private JTextField txt_ename;
	private JTextField txt_ecode;
	private JPasswordField txt_password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rd_man;
	private JRadioButton rd_woman;
	private JTextArea dm_demo;

	/**
	 * Create the panel.
	 */
	public AddEmpPenal() {
		setLayout(null);
		
		JLabel label = new JLabel("\u5458\u5DE5\u59D3\u540D\uFF1A");
		label.setBounds(32, 55, 89, 27);
		add(label);
		
		txt_ename = new JTextField();
		txt_ename.setBounds(93, 58, 95, 21);
		add(txt_ename);
		txt_ename.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5458\u5DE5\u7F16\u53F7\uFF1A");
		label_1.setBounds(279, 58, 89, 21);
		add(label_1);
		
		txt_ecode = new JTextField();
		txt_ecode.setBounds(344, 58, 95, 21);
		add(txt_ecode);
		txt_ecode.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u5BC6\u7801\uFF1A");
		label_2.setBounds(32, 120, 73, 15);
		add(label_2);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(93, 120, 95, 21);
		add(txt_password);
		
		JLabel label_3 = new JLabel("\u6027\u522B\uFF1A");
		label_3.setBounds(286, 120, 54, 15);
		add(label_3);
		
		rd_man = new JRadioButton("\u7537");
		buttonGroup.add(rd_man);
		rd_man.setBounds(346, 116, 53, 23);
		add(rd_man);
		
		rd_woman = new JRadioButton("\u5973");
		buttonGroup.add(rd_woman);
		rd_woman.setBounds(401, 116, 54, 23);
		add(rd_woman);
		
		JLabel hobby = new JLabel("\u7231\u597D\uFF1A");
		hobby.setBounds(32, 173, 54, 15);
		add(hobby);
		
		JCheckBox cb_sing = new JCheckBox("\u5531\u6B4C");
		cb_sing.setBounds(95, 169, 103, 23);
		add(cb_sing);
		
		JCheckBox cb_dance = new JCheckBox("\u8DF3\u821E");
		cb_dance.setBounds(200, 169, 103, 23);
		add(cb_dance);
		
		JCheckBox cb_basketball = new JCheckBox("\u6253\u7BEE\u7403");
		cb_basketball.setBounds(305, 169, 103, 23);
		add(cb_basketball);
		
		JLabel label_5 = new JLabel("\u7C4D\u8D2F\uFF1A");
		label_5.setBounds(32, 221, 54, 15);
		add(label_5);
		
		JComboBox sl_address = new JComboBox();
		sl_address.setModel(new DefaultComboBoxModel(new String[] {"", "\u5E7F\u5DDE\u5E02", "\u4E1C\u839E\u5E02", "\u6C5F\u95E8\u5E02", "\u6E5B\u6C5F\u5E02", "\u6E05\u8FDC\u5E02", "\u4E91\u6D6E\u5E02"}));
		sl_address.setBounds(93, 218, 95, 21);
		add(sl_address);
		
		JLabel label_6 = new JLabel("\u5907\u6CE8\uFF1A");
		label_6.setBounds(32, 277, 54, 15);
		add(label_6);
		
		JButton button = new JButton("\u65B0\u589E");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("准备新增。。。。。。。。。。。。。。。。。。");
				String ename = txt_ename.getText();
				String ecode = txt_ecode.getText();
				char[] password = txt_password.getPassword();
				String sex = "不详";
				if(rd_man.isSelected()){
					 sex = rd_man.getText();
				}else if(rd_woman.isSelected()){
					 sex = rd_woman.getText();
				}
				String hobby = "";//爱好
				if(cb_sing.isSelected()){
					hobby += cb_sing.getText()+";";
				}
				if(cb_dance.isSelected()){
					hobby += cb_dance.getText()+";";
				}
				if(cb_basketball.isSelected()){
					hobby += cb_basketball.getText()+";";
				}
				//籍贯
				
				//备注
				String demo = dm_demo.getText();
				System.out.println(
						"姓名："+ename+"\n"
						+"姓别："+sex+"\n"
						+"编号："+ecode+"\n"
						+"爱好："+hobby+"\n"
						+"备注："+demo+"\n"
						);
				
				
			}
		});
		button.setBounds(192, 383, 93, 23);
		add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setBounds(344, 383, 93, 23);
		add(button_1);
		
		dm_demo = new JTextArea();
		dm_demo.setBounds(82, 273, 286, 62);
		add(dm_demo);

	}
}

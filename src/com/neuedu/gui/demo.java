package com.neuedu.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class demo extends JFrame {
	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public demo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\neuworkspace\\Test1\\icons\\book_edit.png"));
		setTitle("\u96C7\u5458\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 537);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u5458\u5DE5\u7BA1\u7406");
		menuBar.add(menu);
		
		JMenu menu_4 = new JMenu("\u65B0\u589E\u5458\u5DE5");
		menu.add(menu_4);
		
		JMenuItem menuItem = new JMenuItem("\u65B0\u589E\u666E\u901A\u5458\u5DE5");
		menu_4.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u65B0\u589E\u7BA1\u7406\u5458");
		menu_4.add(menuItem_1);
		
		JMenu menu_5 = new JMenu("\u67E5\u8BE2\u5458\u5DE5");
		menu.add(menu_5);
		
		JSeparator separator = new JSeparator();
		menu.add(separator);
		
		JMenuItem menuItem_2 = new JMenuItem("\u9000\u51FA");
		menu.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("\u5C97\u4F4D\u7BA1\u7406");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u90E8\u95E8\u7BA1\u7406");
		menuBar.add(menu_2);
		
		JMenu menu_3 = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		menuBar.add(menu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 782, 31);
		contentPane.add(toolBar);
		
		JButton button = new JButton("");
		button.setToolTipText("\u65B0\u589E\u5458\u5DE5");
		button.setIcon(new ImageIcon("D:\\neuworkspace\\Test1\\icons\\camera_add.png"));
		
		//新增员工按钮
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1.先移除
				panel.removeAll();
				panel.repaint();
				//2.再添加
				AddEmpPenal addEmpPenal = new AddEmpPenal();
				addEmpPenal.setBounds(0, 0, 782, 436);
				panel.add(addEmpPenal);
			}
		});
		toolBar.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setToolTipText("\u8C03\u8F6C\u90E8\u95E8");
		button_1.setIcon(new ImageIcon("D:\\neuworkspace\\Test1\\icons\\brick_edit.png"));
		toolBar.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setToolTipText("\u8C03\u6574\u85AA\u8D44");
		button_2.setIcon(new ImageIcon("D:\\neuworkspace\\Test1\\icons\\briefcase.png"));
		toolBar.add(button_2);
		
		panel = new JPanel();
		panel.setBounds(10, 41, 782, 436);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jilijian\\Desktop\\\u5B66\u800C\u601D\u7F51\u6821_\u7B14\u8BB0\u62CD\u7167\\\u3010\u53E4\u3011\u5343\u53E4\u5947\u51A4\u2014\u2014\u5173\u6C49\u537F\u548C\u300A\u7AA6\u5A25\u51A4\u300B\\20200530-132255.png"));
		lblNewLabel.setBounds(0, 0, 772, 436);
		panel.add(lblNewLabel);
		
		//窗体居中
		this.setLocationRelativeTo(null);
	}
}

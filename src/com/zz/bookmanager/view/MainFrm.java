package com.zz.bookmanager.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class MainFrm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm frame = new MainFrm();
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
	public MainFrm() {
		setTitle("图书管理系统主界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 545);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("基本数据维护");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("图书类别管理");
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/bookTypeManager.png")));
		mnNewMenu.add(mnNewMenu_1);
		
		JMenuItem menuItem = new JMenuItem("图书类别添加");
		mnNewMenu_1.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("图书类别维护");
		mnNewMenu_1.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("图书管理");
		menu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/bookManager.png")));
		mnNewMenu.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("图书添加");
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("图书维护");
		menu_1.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("安全退出");
		menuItem_4.setIcon(new ImageIcon(MainFrm.class.getResource("/images/exit.png")));
		mnNewMenu.add(menuItem_4);
		
		JMenu menu = new JMenu("关于我们");
		menuBar.add(menu);
		
		JMenuItem mntmjavaa = new JMenuItem("关于java'a");
		menu.add(mntmjavaa);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}

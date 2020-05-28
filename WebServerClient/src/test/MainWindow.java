package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

public class MainWindow {

	private JFrame frmWeb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmWeb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWeb = new JFrame();
		frmWeb.setFont(new Font("宋体", Font.BOLD, 12));
		frmWeb.setTitle("Web服务");
		frmWeb.getContentPane().setBackground(Color.WHITE);
		frmWeb.setBounds(100, 100, 466, 375);
		frmWeb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWeb.getContentPane().setLayout(null);
		
		JButton btn_1 = new JButton("IP\u5730\u5740\u5F52\u5C5E\u5730\u67E5\u8BE2");
		btn_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setFont(new Font("宋体", Font.BOLD, 15));
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							IpAddress window = new IpAddress();
							window.frmIp.setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_1.setBounds(85, 30, 264, 32);
		frmWeb.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("\u624B\u673A\u53F7\u5F52\u5C5E\u5730\u67E5\u8BE2");
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_2.setFont(new Font("宋体", Font.BOLD, 15));
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Mobile window = new Mobile();
							window.frame.setVisible(true);
							
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_2.setBounds(85, 90, 264, 32);
		frmWeb.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("\u7B80\u4F53\u5B57\u7E41\u4F53\u5B57\u8F6C\u6362");
		btn_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setFont(new Font("宋体", Font.BOLD, 15));
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							TraditionalChinese window = new TraditionalChinese();
							window.frame.setVisible(true);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_3.setBounds(85, 150, 264, 32);
		frmWeb.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("\u706B\u8F66\u65F6\u523B\u8868");
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_4.setFont(new Font("宋体", Font.BOLD, 15));
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Train window = new Train();
							window.frame.setVisible(true);
								
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_4.setBounds(85, 210, 264, 32);
		frmWeb.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("\u57CE\u5E02\u5929\u6C14\u9884\u62A5");
		btn_5.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_5.setFont(new Font("宋体", Font.BOLD, 15));
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Weather window = new Weather();
							window.frame.setVisible(true);
								
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btn_5.setBounds(85, 270, 264, 32);
		frmWeb.getContentPane().add(btn_5);
	}
}

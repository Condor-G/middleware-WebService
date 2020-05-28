package test;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import cn.com.WebXml.*;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

public class TraditionalChinese {

	JFrame frame;
	private JRadioButton btn1;
	private JRadioButton btn2;
	private ButtonGroup group;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	
	public String getData(String input) {
		String result = null;
		TraditionalSimplifiedWebServiceSoapProxy proxy = new TraditionalSimplifiedWebServiceSoapProxy();
		if(btn1.isSelected()) {
			try {
				result = proxy.toTraditionalChinese(input);
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		if(btn2.isSelected()) {
			try {
				result = proxy.toSimplifiedChinese(input);
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		
		return result;
	}

	/**
	 * Create the application.
	 */
	public TraditionalChinese() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\t中文简体字--繁体字转换");
		frame.setResizable(false);
		frame.setBounds(100, 100, 520, 380);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btn1 = new JRadioButton("\u7B80\u8F6C\u7E41");
		btn1.setFont(new Font("宋体", Font.BOLD, 15));
		btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn1.setBounds(145, 66, 77, 27);
		frame.getContentPane().add(btn1);
		
		btn2 = new JRadioButton("\u7E41\u8F6C\u7B80");
		btn2.setFont(new Font("宋体", Font.BOLD, 15));
		btn2.setBorder(new CompoundBorder());
		btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn2.setBounds(262, 66, 77, 27);
		frame.getContentPane().add(btn2);
		
		group=new ButtonGroup();
		group.add(btn1);
		group.add(btn2);
		
		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textArea_1.setFont(new Font("宋体", Font.PLAIN, 13));
		textArea_1.setBounds(109, 38, 290, 70);
		frame.getContentPane().add(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane(textArea_1);
		scrollPane.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		scrollPane.setBorder(null);
		scrollPane.setBounds(30, 134, 460, 83);
		frame.getContentPane().add(scrollPane);
		
		btnNewButton = new JButton("\u8FD0\u884C");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 15));
		btnNewButton.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JRootPane rootPane = textArea_1.getRootPane();
		rootPane.setDefaultButton(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textArea_1.getText();
				String result = getData(input);
				textArea_2.setText(result);
//				textArea_1.setText("");
			}
		});
		btnNewButton.setBounds(390, 66, 100, 27);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("需转换文字：");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 15));
		lblNewLabel.setBounds(30, 113, 97, 18);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("结果：");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 15));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_1.setBounds(30, 223, 72, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setEditable(false);
		textArea_2.setFont(new Font("宋体", Font.PLAIN, 13));
		textArea_2.setBounds(37, 248, 290, 70);
		frame.getContentPane().add(textArea_2);
		
		scrollPane_1 = new JScrollPane(textArea_2);
		scrollPane_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		scrollPane_1.setBorder(null);
		scrollPane_1.setBounds(30, 248, 460, 83);
		frame.getContentPane().add(scrollPane_1);
		
	}
}

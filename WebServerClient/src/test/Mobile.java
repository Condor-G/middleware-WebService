package test;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

import cn.com.WebXml.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.SystemColor;

public class Mobile {

	JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	
	public String getData(String input) {
		MobileCodeWSSoapProxy proxy = new MobileCodeWSSoapProxy();
		String result = null;
		try {
			result = proxy.getMobileCodeInfo(input, "");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Create the application.
	 */
	public Mobile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("手机号归属地查询");
		frame.setResizable(false);
		frame.setBounds(100, 100, 436, 271);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(126, 48, 149, 34);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setEditable(false);
		textField_2.setBounds(126, 157, 272, 34);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		JRootPane rootPane = textField_1.getRootPane();
		rootPane.setDefaultButton(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField_1.getText();
				String result = getData(input);
				textField_2.setText(result);
			}
		});

		button.setBounds(299, 51, 99, 28);
		frame.getContentPane().add(button);
		
		JLabel lblIp = new JLabel("国内手机号：");
		lblIp.setBounds(25, 52, 90, 24);
		frame.getContentPane().add(lblIp);
		
		label_1 = new JLabel("查询结果：");
		label_1.setBounds(25, 165, 75, 18);
		frame.getContentPane().add(label_1);
	}

}

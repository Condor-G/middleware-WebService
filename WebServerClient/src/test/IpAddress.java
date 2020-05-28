package test;

import java.awt.EventQueue;
import java.rmi.RemoteException;

import cn.com.WebXml.*;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRootPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.SystemColor;

public class IpAddress {

	JFrame frmIp;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblIp_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	
	
	public String getData(String input) {
		IpAddressSearchWebServiceSoapProxy proxy = new IpAddressSearchWebServiceSoapProxy();
		String[] results = null;
		try {
			results = proxy.getCountryCityByIp(input);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results[1];
	}
	

	/**
	 * Create the application.
	 */
	public IpAddress() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIp = new JFrame();
		frmIp.getContentPane().setBackground(SystemColor.control);
		frmIp.getContentPane().setForeground(Color.BLACK);
		frmIp.setFont(new Font("宋体", Font.PLAIN, 12));
		frmIp.getContentPane().setFont(new Font("宋体", Font.PLAIN, 15));
		frmIp.setTitle("IP地址归属地查询");
		frmIp.setResizable(false);
		frmIp.setBounds(100, 100, 450, 291);
		frmIp.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frmIp.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(101, 50, 219, 30);
		frmIp.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.controlHighlight);
		textField_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setEditable(false);
		textField_2.setBounds(101, 160, 219, 28);
		frmIp.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setFont(new Font("宋体", Font.PLAIN, 15));
		
		JRootPane rootPane = textField_1.getRootPane();
		rootPane.setDefaultButton(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField_1.getText();
				String result = getData(input);
				textField_2.setText(result);
			}
		});

		button.setBounds(331, 51, 99, 28);
		frmIp.getContentPane().add(button);
		
		JLabel lblIp = new JLabel("IP地址：");
		lblIp.setFont(new Font("宋体", Font.PLAIN, 15));
		lblIp.setBounds(25, 56, 61, 18);
		frmIp.getContentPane().add(lblIp);
		
		JLabel label = new JLabel("(格式样例：202.117.179.110)");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.PLAIN, 15));
		label.setBounds(101, 90, 211, 18);
		frmIp.getContentPane().add(label);
		
		lblIp_1 = new JLabel("IP所在地：");
		lblIp_1.setFont(new Font("宋体", Font.PLAIN, 15));
		lblIp_1.setBounds(25, 165, 76, 18);
		frmIp.getContentPane().add(lblIp_1);
	}
}

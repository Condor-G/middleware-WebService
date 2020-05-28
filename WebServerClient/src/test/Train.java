package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import cn.com.WebXml.*;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Train {

	JFrame frame;
	private JTextField textField;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	public String[] getData(String input) {
		TrainTimeWebServiceSoapProxy proxy = new TrainTimeWebServiceSoapProxy();
		String[] results = null;
		try {
			results = proxy.getStationAndTimeByTrainCode(input, "");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
	}
	
	/**
	 * Create the application.
	 */
	public Train() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("火车时刻表查询");
		frame.setBounds(100, 100, 463, 347);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("列车编号:");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(27, 40, 75, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(124, 37, 86, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setFont(new Font("宋体", Font.BOLD, 15));
		
		JRootPane rootPane = textField.getRootPane();
		rootPane.setDefaultButton(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText();
				String results[] = getData(input);
				
				label_5.setText(results[0]);
				label_1.setText(results[1]);
				label_2.setText(results[2]);
				label_3.setText(results[4]);
				label_4.setText(results[6]);
				label_6.setText(results[8]);
			}
		});
		button.setBounds(314, 36, 113, 27);
		frame.getContentPane().add(button);
		

		
		label_1 = new JLabel("");
		label_1.setBounds(42, 152, 86, 18);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("");
		label_2.setBounds(320, 152, 72, 18);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("");
		label_3.setBounds(42, 215, 72, 18);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("");
		label_4.setBounds(320, 215, 72, 18);
		frame.getContentPane().add(label_4);
		
		label_5 = new JLabel("");
		label_5.setBounds(188, 170, 72, 18);
		frame.getContentPane().add(label_5);
		
		label_6 = new JLabel("");
		label_6.setBounds(188, 201, 72, 18);
		frame.getContentPane().add(label_6);
	}
}

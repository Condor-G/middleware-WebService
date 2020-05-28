package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import cn.com.WebXml.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Weather {

	JFrame frame;
	private JTextField textField;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	public String getData(String input) {
		WeatherWSSoapProxy proxy = new WeatherWSSoapProxy();
		String results[] = null;
		try {
			results = proxy.getWeather(input, "");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(results.length==1) {
			return "查询结果为空";
		}
		String s = "";
		s += (results[0]+System.lineSeparator()); //位置
		s += (results[3]+System.lineSeparator()); //当前时间
		s += (results[4]+System.lineSeparator()); //今日天气
		s += (results[5]+System.lineSeparator()); //紫外线
		s += (results[9]+System.lineSeparator()); //风向
		
		s += (results[12]+System.lineSeparator()); //明天
		s += (results[13]+System.lineSeparator()); //温度
		s += (results[14]+System.lineSeparator()); //风向
		
		s += (results[17]+System.lineSeparator()); //后天
		s += (results[18]+System.lineSeparator());
		s += (results[19]+System.lineSeparator());
		
		s += (results[22]+System.lineSeparator()); //大后天
		s += (results[23]+System.lineSeparator());
		s += (results[24]+System.lineSeparator());
		return s;
	
	}
	
	/**
	 * Create the application.
	 */
	public Weather() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("宋体", Font.BOLD, 12));
		frame.setTitle("城市天气预报");
		frame.setBounds(100, 100, 488, 461);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(100, 49, 98, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u67E5\u8BE2");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setFont(new Font("宋体", Font.BOLD, 15));
		
		JRootPane rootPane = textField.getRootPane();
		rootPane.setDefaultButton(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textField.getText();
				String result = getData(input);
				textPane.setText(result);
				
			}
		});
		button.setBounds(266, 50, 113, 27);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("\u57CE\u5E02\uFF1A");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(29, 54, 72, 18);
		frame.getContentPane().add(label);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(29, 115, 412, 274);
		frame.getContentPane().add(textPane);
		
		JLabel label_1 = new JLabel("天气状况：");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("宋体", Font.BOLD, 15));
		label_1.setBounds(29, 94, 98, 18);
		frame.getContentPane().add(label_1);
	}
}

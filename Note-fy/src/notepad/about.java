package notepad;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class about extends JFrame implements ActionListener{
	public about() {
		setBounds(400,100,600,500);
		setLayout(null);
		setTitle("About Notepad");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
		JLabel headerIcon = new JLabel(new ImageIcon(i2));
		headerIcon.setBounds(70, 40, 400, 80);
		add(headerIcon);

		ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
		Image i4 = i3.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		JLabel Icon = new JLabel(new ImageIcon(i4));
		Icon.setBounds(60, 180, 70, 70);
		add(Icon);
		
		JLabel text = new JLabel("<html>Bhabesh Behera<br>Version 2.8.9<br>(OS build Java)"
				+ "<br>Bhuvii corporation. All rights Reserved.</html>");
		text.setBounds(150, 100, 500, 200);
		text.setFont(new Font("SAN_SERIF",Font.PLAIN,12));
		add(text);
		
		JButton b1 = new JButton("OK");
		b1.setBounds(150,350,120,25);
		b1.addActionListener(this);
		add(b1);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new about();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setVisible(false);
	}

}

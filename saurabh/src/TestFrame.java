
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TestFrame
{
	JTextField jf1;
	JTextField jf2;
	JTextField jf3;
	JButton b1;
	JButton b2;
	TestFrame()
	{
		
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(664, 486);
		f.getContentPane().setLayout(null);
		
		 jf1=new JTextField();
		jf1.setBounds(100,103,150,30);
		f.getContentPane().add(jf1);
		
		jf2=new JTextField();
		jf2.setBounds(374,103,150,30);
		f.getContentPane().add(jf2);
		
		 jf3=new JTextField();
		jf3.setBounds(210,186,150,30);
		f.getContentPane().add(jf3);
		
		
		b1= new JButton("ADD");
		b1.setBounds(160,261,90,30);
		f.getContentPane().add(b1);
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
			
				int a=Integer.parseInt(jf1.getText());
				int b=Integer.parseInt(jf2.getText());
				int c=a+b;
				jf3.setText(c+" ");
			}
		});
		
		 b2= new JButton("SUB");
		b2.setBounds(292,261,90,30);
		f.getContentPane().add(b2);
		
		JLabel lblValueFirst = new JLabel("First value:-");
		lblValueFirst.setBounds(27, 103, 90, 30);
		f.getContentPane().add(lblValueFirst);
		
		JLabel lblSecondValue = new JLabel("Second value:-");
		lblSecondValue.setBounds(281, 103, 102, 30);
		f.getContentPane().add(lblSecondValue);
		
		JLabel lblAddsub = new JLabel("Add/Sub :-");
		lblAddsub.setBounds(148, 186, 90, 30);
		f.getContentPane().add(lblAddsub);
		
		JLabel lblAdditoinAndSubtraction = new JLabel("Additoin and Subtraction oj two values");
		lblAdditoinAndSubtraction.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAdditoinAndSubtraction.setVerticalAlignment(SwingConstants.TOP);
		lblAdditoinAndSubtraction.setBounds(187, 47, 244, 14);
		f.getContentPane().add(lblAdditoinAndSubtraction);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				int a=Integer.parseInt(jf1.getText());
				int b=Integer.parseInt(jf2.getText());
				int c=a-b;
				jf3.setText(c+" ");	
			}
		} );
	}
	
	
	public static void main(String[] args) 
	{
		new TestFrame();
	}
}


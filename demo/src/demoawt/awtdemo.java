package demoawt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;
import javax.swing.*;    
  
public class awtdemo extends Frame{
	/**
	 * @wbp.nonvisual location=211,69
	 */
	public JLabel label = new JLabel("so 1");
	/**
	 * @wbp.nonvisual location=51,119
	 */
	private final JLabel label_1 = new JLabel("so2");
	/**
	 * @wbp.nonvisual location=51,169
	 */
	private final JLabel label_2 = new JLabel("so3");
	public awtdemo() {
		windowframe();  
			 
		addWindowListener (new WindowAdapter() {    
			public void windowClosing (WindowEvent e) {    
				dispose();    
			            }   
				 });  
	}
	
	public void windowframe() {
		setSize(569,263);
		setLocationRelativeTo(null);
		setVisible(true);
		label.setBounds(10,25,211,69);
		add(label);
		label_1.setBounds(10,35, 51, 119);
		add(label_1);
		label_2.setBounds(10,45, 51, 169);
		add(label_2);
		
	}
	
	public static void main(String[] args) {
		new awtdemo();
	}
	
//
//	public class WindowExample extends Frame {    
//
//	    WindowExample() {    
//  
//	        addWindowListener (new WindowAdapter() {    
//	            public void windowClosing (WindowEvent e) {    
//	                dispose();    
//	            }    
//	        });    
//	
//	        setSize (400, 400);    
//	        setLayout (null);    
//	        setVisible (true);    
//	    }    

//	public static void main (String[] args) {    
//	    new WindowExample();    
//	}    
//	
	
	
	
	
	
}

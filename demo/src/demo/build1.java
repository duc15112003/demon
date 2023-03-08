package demo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class build1 {
	static controller cl = new controller();
	public static JFrame frame;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTable table;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	public static void main(String[]args) {
		frame = new JFrame();
		frame.setSize(774,410);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(308, 90, 426, 80);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 NV", "T\u00EAn NV", "Ch\u1EE9c V\u1EE5", "L\u01B0\u01A1ng"
			}
		));
		frame.getContentPane().add(table);
		JLabel lblNewLabel = new JLabel("Mã NV");
		lblNewLabel.setBounds(48, 61, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TenNV");
		lblNewLabel_1.setBounds(48, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chức Vụ");
		lblNewLabel_2.setBounds(48, 153, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lương");
		lblNewLabel_3.setBounds(48, 204, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setBounds(280, 280, 89, 23);
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cl.exit();	
			}
		});
		frame.getContentPane().add(btnexit);
		
		textField = new JTextField();
		textField.setBounds(141, 58, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(141, 103, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(141, 149, 86, 22);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Giám Đốc", "Nhân viên thường", "Quản lí nhân sự", "Trưởng phòng"}));
		frame.getContentPane().add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 201, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnadd = new JButton("ADD");
		btnadd.setBounds(5, 280, 89, 23);
		frame.getContentPane().add(btnadd);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"MA", "HO VA TEN", "CHUC VU", "LUONG"
				}
			));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		frame.getContentPane().add(table);
		JButton btnopen = new JButton("OPEN");
		btnopen.setBounds(138, 280, 89, 23);
		frame.getContentPane().add(btnopen);
		frame.setVisible(true);
	}
}

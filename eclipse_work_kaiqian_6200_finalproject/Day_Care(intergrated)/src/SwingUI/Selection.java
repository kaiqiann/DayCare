package SwingUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Selection extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection frame = new Selection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Selection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725,510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 709, 471);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(568, 38, 120, 30);
		panel.add(btnAddStudent);
		
		JButton btnAddTeacher = new JButton("Add Teacher");
		btnAddTeacher.setBounds(568, 98, 120, 30);
		panel.add(btnAddTeacher);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 535, 190);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 270, 535, 190);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblSortStudentBy = new JLabel("Sort Student By :");
		lblSortStudentBy.setFont(new Font("Sitka Banner", Font.PLAIN, 16));
		lblSortStudentBy.setBounds(20, 221, 108, 28);
		panel.add(lblSortStudentBy);
		
		JLabel lblSortBy = new JLabel("Sort Teacher By :");
		lblSortBy.setFont(new Font("Sitka Banner", Font.PLAIN, 16));
		lblSortBy.setBounds(284, 220, 128, 30);
		panel.add(lblSortBy);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(139, 222, 137, 28);
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"StudentName", "Age", "Gpa", "ParentName", "Address", "PhoneNumber"}));
		
		JButton btnUpdate = new JButton("Show Updates");
		btnUpdate.setBounds(568, 218, 120, 30);
		panel.add(btnUpdate);
		
				
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(408, 222, 135, 28);
		panel.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"TeacherName", "Age", "Credit"}));
		
		JLabel label_2 = new JLabel("");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setIcon(new ImageIcon(Selection.class.getResource("/images/a19N0q.jpg")));
		label_2.setBounds(0, 0, 710, 470);
		panel.add(label_2);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con =DriverManager.getConnection(  
							"jdbc:mysql://localhost:3306/mydatabase","root","mySQL");  
					Statement st1 = con.createStatement();
					ResultSet set = st1.executeQuery("select * from stu order by " + comboBox.getSelectedItem() +" ;");
					table.setModel(DbUtils.resultSetToTableModel(set));
					ResultSet set1 = st1.executeQuery("select * from tea order by " + comboBox_1.getSelectedItem() +" ;");
					table_1.setModel(DbUtils.resultSetToTableModel(set1));
					
				}
				catch(Exception e)
					{
					System.out.print(e);
					e.printStackTrace();
				}
			}
			});
		
		/*btnShowInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowTable st = new ShowTable();
				st.setVisible(true);
			}
		});*/
		btnAddTeacher.setIcon(
				new ImageIcon(TeacherUI.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		btnAddTeacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeacherUI addteacher = new TeacherUI();
				addteacher.setVisible(true);
			}
		});
		btnAddStudent.setIcon(
				new ImageIcon(TeacherUI.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentUI stuui = new StudentUI();
				stuui.show();
			}
		});
	}
}


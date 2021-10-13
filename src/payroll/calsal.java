package payroll;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
public class calsal extends JFrame{

	Double da,bs,hra,medical,de,basic_salary,pay_salary;
	private static final long serialVersionUID = 1L;
	static calsal frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
//	JOptionPane.showMessageDialog(Add_emp.this, "NAME : "+name+" PASS : "+password+" EMP_ID : "+empid+" ORG : "+org+ " MAIL : "+mail);
/*da = (bs*4)100;
hra = bs*10/100;
medical = 100;

total_salary = da+hra+medical-deduction;*/
	
	public calsal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 450, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdd = new JLabel("Add Details");
		lblAdd.setForeground(Color.GRAY);
		lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel l_bs = new JLabel("Basic Salary (BS) :");
		
		JLabel l_da = new JLabel("Dearness Allowance In % (DA) :");
		
		JLabel l_hra = new JLabel("House Rent Allowance (HRA) :");
		
		JLabel l_med = new JLabel("medical allowance (MA) :");
		
		JLabel l_de = new JLabel("Deduction (DE):");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnAddDetails = new JButton("Add Details");
		btnAddDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//da,bs,hra,medical,basic_salary,pay_salary;
		//int emp_id = user_login.get_emp();
        String s1 = textField.getText();
		String s2 = textField_1.getText();
		String s3=textField_2.getText();
		String s4=textField_3.getText();
		String s5 = textField_4.getText();
		
		basic_salary = Double.parseDouble(s1);
		da = Double.parseDouble(s2);
		hra = Double.parseDouble(s3);
		medical = Double.parseDouble(s4);
		de = Double.parseDouble(s5);
		
		double temp;
		temp = basic_salary*da;
		temp = temp/100;
		 pay_salary = basic_salary+temp+hra+medical-de;
		JOptionPane.showMessageDialog(calsal.this,"CALCULATE SALARY IS: " +pay_salary );
		/*
		medical = 100;

		total_salary = da+hra+medical-deduction*/
			
		int x=user_login.get_emp();
		int i = payCon.insert_cal(x, basic_salary,temp, hra, medical, de, pay_salary);
		
			if(i>0){
				JOptionPane.showMessageDialog(calsal.this,"Details added successfully!");
				user_home.main(new String[]{});
				frame.dispose();
				
			}else{
				
				JOptionPane.showMessageDialog(calsal.this,"Sorry, unable to save Details! ");
			}
			}
		});
		
		JButton btnBack = new JButton("Back");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(150)
							.addComponent(lblAdd))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(l_bs)
								.addComponent(l_da)
								.addComponent(l_hra)
								.addComponent(l_med)
								.addComponent(l_de, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(125, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(161)
					.addComponent(btnAddDetails, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(162, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(359, Short.MAX_VALUE)
					.addComponent(btnBack)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdd)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_bs)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_da)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_hra)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_med)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(l_de)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addComponent(btnAddDetails, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnBack)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new calsal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
}

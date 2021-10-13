package payroll;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
public class user_home extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static user_home frame;
	private JPanel contentPane;
	
	
	
	
	public user_home()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(230, 120, 950, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianSection = new JLabel("Welcome To Payroll Management");
		lblLibrarianSection.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		
		
		
		JButton cals = new JButton("Calculate Salary");
		cals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			calsal.main(new String[]{});
			
			}
		});
		cals.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JButton viewstore = new JButton("View Stored Calcutaion");
		viewstore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View_cal.main(new String[]{});
			}
		});
		viewstore.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JButton slip = new JButton("Download Payslip");
		slip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				View_cal.main(new String[]{});
			}
		});
		slip.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Payroll_main.main(new String[]{});
			}
		});
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
				.addGap(01)
				.addComponent(lblLibrarianSection)
				.addGap(240))
				.addGroup(gl_contentPane.createSequentialGroup()
				.addGap(375)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
				.addComponent(slip, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
				.addComponent(viewstore, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
				.addComponent(cals, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(220, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianSection)
					.addGap(50)
					.addComponent(cals, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(viewstore, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(slip, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}

	
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new user_home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

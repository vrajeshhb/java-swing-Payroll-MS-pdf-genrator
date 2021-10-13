

package payroll;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class Payroll_main extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Payroll_main frame;
	private JPanel contentPane;

	public Payroll_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(430, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel payManagement = new JLabel("PayRoll Management System.");
		payManagement.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		payManagement.setForeground(Color.DARK_GRAY);
		
		JButton UserLogin = new JButton("User Login");
		UserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//to open user login over here.......
			user_login.main(new String[]{});
			frame.dispose();
			}
		});
		UserLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		JButton AdminLogin = new JButton("Admin Login");
		AdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				admin_login.main(new String[]{});// to open admin login over here.......
			}
		});
		AdminLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addComponent(payManagement))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(180)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(UserLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(AdminLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(payManagement)
					.addGap(32)
					.addComponent(UserLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(AdminLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame= new Payroll_main();
					frame.setSize(510, 300);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}

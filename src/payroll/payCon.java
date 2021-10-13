package payroll;


import java.sql.*;

public class payCon {
	public static boolean validate(int empid,String password){
		boolean status=false;
		try{
			Connection con = DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user where empid=? and password=?");
			ps.setInt(1,empid);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int insert(String name,String password,String empid,String mail,String org){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user(name,password,empid,mail,org) values(?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,empid);
			ps.setString(4,mail);
			ps.setString(5,org);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from user where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	
	public static int insert_cal(int e_id, double b_sal,double da,double ha,double med, double de,double t_salary)
	{
		int status = 0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into cal_pay(emp_id,basic_salary,da,home_allo,medical,de,salary) values(?,?,?,?,?,?,?)");
			ps.setInt(1,e_id);
			ps.setDouble(2,b_sal);
			ps.setDouble(3,da);
			ps.setDouble(4,ha);
			ps.setDouble(5,med);
			ps.setDouble(6,de);
			ps.setDouble(7,t_salary);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	


}

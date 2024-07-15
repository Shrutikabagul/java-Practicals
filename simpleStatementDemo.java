import java.sql.*;
public class SimpleStatementDemo{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		try{
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
		System.out.println(con);
		stmt = con.createStatement();

		//Executing SQL statement
		String insertStud = "insert into student1 values(1906007, 'Shrutika', 95,99)";
		stmt.executeUpdate(insertStud);

		//Get ResultSet
		String sel = "select * from student1";
		ResultSet rs = stmt.executeQuery(sel);
		System.out.println("Roll No \tName    \tMarks1\tMarks2");
		while(rs.next())
		{
			int rn = rs.getInt(1);
			String name = rs.getString(2);
			int m1 = rs.getInt(3);
			int m2 = rs.getInt(4);
			System.out.println(rn +"\t\t"+ name +"\t"+ m1 +"\t"+ m2);
		}//end of while loop

		stmt.close();
		con.close();

		}//end of try block
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}//end of catch block
	}//end of main method

}//end of class
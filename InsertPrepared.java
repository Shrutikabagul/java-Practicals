//Create table emp (No int,Name varchar2(20));
import java.sql.*;  
class InsertPrepared{  
public static void main(String args[]){  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");  
  
PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");  
stmt.setInt(1,101);//1 specifies the first parameter in the query  
stmt.setString(2,"Shrutika");  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  
import java.net.*;
import java.io.*;
public class LowPortScanner{
public static void main(String args[])
{
	String host="localhost";
	for(int i=1;i<1024;i++)
	{
		try
		{
			Socket s=new Socket(host,i);
			System.out.println("There is a server on port"+ i +"of"+host);
		}
		catch(UnknownHostException ex)
		{
			System.err.println(ex);
			break;
		}
		catch(IOException ex)
		{
		}
	}
}//end of main
}//end of LowPortScanner class
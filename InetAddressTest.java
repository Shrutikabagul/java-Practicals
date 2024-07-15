import java.net.*;
class InetAddressTest
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress Address=InetAddress.getLocalHost();
		System.out.println(Address);
		
		Address=InetAddress.getByName("google.com");
		System.out.println(Address);
	
		InetAddress sw[]=InetAddress.getAllByName("www.Yahoo.com");
		
		for(int i=0;i<sw.length;i++)
		{
			System.out.println(sw[i]);
		}
	}//end of main
}//end of InetAddress function
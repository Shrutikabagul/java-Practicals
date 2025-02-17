import java.net.*;
public class DatagramPacketExample
{
public static void main(String[] args) throws SocketException
   {
	String s = "This is a test.";
	byte[] data = s.getBytes( );
        try
        {
	InetAddress ia = InetAddress.getByName("www.google.com");
	int port = 7;
	DatagramPacket dp = new DatagramPacket(data, data.length, ia, port);
	
	System.out.println("This packet is addressed to  "+dp.getAddress()+"on port "+dp.getPort());
	System.out.println("There are  " + dp.getLength( )+ " bytes of data in the packet");
	System.out.println(new String(dp.getData( ), dp.getOffset( ), dp.getLength( )));
       }//end of try
       catch (UnknownHostException e)
       {
	System.err.println(e);
       }
  }
}

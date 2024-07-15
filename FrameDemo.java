import java.awt.*;
import java.awt.event.*;

public class FrameDemo
{
	Frame f;
	FrameDemo()
	{
		f=new Frame("Frame Example");
		f.setSize(300,300);
		f.setVisible(true);
		//f.setTitle("hello frame");
	}
	
	public static void main(String args[])
	{
		new FrameDemo();
	}
}
		
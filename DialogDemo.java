// program for dialog box
import java.awt.*;
import java.awt.event.*;

public class DialogDemo{
	private static Dialog d;
	DialogDemo()
	{
		Frame f = new Frame();
		d = new Dialog(f,"Example",true);
		d.setLayout(new FlowLayout());
		Button btnOk = new Button("Ok");

		btnOk.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				DialogDemo.d.setVisible(false);
			} // end of actionPerformed method
		});

		d.add(new Label("Click ok to continue."));
		d.add(btnOk);
		d.setSize(300,300);
		d.setVisible(true);

	} //  end of constructor

	public static void main(String args[])
	{
		new DialogDemo();
	} // end of main method

} // end of DialogDemo class
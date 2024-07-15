//write a program to display login page

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="login.class" width="100" height="100"> </applet> */

public class login extends Applet implements ActionListener
{

	TextField txtUsername,txtPassword;
	Label lbUsername,lblPassword;
	String str,str2,msg;
	
	
	public void init()
	{
	 	//creating objects of buttons
		Button btnSubmit=new Button("Submit");
		Button btnReset=new Button("Reset");
		
		//creating objects for textfield
		Label lblUsername=new Label("Username");
		TextField txtUsername=new TextField(5);
		

		Label lblPassword=new Label("Password");
		TextField txtPassword=new TextField(5);
		txtPassword.setEchoChar('*');


		
		//add buttons to applet
		add(btnSubmit);
		add(btnReset);
		
		
		add(lblUsername);
		add(txtUsername);
		add(lblPassword);
		add(txtPassword);
		
		// register events on buttons
		btnSubmit.addActionListener(this);
		btnReset.addActionListener(this);

		
		

	} //end of init method

public void actionPerformed(ActionEvent ae)
{

			str = ae.getActionCommand();
			if(str.equals("shrutika") && str.equals("shrutika")){
			   
                                                                     
			}
			repaint();
}



public void paint(Graphics g)
{
		
		msg = "Current Status";
		g.drawString(msg,10,90);

		str = txtUsername.getText();
		str2 = txtPassword.getText();
		
			msg = "Hello" + txtUsername.getText();
			g.drawString(msg,10,120);
}//end of paint method

}





	

	

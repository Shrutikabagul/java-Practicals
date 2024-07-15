import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="RegistrationDemo.class" width=1000 height=1000>
</applet>*/

public class RegistrationDemo extends Applet implements ActionListener,ItemListener
{
	Label lblfName, lblmName, lbllName,lblCourse,lblGender,lblDate;
	Button btnSubmit, btnReset;
	Checkbox chkJp2, chkPython, chkDM, chkAap, chkCs, chkMale, chkFemale,chk;
	CheckboxGroup cbg;
	TextField txtfName, txtmName, txtlName;
	Font f;
	String str,msg;
		public void init()
		{
			//setting font styles
			f = new Font("Arial",Font.PLAIN|Font.BOLD,25);
			setFont(f);

			//create objects of  labels
			lblfName =new Label("First Name ");
			lblmName =new Label("\nMiddle Name ");
			lbllName =new Label("\nLast Name ");
			lblCourse = new Label("   Courses  ");
			lblGender = new Label("Gender ");
			lblDate = new Label("Date of Birth ");

			//create text field objects
			txtfName= new TextField(20);
			txtmName= new TextField(20);
			txtlName= new TextField(20);

			//add label to the window
			add(lblfName);
			add(txtfName);
			add(lblmName);
			add(txtmName);
			add(lbllName);
			add(txtlName);

			//create checkbox group objects
			cbg=new CheckboxGroup();

			add(lblCourse);

			//create objects of checkboxes
			chkJp2 = new Checkbox("Java Programming - II");
			chkPython = new Checkbox("Programming with Python");
			chkDM = new Checkbox("Data Mining");
			chkAap = new Checkbox("Android Application Programming");
			chkCs = new Checkbox("Computer Security");
			chkMale =new Checkbox("Male",cbg,false);
			chkFemale = new Checkbox("Female",cbg,false);

			//add checkboxes to the window
			add(chkJp2);
			add(chkPython);
			add(chkDM);
			add(chkAap);
			add(chkCs);
			add(lblGender);

			//add checkboxgroups to the window
			add(chkMale);
			add(chkFemale);

			//create objects of button
			btnSubmit= new Button("Submit");
			btnReset= new Button("Reset");

			//add buttons to the window
			add(btnSubmit);
			add(btnReset);

			//register listener for the checkboxgroup
			chkMale.addItemListener(this);
			chkFemale.addItemListener(this);

			//register listener for the button
			btnSubmit.addActionListener(this);
			btnReset.addActionListener(this);
		}//end of init method
	public void actionPerformed(ActionEvent ae)
	{
		str = ae.getActionCommand();
		msg = "You clicked on button : "+str;
		repaint();
	}//end of actionPerformed method

	public void itemStateChanged(ItemEvent ie)
	{
	repaint();
	}//end of itemStateChanged

	public void paint(Graphics g)
	{
	g.drawString(msg,20,400);
	chk = cbg.getSelectedCheckbox();
	str = chk.getLabel();
	g.drawString("Gender : "+str,20,250);
}//end of paint method
}//end of FormDemo
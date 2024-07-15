//Program for tabbed pane in swing
import java.awt.*;
import javax.swing.*;

/*<applet code="SwingDemo.class" height=500 width=500>
</applet>
*/

public class SwingDemo extends JApplet
{
	public void init()
	{
		//Container cp = getContentPane();
		//cp.setLayout(new FlowLayout());
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Personal info",new PersonalInfo());
		jtp.addTab("Academic info",new AcademicInfo());
		add(jtp);
	}//end of init
}//end of JTabbedPaneDemo class
class PersonalInfo extends JPanel
{
	PersonalInfo()
	{
		JLabel lblEno = new JLabel("Enrollment no");
		add(lblEno);
		JTextField txtEno = new JTextField(10);
		add(txtEno);

		JLabel lblFname = new JLabel("First Name");
		add(lblFname);
		JTextField txtFname = new JTextField(10);
		add(txtFname);

		JLabel lblMname = new JLabel("Middle Name");
		add(lblMname);
		JTextField txtMname = new JTextField(10);
		add(txtMname);

		JLabel lblLname = new JLabel("Last Name");
		add(lblLname);
		JTextField txtLname = new JTextField(10);
		add(txtLname);
		
		//adding radio buttons 
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rbMale = new JRadioButton("Male");
		JRadioButton rbFemale = new JRadioButton("Female");
		bg.add(rbMale);	
		bg.add(rbFemale);
		add(rbMale);
		add(rbFemale);

		JLabel l4 = new JLabel("City");
		add(l4);
		JTextField jcity=new JTextField(10);
		add(jcity);
		
		JButton btnSubmit = new JButton("Submit");
		JButton btnReset = new JButton("Reset");

		add(btnSubmit);
		add(btnReset);
	}
}//end of PersonalInfo class extends JPanel
class AcademicInfo extends JPanel
{
	AcademicInfo()
	{
		JLabel lbl = new JLabel("Registered courses : ");
		add(lbl);
		JCheckBox chkJava = new JCheckBox("Java Programming-II");
		add(chkJava);
		JCheckBox chkPy = new JCheckBox("Python");
		add(chkPy);
		JCheckBox chkAndroid = new JCheckBox("Android Application Programming");
		add(chkAndroid);
		JCheckBox cbdm = new JCheckBox("Data mining");
		add(cbdm);
	
		JLabel lbl2 = new JLabel("Percentage");
		add(lbl2);
		JTextField jperc=new JTextField(10);
		add(jperc);
	
		JLabel lbl3 = new JLabel("Credits Earned");
		add(lbl3);
		JTextField jcredit=new JTextField(10);
		add(jcredit);
	
		
		//Combo box
		JComboBox jDept = new JComboBox();
		jDept.addItem("Computer");
		jDept.addItem("IT");
		jDept.addItem("Mechanical");
		jDept.addItem("Civil");
		jDept.addItem("E&TC");
		jDept.addItem("Electrical");
		jDept.addItem("Metallurgy");

		add(jDept);
		
		JButton btnSubmit = new JButton("Submit");
		JButton btnReset = new JButton("Reset");

		add(btnSubmit);
		add(btnReset);
	}
}//end of AcademicInfo class
//practical 4.2 program to implement table

import java.awt.*;
import javax.swing.*;
/*
<applet code="JTableDemo.class" width=400 height=200>
</applet>
*/
public class JTableDemo extends JApplet {

	public void init() {
	// Get content pane
	Container contentPane = getContentPane();
	
	// Initialize column headings
	final String[] colHeads = { "Enrollment No", "Name", "Marks" };
	// Initialize data
	final Object[][] data = {
	{ "1", "Shrutika Bagul", "95%" },
	{ "2", "Priya more", "78" },
	{ "3", "Samrudhi Bagul", "90" },
	{ "4", "Ankita Thorat", "67" },
	{ "5", "Pradnya Aher", "88" },
	{ "6", "Geeta Vaidya", "90" },
	{ "7", "Radhika Apte", "66" },
	{ "8", "Pranjali Aradhye", "90" },
	{ "9", "Sameer Bhosale", "78" },
	{ "10", "Tina Bhosale", "90" },
	
};
	// Create the table
	JTable table = new JTable(data, colHeads);
	// Add table to a scroll pane
	int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	JScrollPane jsp = new JScrollPane(table, v, h);
	// Add scroll pane to the content pane
	contentPane.add(jsp, BorderLayout.CENTER);
}
}
//Practical 4:Program to map directory,tree,and table

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
/*
<applet code="JTreeDemo.class" width=400 height=200>
</applet>
*/
public class JTreeDemo extends JApplet {
JTree tree;
JTextField jtf;
	public void init() 
	{

	// Get content pane
	Container contentPane = getContentPane();

	
	// Create top node of tree
	DefaultMutableTreeNode top = new DefaultMutableTreeNode("Computer Department");

	// Create subtree of "A"
	DefaultMutableTreeNode a = new DefaultMutableTreeNode("First Year");
	top.add(a);
	DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("G1");
	a.add(a1);
	DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("H1");
	a.add(a2);
	DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("N1");
	a.add(a3);

	// Create subtree of "B"
	DefaultMutableTreeNode b = new DefaultMutableTreeNode("Second year");
	top.add(b);
	DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("G2");
	b.add(b1);
	DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("H2");
	b.add(b2);
	DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("N2");
	b.add(b3);

	
	// Create subtree of "c"
	DefaultMutableTreeNode c = new DefaultMutableTreeNode("Third year");
	top.add(c);
	DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("G3");
	c.add(c1);
	DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("H3");
	c.add(c2);
	DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("N3");
	c.add(c3);

	// Create tree
	tree = new JTree(top);
	JScrollPane jsp=new JScrollPane(tree);
	add(jsp);
}

	
}	


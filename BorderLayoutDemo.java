// Demonstrate BorderLayout.
import java.awt.*;
import java.applet.*;
import java.util.*;
/*
<applet code="BorderLayoutDemo" width=400 height=200>
</applet>
*/
public class BorderLayoutDemo extends Applet 
{
	Font f;
	public void init() 
	{
		f = new Font("Arial",Font.PLAIN|Font.BOLD,25);
		setFont(f);
		setLayout(new BorderLayout());
		add(new Button("This is across the top."),BorderLayout.NORTH);
		add(new Label("The footer message might go here."), BorderLayout.SOUTH);
		add(new Button("Right"), BorderLayout.EAST);
		add(new Button("Left"), BorderLayout.WEST);
		String msg = "This is BorderLayout Example";
		add(new TextArea(msg), BorderLayout.CENTER);
	}
}
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//<applet code="FlowLayoutDemo.class" width=250 height=200></applet>

public class FlowLayoutDemo extends Applet
{
	Checkbox winxp,winvista,solaris,mac;
	Font f;
	
	public void init()
	{
		
		f = new Font("Arial",Font.PLAIN|Font.BOLD,25);
		setFont(f);
		//set left aligned flow layout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		winxp=new Checkbox("windows xp",null,true);
		winvista=new Checkbox("windows vista");
		solaris=new Checkbox("solaris");
		mac=new Checkbox("mac os");

		add(winxp);
		add(winvista);
		add(solaris);
		add(mac);
	}
}
		
		
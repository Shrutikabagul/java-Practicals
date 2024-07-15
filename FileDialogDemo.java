// Importing necessary packages

import java.awt.*;

public class FileDialogDemo extends Frame{
	FileDialog FD;
	Frame f;
	
	FileDialogDemo(){

		f = new Frame();
		FD = new FileDialog(f,"Open", FileDialog.LOAD);
	
		FD.setVisible(true);
		f.setSize(500,500);
		f.setVisible(true);
		
	} // end of constructor

	public static void main(String args[]){
		new FileDialogDemo();
	} // end of main method

} // end of FileDialogDemo class
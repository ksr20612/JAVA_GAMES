package classicGames;

import java.applet.Applet;
import java.text.*;
import java.awt.Graphics;

public class HelloApplet extends Applet{

	public void paint(Graphics g) {
		
		g.drawString("Hello, Applet!", 50, 100);
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 mm월 dd일");
		
		
	}
	
}

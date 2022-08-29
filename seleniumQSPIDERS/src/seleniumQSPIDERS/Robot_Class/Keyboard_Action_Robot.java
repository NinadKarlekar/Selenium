package seleniumQSPIDERS.Robot_Class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Keyboard_Action_Robot {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(5000);
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_Q);
		r2.keyPress(KeyEvent.VK_S);
		r2.keyPress(KeyEvent.VK_P);
		r2.keyPress(KeyEvent.VK_I);
		r2.keyPress(KeyEvent.VK_SHIFT); //SHIFT Key Press
		r2.keyPress(KeyEvent.VK_D);
		r2.keyPress(KeyEvent.VK_E);
		r2.keyPress(KeyEvent.VK_R);
		r2.keyPress(KeyEvent.VK_S);
		r2.keyRelease(KeyEvent.VK_SHIFT); //SHIFT Key Release
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyPress(KeyEvent.VK_1);
		r2.keyPress(KeyEvent.VK_2);
		r2.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(5000);
		r2.keyPress(KeyEvent.VK_RIGHT);
	}
}

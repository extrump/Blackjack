package media;

import gui.Body;
import gui.SubBody;

//throws windows and messages if player or dealer has won
public class Result {
	public static void message(boolean info){
		if (info==true) {
			Body.hit.setEnabled(false);
			Body.miss.setEnabled(false);
			System.out.println("You Won");
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();}
			gui.Body.counter=false;	
			System.exit(0);
			
		} else {
			Body.hit.setEnabled(false);
			Body.miss.setEnabled(false);
			System.out.println("You Lost");
			
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();}
			gui.Body.counter=false;
			System.exit(0);
		}
	}

}
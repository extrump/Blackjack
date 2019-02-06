package gui;

import javax.sound.sampled.Clip;
import javax.swing.SwingUtilities;

public class Launcher {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//generates static GUI elements and 2 active buttons
				new Body();
			}
		});
		
		//adds background audio
		  new Thread(() -> {
			  media.Audio au = new media.Audio();
			  Clip sound = au.playsample("res/aud/NKM.wav");
			  au.play(sound);
			  }).start();
		
		//initial layout, first 4 cards
		SubBody.layout();
		
		
	}

}

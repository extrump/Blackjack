package media;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//Background audio loop
public class Audio {

	public Clip playsample (String filename) {
		
		Clip in = null;
		
		try {
			
			AudioInputStream auxin = AudioSystem.getAudioInputStream(new File(filename));
			in = AudioSystem.getClip();
			in.open(auxin);
		} catch (Exception e){
			e.printStackTrace();
		}
	
		return in;
		
	}
	//commented lines can be used in further projects
	public void play(Clip clip) {
		if (clip.isRunning()) //clip.stop();
			clip.setFramePosition(0);
			//clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		
	}
	
}

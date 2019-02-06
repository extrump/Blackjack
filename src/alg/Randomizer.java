package alg;

import java.io.File;
import java.util.Random;
import java.nio.file.Path;

//here cards are randomly chosen
//it's implemented in my own weird way
//strings are used instead of arrays
//don't bother to understand this part
public class Randomizer {
	
	public String card;
	public int number;
	
	public File file;
	
	public void generate() {
		
		File dir = new File("res/img/crds");
		File[] files = dir.listFiles();
		Random rnd = new Random();
		
		file = files[rnd.nextInt(files.length)];
		Path path = file.toPath();
		card = path.toString();
		
		String name = file.getName().substring(1, 3);
		
		if (name.equals("AA")) {
			switch (gui.SubBody.flag) {
			case 0: if (gui.SubBody.dtmp<17) {number=11;} else number=1; break;
			case 1: if (gui.SubBody.ptmp<17) {number=11;} else number=1; break;
			}
		} else {
			try {
				number = Integer.valueOf(name);
			} catch (NumberFormatException e2) {
				System.out.printf("number %d name %s", number, name);
				e2.printStackTrace();}}
				
	}

}

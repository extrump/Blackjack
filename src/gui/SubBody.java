package gui;

import javax.swing.ImageIcon;

//active gui elements
public class SubBody {
	
	public static int dtmp = 0;
	public static int ptmp = 0;
	public static int flag;
	
	public static void layout() {
		
		//reseting layout
		dtmp=0;
		ptmp=0;
		Body.lbl1.setIcon(null);
		Body.lbl2.setIcon(null);
		Body.lbl3.setIcon(null);
		Body.lbl4.setIcon(null);
		Body.lbl5.setIcon(null);
		Body.lbl6.setIcon(null);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		alg.Randomizer rr = new alg.Randomizer();
		
		//3
		flag = 1;
		rr.generate();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Body.lbl3.setIcon(new ImageIcon(rr.card));
		ptmp+=rr.number;
		Body.ptext.setText(String.valueOf(ptmp));
		
		//4
		rr.generate();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Body.lbl4.setIcon(new ImageIcon(rr.card));
		ptmp+=rr.number;
		Body.ptext.setText(String.valueOf(ptmp));

		//1
		flag = 0;
		rr.generate();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Body.lbl1.setIcon(new ImageIcon(rr.card));
		dtmp+=rr.number;
		Body.dtext.setText(String.valueOf(dtmp));

		try {
			Thread.sleep(300);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Body.lbl2.setIcon(new ImageIcon("res/img/back.png"));
		
		try {
			Thread.sleep(800);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Body.hit.setEnabled(true);
		Body.miss.setEnabled(true);
		
	}

}
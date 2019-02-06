package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//has static gui elements
//except hit/miss button
@SuppressWarnings("serial")
public class Body extends JFrame {
	
	private JMenuBar mbar = new JMenuBar();
	private JMenu menu = new JMenu("Menu");
	private JMenuItem mitem = new JMenuItem("Help");
	public static boolean counter = false;
	
	public static JTextField dtext = new JTextField("");
	public static JTextField ptext = new JTextField("");
	
	public static JButton hit;
	public static JButton miss;
	
	public static boolean dflag = false;
	public static boolean pflag = false;
	
	public  static JLabel lbl1 = new JLabel();
	public  static JLabel lbl2 = new JLabel();
	public  static JLabel lbl3 = new JLabel();
	public  static JLabel lbl4 = new JLabel();
	public  static JLabel lbl5 = new JLabel();
	public  static JLabel lbl6 = new JLabel();
	public  static JLabel lbl7 = new JLabel();
	public  static JLabel lbl8 = new JLabel();
	
	public Body() {
		initialize();
	}
	
	public void initialize() {
		
		setTitle("Blackjack beta");
		setSize(800, 645);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("res/img/ico.png");
		setIconImage(icon.getImage());
		setContentPane(new JLabel(new ImageIcon("res/img/bg.jpg")));
		
		menu.add(mitem);
		mbar.add(menu);
		setJMenuBar(mbar);
		
		dtext.setText("");
		dtext.setBounds(50, 100, 45, 30);
		dtext.setHorizontalAlignment(SwingConstants.CENTER);
		dtext.setEditable(false);
		add(dtext);
		
		ptext.setText("");
		ptext.setBounds(50, 200, 45, 30);
		ptext.setHorizontalAlignment(SwingConstants.CENTER);
		add(ptext);
		
		hit = new JButton("HIT");
		hit.setEnabled(false);
		hit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				alg.Randomizer rr = new alg.Randomizer();
				
				pflag=false;
				dflag=true;
		
				if (counter==false) {
					//2
					gui.SubBody.flag = 0;
					rr.generate();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Body.lbl2.setIcon(new ImageIcon(rr.card));
					gui.SubBody.dtmp+=rr.number;
					Body.dtext.setText(String.valueOf(gui.SubBody.dtmp));
					}
				counter=true;
				
				if (SubBody.dtmp < 17) {
					//5
					SubBody.flag = 0;
					rr.generate();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Body.lbl5.setIcon(new ImageIcon(rr.card));
					SubBody.dtmp+=rr.number;
					Body.dtext.setText(String.valueOf(SubBody.dtmp));
					dflag=false;
				}
				
				//6
				SubBody.flag = 1;
				rr.generate();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Body.lbl6.setIcon(new ImageIcon(rr.card));
				SubBody.ptmp+=rr.number;
				Body.ptext.setText(String.valueOf(SubBody.ptmp));
				
				alg.Conditions.check2();
				
			}});
		hit.setBounds(200, 500, 200, 50);
		add(hit);
		
		miss = new JButton("MISS");
		miss.setEnabled(false);
		miss.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				alg.Randomizer rr = new alg.Randomizer();
				
				pflag=true;
				dflag=true;
				
				if (counter==false) {
					//2
					gui.SubBody.flag = 0;
					rr.generate();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Body.lbl2.setIcon(new ImageIcon(rr.card));
					gui.SubBody.dtmp+=rr.number;
					Body.dtext.setText(String.valueOf(gui.SubBody.dtmp));
					}
				
				
				if (SubBody.dtmp < 17) {
					//5
					SubBody.flag = 0;
					rr.generate();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Body.lbl5.setIcon(new ImageIcon(rr.card));
					SubBody.dtmp+=rr.number;
					Body.dtext.setText(String.valueOf(SubBody.dtmp));
					dflag=false;
				}
				
				if (counter==false) {alg.Conditions.check1();}
				alg.Conditions.check2();
				
				counter=true;
								
			}});
		miss.setBounds(500, 500, 200, 50);
		add(miss);
		
		//dealer cards
		lbl1.setBounds(100, 100, 70, 95);
		add(lbl1);
		lbl2.setBounds(200, 100, 70, 95);
		add(lbl2);
		lbl5.setBounds(300, 100, 70, 95);
		add(lbl5);
		lbl7.setBounds(400, 100, 70, 95);
		add(lbl7);
		
		//player cards
		lbl3.setBounds(100, 200, 70, 95);
		add(lbl3);
		lbl4.setBounds(200, 200, 70, 95);
		add(lbl4);
		lbl6.setBounds(300, 200, 70, 95);
		add(lbl6);
		lbl8.setBounds(400, 200, 70, 95);
		add(lbl8);
		
		setVisible(true);
		
	}

}
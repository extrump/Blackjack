package alg;

//victory conditions check
public class Conditions {
		
	public static void check1() {
				
		if (gui.SubBody.ptmp == 21) {
			//blackjack
			System.out.print("BLACKJACK - ");
			media.Result.message(true);
		}
	}
	
	public static void check2() {
				
			if (gui.Body.pflag==true && gui.Body.dflag==true && gui.SubBody.ptmp <= 21 && gui.SubBody.ptmp > gui.SubBody.dtmp) {
				System.out.print("FAIR VICTORY - ");
				media.Result.message(true);
			} if (gui.SubBody.dtmp > 21) {
				System.out.print("DEALER OVERLOADED - ");
				media.Result.message(true);
			} if (gui.SubBody.ptmp >21) {
				System.out.println("PLAYER OVERLOADED - ");
				media.Result.message(false);
			} if (gui.Body.pflag==true && gui.Body.dflag==true && gui.SubBody.ptmp <= gui.SubBody.dtmp) {
				System.out.print("DEALER WON - ");
				media.Result.message(false);
			}
	
	}

}

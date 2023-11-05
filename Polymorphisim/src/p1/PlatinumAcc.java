package p1;

public class PlatinumAcc extends GoldAcc {
	public void rateOfInterest() {
		System.out.println("8% PA");
	}
	public static void main(String[] args) {
		PlatinumAcc p = new PlatinumAcc();
		p.onlineBanking();
		p.rateOfInterest();
		
		GoldAcc g = new GoldAcc();
		g.onlineBanking();
		g.rateOfInterest();
	}
}

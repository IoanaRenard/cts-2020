package ro.ase.csie.cts.seminar4.faza4;

public enum TipClient {
	WOOD(0), BRONZE(0.1f), SILVER(0.25f), GOLD(0.35f);
	
	private float discount;
	
	public float getDiscount() {
		return this.discount;
	}
	
	private TipClient(float discount) {
		this.discount = discount;
	}
}

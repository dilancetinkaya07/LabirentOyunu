
public abstract class Hucre {
	private Konum konum;
	
	public abstract String toString();
	
	public Hucre(Konum konum) {
		this.konum=konum;

	}
	public Konum getKonum() {
		return konum;
		
	}
	public void setKonum(Konum konum) {
		this.konum=konum;
		
	}

	

}

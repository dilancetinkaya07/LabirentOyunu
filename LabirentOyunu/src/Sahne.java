public abstract class Sahne {
	
	protected Hucre[][] hucreler;
	protected int skor;
	
	public Sahne() {
		hucreler=null;
		skor=0;
	}
	public Sahne(int[][] hucre) {
		yukle(hucre);
		skor=0;
		
	}
	
	public Hucre getHucre(int x,int y) {
		return hucreler[y][x];
	
	}
	public void setHucre(Hucre h, int x, int y){
		hucreler[y][x] = h;
	}
	public int getSkor() {
		return skor;
	}

	public void setSkor(int skor) {
		this.skor = skor;
	}
	
	public abstract void yukle(int[][] grid);
	
	
}

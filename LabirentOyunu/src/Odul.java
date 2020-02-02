
public class Odul extends Hucre{

	public Odul(Konum konum) {
		super(konum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}
	
public Hucre odulToplandýMi(Hucre h, Buyucu b) {
				
	
			if(h instanceof Odul)
			{	
				if(h.getKonum().compareTo(b.getKonum())==0) {
				
					this.getKonum().setX(((Zemin)h).getKonum().getX());
					this.getKonum().setY(((Zemin)h).getKonum().getY());
					
				}
			}
	
		return h;


}


}
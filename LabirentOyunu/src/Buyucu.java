
public class Buyucu extends Hucre {

	public Buyucu(Konum konum) {
		super(konum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "D"  ;
	}
	
	
	public boolean buyucuHareketEttir(Hucre hucre)
	{	boolean hareketEtti = false;
			
			if(hucre instanceof Zemin || hucre instanceof Cikis || hucre instanceof Kutu || hucre instanceof Odul) {
				this.getKonum().setX(hucre.getKonum().getX());
				this.getKonum().setY(hucre.getKonum().getY());
				hareketEtti=true;
			}
		
		return hareketEtti;
	}
	
	

}
//Dilan �etinkaya- 201713172039 
//G�lseren akku� - 201713172056
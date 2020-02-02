
public class Kutu extends Hucre{

	public Kutu(Konum konum) {
		super(konum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#";
	}
	
	public boolean kutuHareketEttir(Hucre hucre)
	{	boolean kutuHareketEtti = false;
			
			if( hucre instanceof Odul || hucre instanceof Zemin) {
				this.getKonum().setX(hucre.getKonum().getX());
				this.getKonum().setY(hucre.getKonum().getY());
				kutuHareketEtti=true;
			}
		
		return kutuHareketEtti;
	}
	

}

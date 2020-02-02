

public class Labirent extends Sahne{
	
	public static final int ZEMIN = 1;
	public static final int DUVAR = 2;
	public static final int ADAM  = 3;
	public static final int CIKIS = 4;
	public static final int ODUL  = 5;
	public static final int KUTU  = 6;
	
	public Labirent () {
		super();
	}
	public Labirent(int [][] labirent) {
		super(labirent);
		
		
	}
	
	
	@Override
	public void yukle(int[][] labirent) {
		// TODO Auto-generated method stub
		hucreler = new Hucre[labirent.length][labirent[0].length];
		
		
		for(int y = 0; y<labirent.length;y++) {
			for(int x=0; x<labirent[0].length;x++) {
				int hucre = labirent[y][x];
				switch(hucre) {
					case ZEMIN : 
						hucreler[y][x] = new Zemin(new Konum(x,y));
						break;
					case DUVAR : 
						hucreler[y][x] = new Duvar(new Konum(x,y));
						break;
					case ADAM : 
						hucreler [y][x] = new Buyucu(new Konum(x,y));
						break;
					case CIKIS : 
						hucreler [y][x] = new Cikis(new Konum(x,y));
						break;
					case ODUL : 
						hucreler[y][x] = new Odul(new Konum(x,y));
						break;
					case KUTU : 
						hucreler [y][x] = new Kutu(new Konum(x,y));
						break;

				}
			}
		}
		
	}
	
	
	
	public Buyucu getBuyucu() {
		Buyucu adam = null;
		for (int y = 0; y < hucreler.length; y++){
			for(int x = 0; x < hucreler[y].length; x++){
				Hucre hucre = hucreler[y][x];
				if(hucre instanceof Buyucu)
					adam = (Buyucu)hucre;
			}
		}

		return adam;
	}
	public Cikis getCikis() {
		Cikis cikis=null;
		
		for (int y = 0; y < hucreler.length; y++){
			for(int x = 0; x < hucreler[y].length; x++){
				Hucre hucre = hucreler[y][x];
				if(hucre instanceof Cikis)
					cikis = (Cikis)hucre;
			}
		}
		
		return cikis;
	}
	
public String toString(){
		String s = "";
		for (int y = 0; y < hucreler.length; y++){
			for(int x = 0; x < hucreler[y].length; x++){
				s += (hucreler[y][x]).toString();
			}
			s +="\n";
		}
		return s;
	}
}

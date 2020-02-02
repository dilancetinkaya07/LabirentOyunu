import java.util.ArrayList;
import java.util.Scanner;

public class LabirentOyun extends Oyun{
	
	public static final int YUKARI = 1;
	public static final int ASAGI = 2;
	public static final int SAGA = 3;
	public static final int SOLA = 4;
	public static final int HATALI = 0;
	@Override
	public void yukle() {
		// TODO Auto-generated method stub
		int[][] lab={{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				{2, 3, 5, 5, 1, 5, 1, 1, 1, 1, 6, 1, 1, 1, 5, 1, 1, 1, 5, 2},
				{2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2},
				{2, 5, 1, 5, 1, 5, 1, 6, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2},
				{2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2},
				{2, 5, 2, 1, 1, 1, 1, 6, 1, 2, 1, 2, 1, 2, 1, 1, 1, 5, 5, 2},
				{2, 5, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 5, 1, 1, 1, 5, 2},
				{2, 5, 2, 5, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2},
				{2, 5, 2, 5, 2, 1, 2, 5, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2},
				{2, 5, 2, 1, 2, 5, 2, 5, 5, 1, 6, 1, 5, 2, 1, 2, 1, 1, 1, 2},
				{2, 1, 2, 5, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 5, 2},
				{2, 1, 2, 5, 2, 5, 1, 6, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 5, 2},
				{2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
				{2, 1, 2, 1, 2, 5, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2},
				{2, 5, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2},
				{2, 1, 2, 5, 2, 1, 5, 1, 1, 2, 1, 5, 1, 1, 1, 2, 1, 2, 1, 2},
				{2, 5, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2},
				{2, 5, 2, 1, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5, 1, 2, 1, 2, 1, 2},
				{2, 1, 2, 1, 5, 1, 5, 5, 1, 1, 1, 5, 1, 5, 1, 2, 1, 1, 4, 2},
				{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}};
		
			sahne = new Labirent(lab);
		
	}
	private int kullanicidanYonBilgisiAl() {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.print("Yön Tuþlarý (w = yukarý, s = asagi, a = sol, d = sag), seciniz: ");
		
		String secimStr = klavye.next();
		
		char secim = secimStr.charAt(0);
		int yon = HATALI;
		
		switch(secim){
			case 'w':
			case 'W': 
				yon = YUKARI;
				break;
				
			case 'a':
			case 'A':
				yon = SOLA;
				break;
				
			case 's':
			case 'S':	
				yon = ASAGI;
				break;
				
			case 'd':
			case 'D':	
				yon = SAGA;
				break;
	
		}

		return yon;

	}
	@Override
	public void basla() {
		// TODO Auto-generated method stub
		while(true){
			
			System.out.println(this);
			int girdi = kullanicidanYonBilgisiAl();
			guncelle(girdi);
			if(oyunBitti())
			{
				System.out.println("Tebrikler! Çýkýþý buldunuz");
				break;
			}
				
		}
	}
	
	private void guncelle(int girdi) {
		
		Konum buyucuKonum = ((Labirent)sahne).getBuyucu().getKonum();
		
		switch(girdi){
		
		case YUKARI:
			hareketEttir(buyucuKonum.getX(), buyucuKonum.getY()-1);
			break;
		case SOLA:
			hareketEttir(buyucuKonum.getX()-1, buyucuKonum.getY());
			break;

		case ASAGI:
			hareketEttir(buyucuKonum.getX(), buyucuKonum.getY()+1);
			break;
		
		case SAGA:
			hareketEttir(buyucuKonum.getX()+1, buyucuKonum.getY());				
			break;
	}

		
	}
	private void hareketEttir(int x, int y) {
		
		Buyucu buyucu = ((Labirent)sahne).getBuyucu();
		ArrayList<Kutu> kutu = new ArrayList<Kutu>();
		for(int a=0 ; a<((Labirent)sahne).hucreler.length;a++)
			for(int b=0; b<((Labirent)sahne).hucreler[0].length;b++) {
				if(sahne.hucreler[a][b] instanceof Kutu) {
					kutu.add((Kutu)sahne.hucreler[a][b]);
					
				}	
			}
		
		
		Hucre hucre = ((Labirent)sahne).getHucre(x, y);		
		
		for(int i=0;i<kutu.size();i++) {
			if(kutu.get(i).getKonum().getX() == buyucu.getKonum().getX()+1) {
				int eskiX = buyucu.getKonum().getX();
				int eskiY = buyucu.getKonum().getY();
				int kutuEskiX=kutu.get(i).getKonum().getX();
				int kutuEskiY= kutu.get(i).getKonum().getY();
				
				boolean buyucuHareketEtti = buyucu.buyucuHareketEttir(hucre);
				boolean kutuHareketEtti = kutu.get(i).kutuHareketEttir(hucre);
				if(buyucuHareketEtti && kutuHareketEtti){
					sahne.setHucre(buyucu, x, y);
					sahne.setHucre(kutu.get(i), kutuEskiX+1, kutuEskiY);			
					sahne.setHucre(hucre, eskiX, eskiY);
					sahne.setHucre(((Odul)hucre).odulToplandýMi(hucre, buyucu), x, y);
					sahne.setSkor(sahne.getSkor()+1);
		
				}
			}
						
			else {
				
				int eskiX = buyucu.getKonum().getX();
				int eskiY = buyucu.getKonum().getY();
				
				boolean hareketEtti = buyucu.buyucuHareketEttir(hucre);
				
				if(hareketEtti){
					sahne.setHucre(buyucu, x, y);
					sahne.setHucre(hucre, eskiX, eskiY);
					sahne.setSkor(sahne.getSkor()+1);
			}
			
			
		}	
			
		}
		
	}
	public boolean oyunBitti() {
		Labirent labs = (Labirent)sahne;
		boolean oyunBitti = false; 
		if(labs.getBuyucu().getKonum().compareTo(labs.getCikis().getKonum()) == 0)
			for(int x=0;x<labs.hucreler.length;x++)
				for(int y=0;y<labs.hucreler[0].length;y++)
				{
					if(labs.hucreler[x][y] instanceof Odul)
						oyunBitti = false;
					else {oyunBitti = true;}
					
				}
			
		
		return oyunBitti;
	}
	
}

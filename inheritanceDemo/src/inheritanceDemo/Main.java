package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
		
		KrediUI krediUI2 = new KrediUI();
		krediUI2.KrediHesapla(new TarimKrediManager());
	}
}

package singleton;

public class CholocateController {
	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler.fill();//za pomoc¹ tego punktu nie mo¿emy drugi raz
//		wype³niæ nape³nionego kot³a
		 boiler2.fill();//tu uzyskujemy drugi punkt dostêpowy do
//		kot³a i za pomoc¹ tego punktu dostêpowego mo¿emy drugi raz wype³niæ
//		ju¿ nape³niony kocio³ co spowoduje awariê
		boiler2.boil();
		 boiler.drain();
		 boiler2.drain();
	}
}

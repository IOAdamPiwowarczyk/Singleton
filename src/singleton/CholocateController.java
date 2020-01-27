package singleton;

public class CholocateController {
	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler.fill();//za pomoc� tego punktu nie mo�emy drugi raz
//		wype�ni� nape�nionego kot�a
		 boiler2.fill();//tu uzyskujemy drugi punkt dost�powy do
//		kot�a i za pomoc� tego punktu dost�powego mo�emy drugi raz wype�ni�
//		ju� nape�niony kocio� co spowoduje awari�
		boiler2.boil();
		 boiler.drain();
		 boiler2.drain();
	}
}

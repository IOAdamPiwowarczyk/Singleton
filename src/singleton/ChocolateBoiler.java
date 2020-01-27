package singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	private ChocolateBoiler() {
	empty = true;
	boiled = false; }
	 public void fill() {
	if (isEmpty()) {
	empty = false;
	boiled = false;
	 System.out.println("wype�niamy kocio�");} }
	public void drain() {
	if (!isEmpty() && isBoiled()) {
	empty = true;
	 System.out.println("opr�niamy kocio�");} }
	public void boil() {
	if (!isEmpty() && !isBoiled()) {
	boiled = true;
	 System.out.println("gotujemy zawarto�� kot�a"); } }
	public boolean isEmpty() {
	return empty; }
	public boolean isBoiled() {
	return boiled; }
}

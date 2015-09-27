public class Generics<T, S> {
	private T parameter1;
	private S parameter2;

	Generics(T t, S s) {

		this.parameter1 = t;
		this.parameter2 = s;
	}

	public void sendLocation() {

		System.out.println("Parameter 1:" + parameter1 + " Parameter 2:" + parameter2);

		System.out.println("Type of parameter 1 is:" + parameter1.getClass().getName());

		System.out.println("Type of parameter 2 is:" + parameter2.getClass().getName());

	}

	public static void main(String args[]) {
		Generics<Double, Double> location1 = new Generics<Double, Double>(37.3353, 121.88);
		location1.sendLocation();

		Generics<String, String> location2 = new Generics<String, String>("San Fernando", "7th Street");
		location2.sendLocation();

		Generics<String, Integer> location3 = new Generics<String, Integer>("California", 94087);
		location3.sendLocation();

	}

}
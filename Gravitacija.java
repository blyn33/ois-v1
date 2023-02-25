
public class Gravitacija {

	public static void main(String[] args) {
		System.out.println("OIS je zakon!");

	}
	public int pospesk(int V) {
		double C = 6.674 * Math.pow(10, -11);
		double M = 5.972 * Math.pow(10, 24);
		double R = 6.371 * Math.pow(10, 6);

		double A = (C * M) / ((R + V) * (R + V));
		return A;
	}
	
    public static void izpisi(double nadmorskaVisina, double gravitacijskiPospesek) {
        System.out.println("Nadmorska visina: " + nadmorskaVisina + " m");
        System.out.println("Gravitacijski pospesek: " + gravitacijskiPospesek + " m/s^2");
    }
}

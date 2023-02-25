import java.util.*;

public class Gravitacija {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("OIS je zakon!");
		
		double nadmorskaVisina = sc.nextDouble();

		izpisi(nadmorskaVisina, pospesk(nadmorskaVisina));
	}
	public static double pospesk(double V) {
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

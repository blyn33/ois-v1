import java.util.Scanner;

public class Gravitacija {

    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
		Scanner sc = new Scanner(System.in);
		
		double C = 6.674 * Math.pow(10, -11);
		double M = 5.972 * Math.pow(10, 24);
		double R = 6.371 * Math.pow(10, 6);
		double V = sc.nextDouble();
		double A = (C * M) / ((R + V) * (R + V));
    }
}
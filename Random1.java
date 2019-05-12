import java.util.*;

public class Random1{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int getal2 = rn.nextInt(10) + 1; // je doet + 1 omdat het niet nul mag zijn

		System.out.println("vul een getal in:");
		int getal1 = sc.nextInt(10);
	
		if (getal1 == getal2) {
			System.out.println("het nummer is gelijk");
		}
		else {
			System.out.println("het nummer is niet gelijk");
		}
	}
}

	
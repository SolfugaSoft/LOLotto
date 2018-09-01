
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		String [] topChampions = {"Aatrox","Akali","Camile","Cho'Gath","Darius" };
		Random r = new Random();
		int i = r.nextInt(topChampions.length);
		System.out.println(topChampions[i]);
		

	}
}


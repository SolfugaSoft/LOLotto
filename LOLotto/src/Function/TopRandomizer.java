package Function;

import java.util.Random;

public class TopRandomizer {	


	public static String RandomMachine()
	
	{
		String[] topChampions = { "Aatrox", "Akali", "Camile", "Cho'Gath", "Darius" };
		Random r = new Random();
		int i = r.nextInt(topChampions.length);
		String name = topChampions[i];
		//System.out.println(topChampions[i]);
		return name;

	}
}

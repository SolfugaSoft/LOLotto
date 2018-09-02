import java.util.Random;

public class TopRandomizer {

	private String[] topChampions;

	public String[] getTopChampions() {
		return topChampions;
	}

	public void setTopChampions(String[] topChampions) {
		this.topChampions = topChampions;
	}

	public static void RandomMachine() {
		String[] topChampions = { "Aatrox", "Akali", "Camile", "Cho'Gath", "Darius" };
		Random r = new Random();
		int i = r.nextInt(topChampions.length);
		System.out.println(topChampions[i]);

	}
}

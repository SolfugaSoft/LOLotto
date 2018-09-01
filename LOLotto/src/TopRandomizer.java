import java.util.Random;

public class TopRandomizer {
	
	private String [] topChampions;
	


	public String[] getTopChampions() {
		return topChampions;
	}
	public void setTopChampions(String[] topChampions) {
		this.topChampions = topChampions;
	}
	
	public static void RandomMachine() {
	String [] topChampions1 = {"Aatrox","Akali","Camile","Cho'Gath","Darius" };
	Random r = new Random();
	int i = r.nextInt(topChampions1.length);
	System.out.println(topChampions1[i]);

}}

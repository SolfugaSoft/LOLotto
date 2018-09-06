
import java.util.Random;

public class test {
	public static void main(String[]args){
		
		test t = new test();
		t.RandomeMachine();
		
		
	String[] lineName;

	String[] topChampions = { "Aatrox", "Akali", "Camile", "Cho'Gath", "Darius" };
	String[] midChampions = { "Yasuo", "Veigar", "Malzahar", "Vel'Koz", "Zed" };
	String[] jungleChampions = { "Master Yi", "Shyvana", "Gragas", "Wukong", "Kha'Zix" };
	String[] adcChampions = { "Varus", "Catlyn", "Jinx", "Jhin", "Draven" };
	String[] supportChampions = { "Alistar", "Annie", "Bard", "Blizcrank", "Brand" };
	}

	public String RandomeMachine() {

		String[] Line = null;
		Random r = new Random();
		int i = r.nextInt((Line.length));
		String name = Line[i];
		return name;
		
		
	}
}

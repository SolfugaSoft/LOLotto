package Function;

import java.util.Random;

public class LineRandomizer {

	String[] topChampions = { "Aatrox", "Akali", "Camile", "Cho'Gath", "Darius" };
	String[] midChampions = { "Yasuo", "Veigar", "Malzahar", "Vel'Koz", "Zed" };
	String[] jungleChampions = { "Master Yi", "Shyvana", "Gragas", "Wukong", "Kha'Zix" };
	String[] adcChampions = { "Varus", "Catlyn", "Jinx", "Jhin", "Draven" };
	String[] supportChampions = { "Alistar", "Annie", "Bard", "Blitzcrank", "Brand" };

	public static String RandomMachine()

	{
		String[] topChampions = { "Aatrox", "Akali", "Camile", "Cho'Gath", "Darius" };
		Random r = new Random();
		int i = r.nextInt(topChampions.length);
		String name = topChampions[i];
		// System.out.println(topChampions[i]);
		return name;

	}

	public static String MidRandomMachine()

	{
		String[] midChampions = { "Yasuo", "Veigar", "Malzahar", "Vel'Koz", "Zed" };
		Random r = new Random();
		int i = r.nextInt(midChampions.length);
		String name = midChampions[i];
		// System.out.println(topChampions[i]);
		return name;

	}

	public static String JungleRandomMachine()

	{
		String[] jungleChampions = { "Master Yi", "Shyvana", "Gragas", "Wukong", "Kha'Zix" };
		Random r = new Random();
		int i = r.nextInt(jungleChampions.length);
		String name = jungleChampions[i];
		// System.out.println(topChampions[i]);
		return name;

	}

	public static String AdcRandomMachine()

	{
		String[] adcChampions = { "Varus", "Catlyn", "Jinx", "Jhin", "Draven" };
		Random r = new Random();
		int i = r.nextInt(adcChampions.length);
		String name = adcChampions[i];
		// System.out.println(topChampions[i]);
		return name;

	}
	public static String SupportRandomMachine()

	{
		String[] supportChampions = { "Alistar", "Annie", "Bard", "Blizcrank", "Brand" };
		Random r = new Random();
		int i = r.nextInt(supportChampions.length);
		String name = supportChampions[i];
		// System.out.println(topChampions[i]);
		return name;

	}
}
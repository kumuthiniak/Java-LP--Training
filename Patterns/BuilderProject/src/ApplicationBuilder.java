
public class ApplicationBuilder {

	public static void main(String[] args) {
		
		
		System.out.println("Making Orange Juice  ");
		Juice.JuiceBuilder juiceBuilder = new Juice.JuiceBuilder("water","sugar","salt");
		Juice orangeJuice = juiceBuilder.orange("orange").lime("lime").juiceBuild();
		System.out.println(orangeJuice + "\r");
		
		System.out.println("Making Apple Juice ");
		Juice.JuiceBuilder juiceBuilder1 = new Juice.JuiceBuilder("water","sugar","salt");
		Juice AppleJuice = juiceBuilder1.apple("apple").lime("lime").juiceBuild();
		System.out.println(AppleJuice+ "\r");
		
		System.out.println("Making Mix Juice ");
		Juice.JuiceBuilder juiceBuilder3 = new Juice.JuiceBuilder("water","sugar","salt");
		Juice mixjuice = juiceBuilder3.apple("apple").lime("lime").grapes("grapes"). juiceBuild();
		System.out.println(mixjuice+ "\r");
	}

}

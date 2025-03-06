package java10.practice;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name);

		PoisonMatango pm = new PoisonMatango('A');

		while (pm.poisonCount > 0) {
			pm.attack(h1);
			System.out.println(h1.name + "の残りHPは" + h1.hp);
			System.out.println();
		}
	}
}
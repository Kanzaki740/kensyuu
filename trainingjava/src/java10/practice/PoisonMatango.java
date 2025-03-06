package java10.practice;

public class PoisonMatango extends Matango {

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public int poisonCount = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (poisonCount > 0) {
			System.out.println("さらに毒の奉仕をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ!");
			this.poisonCount--;
		}
	}
}
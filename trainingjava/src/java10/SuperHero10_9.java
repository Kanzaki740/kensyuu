package java10;

public class SuperHero10_9 extends Hero {
	public void attack(Matango m) {
		super.attack(m);
		ifi(this.flying){
			super.attack(m);
		}
	}
}
package java11;

public class Hero11_5 extends Character11_2 {
	public void atack(Matango m) { //attack
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
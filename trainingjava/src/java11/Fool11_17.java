package java11;

public class Fool11_17 extends Character11_8 implements Human11_16{
	//Characterからhpやnameなどのフィールドを継承している
	//Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}
	//さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {}
}
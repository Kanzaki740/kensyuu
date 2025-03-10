package java10;

public class Hero10_7{
	public final void slip() { //オーバーライド不可
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
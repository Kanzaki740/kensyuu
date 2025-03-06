package java9;

public class Hero {
	String name;
	int hp;
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ！");
	}

	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
	}
}
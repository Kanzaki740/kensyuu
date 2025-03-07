package java11.practice;

public class Book extends TangibleAsset {
	String isbn; //International Standard Book Number

	//コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color); //親クラスのコンストラクタの呼び出し
		this.isbn = isbn;
	}

	//メソッド
	public String getIsbn() {
		return this.isbn;
	}
}
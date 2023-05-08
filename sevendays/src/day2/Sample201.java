/**
 * 
 */
package day2;

/**
 * @author takathius2
 *
 */
public class Sample201 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//演算について理解する
		//足し算
		System.out.print(5 + "+" + 2 + "=");
			System.out.println(5 + 2);
		//引き算
		System.out.print(5 + "-" + 2 + "=");
			System.out.println(5 - 2);
		//かけ算
		System.out.print(5 + "*" + 2 + "=");
			System.out.println(5 * 2);
		//割り算
		System.out.print(5 + "/" + 2 + "=");
			System.out.println(5 / 2);
		//剰余（割り算の余り。Jあう゛ぁではよく扱う）
		System.out.print(5 % 2);
		
		/*
		 * "+"は文字列型と数値型（文字列型）を接続している
		 * 数値型同士の場合は和として計算処理を行う
		 */
		System.out.println("ABC" + "DEF");
		System.out.println("答え：" + "100");
		
		

	}

}

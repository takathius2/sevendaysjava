/**
 * 
 */
package day3;

/**
 * @author takathius2
 *
 */
public class Sample301 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//if文の練習
		// 標準出力
		int a = -2;
		
		System.out.println("a="+a);
		
		//　入力した数値が正の数か調べる。
		if(a > 0) {
			//　正の数だった場合に実行すること
			System.out.println("aは正の数です");
			
		} else { //負の数の場合の処理
			System.out.println("aは正の数ではありません");
		}
		
		
		//複数の条件分岐else if
		int num = 3;
		if(num == 1) {
			System.out.println("one");
		} else if(num == 2){
			System.out.println("two");
		} else if(num == 3) {
			System.out.println("three");
		} else{
			System.out.println("不適切な値です");
		}
		
		//複雑なif文
		int dice = (int)(Math.random()*7)+1;
		//値が1～7で出力されるか確認		
		System.out.println("さいころの目：" + dice);
		
		//さいころの出目が偶数下記数かで処理を分ける
		if(1 <= dice && dice <= 6) {
			
			//偶数ならば丁
			if(dice == 2 || dice == 4 || dice == 6) {
				System.out.println("丁です");
			} else {
				//奇数ならば半
				System.out.println("半です");
			}
		} else {
			System.out.println("範囲外の数値です");
		}
		
		/*
		 * 乱数について
		 * (int)(Math.random()*n);で0～ｎ-1までの乱数を発生する
		 * (int)(Math.random()*n)+1;で1～7の乱数を発生する
		 */
		
		/*
		 * 論理演算子
		 * &&や||などのこと。
		 * &や&&を論理積。aが○○かつbがxxならば～(and) 
		 * |や||を論理和。aが○○かxxならば～（or）
		 * !は否定。aが○○出ない場合真となる(not)
		 */
		
		//swich文
		/*else ifを用いた多数に分岐する条件分岐は
		 *値が整数値であれば、switch(スイッチ)文を用いて以下のように書くことができる
		 *switch(値)の値によって条件分岐する。条件はcase 値　で書く。
		 *最後にcaseでいずれも当てはまらない処理を書く
		 *breakを書かないとずっと処理を実行し続けるため注意が必要
		 */
		
		int hoge = 10;
		switch(hoge) {
		//hogeが１だった時の処理
		case 1:
			System.out.println("one");
			break;
		//hogeが２だった時の処理
		case 2:
			System.out.println("two");
			break;
		//hogeが３だった時の処理
		case 3:
			System.out.println("three");
			break;
			//1～3以外の値が入力された時の処理
		default:
			System.out.println("不適切な数値です");
		}
		
	}

}

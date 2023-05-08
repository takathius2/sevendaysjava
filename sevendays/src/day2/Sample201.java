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
		
		/*変数について理解する
			 * 型 変数名;
			 * で宣言する。変数名のことを識別子と言い、半角英数で入力する
			 */
			
			//変数aを宣言
				int a;
			
			/*変数の初期化と代入の実行
			 * 変数名 =値;
			 * で値を変数に代入する。
			 */
				int b = 3;
				System.out.println(b);
			
			//複数の変数を同時に宣言する
				int add,sub;
			
			/*int(整数型)以外の変数の宣言をする
			 *今回はdouble(倍精度浮動小数点数型)
			 *小数で数値を表せintやfloatよりもより精度の高い数値が出力可能
			 *計算速度はfloatより速い
			 */
				double avg;
			
			/*
			 * aに6を代入。
			 * 最初に値を入れるため初期化という
			 */
			
				a = 6;
			
			//a,bの和
				add = a + b;
				System.out.println(a + " + " + b + " = " + add);
				System.out.println(add);
	
			//a,bの差
				sub = a - b;
				System.out.println(a + " - " + b + " = " + sub);
				System.out.println(a - b);
			
			/*a,bの平均値
			 * 変数の初期化を行いavgにaとbの値(6と3)を代入
			 */
				avg = (a + b) / 2.0;
				System.out.println(a + "と" + b + "の平均値：" + avg);
		
		//演算の優先順位は()内の式が優先される
				System.out.println(1+2*3); //7が出力される
				System.out.println((1+2)*3); //9が出力される
		
		//複数の変数を同時に宣言するときはカンマで区切る
//				int a,b;
//				int a=1,b=2;
				
				//変数a,bを宣言し、bのみ初期化する
//				int a,b =1;
		/*
		 * 変数の命名規則として
		 * 半角英数字やアンダーバー、$などが使える
		 * 変数名の頭文字を数字にすることは不可
		 * 必ず英数字かアンダーバーから始めること
		 * 大文字と小文字は別の文字として扱われる（ABCとabcは違う変数扱い）
		 * 予約語・定数は使ってはいけない
		 */
				
		//自身を用いた計算結果の代入
				//変数宣言
					int a1=2,b1=2,c1=2,d1=2;
					int a2=2,b2=2,c2=2,d2=2;
				//普通の演算による計算と代入
					a1 = a1 + 1;
			        b1 = b1 - 1;
			        c1 = c1 * 2;
			        d1 = d1 / 2;
			        
			    //代入演算による計算
			        a2 += 1;
			        b2 -= 1;
			        c2 *= 2;
			        d2 /= 2;
			        
			        System.out.println("a1="+a1+" b1=" + b1+ " c1="+c1+" d1="+d1);
			        System.out.println("a2="+a2+" b2=" + b2+ " c2="+c2+" d2="+d2);
		
		//上記から代入演算により短い記述で同様の結果が得られることがわかる
			        int a3=0;
			        a3=a3+1;
			        System.out.println(a3);
			        
			        int a4=0;
			        a4+=1;
			        System.out.println(a4);
			        
			        /*
			         * 上記から
			         * a=a+1; は a+=1;
			         * a=a-1; は a-=1;
			         * a=a*2; は a*=2;
			         * a=a/2; は a/=2;
			         * a=a%2; は a%=2;
			         * というように代入演算で表せる
			         */
		
		//キャストとデータ型の変換
	    //頭に(int)や(double)などと、変換したい値の型を先頭につけることを、キャストと言う
			        int x;
			        double y,z,w;
			        
			        //キャストで代入する
			        x = (int)1.23; //int型なので小数点以下切り下げた数値の1を出力
			        y = 1.23;
			        z = 10; //double型なので小数点まで求められる
			        w = (double)z;
			        System.out.println("x=" + x + " y=" + y + " z=" + z + " w=" + w);
			        
			        /*
			         * int→doubleなど違う型へ変換する場合キャストを省略するとエラーになる
			         * 整数型→実数型（小数点以下）の場合はキャストがなくてもエラーにならない
			         */
			        
		//文字列型Stringはデータ型ではないが同じように変数として扱うことができる
		//Stringの頭文字は大文字のSで打つこと！
			        String s1,s2,s3;
			        s1 = "ABC";
			        s2 = "DEF";
			        s3 = s1 +s2;
			        
			        System.out.println(s1);
			        System.out.println(s2);
			        System.out.println(s1 + s2);
			        System.out.println(s3);
			        
		//値を変えたくない場合に使える変数final（ファイナル）変数について
			        final int NUMBER = 100;
			        final String STRING = "Hoge";
			        
			        System.out.println(NUMBER);
			        System.out.println(STRING);
			        
			        //NUMBER = 100;
			        //STRING = "fuga";
			        /*
			         * ↑コメントアウトを外すとエラーになることから
			         * finalがついた変数は一度値が決められると二度と値の変更ができない
			         */
			        /*
			         *上記のように変数の値の変更をできなくする。値が変わらないため
			         *定数として扱うことができる
			         *メリットとして
			         *　final 変数　変数名　と記述することでソースコードが理解しやすくなる
			         *　何を制限（チェック）しているかなどがわかるためソースコードに無駄に コメントを書かなくてよくなる
			         *　定数を変数名をつけて管理するため置換（置き換え）がしやすい
			         *finalは、円周率のような、値を変えられたら困るような値に使用するのが一般的
			         *命名規則として
			         *　他の変数と見分けやすくするために全て大文字で記述する
			         *　複数文字の場合は単語の区切りをアンダースコアで結合する
			         *　　DATABASE_NAMEなど（スネーク記法という）
			         */

	}

}

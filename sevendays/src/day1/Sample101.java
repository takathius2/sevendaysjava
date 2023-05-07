/**
 * 
 */
package day1;
//以下はday1というパッケージに属しています
/**
 * @author takathius2
 *
 */
public class Sample101 {
//同一パッケージ内に同じクラスは存在しないようにする
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Public=どのクラスからもアクセスできる。公開範囲が一番広い
		 * 	↑を変えて公開範囲を限定する
		 * 
		 * Static=固定という意味。クラス特有の値やメソッド
		 * 	インスタンス化（new）せず使えるようになる
		 * 
		 * Void=main関数内似記述したものが実行される
		 * 
		 * String args=コマンドライン引数。
		 * 	プログラムを実行するときの“引数の文言”を受け取る
		 */
		// TODO 自動生成されたメソッド・スタブ
			
		//HolloWorld　という文字列を表示する
		
		System.out.println("Hollo,World");
		// 文字列はダブルクォーテーションで囲む必要がある
		
		//printとprintlnの違い
		/*
		 * printでは処理の実行結果を改行せず出力する
		 * printlnでは処理の実行結果を改行して出力する
		 */
		
		System.out.print(123);
		System.out.println(546);
		System.out.println(789);
		System.out.println("Hollo,World");
		
		/*
		 * エラーが起きるとRubyと同じくメソッドや文法・ミスしてる箇所
		 * を指摘してくれるのでそこを見る
		 */
		
	}

}

/**
 * 
 */
package day4;

/**
 * @author takathius2
 *
 */
public class Sumple401 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//繰り返し処理
		for(int i = 1;i <= 5;i++) {
			System.out.print(i+"");
			
		}
		System.out.println();
		
		//for文の二重ループ
		for(int j = 1;j <= 2;j++) {
			for(int k = 1; k <= 3; k++) {
				int l = j + k;
				System.out.print(j+"+"+ k +  "=" +l+"");
	
			}
			System.out.println();
			
			//while文
			int x = 1;
			while(x <= 5) {
				System.out.print(x+ "");
				x++;
			}
			System.out.println();
			
			//do～while文
			int a = 0;
			do {
				System.out.print(a+"");
				a++;
			}while(a <= 5);
			System.out.println("");
		}
		
		//whileとdo～whileの違い
		int i,num;
		num = 1;
		
		//while文で実行
		System.out.print("whileで実行：");
		i = 1;
		while(i < num) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		
		//do～while文で実行
		System.out.print("do～whileで実行：");
		i = 1;
		do {
			System.out.println("*");
			i++;
		}while(i < num);
		/*
		 * 判定する前にまず｛｝内の処理を行うため
		 * 満たしていなくても１回は処理が実行される
		 */
		
		//無限ループ
		System.out.println("6が出たら終了");
		//以下乱数出力で無限ループ
		while(true) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
			if(dice == 6) {
				break; //breakを記述することでループから抜ける
			}
		}
		System.out.println("終了");
	}

}

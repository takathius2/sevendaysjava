/**
 * 
 */
package fizzbuzz;

/**
 * @author takathius2
 *
 */
public class try_fizzbuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//FizzBuzz問題を解く
		//わからなければ調べる
		for(int i = 1; i <= 50; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");				
			} else if(i % 3 == 0) {
				System.out.println("Fizz");				
			} else if(i % 5 == 0) {
				System.out.println("Buzz");				
			} else {
				System.out.println(i);
			}
			
		}
		
		//復習（なるべく見ない）
		for (int n = 1; n <= 100; n++) {
			if(n % 3 == 0 && n % 5 ==0) {
				System.out.println("FizzBuzz");
			} else if (n % 3 == 0){
				System.out.println("Fizz");
				} else if (n % 5 == 0) {
					System.out.println("Buzz");
			} else {
				System.out.println(n);
			}
		}
		
		//完全に見ないでやる
		for(int a=1; a <=60; a++) {
		if(a%3==0 && a%5==0) {
			System.out.println("FizzBuzz");
		} else if(a%3==0) {
			System.out.println("Fizz");
		} else if(a%5==0) {
			System.out.println("Buzz");
		} else {
			System.out.println(a);
		}
		}

	}

}

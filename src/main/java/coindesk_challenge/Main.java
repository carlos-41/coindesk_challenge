package coindesk_challenge;

public class Main {

	public static void main(String[] args) {
//		System.out.println(check("aba"));
//		System.out.println(check("hello"));
//		fillingMatrix();
	}
	
	public static boolean check(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left < s.length()) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static void fillingMatrix() {
		int counter = 1;
		int[][] mat = new int[5][10];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++ ) {
				mat[i][j] = counter;
				counter++;
			}
		}
//		This is for debug purpose
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 10; j++ ) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}

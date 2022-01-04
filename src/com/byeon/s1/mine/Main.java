package com.byeon.s1.mine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String ox = "OOXXOOXXOO";
		char [] chArray = ox.toCharArray(); // 문자를 문자열로 만드는 코드
	
		int count = 0;
		
		for(int i = 1; i<chArray.length; i++) {
			
			int cnt = 1;
			
			if(chArray[i-1]==chArray[i]) {
				cnt++;

			}else {
				cnt = 0;
			}
			
			count +=cnt;
//			System.out.println(chArray[i]);
//			System.out.println(count);
		}
		
		System.out.println(count);
		
		
		
	}
}

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

//OOXXOXXOOO
//OOXXOOXXOO
//OXOXOXOXOXOXOX
//OOOOOOOOOO
//OOOOXOOOOXOOOOX


//10
//9
//7
//55
//30









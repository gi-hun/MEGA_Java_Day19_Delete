/*
 * # 2차원배열[삭제]
 * . 이름과 번호를 입력받아 삭제하기
 * 예)
 * 입력 : 철수	1
 * 삭제 : 김밥
 * 
 * 입력 : 철수 2
 * 삭제 : 바나나
 */
// Error: java.lang.ArrayIndexOutOfBoundsException: 7

package day_19;

import java.util.Scanner;

public class ArrayEx47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] jang = {			//6*1
				{"철수", "소고기"},
				{"철수", "김밥"},
				{"영희", "김치"},
				{"철수", "바나나"},
				{"철수", "새우깡"},
				{"영희", "오징어"},
				{"영희", "맛밤"}
			};
		
		System.out.println("입력:");
		String data = sc.next();
		System.out.println("삭제");
		String delete = sc.next();
		
		int name = -1;
		int food = -1;
		
		int count = 0;
		int check =-1;
		
		for(int i=0;i<7;i++)
		{
			if(data.equals(jang[i][0]) && delete.equals(jang[i][1]))
			{
				name = i;
				check = 1;
				count++;
			}
		}
		
		System.out.println("i" + name);
		
		if(check == -1)
		{
			System.out.println("[오타] 입력하신 것을 확인해주세요");
		}
		
		for(int i = name; name<7-count;i++)
		{
			jang[i+1][0] = jang[i][0];
			jang[i+1][1] = jang[i][1];
		}
		
		for(int i=0; i<7-count; i++) 
		{
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}

	}
}

/*
 * # 2�����迭[����]
 * . �̸��� ��ȣ�� �Է¹޾� �����ϱ�
 * ��)
 * �Է� : ö��	1
 * ���� : ���
 * 
 * �Է� : ö�� 2
 * ���� : �ٳ���
 */
// Error: java.lang.ArrayIndexOutOfBoundsException: 7

package day_19;

import java.util.Scanner;

public class ArrayEx47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] jang = {			//6*1
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		
		System.out.println("�Է�:");
		String data = sc.next();
		System.out.println("����");
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
			System.out.println("[��Ÿ] �Է��Ͻ� ���� Ȯ�����ּ���");
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

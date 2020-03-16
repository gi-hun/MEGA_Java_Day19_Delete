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

package day_19;

import java.util.Scanner;

public class ArrayEx47_���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] jang = {
				{"ö��", "�Ұ��"},
				{"ö��", "���"},
				{"����", "��ġ"},
				{"ö��", "�ٳ���"},
				{"ö��", "�����"},
				{"����", "��¡��"},
				{"����", "����"}
			};
		
		for(int i=0;i<jang.length;i++)
		{
			System.out.println(jang[i][0] + " : " + jang[i][1] + "[" + i + "]");
		}
		
		System.out.println("[����]�̸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("[����]��ȣ�� �Է��ϼ���");
	    int idx = sc.nextInt();
	    
	    int delIdx = -1;
	    
	    int count = 0;
	    for(int i=0;i<jang.length;i++)
	    {
	    	if(name.equals(jang[i][0]))
	    	{
	    		if(count == idx)
	    		{
	    			delIdx = i;
	    		}
	    		count++;
	    	}
	    }
	    
	    System.out.println(delIdx);
	    
	    String[][] temp = jang;
	    jang = new String[temp.length-1][2];
	    
	    int j = 0;
	    for(int i=0;i<temp.length;i++)
	    {
	    	if(i != delIdx)
	    	{
	    		jang[j] = temp[i];
	    		j++;
	    	}
	    }
	    
	    for(int i=0;i<jang.length;i++)
	    {
	    	System.out.println(jang[i][0] + " : " + jang[i][1]);
	    }
	}
}

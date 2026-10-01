package array2d;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistdemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.size());
	}
}
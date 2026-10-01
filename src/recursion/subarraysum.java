package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class subarraysum {

	public static void main(String[] args) {
		
Scanner scn=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println("The Size of Array : ");
		int size=scn.nextInt();
		
		System.out.println("Enter the Elements of Array : ");
		int[]arr=new int[size];
		for (int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
	
		int sum=0;
		int index=0;

		function(arr,sum,index,list);
		
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static ArrayList<Integer> function(int[]arr,int sum,int index,ArrayList<Integer>list) {
		
		if(index==arr.length) {
			list.add(sum);
			return list;
		}
		function(arr,sum+arr[index],index+1,list);
		function(arr,sum,index+1,list);
		return list;
	}
}
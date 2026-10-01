package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class combinationsum {

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
		
		System.out.println("Enter  the Target Element : ");
		int target=scn.nextInt();
		int index=0;
		
		System.out.println("The combination of Element whose Combination Sum is : "+target);
		function(arr,target,index,list);
		
	}
	
	public static void function(int[]arr,int target,int index,ArrayList<Integer>list) {
		
		if(index==arr.length) {
			if(target==0) {
				System.out.println(list);
			}
			return;
		}
		
		if (arr[index]<=target) {
			list.add(arr[index]);
			
			function(arr,target-arr[index],index,list);
			list.removeLast();
		}
		
		function(arr,target,index+1,list);
	}
}
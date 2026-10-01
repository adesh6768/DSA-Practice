package backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class ratinmaze {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=4;
		int[][]mat= {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		ArrayList<String>ans=new ArrayList<>();
		int[][]visited=new int[n][n];
		ratinmaze(0,0,mat,visited,"",ans);
		if(ans.size()>=1) {
			for(int a=0;a<ans.size();a++) {
				System.out.println(ans.get(a)+" ");
			}
		}
		else {
			System.out.println(-1);
		}
	}
public static void ratinmaze(int i,int j,int [][]mat,int[][]visited,String move,ArrayList<String>ans) {
	//downward
	if(i+1<mat.length && mat[i+1][j]==1&& visited[i+1][j]==0) {
		visited [i+1][j]=1;
		ratinmaze(i+1,j,mat,visited,move+"D"+" ",ans);
		visited[i+1][j]=0;
		}
	//upward
	if(i-1>=0 && mat[i-1][j]==1&& visited[i-1][j]==0) {
		visited [i-1][j]=1;
		ratinmaze(i-1,j,mat,visited,move+"U"+" ",ans);
		visited[i-1][j]=0;
		}
	//right
	if(j+1<mat.length && mat[i][j+1]==1&& visited[i][j+1]==0) {
		visited [i][j+1]=1;
		ratinmaze(i,j+1,mat,visited,move+"R"+" ",ans);
		visited[i][j+1]=0;
		}
	//Left
	if(j-1>=0&& mat[i][j-1]==1&& visited[i][j-1]==0) {
		visited [i][j-1]=1;
		ratinmaze(i,j-1,mat,visited,move+"L"+" ",ans);
		visited[i][j-1]=0;
		}
	if(i==mat.length-1&&j==mat.length-1) {
		ans.add(move);
		return;
		}
	}
}
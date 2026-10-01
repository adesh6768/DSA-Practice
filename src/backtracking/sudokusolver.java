package backtracking;

import java.util.Scanner;

public class sudokusolver {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int[][]board=new int[9][9];
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				board[i][j]=scn.nextInt();
			}	
		}
		
		int row=0;
		int col=0;
		
		sudoku(board,row,col);
		
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			
			System.out.println();
		}
	}
	
	public static boolean sudoku(int[][]board,int row,int col) {
		
		if(col==board.length) {
			col=0;
			row=row+1;
		}
		
		if(row==board.length) {
			return true;
		}
		
		if(board[row][col]!=0) {
			return sudoku(board,row,col+1);
		}
		
		if (board[row][col]==0) {
			
			for(int value=1;value<=9;value++) {
				
				if(isvalid(board,row,col,value)) {
					board[row][col]=value;
				}
				
				if(sudoku(board,row,col+1)) {
					return true;
				}
				
				else {
					board[row][col]=0;
				}
			}
		}
		
		return false;
	}
	
	public static boolean isvalid(int[][]board,int row,int col,int value) {
		
		for(int i=0;i<board.length;i++) {
			
			if(board[row][i]==value) {
				return false;
			}
		}
		
		for(int i=0;i<board.length;i++) {
			
			if (board[i][col]==value) {
				return false;
				
			}
		}
		
		int startingrow=(row/3)*3;
		int startingcol=(col/3)*3;
		
		for (int i=startingrow;i<=startingrow+2;i++) {
			for(int j=startingcol;j<=startingcol+2;j++) {
				
				if(board[i][j]==value) {
					return false;
				}
			}
		}
		
		return true;
	}
}

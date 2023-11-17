import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.plaf.basic.BasicListUI.ListDataHandler;

/**
 * Copyright 2023 All rights reserved.
 * 
 * 
 * Tic-Tac-Toc
 * 
 * Game of X and O
 * 
 */
public class ttt {
/**
 * Main
 * @param args
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] boxes = {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}};
		while(threeInRow(boxes) == false) {
			System.out.println("Enter 1 for X" + "\n" + "Enter 2 for O");
			drawBoard(boxes);
			int i = input.nextInt();
			System.out.println("Enter any number sapce 1 - 9");
			int j = input.nextInt();
			spaces(boxes, i, j);
			drawBoard(boxes);
		}	
		System.out.println();
		drawBoard(boxes);
	}
	
	/**
	 * drawBorad i draws the current board state
	 * @param boxes which is a 2d array
	 */
	public static void drawBoard(char[][] boxes) {
		System.out.println("_____________");
		System.out.println("| " + boxes[0][0] + " | " + boxes[0][1] + " | " + boxes[0][2] + " |");
		System.out.println("_____________");
		System.out.println("| " + boxes[1][0] + " | " + boxes[1][1] + " | " + boxes[1][2] + " |");
		System.out.println("_____________");
		System.out.println("| " + boxes[2][0] + " | " + boxes[2][1] + " | " + boxes[2][2] + " |");
		System.out.println("_____________");
	} 
	public static char[][] spaces(char[][] boxes, int i, int j){
		if (i == 1) {
			if (j == 1) {
				boxes[0][0] = 'X';	
			}
			if (j == 2) {
				boxes[0][1] = 'X';	
			}
			if (j == 3) {
				boxes[0][2] = 'X';	
			}
			if (j == 4) {
				boxes[1][0] = 'X';	
			}
			if (j == 5) {
				boxes[1][1] = 'X';	
			}
			if (j == 6) {
				boxes[1][2] = 'X';	
			}
			if (j == 7) {
				boxes[2][0] = 'X';	
			}
			if (j == 8) {
				boxes[2][1] = 'X';	
			}
			if (j == 9) {
				boxes[2][2] = 'X';	
			}
		}
		if (i == 2) {
			if (j == 1) {
				boxes[0][0] = 'O';	
			}
			if (j == 2) {
				boxes[0][1] = 'O';	
			}
			if (j == 3) {
				boxes[0][2] = 'O';	
			}
			if (j == 4) {
				boxes[1][0] = 'O';	
			}
			if (j == 5) {
				boxes[1][1] = 'O';	
			}
			if (j == 6) {
				boxes[1][2] = 'O';	
			}
			if (j == 7) {
				boxes[2][0] = 'O';	
			}
			if (j == 8) {
				boxes[2][1] = 'O';	
			}
			if (j == 9) {
				boxes[2][2] = 'O';	
			}
		}
		return boxes;
	}
	
	
	public static boolean threeInRow(char[][] boxes) {
		/// Row ///
		if (boxes[0][0] == 'X' && boxes[0][1] == 'X' && boxes[0][2] == 'X'){
				return true;
		}
		if (boxes[0][0] == 'O' && boxes[0][1] == 'O' && boxes[0][2] == 'O'){
			return true;	
	}
		if (boxes[1][0] == 'X' && boxes[1][1] == 'X' && boxes[1][2] == 'X'){
			return true;
	}
		if (boxes[1][0] == 'O' && boxes[1][1] == 'O' && boxes[1][2] == 'O'){
			return true;
}
		if (boxes[2][0] == 'X' && boxes[2][1] == 'X' && boxes[2][2] == 'X'){
			return true;
	}
		if (boxes[2][0] == 'O' && boxes[2][1] == 'O' && boxes[2][2] == 'O'){
			return true;
	}
		/// Col ///
		if (boxes[0][0] == 'O' && boxes[1][0] == 'O' && boxes[2][0] == 'O'){
			return true;
	}
		if (boxes[0][0] == 'O' && boxes[1][0] == 'O' && boxes[2][0] == 'O'){
			return true;
}
		if (boxes[0][1] == 'X' && boxes[1][1] == 'X' && boxes[2][1] == 'X'){
			return true;
	}
		if (boxes[0][1] == 'O' && boxes[1][1] == 'O' && boxes[2][1] == 'O'){
			return true;
	}
		if (boxes[0][2] == 'X' && boxes[1][2] == 'X' && boxes[2][2] == 'X'){
			return true;
	}	if (boxes[0][2] == 'O' && boxes[1][2] == 'O' && boxes[2][2] == 'O'){
		return true;
}
	////// Across //////
		if (boxes[0][2] == 'X' && boxes[1][1] == 'X' && boxes[2][0] == 'X') {
			return true;
		}
		if (boxes[0][2] == 'O' && boxes[1][1] == 'O' && boxes[2][0] == 'O') {
			return true;
		}
		if (boxes[0][0] == 'X' && boxes[1][1] == 'X' && boxes[2][2] == 'X') {
			return true;
		}
		if (boxes[0][0] == 'O' && boxes[1][1] == 'O' && boxes[2][2] == 'O') {
			return true;
		}
		return false;
	}
}

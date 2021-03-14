package com.codeWithAzadani;

public class Arrays {

	public static void main(String[] args) {
		//

		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int row=0; row<grid.length; row++) {
			for (int column=0; column<grid[row].length; column++) {
				System.out.print(grid[row][column] + "*  ");
			}
			System.out.println();
		}
	}
}
package com.maze_generator.classes;

import java.util.Random;

public class Generator {
	
	int[] start = new int[2];
	Cell[][] grid;
	int[] loc;
	int[][] way;
	
	Generator(int rows, int cols) {
		Random random = new Random();
		start[0] = random.nextInt(cols);
		start[1] = random.nextInt(rows);
		loc = start;
		for (int c=0; c<cols; c++) {
			for (int r=0; r<rows; r++) {
				grid[c][r] = new Cell();
			}
		}
		
		
	}
}

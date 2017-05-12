package assignment;

import java.util.Scanner;

public class Puzzle {

	public static final int N = 4;
	public static final int NUMBER_OF_ROTATIONS = 5;

	public static void main(String[] args) {
		int[][] puzzle = new int[N][N];
		reset(puzzle);
		test(puzzle);
		reset(puzzle);
		scramble(puzzle);
		System.out.println("### Testing puzzle game play\n");
		play(puzzle);
	}

	public static void print(int[][] puzzle) {
		for (int[] row : puzzle) {
			for (int elem : row) {
				System.out.printf("%4d", elem);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void test(int[][] puzzle) {
		System.out.println("### Testing reset method\n");
		print(puzzle);
		System.out.println("### Testing rotate methods\n");
		print(puzzle);
		for (int i = 0; i < N; i++) {
			System.out.println("### rotateColumn(" + i + ")\n");
			rotateColumn(puzzle, i);
			print(puzzle);
			System.out.println("### rotateRow(" + i + ")\n");
			rotateRow(puzzle, i);
			print(puzzle);
		}
		reset(puzzle);
		System.out.println("### Testing random rotations\n");
		print(puzzle);
		for (int i = 0; i < 5; i++) {
			randomRotation(puzzle);
			print(puzzle);
		}
	}

	public static void reset(int[][] puzzle) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				puzzle[i][j] = i * N + j;
		}
	}

	public static void scramble(int[][] puzzle) {
		for (int i = 0; i < NUMBER_OF_ROTATIONS; i++) {
			randomRotation(puzzle);
		}
	}

	public static void rotateRow(int[][] arr, int row) {
		int x = arr[row].length;
		int temp = arr[row][x - 1];
		for (int i = x - 1; i >= 1; i--) {
			arr[row][i] = arr[row][i - 1];
		}
		arr[row][0] = temp;
	}

	public static void rotateColumn(int[][] arr, int column) {
		int x = arr[column].length;
		int temp = arr[x - 1][column];

		for (int j = x - 1; j >= 1; j--) {
			arr[j][column] = arr[j - 1][column];
		}
		arr[0][column] = temp;
	}

	public static void randomRotation(int[][] puzzle) {
		int i = 0 + (int) (Math.random() * 4);
		int randomSelect = 0 + (int) (Math.random() * 2);

		if (randomSelect == 0) {
			rotateRow(puzzle, i);
		} else if (randomSelect == 1) {
			rotateColumn(puzzle, i);
		}
	}

	
	static void play(int[][] puzzle) {
		Scanner input = new Scanner(System.in);
		int j = 1;

		
		
		for (int i = 0; i <= j; i++) {
			
				j++;
				print(puzzle);
				String x = input.next();
				int y = input.nextInt();
				
				if (!x.equals("row") && !x.equals("col") || y>3){
					System.out.println("Invalid input!");
					break;
					}
				if (x.equals("row")) rotateRow(puzzle, y);
				if (x.equals("col")) rotateColumn(puzzle, y);
				
				}
			}
		}


		

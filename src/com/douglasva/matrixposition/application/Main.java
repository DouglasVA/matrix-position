package com.douglasva.matrixposition.application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Matrix lines: ");
        int m = sc.nextInt();
        System.out.print("Matrix columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.print("Enter matrix values: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // teste visual da matriz, apagar após finalizar os testes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter a number who exists in matrix, and i'll show the number in the left, up, right and dowm: ");
        int x = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("\nPosition: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();

    }

}
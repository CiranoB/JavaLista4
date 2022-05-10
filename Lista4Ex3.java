package Familia52;

import java.util.Scanner;

public class Lista4Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i,j,qtt=0;
		float[][] matriz = new float [3][3];
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print("\nInsira o valor da linha"+(i+1)+", coluna "+(j+1)+": ");
				matriz[i][j] = leia.nextFloat();
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(matriz[i][j]>10) {
					qtt++;
				}
			}
		}
		System.out.println("O número de valores maiores que 10 é de: "+qtt);
	}
}

package Familia52;

import java.util.Scanner;

public class Lista4Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, somapar=0,qtt=0;
		int[] vetor = new int [6];
		for(i=0;i<6;i++) {
			System.out.println("\nInsira o valor "+(i+1)+": ");
			vetor[i]= leia.nextInt();
		}
		System.out.println("\nOs números pares digitados: ");
		for(i=0;i<6;i++) {
			if(vetor[i]%2==0) {
				System.out.print(vetor[i]+" ");
				somapar+=vetor[i];
			}
		}
		System.out.println("\nA soma dos números pares digitados: "+somapar);
		System.out.println("\nOs números ímpares digitados: ");
		for(i=0;i<6;i++) {
			if(vetor[i]%2!=0) {
				System.out.print(vetor[i]+" ");
				qtt++;
			}
		}
		System.out.println("\nA quantidade de números ímpares digitados: "+qtt);
		
	}

}

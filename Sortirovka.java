package test;

import java.util.Arrays;
import java.util.Scanner;

public class Sortirovka {

	private static int[] array;
	private static int[] arrayN;
	private static int[] arrayCh;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = 0;
		int j = 0;
		System.out.print("������� ����� �������: ");
		int arrayLength = sc.nextInt();
		array = new int[arrayLength];
		arrayCh = new int[arrayLength / 2 + 1];
		arrayN = new int[arrayLength / 2];
		for (int i = 0; i < array.length; i++) {
			System.out.print("������� " + (i + 1) + "-������� ��������: ");
			int arrayElement = sc.nextInt();
			if (isContains(arrayElement)) {
				System.out.println("!");
				System.out.print("������� " + (i + 1) + "-������� ��������: ");
				array[i] = sc.nextInt();
			} else {
				array[i] = arrayElement;
			}
		}
		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) {
				System.out.println("׸���� ������� �������   " + array[i]);  //�������� ������� ������� 
																			//׸���� ������� �������   
				arrayCh[k] = array[i];

				k++;
			} else {
				System.out.println("�������� ������� ������� " + array[i]);

				arrayN[j] = array[i];
				j++;
			}
		}

		System.out.println("����� ������� �������     " + Arrays.toString(array));
		System.out.println("��������  �������� �������" + Arrays.toString(arrayCh));
		System.out.println("׸���� �������� �������   " + Arrays.toString(arrayN));
		for (int i = 0; i < arrayCh.length - 1; i++) {
			for (int l = 0; l < arrayCh.length - 1 - i; l++) {
				int max = 0;

				if (arrayCh[l] < arrayCh[l + 1]) {

					max = arrayCh[l];
					arrayCh[l] = arrayCh[l + 1];
					arrayCh[l + 1] = max;
				}
			}
		}
		System.out.println("��������� �������� �������" + Arrays.toString(arrayCh));
		for (int i = 0; i < arrayN.length - 1; i++) {
			for (int l = 0; l < arrayN.length - 1 - i; l++) {
				int max = 0;

				if (arrayN[l] > arrayN[l + 1]) {

					max = arrayN[l];
					arrayN[l] = arrayN[l + 1];
					arrayN[l + 1] = max;
				}
			}
		}
		System.out.println("��������� ������ �������  " + Arrays.toString(arrayN));

	}

	private static boolean isContains(int son) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == son) {
				return true;
			}
		}
		return false;
	}
}

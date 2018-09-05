import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		int[] numeros = { 1, 3, 6, 4, 1, 2 };
		//int[] numeros ={1,2,3};
		//int[] numeros ={-1, -3, -12123121,2};

		System.out.println(getNumbers(numeros));
	}

	public static int getNumbers(int[] A) {

		boolean existe = false;
		Arrays.sort(A);
		int tamanio = A.length - 1;

		if (A[tamanio]< 0) {
			return 1;
		} else {

			for (int i = 1; i <= 100000; i++) {
				for (int j = 0; j < A.length; j++) {

					if (A[j] == i) {
						existe = true;
						break;
					}
				}

				if (!existe) {
					return i;
				}
				existe = false;
			}
		}
		return 0;
	}
}

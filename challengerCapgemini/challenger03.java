package challengerCapgemini;

import java.util.Arrays;
import java.util.Scanner;

public class challenger03 {
	public static void calculadorDeAnagrama(String texto){
		
		int numeroDeAnagramas = 0;

		for(int a = 1; a < texto.length(); a++) {
			for(int e = 0; e < texto.length(); e++) {
				for(int i = e + 1; i < texto.length() - a + 1; i++) {
					
					String subString1 = texto.substring(e,e+a);
					String subString2 = texto.substring(i,i+a);
					
					char[] array = subString1.toCharArray();
					char[] array2 = subString2.toCharArray();

					
					Arrays.sort(array);
					Arrays.sort(array2);

					if(Arrays.equals(array, array2)) {
						numeroDeAnagramas++;
					}
				}
			}
		}
		
		System.out.println(numeroDeAnagramas);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a String ");
		String texto = input.next();
		calculadorDeAnagrama(texto);
		input.close();
		
		
	}
}


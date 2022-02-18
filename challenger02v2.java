import java.util.Scanner;

public class challenger02v2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String password;
		Boolean six = false;
		Boolean number = false;
		Boolean uppercase = false;
		Boolean lowercase = false;
		Boolean specialCharacter = false;
		int i = 0;
		int numberWantage = 0;
		
		
		System.out.print("Digite a senha: ");
		password = input.next();
		input.close();
		
		if(password.length() < 6){
			numberWantage = 6 - password.length() ;
			
		}else six = true;
		
		for( i = 0; i <= password.length()-1 ;i++ ) {
			char letter = password.charAt(i);
			
			if(Character.isUpperCase(letter)) {
				uppercase = true;
			}else if(Character.isLowerCase(letter)) {
				lowercase = true;
			}else if(Character.isDigit(letter)) {
				number = true;
			}else specialCharacter = true;
		}
		if(!six)System.out.println("menos de 6 digitos, adicione mais "+numberWantage+"" );
		if(!number)System.out.println("falta numero ");
		if(!uppercase)System.out.println("falta letra maiuscula ");
		if(!lowercase)System.out.println("falta letra minuscula");
		if(!specialCharacter)System.out.println("falta caracter especial ");
		
	
	  }
}

import java.util.Scanner;

public class challenger02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String password;
		int numberWantage = 0;
		
		
		System.out.print("Digite a senha: ");
		password = input.next();
		input.close();
		
		if(password.length() < 6){
			numberWantage = 6 - password.length() ;
			System.out.print("falta "+numberWantage+" para ser segura");
		}else{
			System.out.print("Sua senha esta segura");
		}
		
	  }
}

import java.util.Scanner;

public class Login{

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String userName = "nada";
		String passWord = "azerty";
		boolean condition = false;
		
		do{
			System.out.print("user name: ");
			String userInput = sc.next();
			System.out.print("password: ");
			String passwordInput = sc.next();
			if(userInput.equals(userName) && passwordInput.matches(passWord)){
				condition = true;
				System.out.println("Welcome "+ userName);
			}else{
				System.out.println("access denied");
			}
			
		}while(!condition);
		// TODO Auto-generated method stub

	}

}

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen parola giriniz: ");
		String password = scanner.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "Tebrikler. Giriş yaptınız" : "Hatalı Parola");
	}

}

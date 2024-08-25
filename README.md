		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen parola giriniz: ");
		String password = scanner.nextLine();
		boolean isOk = password.equals("1234");
		System.out.println(isOk ? "Tebrikler. Giriş yaptınız" : "Hatalı Parola");

package variaveis;

public class TipoString {

	public static void main(String[] args) {
		// String é uma classe => é um tipo de Referência
		// Classe se inicia em letra maiúscula (dentro de classe eu tenho métodos)
		// Date => também é um tipo de referência
	    
		String email= "leanDro@GmAil.com.bR";
		System.out.println("Original: " + email);
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Minusculo:" + email.toLowerCase());
		System.out.println("Qtde Caracteres:" + email.length());
		//contains() => retorna true/false sobre a existencia ou não do caracter
		System.out.println("Tem arroba?:" + email.contains("@"));
		System.out.println("Posição do arroba:" + email.indexOf("@"));
		System.out.println("Do 2 até o 5 : " + email.substring(1,6));
		System.out.println("A partir do 3 : " + email.substring(2,email.length()));
		
		// exibir somente o usuário do email
		
		System.out.println("Somente o usuário : " + email.substring(0, email.indexOf("@")));
		
		// exibir somente o servidor do email
		
		System.out.println("Servidor : " + email.substring(email.indexOf("@")+1, email.indexOf(".com")));
		
		
		//l e a n d r o @ g m 
		//0 1 2 3 4 5 6 7 8 9 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

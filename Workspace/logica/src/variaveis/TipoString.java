package variaveis;

public class TipoString {

	public static void main(String[] args) {
		// String � uma classe => � um tipo de Refer�ncia
		// Classe se inicia em letra mai�scula (dentro de classe eu tenho m�todos)
		// Date => tamb�m � um tipo de refer�ncia
	    
		String email= "leanDro@GmAil.com.bR";
		System.out.println("Original: " + email);
		System.out.println("Maiusculo:" + email.toUpperCase());
		System.out.println("Minusculo:" + email.toLowerCase());
		System.out.println("Qtde Caracteres:" + email.length());
		//contains() => retorna true/false sobre a existencia ou n�o do caracter
		System.out.println("Tem arroba?:" + email.contains("@"));
		System.out.println("Posi��o do arroba:" + email.indexOf("@"));
		System.out.println("Do 2 at� o 5 : " + email.substring(1,6));
		System.out.println("A partir do 3 : " + email.substring(2,email.length()));
		
		// exibir somente o usu�rio do email
		
		System.out.println("Somente o usu�rio : " + email.substring(0, email.indexOf("@")));
		
		// exibir somente o servidor do email
		
		System.out.println("Servidor : " + email.substring(email.indexOf("@")+1, email.indexOf(".com")));
		
		
		//l e a n d r o @ g m 
		//0 1 2 3 4 5 6 7 8 9 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

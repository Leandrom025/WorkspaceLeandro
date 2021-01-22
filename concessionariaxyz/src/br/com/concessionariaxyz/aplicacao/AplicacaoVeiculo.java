		// Criar um objeto => ele não possui qualquer repartição
		// Exemplo: Veiculo objeto;
		// Instanciar um objeto => ele possui todas as repartições
		// Exemplo: Veiculo objeto = new Veiculo();

		//Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("fiat");
		objeto.preencherModelo("Uno");
		objeto.preencherValor(30000);
		objeto.preencherVelocidadeMaxima(180);
		System.out.println("Montadora.........: " + objeto.retornarMontadora());
		System.out.println("Modelo............: " + objeto.retornarModelo());
		System.out.println("Valor.............: " + objeto.retornarValor());
		System.out.println("Velocidade Máxima.: " + objeto.retornarVelocidadeMaxima());
		
		System.out.println(objeto.ligar());
		
		objeto.acelerar();
		objeto.acelerar();
		objeto.acelerar();
		System.out.println(objeto.verificarStatus());
		
		System.out.println(objeto.desligar());
		
		
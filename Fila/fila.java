package Fila;

public class fila {

	String [] pepe = new String[5]; // cria um vetor do tipo String com espaço pra 5 posições
	int inicio=0,fim=0; // índices da Fila, contando o início e o fim dela
	
	public void retirarFila()
	{ // retira um elemento do começo da fila
		try
		{
			if(estaVazia()) // verifica se a fila está vazia, caso positivo gera um erro
				throw new Exception();
			inicio++; // move o marcador de início em uma posição, deixando o coletor de lixo do java apagá-lo
		}
		catch(Exception e)
		{
			System.out.println("ERRO: fila vazia"); // erro exibido quando a fila está vazia
		}
		
	
	}
	
	public void inserirFila(String x)
	{ // insere no fim da fila um elemento
		try
		{
			if(tamanhoFila()==pepe.length) // se o tamanho da fila retornar igual ao tamanho total do vetor, gera um erro
				throw new Exception();
			pepe[fim]=x; // insere no fim da fila o valor recebido por X no método
			fim++; // move o índice da fila pro próximo lugar disponível
		}
		catch(Exception e)
		{
			System.out.println("ERRO: Fila cheia"); // erro retornado caso a fila esteja cheia
		}
		
	}
	
	public int tamanhoFila()
	{
		return fim-inicio; // subtrai o índice de fim pelo de início, o resultado é o tamanho ocupado da fila
	}
	
	public boolean estaVazia()
	{ // retorna verdadeiro ou falso se a fila está vazia ou não
		return	inicio == fim;
		// se o índice de começo for o mesmo que o fim, a fila está vazia
		// retorna verdadeiro ou falso pra pergunta
	}
	
	public String exibirFrente()
	{// exibe o elemento na frente da fila, ou seja a próxima a ser retirada
		try
		{
			if(estaVazia())
				throw new Exception();
			return pepe[inicio]; // retorna o valor do vetor na posição de início
		}
		catch(Exception e)
		{
			System.out.println("ERRO: Fila vazia"); // mensagem de erro caso a fila esteja vazia
		}
		return null;
	}
}

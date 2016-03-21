package pilha;


public class Pilha {

	
	
	// Declaração das variáveis
	int topo=-1;
	String [] memes = new String [5];
	
	// Métodos
	
	public void retirarPilha(){
	
	try // antes de retirar da pilha, verifica se ela está vazia
		{
		if(estaVazia())
			throw new Exception();
			memes[topo]=null; // caso esteja vazia, topo da pilha é marcado como nulo
		topo--; //caso negativo, retira o último membro da pilha
		}
	catch(Exception e)
		{
		System.out.println("A pilha está vazia, ERRO");		
		}
		
	}
	
	public void inserirPilha(String x){
		topo++; // incrementa um na pilha, pra inserir valor na próxima posição livre
		memes[topo] = x; // recebe string do método e manda pro topo da pilha
	}
	
	public int tamanhoPilha(){
		return topo+1;
		// inteiros são inicializados com zero, então soma 1 para valor legível a humanos
		
	}
	
	public boolean estaVazia(){
		if(topo<=-1){ // se o topo for igual ou menor a -1
			return true;} // retorna verdadeiro, a pilha está vazia
		else
			return false; // retorna falso, a pilha contém elementos
		}
	
	public String exibirTopo()
	{
		try{ 
			if(estaVazia()){
				throw new Exception();} // caso a pilha esteja vazia cria nova exceção
			return memes[topo];// caso tenha um topo, retorna ele
		}
		catch(Exception e)
		{
			System.out.println("Pilha está vazia");	 // mensagem de erro caso exceção seja encontrada
		}	
		return null; // retorno nulo obrigatório pro método
	
	}
}
	
	


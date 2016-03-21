package Fila;
import Fila.fila;
public class aplicarFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fila filanaocircular = new fila();
		filanaocircular.inserirFila("Teste1");
		filanaocircular.inserirFila("teste2");
		filanaocircular.inserirFila("teste3");
		filanaocircular.inserirFila("teste4");
		filanaocircular.inserirFila("teste5");
		//filanaocircular.inserirFila("teste6");
		System.out.println(filanaocircular.exibirFrente());
		
		
		
	}

}

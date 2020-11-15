    public class Lista {
        Aluno comeco;
        Aluno fim;

    public void inserir(Aluno aluno){
        if (comeco == null){
            comeco = aluno;
            fim = aluno;
            System.out.println(".....Início da lista.....\n");
        }
    else{
        fim.prox = aluno;
        aluno.anterior = fim;
        fim = aluno;
    }
}
    public void imprimeLista(){
        Aluno aux = comeco;
        
        do {
            System.out.println(aux.toString());
            aux= aux.prox;
        } while (aux!=null);
    }
 }
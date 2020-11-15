public class ListaD {
    No inicio;
    No fim;

    public void insere(No no){
        if (inicio == null){
            inicio = no;
            fim = no;
            System.out.println("Inicializando a lista - Inserido no inicio...");
        }
        else{
            fim.proximo = no;
            fim = no;
            System.out.println("Inserido no final...");
        }

    }

    public No busca(String nome){
        No aux = inicio;
        while(aux != null){
            if(aux.atleta.getNome().contains(nome)){
                return aux;
            }
            aux = aux.proximo;
        }
        return null;
    }

    public No getbuscaAnt(String nome){
        No anterior = inicio;
        while(anterior.proximo != null){
            if(anterior.proximo.atleta.getNome().contains(nome)){
                return anterior;
            }
            anterior = anterior.proximo;
        }
        return null;
    }

    public No removerPorNome(String nome){
        No aux = inicio;

    if (inicio == null) {
      System.out.println("Lista vazia!");
      return null;
    }
    if (aux.atleta.getNome().contains(nome)){
        if (aux == fim) {
            fim = null;
            inicio = null;
      }
        else {
            inicio = aux.proximo;
            aux.proximo = null;
        }
    }
    else{
        No anterior = getbuscaAnt(nome);
        if (anterior == null){
            System.out.println("Noem não encontrado!");
            return null;
        }

    aux = anterior.proximo;
    if (aux == fim){
        anterior.proximo = null;
        fim = anterior;
        }
        else{
            anterior.proximo = aux.proximo;
            aux.proximo = null;
        }
    }
    System.out.println("Element removido: "+ aux);
        return aux;
  }

    public void imprimeLista(){
        No aux = inicio;
        if (inicio == null){
            System.out.println("---LISTA VAZIA---");
        }
        else {
            System.out.println("Inicio da lista: " + inicio.getClass() + "@" + Integer.toHexString(inicio.hashCode()));
            System.out.println("Fim da lista: " + fim.getClass() + "@" + Integer.toHexString(fim.hashCode()));
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.proximo;
            }
        }
    }
}
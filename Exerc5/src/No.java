public class No {

    Atleta atleta;

    No proximo;

    public No(Atleta atleta){
        this.atleta = atleta;
    }
    public String toString(){
        if (proximo!=null)
            return ("Athelet = "+ this.atleta + " | Proximo = "+this.proximo.getClass() + "@"+Integer.toHexString(this.proximo.hashCode()));
    else
      return "Atleta: "+ this.atleta + " | Proximo = null";
  }
}
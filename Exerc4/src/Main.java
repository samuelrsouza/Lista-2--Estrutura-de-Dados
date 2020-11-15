    class Main {
    public static void main(String[] args) {
        teste();  
    }
    public static void teste() {
        Lista lista = new Lista();
        Aluno n = new Aluno("Zé","666",9.9,"Mat");
        lista.inserir(n);
        
        n = new Aluno("Tião","123",0.1,"Eng");
        lista.inserir(n);
        
        n= new Aluno("D Gilmour","65",8.2,"Psc");
        lista.inserir(n);
        
        lista.imprimeLista();
    }
}

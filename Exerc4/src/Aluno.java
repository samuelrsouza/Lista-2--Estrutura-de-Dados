public class Aluno {
    String aluno;
    String matricula;
    Double rendimento;
    String nomeCurso;
    
    Aluno prox;
    Aluno anterior;
    
public Aluno(String aluno,String matricula,Double rendimento,String nomeCurso){
    this.aluno =  aluno;
    this.matricula =  matricula;
    this.rendimento = rendimento;
    this.nomeCurso = nomeCurso;
}
public String toString(){
    return("Nome do aluno: "+this.aluno+ "\nMatricula: "+this.matricula+"\nCurso: "+this.nomeCurso+ "\nRendimento do aluno: "+this.rendimento + "\n...................." );
}
}
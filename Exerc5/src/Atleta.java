public class Atleta {
    private String nome;
    private Double altura;
    private Double peso ;
    private String esporte;
    private String patrocinadores;

    public Atleta(String nome, Double altura, Double peso, String esporte, String patrocinadores){
        this.nome =  nome;
        this.altura = altura;
        this.peso = peso;
        this.nome = esporte;
        this.patrocinadores = patrocinadores;
    }
    
    public void setNome(String nome){
        this.nome = nome;
     }
    public String getNome(){
        return this.nome;
    }
    public void setPeso(Double peso){
        this.peso = peso;
    }
    public Double getPeso(){
        return this.peso;
    }
    public Double getAltura(){
        return this.altura;
    }
    public void setAltura(Double altura){
      this.altura = altura;
     }
    public void setEsporte(String esporte){
        this.esporte = esporte;
     }
    public String getEsporte(){
        return this.esporte;
     }
    public void setPatrocinador(String patrocinadores){
        this.patrocinadores = patrocinadores;
     }
    public String getPatrocinador(){
        return this.patrocinadores;
    }
}

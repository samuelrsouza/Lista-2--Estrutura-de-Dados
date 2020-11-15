import java.util.Scanner;

public class Main {
  static Scanner input = new Scanner(System.in);
  static ListaD lista = new ListaD();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int opcao = -1;
    while (opcao != 0) {
      System.out.println("Menu de interações");
      System.out.println(" 1 - Inserir");
      System.out.println(" 2 - Buscar");
      System.out.println(" 3 - Remover");
      System.out.println(" 4 - Imprimir");
      System.out.println(" 0 - Sair ");

      switch (opcao){
        case 1:
          insereNovoAtleta();
          break;
        
        case 2:
          System.out.print("Digite o nome do atleta para buscar: ");
          String nomeAtleta = input.nextLine();
          System.out.println(lista.busca(nomeAtleta));
          break;
        
        case 3:
          System.out.println("Digite o nome do atleta para remover");
          String inputAthlete = input.nextLine();

          No _element = lista.removerPorNome(inputAthlete);
          if (_element != null){
            System.out.println("Atleta Removido: " + _element);
          }
          break;

        case 4:
          lista.imprimeLista();
          break;
      }
    }
  }

public static void insereNovoAtleta(){
    System.out.print("Insira o nome do atleta: ");
    String nome = input.nextLine();
    
    System.out.print("Insira o peso do atleta em kilogramas: ");
    Double peso = input.nextDouble();
    
    System.out.print("Insira a altura(cm) do atleta em metros: ");
    Double altura = input.nextDouble();

    System.out.print("Insira o esporte do atleta: ");
    String esporte = input.nextLine();

    System.out.print("Insira o(s) patrocinadores do atleta: ");
    String patrocinadores = input.nextLine();

    No n = new No(new Atleta(nome, peso, altura, esporte, patrocinadores));
    lista.insere(n);
  }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Vetor 'inicial'\n");
        No[] vetObj = new No[4];

        vetObj[0] = new No(33);
        vetObj[1] = new No(44);
        vetObj[2] = new No(11);
        vetObj[3] = new No(22);
        
        EstrOrd ordenacao = new EstrOrd(vetObj);
        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i].getChave());
        }

        No[] vetBubbleSort = ordenacao.bubbleSort();
        for (int i = 0;i < vetBubbleSort.length; i++) {
            System.out.println(vetBubbleSort[i].getChave());
        }
        System.out.println("\n_________________________________________\n");
        
        System.out.println("Vetor 'inicial'\n");
        vetObj = new No[4];

        vetObj[0] = new No(66);
        vetObj[1] = new No(77);
        vetObj[2] = new No(88);
        vetObj[3] = new No(55);

        ordenacao = new EstrOrd(vetObj);
        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i].getChave());
        }

        No[] vetInsertionSort = ordenacao.insertionSort();
        for (int i = 0;i < vetInsertionSort.length; i++) {
            System.out.println(vetInsertionSort[i].getChave());
        }

        System.out.println("");
    }
}
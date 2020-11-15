import java.util.ArrayList;
import java.util.Collections;

public class EstrOrd {
    No [] vetObj;
    
    public EstrOrd(No[] vetObj) {
       this.vetObj = vetObj;
   }
    private No[] swap(No[] vetObj, int idx1, int idx2) {
       No temp = vetObj[idx1];
       vetObj[idx1] = vetObj[idx2];
       vetObj[idx2] = temp;
       return vetObj;
   }
    public No[] insertionSort() { 
       System.out.println("....Vetor final por Insertion Sort....");
       for (int j = 1; j < this.vetObj.length; j++) {
           for (int i = j; i > 0; i--) {
               if(this.vetObj[i].getChave() < this.vetObj[i-1].getChave()) {
                   this.vetObj = swap(this.vetObj, i, (i-1));
                }             
            }
        }
       return this.vetObj;

    }
    public No[] bubbleSort() {
       System.out.println("....Vetor final por Estrutura Bubble Sort....");
       int tamanho = this.vetObj.length;
       for (int j = (tamanho-1); j > 0; j--) {
           for (int i = 0; i < j; i++) {
               if(this.vetObj[i].getChave()>this.vetObj[i+1].getChave()){
                   this.vetObj = swap(this.vetObj, i, (i+1));
               }
           }
       }
       return this.vetObj;
   }
}

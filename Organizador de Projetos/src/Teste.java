class Pai {
    Pai() {
      System.out.println("Pai");
    }
   Pai(int valor) {
      System.out.println("Pai int: " + valor);
    }
  }
 
 
 class Filho extends Pai {
    Filho() {
       System.out.println("Filho");
    }
    Filho(int valor) {
        super(valor);
    }
 }
 
 
 public class Teste {
     public static void main(String[] args) {
         Pai p = new Pai();
         Filho primeiro = new Filho();
     }
 }
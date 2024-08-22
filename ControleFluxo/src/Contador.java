import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int p1, p2;
        
        try {
            System.out.print("Digite o primeiro parametro: ");
            p1 = leitor.nextInt();
            System.out.print("Digite o segundo parametro: ");
            p2 = leitor.nextInt();
            
            Conta c1 = new Conta(p1,p2);
      
        
            System.out.println("\n------------------------------------------------------------------");
            
            for (int j = 0; j < c1.contando(); j++) {
                System.out.println(String.format("Imprimindo o numero %d", j+1)); 
                System.out.println("");
            }
        } catch (MenorException e) {
             System.err.println(e);
             System.out.println("");
        }
        
        leitor.close();   
    }        
}


    
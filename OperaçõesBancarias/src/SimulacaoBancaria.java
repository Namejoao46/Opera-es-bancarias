import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        int opcao;
        do{
            System.out.println("Escolha uma opção; 1 deposita, 2 sacar, 3 consultar saldo, 0 encerrar");
            opcao = scanner.nextInt();

            switch (opcao) {
            
                case 1: 
                    System.out.println("Digite o valor do deposito");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo );
                    break;
               
                
                case 2:
                
                    System.out.println("Saldo atual: " + saldo);
                    System.out.println("Digite o valor a ser sacado");
                    double saque = scanner.nextDouble();
                    if ( saque <= saldo) {
                        saldo -= saque;
                    System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente."); 
                    }
                    break;
                
                 case 3:
                    System.out.println("saldo atual: " + saldo );
                    break;
                
                
                case 0:
                    System.out.println("Programa encerrado.");  
                    break;
                
                
                default:
                    System.out.println("Opção inválida. Tente novamente.");
       
            }   
        }while (opcao !=0);
          scanner.close();     
    }
}

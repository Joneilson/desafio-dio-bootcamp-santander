import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //TODO: Conhercer e importar a classe Scanner;
        Scanner sc = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuario;
        System.out.println("Bem vindo ao Banco NewEra");
        //Obter pela scanner os valores digitados no terminal;
        System.out.println("Por favor, digite o número da Agência!");
        int num_conta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite a agência!");
        String agencia_conta = sc.nextLine();
        System.out.println("Digite o seu nome!");
        String nome_usuario_conta = sc.nextLine();
        System.out.println("Digite o seu saldo!");        
        float saldo_conta = sc.nextFloat();
        sc.nextLine();
        //Exibir a mensagem conta criada;
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque", nome_usuario_conta, agencia_conta, num_conta, saldo_conta);      
    }
}
import java.util.Scanner;

public class Main {
    static void user() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem vindo! usuário");
        int userChoice = 0;

        do{
            System.out.println("Digite a opção desejada");
            System.out.println(" (1) Cadastro Item\n (2) Alterar item existente\n (3) Excluir item existente\n (4) Visualizar todos os items\n (5) Visualizar item existente\n (6) Sair\n");
            userChoice = sc.nextInt();
            switch(userChoice){
                case 1:
                    System.out.println("Teste");
            }
        }while(userChoice != 6);
    }




    public static void main(String[] args){
        user();
    }
}
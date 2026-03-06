import java.util.Scanner;

public class main {
    public static void main (String[] args){
        //Leitura de dados - parte 1
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeUsuario;
        nomeUsuario = leitor.nextLine();
        System.out.println("Agora boute a sua idade, caba");
        int idade;
        idade = leitor.nextInt();
        System.out.println("Well cumon!!! VAI LÁ " + nomeUsuario);
    }
}

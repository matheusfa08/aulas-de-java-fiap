import java.util.Scanner;

public class MédiaBolada {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);;
        float nota1;
        float nota2;
        float media;
        System.out.println("Digite as notas das suas duas provas: ");
        nota1 = leitor.nextFloat();
        nota2 = leitor.nextFloat();
        System.out.println("Calculando a média...");
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é: " + media);
        System.out.println("Narumitsu é real!!!!");
        /*
        + é soma
        - é subtração
        / é divisão
        * é vezes
        % VOCÊ PEGA O RESTO DA DIVISÃO!!!! SUA ANTA, SEU JUMENTO!
         */
    }
}

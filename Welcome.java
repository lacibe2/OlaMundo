import java.util.Scanner;

public class Welcome {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Olá Mundo");
        System.out.println("Qual o seu nome");
        nome = entrada.nextLine();
        System.out.println("Olá  " +nome +" seja bem-vindo ao curso de git");


    }
}

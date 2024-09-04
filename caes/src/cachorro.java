import java.util.Scanner;


public class cachorro {
    int idade;
    String nome;
    double peso;
    String cor;


    void pular(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quão alto seu cachorro pulou?");
        int altura = scanner.nextInt();
        if (altura >= 80) {
            System.out.println("Seu cachorro pula alto!");
        } if (altura <= 80 && altura >= 50) {
            System.out.println("Seu cachorro pula normal.");
        } else{
            System.out.println("Seu cachorro pula baixo");
        }
    }

    public cachorro(int idade, String nome, double peso, String cor) {
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
        this.cor = cor;
        
    }
    
    public void exibirInformacoes(){
        System.out.println("idade: "+idade);
        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+peso+" KG");
        System.out.println("Cor: "+cor);
    }
}

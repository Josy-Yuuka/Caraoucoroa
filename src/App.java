import java.util.Scanner;

public class App {
    public static void main(String[] args){
       
        Scanner ler = new Scanner(System.in);
        Jogador jogador1 = new Jogador();


        System.out.println("Digite o nome: ");
        jogador1.setNome(ler.nextLine()); 
        jogador1.mostrarDados();

        ler.close();
    }
}

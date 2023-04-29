import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

public class App{
    public static void main(String[] args) throws InterruptedException {

        Scanner lernome = new Scanner (System.in);
        Scanner lerpalpite = new Scanner (System.in);
        Random num = new Random();


        int numero = num.nextInt(2);
        //System.out.println(numero);

        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador();


        do{
            if(jogador1.getNome() == ""){
                System.out.println("Digite seu nome Jogador 1: ");
                String nome1 = lernome.nextLine();           
                jogador1.setNome(nome1);    
                System.out.println("Olá "+jogador1.getNome()+", bem vindo!");

            }else{
                System.out.println("Olá "+jogador1.getNome()+", bem vindo!");
            };

            System.out.println("Cara ou Coroa?");
            System.out.println("0 - Cara");
            System.out.println("1 - Coroa");
            int palpite = lerpalpite.nextInt();
            jogador1.setPalpite(palpite);


        }while (jogador1.getPalpite() > 1 || jogador1.getPalpite() < 0);


        do{
            if(jogador2.getNome() == ""){
                System.out.println("Digite seu nome Jogador 2: ");
                String nome2 = lernome.nextLine();           
                jogador2.setNome(nome2);    
                System.out.println("Olá "+jogador2.getNome()+", bem vindo!");

            }else{
                System.out.println("Olá "+jogador2.getNome()+", bem vindo!");
            };

            System.out.println("Cara ou Coroa?");
            System.out.println("0 - Cara");
            System.out.println("1 - Coroa");
            int palpite = lerpalpite.nextInt();
            jogador2.setPalpite(palpite);

                if(jogador1.getPalpite() == jogador2.getPalpite()){
                    System.out.println(jogador1.getNome() + " Já escolheu essa opcao, escolha a outra");
                }

        }while (jogador2.getPalpite() > 1 || jogador2.getPalpite() < 0 || jogador1.getPalpite() == jogador2.getPalpite());

        System.out.println("Jogando a moeda..");
        Thread.sleep(2000);

        if(numero == jogador1.palpite){
            System.out.println(jogador1.getNome()+" ganhou!!" );
                if(jogador1.palpite == 0){
                    System.out.println("Deu Cara!");
                }else{
                    System.out.println("Deu Coroa!");
                }
        }
        if(numero == jogador2.palpite){
            System.out.println(jogador2.getNome()+" ganhou!!" );
                if(jogador2.palpite == 0){
                    System.out.println("Deu Cara!");
                }else{
                    System.out.println("Deu Coroa!");
                }
        }
        
        


        

        lernome.close();
        lerpalpite.close();
    }
}

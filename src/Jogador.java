public class Jogador {

    String nome;
    int palpite = 0;


    public Jogador(){

        this.nome = "";
        this.palpite = 2;

    }

    public Jogador(String nome, int palpite){

        this.palpite = palpite;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPalpite() {
        return palpite;
    }

    public void setPalpite(int palpite) {
        this.palpite = palpite;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Palpite: "+ this.palpite);
    }
    
}

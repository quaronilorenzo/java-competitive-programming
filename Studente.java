public class Studente {
    public String nome = ""; 
    public String cognome = "";
    public int eta;
    public double mediaVoti;
    
    public Studente(String nome, String cognome, int eta, double mediaVoti){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.mediaVoti = mediaVoti;
    }

    public void stampaInfo(){
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Età: " + eta);
        System.out.println("Media voti: " + mediaVoti);
        System.out.println("--------------------------");
    }
    public static void main(String[] args) {
    }
}

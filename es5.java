public class es5 {
    public static void main(String[] args) {
        Persona persona = new Persona("Marco", 30);

        // Usare i metodi getter
        System.out.println("Nome: " + persona.getNome());
        System.out.println("Età: " + persona.getEta());

        // Usare i metodi setter
        persona.setNome("Luca");
        persona.setEta(25);

        persona.presentati();

        System.out.println("Dopo le modifiche:");
        System.out.println("Nome: " + persona.getNome());
        System.out.println("Età: " + persona.getEta());

        // Tentativo di impostare un'età negativa
        persona.setEta(-5); // Questo non dovrebbe modificare l'età
        System.out.println("Dopo il tentativo di impostare un'età negativa:");
        System.out.println("Età: " + persona.getEta());
    }
}

class Persona {
    private String nome;
    private int eta;

    // Costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter e setter per nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e setter per eta
    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("L'età non può essere negativa.");
        }
    }

    public void presentati() {
        System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni");
    }
}
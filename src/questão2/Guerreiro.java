package questão2;

public class Guerreiro {

    public Guerreiro() {
        this.armadura = false;
        this.arma = false;
    }

    String nome;
    private boolean arma;

    int energia;
    private boolean armadura;

    public boolean isArmadura() {
        return armadura;
    }

    public boolean isArma() {
        return arma;
    }
    
    public void setArma(){
         this.arma = !this.arma;
    }
    public void setArmadura() {
        this.armadura = !this.armadura;
    }

    void mostrarG() {
        System.out.format("Personagem:  (Nome: %s )\n", nome);
    }

    void atacarG(Guerreiro defesa) {
        if (arma && !defesa.armadura) {
            defesa.energia -= 5;
        }
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", arma=" + arma + ", energia=" + energia + ", armadura=" + armadura + '}';
    }

}

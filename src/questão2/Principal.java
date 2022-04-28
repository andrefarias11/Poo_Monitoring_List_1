package questão2;

public class Principal {
    
    public static void main(String[] args) {
        //Guerreiro 1 | Eren | Arma [y] | Energia | Armadura
        //Guerreiro 2 | Reiner | Armadura
        Guerreiro guerreiro1 = new Guerreiro();
        Guerreiro guerreiro2 = new Guerreiro();
        
        guerreiro1.nome = "Eren";
        guerreiro1.energia = 20;
        
        guerreiro2.nome = "Reiner";
        guerreiro2.energia = 20;
        
        guerreiro2.setArmadura();//2 recebe armadura
        
        guerreiro1.atacarG(guerreiro2);//1 ataca 2
        guerreiro2.atacarG(guerreiro1);//2 ataca 1
        
        guerreiro1.setArmadura();// 1 recebe armadura
        guerreiro1.setArma();//1 recebe arma
        guerreiro1.atacarG(guerreiro2);// 1 ataca 2
        guerreiro2.atacarG(guerreiro1);//2 ataca 1
        
        
        
        System.out.println(guerreiro1.toString());//exibir status 1
        System.out.println(guerreiro2.toString());//exibir status 2

//        guerreiro1.mostrarG();;
//        guerreiro2.mostrarG();
//
//        
//        guerreiro1.atacarG(guerreiro2);
//        guerreiro2.atacarG(guerreiro1);
//        guerreiro1.atacarG(guerreiro2);
//        
//        System.out.println(guerreiro2.toString());
//        System.out.println(guerreiro1.toString());
    }
}

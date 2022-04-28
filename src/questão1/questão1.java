package questão1;
import java.util.Scanner;

public class questão1 {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a nota do produto: ");
        int nota= ler.nextInt();
        
        String msg;
        
        switch(nota){
            case 1:msg="Pessimo";break;
            case 2:msg="Ruim";break;
            case 3:msg="Suficiente";break;
            case 4:msg="Bom";break;
            case 5:msg="Exelente";break;
            default :msg="Nota invalida"; break;
        }   
        System.out.println(msg);
    }
}

package koronaukol;
import java.util.Scanner;

public class Pacient {
    
    public void PacientZjisti(){
        Scanner Pacient=new Scanner(System.in);
        
        System.out.println("Zadejte prosím své jméno:");
        String JmenoPacienta=Pacient.nextLine();
        
        System.out.println("Zadejte prosím svůj věk:");
        int VekPacienta=Pacient.nextInt();
        
        System.out.println("Jste tedy "+JmenoPacienta+" a je vám "+VekPacienta+".");
        
        if(VekPacienta>=60){
            System.out.println("Patříte do rizikové skupiny!");
        }
        else{
            System.out.println("Nepatříte do rizikové skupiny.");
        }
        
        
        
        
        
    }
    
}

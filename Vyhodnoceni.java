package koronaukol;
import java.util.Scanner;

public class KoronaVyhodnoceni {
    
    public void KoronaVyhodnoceni(){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Byly jste v zahraničí?");
    String Zahranici=sc.nextLine();
    
    if(Zahranici.equals("ano")){
        System.out.println("Prosím dodržujte domací karanténu");
    }
     else if(Zahranici.equals("Ano")){
        System.out.println("Prosím dodržujte domací karanténu");
    }
    else{
        System.out.println("Děkujeme za zodpovědnost.");
    }
    
    System.out.println("Máte horečku? ano/ne");
    String odpoved1=sc.nextLine();
    
    if (odpoved1.equals("ano")){
        System.out.println("Máte obtíže s dýcháním? ano/ne");
        String odpoved2=sc.nextLine();
        
        if(odpoved2.equals("ano")){
            System.out.println("Máte průjem? ano/ne");
            String odpoved3=sc.nextLine();
            
            if(odpoved3.equals("ano")){
                System.out.println("Máte všechny 3 příznaky, obáváme se že jste nakažený covid19 :(");
            }
            else{
               System.out.println("Máte obtíže s dýcháním? ano/ne");
               String odpoved21=sc.nextLine();
               
               if(odpoved21.equals("ano")){
                   System.out.println("Máte horečku? ano/ne");
                   String odpoved31=sc.nextLine();
                   
                   if(odpoved31.equals("Ano")){
                       
                       
                   }
                   else{
                   System.out.println("Máte dva příznaky ze tří možných, obáváme se že jste nakažený.");    //2 priznaky
                   }
               }
               else{
                   System.out.println("Máte jeden příznak ze třech možných, vyhledejte lékaře.");//1 priznak
                   
                   
               }
            }
        }
        else{
            System.out.println("Máte průjem? ano/ne");
            String odpoved21=sc.nextLine();
            
            if(odpoved21.equals("ano")){
                System.out.println("Máte dva příznaky ze tří možných, obáváme se že jste nakažený.");//2 priznaky
            }
            else{
                System.out.println("Máte jeden příznak ze třech možných, můžete být nemocný proto vyhledejte lékaře.");//1 priznak
                
            }
        }   
    }
    else{
        System.out.println("Máte obtíže s dýcháním? ano/ne");
        String odpoved2=sc.nextLine();
        
        if(odpoved2.equals("ano")){
            System.out.println("Máte průjem? ano/ne");
            String odpoved3=sc.nextLine();
            
            if(odpoved3.equals("ano")){
                System.out.println("Máte dva příznaky ze tří možných, obáváme se že jste nakažený.");
            }
            else{
                System.out.println("Máte jeden příznak ze třech možných, můžete být nemocný proto vyhledejte lékaře.");
            }
        }
        else{
            System.out.println("Máte průjem? ano/ne");
            String odpoved3=sc.nextLine();
            
            if(odpoved3.equals("ano")){
                System.out.println("Máte jeden příznak ze třech možných, můžeze být nemocný proto vyhledejte lékaře.");
            }
            else{
                System.out.println("Nemáte žádný příznak, pravděpodobně jste zdravý"); //3x Ne
            }
        }
    }
   
    
    
    }

}

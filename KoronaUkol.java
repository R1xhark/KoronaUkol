package koronaukol;
import java.util.Scanner;

public class KoronaUkol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner main=new Scanner(System.in);
       Uvod Pozdrav;
       Pozdrav = new Uvod();
       Pozdrav.pozdrav();
       
      System.out.println("Pro test na Covid19 napište /test");
      System.out.println("Pro prevenční informace napiste /prevence");
      System.out.println("Pro informace o softwaru napište /end");
      String Odpoved=main.nextLine();
       
      if(Odpoved.equals("/test")){
          
      
       Pacient Info;
       Info= new Pacient();
       Info.PacientZjisti();
       
       KoronaVyhodnoceni Vyhodnot;
       Vyhodnot= new KoronaVyhodnoceni();
       Vyhodnot.KoronaVyhodnoceni();
       
       Konec Ukonci;
       Ukonci=new Konec();
       Ukonci.getInfo();
       }
      else if(Odpoved.equals("test")){
          
      
       Pacient Info;
       Info= new Pacient();
       Info.PacientZjisti();
       
       KoronaVyhodnoceni Vyhodnot;
       Vyhodnot= new KoronaVyhodnoceni();
       Vyhodnot.KoronaVyhodnoceni();
       
       Konec Ukonci;
       Ukonci=new Konec();
       Ukonci.getInfo();
       }
      else if(Odpoved.equals("Test")){
          
      
       Pacient Info;
       Info= new Pacient();
       Info.PacientZjisti();
       
       KoronaVyhodnoceni Vyhodnot;
       Vyhodnot= new KoronaVyhodnoceni();
       Vyhodnot.KoronaVyhodnoceni();
       
       Konec Ukonci;
       Ukonci=new Konec();
       Ukonci.getInfo();
       }
      else if(Odpoved.equals("/Test")){
          
      
       Pacient Info;
       Info= new Pacient();
       Info.PacientZjisti();
       
       KoronaVyhodnoceni Vyhodnot;
       Vyhodnot= new KoronaVyhodnoceni();
       Vyhodnot.KoronaVyhodnoceni();
       
       Konec Ukonci;
       Ukonci=new Konec();
       Ukonci.getInfo();
       }
      else if(Odpoved.equals("/prevence")){
          Prevence Vypis;
          Vypis=new Prevence();
          Vypis.Prevence();
          
      }
      else if(Odpoved.equals("prevence")){
          Prevence Vypis;
          Vypis=new Prevence();
          Vypis.Prevence();
      }
      else if(Odpoved.equals("Prevence")){
          Prevence Vypis;
          Vypis=new Prevence();
          Vypis.Prevence();
      }
      else if(Odpoved.equals("/Prevence")){
          Prevence Vypis;
          Vypis=new Prevence();
          Vypis.Prevence();
      }
  
      else{
          Konec ElseSkonci;
          ElseSkonci=new Konec();
          ElseSkonci.getInfo();
         
      }
     
       
    }
    
}

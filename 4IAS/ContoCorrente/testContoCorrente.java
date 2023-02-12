import java.util.Scanner;

public class testContoCorrente {
    public static void main(String[] args) throws Exception {
        //#region Inizializzazioni..
        Scanner leggi= new Scanner(System.in);              
        ContoCorrente cc1=null, cc2=null;
        int scelta,codiceconto=0;     
        String owner="";        
        double fido=0;
        String menu=ContoCorrente.menu();

        
        //#endregion

        do {
            System.out.println(menu);// Mostra menù a video            
            System.out.println("-------------------------------------");
            scelta=leggi.nextInt();  
            switch(scelta){//Scelte Menù
                case 0:// Chiudi programma  
                break;  
                case 1:// Crea conto
                    System.out.println("digitare separati dal tasto invio: nome intestatario conto da creare");
                    System.out.println("nome , codiceconto, fido");
                    owner=leggi.next();
                    codiceconto=leggi.nextInt();
                    fido=leggi.nextDouble();
                    cc1 = new ContoCorrente(owner, codiceconto,fido);                                        
                    break;

                case 2:// Crea conto 2
                    System.out.println("digitare separati dal tasto invio: nome intestatario conto da creare");
                    System.out.println("nome , codiceconto, fido");                    
                    owner=leggi.next();                    
                    codiceconto=leggi.nextInt();
                    fido=leggi.nextDouble();
                    cc2 = new ContoCorrente(owner,codiceconto,fido);
                    break;

                case 3:// Deposita
                    System.out.println("digita Codice conto destinatario ");                    
                    double contodigitato=leggi.nextInt();
                    System.out.println("digita importo deposito ");
                    double importodeposito=leggi.nextDouble();  
                    if (contodigitato==cc1.getCodiceconto()) {   
                        try {
                            cc1.deposita(importodeposito);
                        } catch (Exception e) {                            
                            System.out.println(e.getMessage());
                        }                         
                    } else if (contodigitato==cc2.getCodiceconto()){                            
                        try {
                            cc2.deposita(importodeposito);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        } 
                    } 
                    break;

                case 4:// Prelieva
                    System.out.println("digita Codice conto prelievo ");
                    boolean trovatoprelievo=false;
                    double contoprelievo=leggi.nextInt();
                    System.out.println("digita importo prelievo ");
                    double importoprelievo=leggi.nextDouble();
                    
                    if (contoprelievo==cc1.getCodiceconto()) {  
                        try {            
                            cc1.preleva(importoprelievo);
                            System.out.println("eseguito");
                            }     
                        //catch (MyException e) {
                        catch (Exception e) {
                            // TODO: handle exception
                            System.out.println(e.getMessage());
                        }                    
                    } else if (contoprelievo==cc2.getCodiceconto()){
                        try {            
                            cc2.preleva(importoprelievo);
                            System.out.println("eseguito");
                            }   
                        //catch (MyException e) {
                        catch (Exception e) {
                            // TODO: handle exception
                            System.out.println(e.getMessage()); 
                        }  
                    }           
                    break;

                case 5:// Trasferimento
                    System.out.println("digita: ");
                    System.out.println("0 per trasf da cc1 a cc2");
                    System.out.println("1 per trasf da cc2 a cc1");
                    int tipotrasf=leggi.nextInt();
                    System.out.println("digita importo: ");
                    double importo=leggi.nextDouble();
                    
                        if (tipotrasf==0){
                            try {
                                ContoCorrente.trasferisci(cc1, cc2, importo);
                            } catch (Exception e) {
                                // TODO: handle exception
                                System.out.println(e.getMessage());
                            }                       
                        }
                        else if (tipotrasf==1){
                            try {
                                ContoCorrente.trasferisci(cc2, cc1, importo);
                            } catch (Exception e) {
                                // TODO: handle exception
                                System.out.println(e.getMessage());
                            }
                        
                        }                   
                    
                    break;  

                case 6:// Confronta CC
                    if (cc2==null) {
                        System.out.println("creare prima un istanza di CC");
                    } else {
                        System.out.println("Confronto: "); 
                        System.out.println(cc1.equals(cc2));
                    }            
                break;

                case 7:// Copia istanza CC
                    cc2=cc1.copyCC();
                    System.out.println("istanza copia CC creata");
                    break;

                case 8:// Nuova istanza CC
                    cc2= new ContoCorrente();
                    System.out.println("istanza nuovo CC creato");
                    break;

                case 9:// Stato CC
                if (cc2==null){
                    System.out.println("CC1: "+cc1.toString());
                    System.out.println("CC2: non esiste");
                }
                else{
                    System.out.println("CC1: "+cc1.toString());
                    System.out.println("CC2: "+cc2.toString());
                }
                break;

                case 10://Stampa menù
                ContoCorrente.menu();
                break;

                          
                }
                System.out.println("-------------------------------------");
        } while (scelta!=0);
           
    }
    
}

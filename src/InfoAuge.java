/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Diego Muñoz, Luis Ortega, Mauricio Sepúlveda, Claudio Torres
 */
public class InfoAuge {

    /**
     * @param args the command line arguments
     */
    private static GUI1 fondo1;
    private static GUI1_1 fondo1_1;
    private static GUI1_2 fondo1_2;
    private static GUI1_3 fondo1_3;
    private static GUI2 fondo2;
    private static GUI3 fondo3;
    private static GUI4 fondo4;
    private static GUI5 fondo5;
    private static GUI6 fondo6;
    private static GUI7 fondo7;
    private static GUID0 fondoDO;
    private static GUID1 fondoD1;
    
    private static InfoAuge system;

    public InfoAuge() {
        fondo1_1 = new GUI1_1();
        fondo1_2 = new GUI1_2();
        fondo1_3 = new GUI1_3();
        fondo2 = new GUI2();
        fondo3 = new GUI3();
        fondo4 = new GUI4();
        fondo5 = new GUI5();
        fondo6 = new GUI6();
        fondo7 = new GUI7();
        fondoDO = new GUID0();
        fondoD1 = new GUID1();
        
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        fondo1 = new GUI1();
        fondo1.setVisible(true);
        
    }

    public GUI1 getFondo1() {
        return fondo1;
    }
    
    public GUI1_1 getFondo1_1() {
        return fondo1_1;
    }

    public GUI2 getFondo2() {
        return fondo2;
    }

    public GUI3 getFondo3() {
        return fondo3;
    }

    public static InfoAuge getSystem() {
        if(system==null){
            system = new InfoAuge();
            return system;
        }
        else{
            return system;
        }
    }

    public GUI4 getFondo4() {
        return fondo4;
    }
    
    public void esconde(){
        getFondo1().setVisible(false);
        getFondo2().setVisible(false);
        getFondo3().setVisible(false);
        getFondo4().setVisible(false);
        getFondo5().setVisible(false);
        getFondo6().setVisible(false);
        getFondo7().setVisible(false);
       
        getFondo1_1().setVisible(false);
        getFondo1_2().setVisible(false);
        getFondo1_3().setVisible(false);
        
        getFondoDO().setVisible(false);
        getFondoD1().setVisible(false);
        
    }

    public static GUI5 getFondo5() {
        return fondo5;
    }

    public static GUI6 getFondo6() {
        return fondo6;
    }

    public static GUI7 getFondo7() {
        return fondo7;
    }

    public static GUI1_2 getFondo1_2() {
        return fondo1_2;
    }

    public static GUI1_3 getFondo1_3() {
        return fondo1_3;
    }

    public static GUID0 getFondoDO() {
        return fondoDO;
    }

    public static GUID1 getFondoD1() {
        return fondoD1;
    }
    
    
}

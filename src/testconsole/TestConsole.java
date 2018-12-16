/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconsole;

import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Adrian
 */
public class TestConsole {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        
//        int i=0;
//        double resultado=1, numerACalcularRaiz = 20.25;
//        
//       while(i++<5){
//resultado=resultado-((resultado*resultado-numerACalcularRaiz)/(2*resultado));
//
//          
//
//}
//       
//        System.out.println(resultado);
//        
//      
//    }
    public static void tricky(Point arg1, Point arg2) {
        arg1.x = 100;
        arg1.y = 100;
        Point temp = arg1;
        arg1 = arg2;

        arg2 = temp;

    }

    public static void main(String[] args) {

        try {
            /*Properties p = new Properties();
            p.load(new FileReader("MPVSBPP_SET1_IT200_ITV1_NT1_TS3_WT1_VT1_REP1.dat"));
            
            for (Object valor : p.keySet()) {
            System.out.println(valor +" : "+ p.get(valor));
            }*/
            
            
            
            /* ArrayList<ArrayList<Integer>> a = JavaScriptEval.eval("[[1, 7, 3], [5, 4, 9]];");
            
            for (ArrayList<Integer> arrayList : a) {
            for (Integer object : arrayList) {
            System.out.print(object + " ");
            }
            System.out.println("");
            
            }*/
        } catch (Exception ex) {
            Logger.getLogger(TestConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
   
    
}
//    int [] demand = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//
//    
//    for (int i = 0; i < demand.length; i++) {
//        
//        String var= (i+1)+"";
//        
//        if(var.length()<2)var="0"+var;
//         //if(var.length()<3)var="0"+var;
//        
//        System.out.print( ", "+var +" : "+demand[i]);
//    }


/*int var [] [] ={{70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}, {70, 100, 30}}
;
//{(01 , 1) : 5 , (01 , 2) : 7}

for (int i = 0; i < var[0].length; i++) {

String vari= (i+1)+"";
//System.out.print(var1 + " : {");

for (int j = 0; j < var.length; j++) {

String varj= (j+1)+"";
if(varj.length()<2)varj="0"+varj;

int varTem= Integer.parseInt(varj);

System.out.print(", ("+varj+" , "+vari+") : "+var [j][i]);  
}
}

      
}
     

     


}
*/

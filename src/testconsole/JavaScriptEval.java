/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconsole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Adrian
 */
public class JavaScriptEval {
    
    
    
    
    /**
     Ej de valor que recibe: "[[1, 7, 3], [5, 4, 9]];"
     */
    public static ArrayList<ArrayList<Integer>> eval(String arrayPrimitiveSimple){
    
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            
            
            /*String arraySimple = "java.util.Arrays.asList([1, 7, 3, 4])";
           
            Object result = engine.eval(arraySimple);
            
            List<Integer> a = (List<Integer>) result;
            
            for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
            }*/
            
            
            //System.out.println(engine.eval(arrayPrimitiveSimple));
            jdk.nashorn.api.scripting.ScriptObjectMirror  resultInt =  (jdk.nashorn.api.scripting.ScriptObjectMirror) engine.eval(arrayPrimitiveSimple);
            // System.out.println(resultInt.getClass() + " "+resultInt);
            
            //resultInt.values().toArray()
            ArrayList<ArrayList<Object>> lista = new ArrayList<ArrayList<Object>>();
            
            for (int i = 0; i < resultInt.size(); i++) {
                jdk.nashorn.api.scripting.ScriptObjectMirror  filaI = (jdk.nashorn.api.scripting.ScriptObjectMirror) resultInt.get(i);
                
                lista.add(new ArrayList<Object>(filaI.values()));
                
               /* for (int j = 0; j < filaI.size(); j++) {
                    System.out.print(filaI.get(j) + " "+filaI.get(j).getClass());
                }
                System.out.println();*/
            }
            
            ArrayList<ArrayList<Integer>> result=(ArrayList<ArrayList<Integer>>) (Object) lista;
            return result;
            
            
        } catch (ScriptException ex) {
            Logger.getLogger(JavaScriptEval.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
    
    
}

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.longparameterlistdetector;

import AnalyzedProject.BadSmells;
import badsmelldetector.main.BadSmellDetector;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class LongParameterListDetector extends BadSmellDetector  {
     public void detect(CompilationUnit cu, String packageName, String className) {
          LongParameterListVisitor visitor=new LongParameterListVisitor();
              cu.accept(visitor); ArrayList<String> longParameterList=new
              ArrayList<String>();
             longParameterList.addAll(visitor.getLongParameterList());
              for(String method:longParameterList){
                  BadSmells.getLongParameterListBadSmells().add(packageName+"\t"+className+"\t"+method);
            //  System.out.println(packageName+"\t"+className+"\t"+method);
              }
             
   
     }
    
}

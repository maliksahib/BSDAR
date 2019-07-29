/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.switchstatementdetector;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SimpleName;

/**
 *
 * @author MHAWAN
 */
public class SimpleNameVisitor extends ASTVisitor {
    private ArrayList<String> simpleName=new ArrayList<String>();
    
   public String getSimpleName()
   {
       return simpleName.get(0);
   }
   
    public boolean visit(SimpleName node)
    {
        simpleName.add(node.getIdentifier().toString());
      return true;  
    }
    
}

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.switchstatementdetector;

import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

/**
 *
 * @author MHAWAN
 */
public class MethodVisitor extends ASTVisitor {
    private ArrayList<String> smell=new ArrayList<String>();
    
    public boolean visit(MethodDeclaration node)
    {
        SwitchStatementVisitor visitor=new SwitchStatementVisitor();
        node.accept(visitor);
       ArrayList<String> vsmell=visitor.getSwitchStatement();
       for(String s:vsmell)
       {
            getSmell().add( node.getName().getIdentifier().toString()+"\t"+s);
       }
        return true;
    }

    /**
     * @return the smell
     */
    public ArrayList<String> getSmell() {
        return smell;
    }
    
}

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.switchstatementdetector;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SwitchCase;

/**
 *
 * @author MHAWAN
 */
public class SwitchCaseVisitor extends ASTVisitor {
    private int switchcase=0;
    
    public boolean visit(SwitchCase node)
    {
     switchcase++;
        return true;
    }

    /**
     * @return the switchcase
     */
    public int getSwitchcase() {
        return switchcase;
    }
       
}

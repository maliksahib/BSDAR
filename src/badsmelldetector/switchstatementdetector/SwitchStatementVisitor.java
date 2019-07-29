/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.switchstatementdetector;

import AnalyzedProject.BadSmellDetectionCreteria;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.SwitchStatement;

/**
 *
 * @author MHAWAN
 */
public class SwitchStatementVisitor  extends ASTVisitor {
    
    private ArrayList<String> switchStatement=new ArrayList<String>();
    
    public boolean visit(SwitchStatement node)
    {
        SimpleNameVisitor name=new SimpleNameVisitor();
        node.accept(name);
        SwitchCaseVisitor visitor = new SwitchCaseVisitor();
        node.accept(visitor);
       if(visitor.getSwitchcase()>BadSmellDetectionCreteria.getSwitchStatementsBadSmellCreteria())
       {
        switchStatement.add(name.getSimpleName()+"\t"+visitor.getSwitchcase());
           
       }
        return false;
    }

    /**
     * @return the switchStatement
     */
    public ArrayList<String> getSwitchStatement() {
        return switchStatement;
    }
    
     
}

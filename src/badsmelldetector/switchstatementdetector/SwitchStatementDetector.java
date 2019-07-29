/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.switchstatementdetector;

import AnalyzedProject.BadSmells;
import badsmelldetector.main.BadSmellDetector;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class SwitchStatementDetector extends BadSmellDetector {

    public void detect(CompilationUnit cu, String packageName, String className) {
        MethodVisitor visitor = new MethodVisitor();
        cu.accept(visitor);
        ArrayList<String> vsmell = visitor.getSmell();
        for (String s : vsmell) {
            BadSmells.getSwitchStatementBadSmells().add(packageName + "\t" + className + "\t" + s);
        }

    }
}

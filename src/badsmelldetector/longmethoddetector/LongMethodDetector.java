/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.longmethoddetector;

import AnalyzedProject.BadSmells;
import badsmelldetector.main.BadSmellDetector;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class LongMethodDetector extends BadSmellDetector {

    public void detect(CompilationUnit cu, String packageName, String className) {
        LongMethodBadSmellVisitor visitor = new LongMethodBadSmellVisitor();
        cu.accept(visitor);
        if (visitor.getSmell() != null) {
            ArrayList<String> smells = visitor.getSmells();
            for (String smell : smells) {
                
                BadSmells.getLongMethodBadSmells().add(packageName + "\t" + className + "\t" + smell);
//                System.out.println(packageName + "\t" + className + "\t" + smell);
            }
        }
    }
}
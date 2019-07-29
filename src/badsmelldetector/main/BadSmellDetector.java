/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.main;

import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public abstract class BadSmellDetector {
     public abstract void detect(CompilationUnit cu, String packageName, String className);
    
}

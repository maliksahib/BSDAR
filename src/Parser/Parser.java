/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Parser;

import java.io.File;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public abstract class Parser {
    public abstract CompilationUnit parse(File file);
    
}

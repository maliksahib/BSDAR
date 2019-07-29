/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package Parser;

import java.io.File;
import java.util.Map;
import java.util.Scanner;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class ParserWithComments extends Parser {

    
    
    @Override
    public CompilationUnit parse(File file) {
        ASTParser parser=ASTParser.newParser(AST.JLS4);
        parser.setSource(readJavaFile(file));
     Map options = JavaCore.getOptions();
 JavaCore.setComplianceOptions(JavaCore.VERSION_1_7, options);
 parser.setCompilerOptions(options);
        CompilationUnit cu=(CompilationUnit) parser.createAST(null);
        return cu;
    }
    private char[] readJavaFile(File file)
    {
        char[] result=null;
        try
        {
            Scanner scanner=new Scanner(file);
           String data="";
           while(scanner.hasNext())
           {
               String nextLine=scanner.nextLine();
                   data+=nextLine;            
           }
           result=data.toCharArray();
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        return result;
    }
}

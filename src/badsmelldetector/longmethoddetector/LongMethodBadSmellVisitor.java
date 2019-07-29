/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.longmethoddetector;

import AnalyzedProject.BadSmellDetectionCreteria;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

/**
 *
 * @author MHAWAN
 */
public class LongMethodBadSmellVisitor extends ASTVisitor {

    private int numberOfStatements;
    private String smell;
    private ArrayList<String> smells = new ArrayList<String>();

    /**
     * @return the smell
     */
    public String getSmell() {
        return smell;
    }

    public boolean visit(MethodDeclaration node) {
        String[] methodBlockBody = null;
        try {
            methodBlockBody = node.getBody().toString().split("\n");
            setNumberOfStatements(methodBlockBody.length - 2);
            if (getNumberOfStatements() > BadSmellDetectionCreteria.getLongMethodBadSmellCreteria()) {
                smell = getMethodNameAndParameters(node) + "" + "\t" + getNumberOfStatements();
                getSmells().add(smell);
            }
        } catch (Exception e) {
        }
        return true;
    }

    /**
     * @return the smells
     */
    public ArrayList<String> getSmells() {
        return smells;
    }

    private String getMethodNameAndParameters(MethodDeclaration node) {
        String fullExpression = null;
        String[] lines = node.toString().split("\n");
        for (String line : lines) {
            if (line.contains(node.getName().toString()) && !line.startsWith("/") && line.contains("(") && line.contains(")")) {
                int startIndex = line.indexOf("(") + 1;
                int lastIndex = line.lastIndexOf(")");
                //   int lastIndex=line.indexOf(")",startIndex);
                String parameterExpression = line.substring(startIndex - 1, lastIndex + 1);
                // longParameterList.add((methodName+this.parameterExpression+":"+node.getReturnType2().toString()).toString());
                String returnType = "";
                try {
                    returnType = node.getReturnType2().toString();
                } catch (Exception e) {
                    returnType = "No return type";
                }
                fullExpression = node.getName().toString() + parameterExpression + ":" + returnType;
                break;
            }
        }
        return fullExpression;
    }

    /**
     * @return the numberOfStatements
     */
    private int getNumberOfStatements() {
        return numberOfStatements;
    }

    /**
     * @param numberOfStatements the numberOfStatements to set
     */
    private void setNumberOfStatements(int numberOfStatements) {
        this.numberOfStatements = numberOfStatements;
    }
}

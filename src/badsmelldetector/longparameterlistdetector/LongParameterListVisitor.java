/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package badsmelldetector.longparameterlistdetector;

import AnalyzedProject.BadSmellDetectionCreteria;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

/**
 *
 * @author MHAWAN
 */
public class LongParameterListVisitor extends ASTVisitor {

    private ArrayList<String> longParameterList = new ArrayList<String>();
    private int numberOfParameter = 0;
    private String methodName = new String();
    private String methodBody;
    private String parameterExpression;

    /**
     * 
     * @return
     */
    public ArrayList<String> getLongParameterList() {
        return longParameterList;
    }

    /**
     * 
     * @param node
     * @return
     */
    public boolean visit(MethodDeclaration node) {

        setNumberOfParameter(node.parameters().size());
        setMethodName(node.getName().toString());
        longMethodParameterCheck(node);
        return true;
    }

    private void longMethodParameterCheck(MethodDeclaration node) {
        if (this.getNumberOfParameter() > BadSmellDetectionCreteria.getLongParameterListBadSmellCreteria()) {
            setMethodBody(node.toString());
            String[] lines = getMethodBody().split("\n");
            for (String line : lines) {
                if (line.contains(getMethodName()) && !line.startsWith("/") && line.contains("(") && line.contains(")")) {
                    int startIndex = line.indexOf("(") + 1;
                    int lastIndex = line.lastIndexOf(")");
                    //   int lastIndex=line.indexOf(")",startIndex);
                    setParameterExpression(line.substring(startIndex - 1, lastIndex + 1));
                    // longParameterList.add((methodName+this.parameterExpression+":"+node.getReturnType2().toString()).toString());
                    String returnType = "";
                    try {
                        returnType = node.getReturnType2().toString();
                    } catch (Exception e) {
                        returnType = "No return type";
                    }
                    longParameterList.add(getMethodName() + this.getParameterExpression() + ":" + returnType+"\t"+getNumberOfParameter());
                    break;
                }

            }
        }
    }

    /**
     * @return the numberOfParameter
     */
    public int getNumberOfParameter() {
        return numberOfParameter;
    }

    /**
     * @param numberOfParameter the numberOfParameter to set
     */
    public void setNumberOfParameter(int numberOfParameter) {
        this.numberOfParameter = numberOfParameter;
    }

    /**
     * @return the methodName
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * @return the methodBody
     */
    public String getMethodBody() {
        return methodBody;
    }

    /**
     * @return the parameterExpression
     */
    public String getParameterExpression() {
        return parameterExpression;
    }

    /**
     * @param parameterExpression the parameterExpression to set
     */
    public void setParameterExpression(String parameterExpression) {
        this.parameterExpression = parameterExpression;
    }

    /**
     * @param methodBody the methodBody to set
     */
    private void setMethodBody(String methodBody) {
        this.methodBody = methodBody;
    }

    /**
     * @param methodName the methodName to set
     */
    private void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}

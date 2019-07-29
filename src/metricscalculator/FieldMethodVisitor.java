/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package metricscalculator;

import AnalyzedProject.Metrics;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 *
 * @author MHAWAN
 */
public class FieldMethodVisitor extends ASTVisitor {

    public boolean visit(TypeDeclaration type) {
        fieldCounter(type);
        methodCounter(type);
        checkTypes(type);
        return true;
    }

    private void fieldCounter(TypeDeclaration type) {
        FieldDeclaration[] fields = type.getFields();
        Metrics.setNumberOfFields(Metrics.getNumberOfFields() + fields.length);
        for (FieldDeclaration field : fields) {
            //System.out.println(method.modifiers().toString());
            if (field.modifiers().toString().contains("static")) {
                Metrics.setNumberOfstaticFields(Metrics.getNumberOfstaticFields() + 1);
            }
        }

    }

    private void methodCounter(TypeDeclaration type) {
        MethodDeclaration[] methods = type.getMethods();
        Metrics.setNumberOfMethods(Metrics.getNumberOfMethods() + methods.length);
        for (MethodDeclaration method : methods) {
            //System.out.println(method.modifiers().toString());
            if (method.modifiers().toString().contains("static")) {
                Metrics.setNumberOfstaticMethods(Metrics.getNumberOfstaticMethods() + 1);
            }

        }

    }

    public void checkTypes(TypeDeclaration node) {
        TypeDeclaration[] types = node.getTypes();
        for (TypeDeclaration type : types) {
            FieldMethodVisitor visitor = new FieldMethodVisitor();
            type.accept(visitor);
        }


    }
}
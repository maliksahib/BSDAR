/*
 *
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package metricscalculator;

import AnalyzedProject.Metrics;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 *
 * @author MHAWAN
 */
public class TypeVisitorForMetricsCalculations extends ASTVisitor {

    @Override
    public boolean visit(TypeDeclaration node) {
        if (node.isInterface()) {
            Metrics.setNumberOfInterfaces(Metrics.getNumberOfInterfaces() + 1);
        } else {
            Metrics.setNumberOfClasses(Metrics.getNumberOfClasses() + 1);
        }
        if (node.isMemberTypeDeclaration()) {
            Metrics.setNumberOfMemberTypes(Metrics.getNumberOfMemberTypes() + 1);
            if (node.isInterface()) {
                Metrics.setNumberOfMemberInterfaces(Metrics.getNumberOfMemberInterfaces() + 1);
            } else {
                Metrics.setNumberOfMemberClasses(Metrics.getNumberOfMemberClasses() + 1);
            }
        }
        if (node.isPackageMemberTypeDeclaration()) {
            if (node.isInterface()) {
                Metrics.setNumberOfTopLevelInterfaces(Metrics.getNumberOfTopLevelInterfaces() + 1);
            } else {
                Metrics.setNumberOfTopLevelClasses(Metrics.getNumberOfTopLevelClasses() + 1);
            }
        }
        if (node.isLocalTypeDeclaration()) {
            if (node.isInterface()) {
                Metrics.setNumberOfLocalInterfaces(Metrics.getNumberOfLocalInterfaces() + 1);
            } else {
                Metrics.setNumberOfLocalClasses(Metrics.getNumberOfLocalClasses() + 1);
            }
        }
        checkMemberTypes(node);
        return true;
    }

    public void checkMemberTypes(TypeDeclaration node) {
        TypeDeclaration[] types = node.getTypes();
        for (TypeDeclaration type : types) {
            TypeVisitorForMetricsCalculations visitor = new TypeVisitorForMetricsCalculations();
            type.accept(visitor);
        }
    }
}

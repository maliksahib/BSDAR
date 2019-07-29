/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package metricscalculator;

import AnalyzedProject.Project;
import javax.swing.JOptionPane;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class ClassInterfaceMethodFieldAndMembersMC extends MetricsCalculator {

    private CompilationUnit cu;

    public ClassInterfaceMethodFieldAndMembersMC(CompilationUnit cu) {
        this.cu = cu;

    }


    @Override
    public void calculate() {
        TypeVisitorForMetricsCalculations typeVisitor1=new TypeVisitorForMetricsCalculations();
       cu.accept(typeVisitor1);
   //    FieldMethodVisitor fmVisitor=new FieldMethodVisitor();
     // cu.accept(fmVisitor);
    }
}

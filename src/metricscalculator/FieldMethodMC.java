/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package metricscalculator;

import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class FieldMethodMC extends MetricsCalculator {
    
    CompilationUnit cu;
    
    public FieldMethodMC(CompilationUnit cu)
    {
     this.cu=cu;
    }

    @Override
    public void calculate() {
        FieldMethodVisitor visitor=new FieldMethodVisitor();
        cu.accept(visitor);
    }
    
    
}

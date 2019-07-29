/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package metricscalculator;

import AnalyzedProject.Metrics;
import AnalyzedProject.Project;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MHAWAN
 */
public class NumberOfPackagesMC extends MetricsCalculator {

    @Override
    public void calculate() {
        Metrics.setNumberOfPackages(Project.getProjectJavaPackagesPath().size());
    }
}

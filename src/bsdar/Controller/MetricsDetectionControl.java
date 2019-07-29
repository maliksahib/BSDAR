/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package bsdar.Controller;

import AnalyzedProject.Metrics;
import AnalyzedProject.Project;
import Parser.Parser;
import Parser.ParserWithComments;
import badsmelldetector.main.BSDARController;
import java.io.File;
import java.util.ArrayList;
import metricscalculator.ClassInterfaceMethodFieldAndMembersMC;
import metricscalculator.FieldMethodMC;
import metricscalculator.NumberOfPackagesMC;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class MetricsDetectionControl extends BSDARController {

    private String name;
    private String className;
    private String packageName;
    private Parser parser;
    private CompilationUnit cu;

    public void control() {
        ArrayList<File> files = Project.getProjectJavaFilesPath();
        for (File file : files) {
            // System.out.println(file.getName());
            name = file.getAbsolutePath();
            name = name.replace(".java", "");
            name = name.substring(name.lastIndexOf("src") + 4);
            name = name.replace("\\", ".");
            int pointIndex = name.lastIndexOf(".") + 1;
            className = name.substring(pointIndex);
            packageName = name.substring(0, pointIndex - 1);
            //    System.out.println(name)
            parser = new ParserWithComments();
            cu = parser.parse(file);
            if (true) {
                detectMetrics();

            }
        }
        new NumberOfPackagesMC().calculate();
        System.out.println("NUmber of Classes" + Metrics.getNumberOfClasses());
        System.out.println("NUmber of Interfaces" + Metrics.getNumberOfInterfaces());
        System.out.println("NUmber of Top Level Classes" + Metrics.getNumberOfTopLevelClasses());
        System.out.println("NUmber of Member Classes" + Metrics.getNumberOfMemberClasses());
        System.out.println("NUmber of local classes" + Metrics.getNumberOfLocalClasses());
        System.out.println("NUmber of Static Methods" + Metrics.getNumberOfstaticMethods());
        System.out.println("NUmber of Methods" + Metrics.getNumberOfMethods());
        System.out.println("NUmber of Static Fields" + Metrics.getNumberOfstaticFields());
        System.out.println("NUmber of Fields" + Metrics.getNumberOfFields());
    }

    public void detectMetrics() {
        ClassInterfaceMethodFieldAndMembersMC detector1 = new ClassInterfaceMethodFieldAndMembersMC(cu);
        detector1.calculate();
        FieldMethodMC detector2 = new FieldMethodMC(cu);
        detector2.calculate();

    }
}

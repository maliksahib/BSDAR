/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package bsdar.Controller;

import AnalyzedProject.DetectionFlag;
import AnalyzedProject.Project;
import Parser.Parser;
import Parser.ParserWithComments;
import badsmelldetector.longmethoddetector.LongMethodDetector;
import badsmelldetector.longparameterlistdetector.LongParameterListDetector;
import badsmelldetector.main.BSDARController;
import badsmelldetector.switchstatementdetector.SwitchStatementDetector;
import java.io.File;
import java.util.ArrayList;
import org.eclipse.jdt.core.dom.CompilationUnit;

/**
 *
 * @author MHAWAN
 */
public class BadSmellDetectionControl extends BSDARController {

    private String name;
    private String className;
    private String packageName;
    private Parser parser;
    private CompilationUnit cu;

    /**
     * 
     */
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
            if (DetectionFlag.isLongMethodFlag()) {
                detectLongMethodBadSmell();
            }
            if(DetectionFlag.isLongParameterListFlag()){
                detectLongParameterListBadSmell();
            }
            if(DetectionFlag.isSwitchStatementFlag()){
                detectSwitchStatementBadSmell();
            }
        }

    }

    private void detectLongMethodBadSmell() {
        LongMethodDetector longMethodDetector = new LongMethodDetector();
        longMethodDetector.detect(cu, packageName, className);
    }
    private void detectLongParameterListBadSmell() {
        LongParameterListDetector longParameterListDetector = new LongParameterListDetector();
        longParameterListDetector.detect(cu, packageName, className);
    }

    private void detectSwitchStatementBadSmell() {
        SwitchStatementDetector detector=new SwitchStatementDetector();
        detector.detect(cu, packageName, className);
        
    }
}

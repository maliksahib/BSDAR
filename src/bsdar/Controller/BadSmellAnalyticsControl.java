/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package bsdar.Controller;

import AnalyzedProject.DetectionFlag;
import badsmelldetector.main.BSDARController;

/**
 *
 * @author MHAWAN
 */
public class BadSmellAnalyticsControl extends BSDARController{
private boolean mFlag=false;
private boolean bFlag=false;
    
    public void control() {
        setFlags();
        setBadSmellControl();
        setMetricsControl();
        while(!(mFlag==true && bFlag==true));
        

    }

    private void setFlags() {
        if (DetectionFlag.isLongMethodAnalyticsFlag()) {
            DetectionFlag.setLongMethodFlag(true);
        } else if (DetectionFlag.isLongParameterListAnalyticsFlag()) {
            DetectionFlag.setLongParameterListFlag(true);
        }

    }

    private void setBadSmellControl() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                new BadSmellDetectionControl().control();
                bFlag=true;
            }
            
        }).start();
    }

    private void setMetricsControl() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                new MetricsDetectionControl().control();
                mFlag=true;
            }
        }).start();
    }
}

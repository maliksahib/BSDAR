/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package AnalyzedProject;

/**
 *
 * @author MHAWAN
 */
public class BadSmellDetectionCreteria {
    private static int longMethodBadSmellCreteria=10;
 private static int longParameterListBadSmellCreteria=3;
  private static int switchStatementsBadSmellCreteria=3;

    /**
     * @return the longMethodBadSmellCreteria
     */
    public static int getLongMethodBadSmellCreteria() {
        return longMethodBadSmellCreteria;
    }

    /**
     * @param aLongMethodBadSmellCreteria the longMethodBadSmellCreteria to set
     */
    public static void setLongMethodBadSmellCreteria(int aLongMethodBadSmellCreteria) {
        longMethodBadSmellCreteria = aLongMethodBadSmellCreteria;
    }

    /**
     * @return the longParameterListBadSmellCreteria
     */
    public static int getLongParameterListBadSmellCreteria() {
        return longParameterListBadSmellCreteria;
    }

    /**
     * @param aLongParameterListBadSmellCreteria the longParameterListBadSmellCreteria to set
     */
    public static void setLongParameterListBadSmellCreteria(int aLongParameterListBadSmellCreteria) {
        longParameterListBadSmellCreteria = aLongParameterListBadSmellCreteria;
    }

    /**
     * @return the switchStatementsBadSmellCreteria
     */
    public static int getSwitchStatementsBadSmellCreteria() {
        return switchStatementsBadSmellCreteria;
    }

    /**
     * @param aSwitchStatementsBadSmellCreteria the switchStatementsBadSmellCreteria to set
     */
    public static void setSwitchStatementsBadSmellCreteria(int aSwitchStatementsBadSmellCreteria) {
        switchStatementsBadSmellCreteria = aSwitchStatementsBadSmellCreteria;
    }
    
    
}

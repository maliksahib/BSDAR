/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package AnalyzedProject;

import java.util.ArrayList;

/**
 *
 * @author MHAWAN
 */
public class BadSmells {

    private static ArrayList<String> longMethodBadSmells = new ArrayList<String>();
     private static ArrayList<String> longParameterListBadSmells = new ArrayList<String>();
      private static ArrayList<String> switchStatementBadSmells = new ArrayList<String>();

    /**
     * @param aLongMethodBadSmells the longMethodBadSmells to set
     */
    public static void setLongMethodBadSmells(ArrayList<String> aLongMethodBadSmells) {
        setLongMethodBadSmells(aLongMethodBadSmells);
    }

    /**
     * @return the longMethodBadSmells
     */
    public static ArrayList<String> getLongMethodBadSmells() {
        return longMethodBadSmells;
    }

    /**
     * @return the longParameterListBadSmells
     */
    public static ArrayList<String> getLongParameterListBadSmells() {
        return longParameterListBadSmells;
    }

    /**
     * @param aLongParameterListBadSmells the longParameterListBadSmells to set
     */
    public static void setLongParameterListBadSmells(ArrayList<String> aLongParameterListBadSmells) {
        longParameterListBadSmells = aLongParameterListBadSmells;
    }
   public static void setSmellsEmpty()
   {
   longMethodBadSmells = new ArrayList<String>();
   longParameterListBadSmells = new ArrayList<String>();
   switchStatementBadSmells=new ArrayList<String>();
   }

    /**
     * @return the switchStatementBadSmells
     */
    public static ArrayList<String> getSwitchStatementBadSmells() {
        return switchStatementBadSmells;
    }

    /**
     * @param aSwitchStatementBadSmells the switchStatementBadSmells to set
     */
    public static void setSwitchStatementBadSmells(ArrayList<String> aSwitchStatementBadSmells) {
        switchStatementBadSmells = aSwitchStatementBadSmells;
    }
}

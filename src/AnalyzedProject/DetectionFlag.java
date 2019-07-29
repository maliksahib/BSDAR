/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package AnalyzedProject;

/**
 *
 * @author MHAWAN
 */
public class DetectionFlag {

    private static boolean longMethodFlag = false;
    private static boolean longParameterListFlag = false;
    private static boolean switchStatementFlag = false;
    private static boolean numberOfPackagesflag = false;
    private static boolean numberOfClassesflag = false;
    private static boolean numberOfInterfacesflag = false;
    private static boolean numberOfFieldsflag = false;
    private static boolean numberOfMethodFlag = false;
    private static boolean numberOfStaticFieldsFlag = false;
    private static boolean numberOfStaticMethodsFlag = false;
    private static boolean numberOfMemberClassesFlag = false;
    private static boolean numberOfLocalClassesFlag = false;
    private static boolean numberOfTopLevelClassesFlag = false;
    private static boolean longMethodAnalyticsFlag = false;
    private static boolean longParameterListAnalyticsFlag = false;

    public static void setDetectionFlagsFalse() {
        setLongMethodFlag(false);
        setLongParameterListFlag(false);
        setSwitchStatementFlag(false);
        DetectionFlag.setNumberOfFieldsflag(false);
        DetectionFlag.setNumberOfLocalClassesFlag(false);
        DetectionFlag.setNumberOfMemberClassesFlag(false);
        DetectionFlag.setNumberOfMethodFlag(false);
        DetectionFlag.setNumberOfStaticFieldsFlag(false);
        DetectionFlag.setNumberOfStaticMethodsFlag(false);
        DetectionFlag.setNumberOfClassesflag(false);
        DetectionFlag.setNumberOfPackagesflag(false);
        DetectionFlag.setNumberOfInterfacesflag(false);
        DetectionFlag.setNumberOfTopLevelClassesFlag(false);
        longParameterListAnalyticsFlag = false;
        longMethodAnalyticsFlag = false;

    }

    /**
     * @return the longMethodFlag
     */
    public static boolean isLongMethodFlag() {
        return longMethodFlag;
    }

    /**
     * @param longMethodFlag the longMethodFlag to set
     */
    public static void setLongMethodFlag(boolean aLongMethodFlag) {
        longMethodFlag = aLongMethodFlag;
    }

    /**
     * @return the longParameterListFlag
     */
    public static boolean isLongParameterListFlag() {
        return longParameterListFlag;
    }

    /**
     * @param longParameterListFlag the longParameterListFlag to set
     */
    public static void setLongParameterListFlag(boolean aLongParameterList) {
        longParameterListFlag = aLongParameterList;
    }

    /**
     * @return the numberOfFieldsflag
     */
    public static boolean isNumberOfFieldsflag() {
        return numberOfFieldsflag;
    }

    /**
     * @param aNumberOfFieldsflag the numberOfFieldsflag to set
     */
    public static void setNumberOfFieldsflag(boolean aNumberOfFieldsflag) {
        numberOfFieldsflag = aNumberOfFieldsflag;
    }

    /**
     * @return the numberOfMethodFlag
     */
    public static boolean isNumberOfMethodFlag() {
        return numberOfMethodFlag;
    }

    /**
     * @param aNumberOfMethodFlag the numberOfMethodFlag to set
     */
    public static void setNumberOfMethodFlag(boolean aNumberOfMethodFlag) {
        numberOfMethodFlag = aNumberOfMethodFlag;
    }

    /**
     * @return the numberOfStaticFieldsFlag
     */
    public static boolean isNumberOfStaticFieldsFlag() {
        return numberOfStaticFieldsFlag;
    }

    /**
     * @param aNumberOfStaticFieldsFlag the numberOfStaticFieldsFlag to set
     */
    public static void setNumberOfStaticFieldsFlag(boolean aNumberOfStaticFieldsFlag) {
        numberOfStaticFieldsFlag = aNumberOfStaticFieldsFlag;
    }

    /**
     * @return the numberOfStaticMethodsFlag
     */
    public static boolean isNumberOfStaticMethodsFlag() {
        return numberOfStaticMethodsFlag;
    }

    /**
     * @param aNumberOfStaticMethodsFlag the numberOfStaticMethodsFlag to set
     */
    public static void setNumberOfStaticMethodsFlag(boolean aNumberOfStaticMethodsFlag) {
        numberOfStaticMethodsFlag = aNumberOfStaticMethodsFlag;
    }

    /**
     * @return the numberOfMemberClassesFlag
     */
    public static boolean isNumberOfMemberClassesFlag() {
        return numberOfMemberClassesFlag;
    }

    /**
     * @param aNumberOfMemberClassesFlag the numberOfMemberClassesFlag to set
     */
    public static void setNumberOfMemberClassesFlag(boolean aNumberOfMemberClassesFlag) {
        numberOfMemberClassesFlag = aNumberOfMemberClassesFlag;
    }

    /**
     * @return the numberOfLocalClassesFlag
     */
    public static boolean isNumberOfLocalClassesFlag() {
        return numberOfLocalClassesFlag;
    }

    /**
     * @param aNumberOfLocalClassesFlag the numberOfLocalClassesFlag to set
     */
    public static void setNumberOfLocalClassesFlag(boolean aNumberOfLocalClassesFlag) {
        numberOfLocalClassesFlag = aNumberOfLocalClassesFlag;
    }

    /**
     * @return the numberOfTopLevelClassesFlag
     */
    public static boolean isNumberOfTopLevelClassesFlag() {
        return numberOfTopLevelClassesFlag;
    }

    /**
     * @param aNumberOfTopLevelClassesFlag the numberOfTopLevelClassesFlag to set
     */
    public static void setNumberOfTopLevelClassesFlag(boolean aNumberOfTopLevelClassesFlag) {
        numberOfTopLevelClassesFlag = aNumberOfTopLevelClassesFlag;
    }

    /**
     * @return the numberOfPackagesflag
     */
    public static boolean isNumberOfPackagesflag() {
        return numberOfPackagesflag;
    }

    /**
     * @param aNumberOfPackagesflag the numberOfPackagesflag to set
     */
    public static void setNumberOfPackagesflag(boolean aNumberOfPackagesflag) {
        numberOfPackagesflag = aNumberOfPackagesflag;
    }

    /**
     * @return the numberOfClassesflag
     */
    public static boolean isNumberOfClassesflag() {
        return numberOfClassesflag;
    }

    /**
     * @param aNumberOfClassesflag the numberOfClassesflag to set
     */
    public static void setNumberOfClassesflag(boolean aNumberOfClassesflag) {
        numberOfClassesflag = aNumberOfClassesflag;
    }

    /**
     * @return the numberOfInterfacesflag
     */
    public static boolean isNumberOfInterfacesflag() {
        return numberOfInterfacesflag;
    }

    /**
     * @param aNumberOfInterfacesflag the numberOfInterfacesflag to set
     */
    public static void setNumberOfInterfacesflag(boolean aNumberOfInterfacesflag) {
        numberOfInterfacesflag = aNumberOfInterfacesflag;
    }

    /**
     * @return the switchStatementFlag
     */
    public static boolean isSwitchStatementFlag() {
        return switchStatementFlag;
    }

    /**
     * @param aSwitchStatementFlag the switchStatementFlag to set
     */
    public static void setSwitchStatementFlag(boolean aSwitchStatementFlag) {
        switchStatementFlag = aSwitchStatementFlag;
    }

    /**
     * @return the longMethodAnalyticsFlag
     */
    public static boolean isLongMethodAnalyticsFlag() {
        return longMethodAnalyticsFlag;
    }

    /**
     * @param aLongMethodAnalyticsFlag the longMethodAnalyticsFlag to set
     */
    public static void setLongMethodAnalyticsFlag(boolean aLongMethodAnalyticsFlag) {
        longMethodAnalyticsFlag = aLongMethodAnalyticsFlag;
    }

    /**
     * @return the longParameterListAnalyticsFlag
     */
    public static boolean isLongParameterListAnalyticsFlag() {
        return longParameterListAnalyticsFlag;
    }

    /**
     * @param aLongParameterListAnalyticsFlag the longParameterListAnalyticsFlag to set
     */
    public static void setLongParameterListAnalyticsFlag(boolean aLongParameterListAnalyticsFlag) {
        longParameterListAnalyticsFlag = aLongParameterListAnalyticsFlag;
    }
}

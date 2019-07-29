/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package AnalyzedProject;

/**
 *
 * @author MHAWAN
 */
public class Metrics {

    private static int numberOfPackages = 0;
    private static int numberOfClasses = 0;
    private static int numberOfInterfaces = 0;
    private static int numberOfMethods = 0;
    private static int numberOfFields = 0;
    private static int numberOfMemberTypes = 0;
    private static int numberOfMemberClasses = 0;
    private static int numberOfMemberInterfaces = 0;
    private static int numberOfTopLevelClasses = 0;
    private static int numberOfTopLevelInterfaces = 0;
    private static int numberOfLocalClasses = 0;
    private static int numberOfLocalInterfaces = 0;
    private static int numberOfstaticMethods = 0;
    private static int numberOfstaticFields = 0;

    /**
     * @return the numberOfPackages
     */
    public static int getNumberOfPackages() {
        return numberOfPackages;
    }

    /**
     * @param aNumberOfPackages the numberOfPackages to set
     */
    public static void setNumberOfPackages(int aNumberOfPackages) {
        numberOfPackages = aNumberOfPackages;
    }

    /**
     * @return the numberOfClasses
     */
    public static int getNumberOfClasses() {
        return numberOfClasses;
    }

    /**
     * @param aNumberOfClasses the numberOfClasses to set
     */
    public static void setNumberOfClasses(int aNumberOfClasses) {
        numberOfClasses = aNumberOfClasses;
    }

    /**
     * @return the numberOfInterfaces
     */
    public static int getNumberOfInterfaces() {
        return numberOfInterfaces;
    }

    /**
     * @param aNumberOfInterfaces the numberOfInterfaces to set
     */
    public static void setNumberOfInterfaces(int aNumberOfInterfaces) {
        numberOfInterfaces = aNumberOfInterfaces;
    }

    /**
     * @return the numberOfMethods
     */
    public static int getNumberOfMethods() {
        return numberOfMethods;
    }

    /**
     * @param aNumberOfMethods the numberOfMethods to set
     */
    public static void setNumberOfMethods(int aNumberOfMethods) {
        numberOfMethods = aNumberOfMethods;
    }

    public static void setProjectMetricsEmpty() {
        numberOfPackages = 0;
        numberOfClasses = 0;
        numberOfInterfaces = 0;
        numberOfMethods = 0;
        numberOfFields = 0;
        numberOfMemberTypes = 0;
        numberOfMemberClasses = 0;
        numberOfMemberInterfaces = 0;
        setNumberOfTopLevelClasses(0);
        setNumberOfTopLevelInterfaces(0);
        setNumberOfLocalClasses(0);
        setNumberOfLocalInterfaces(0);
        numberOfstaticMethods = 0;
        numberOfstaticFields = 0;
    }

    /**
     * @return the numberOfFields
     */
    public static int getNumberOfFields() {
        return numberOfFields;
    }

    /**
     * @param aNumberOfFields the numberOfFields to set
     */
    public static void setNumberOfFields(int aNumberOfFields) {
        numberOfFields = aNumberOfFields;
    }

    /**
     * @return the numberOfMemberTypes
     */
    public static int getNumberOfMemberTypes() {
        return numberOfMemberTypes;
    }

    /**
     * @param aNumberOfMemberTypes the numberOfMemberTypes to set
     */
    public static void setNumberOfMemberTypes(int aNumberOfMemberTypes) {
        numberOfMemberTypes = aNumberOfMemberTypes;
    }

    /**
     * @return the numberOfMemberClasses
     */
    public static int getNumberOfMemberClasses() {
        return numberOfMemberClasses;
    }

    /**
     * @param aNumberOfMemberClasses the numberOfMemberClasses to set
     */
    public static void setNumberOfMemberClasses(int aNumberOfMemberClasses) {
        numberOfMemberClasses = aNumberOfMemberClasses;
    }

    /**
     * @return the numberOfMemberInterfaces
     */
    public static int getNumberOfMemberInterfaces() {
        return numberOfMemberInterfaces;
    }

    /**
     * @param aNumberOfMemberInterfaces the numberOfMemberInterfaces to set
     */
    public static void setNumberOfMemberInterfaces(int aNumberOfMemberInterfaces) {
        numberOfMemberInterfaces = aNumberOfMemberInterfaces;
    }

    /**
     * @return the numberOfTopLevelClasses
     */
    public static int getNumberOfTopLevelClasses() {
        return numberOfTopLevelClasses;
    }

    /**
     * @param aNumberOfTopLevelClasses the numberOfTopLevelClasses to set
     */
    public static void setNumberOfTopLevelClasses(int aNumberOfTopLevelClasses) {
        numberOfTopLevelClasses = aNumberOfTopLevelClasses;
    }

    /**
     * @return the numberOfTopLevelInterfaces
     */
    public static int getNumberOfTopLevelInterfaces() {
        return numberOfTopLevelInterfaces;
    }

    /**
     * @param aNumberOfTopLevelInterfaces the numberOfTopLevelInterfaces to set
     */
    public static void setNumberOfTopLevelInterfaces(int aNumberOfTopLevelInterfaces) {
        numberOfTopLevelInterfaces = aNumberOfTopLevelInterfaces;
    }

    /**
     * @return the numberOfLocalClasses
     */
    public static int getNumberOfLocalClasses() {
        return numberOfLocalClasses;
    }

    /**
     * @param aNumberOfLocalClasses the numberOfLocalClasses to set
     */
    public static void setNumberOfLocalClasses(int aNumberOfLocalClasses) {
        numberOfLocalClasses = aNumberOfLocalClasses;
    }

    /**
     * @return the numberOfLocalInterfaces
     */
    public static int getNumberOfLocalInterfaces() {
        return numberOfLocalInterfaces;
    }

    /**
     * @param aNumberOfLocalInterfaces the numberOfLocalInterfaces to set
     */
    public static void setNumberOfLocalInterfaces(int aNumberOfLocalInterfaces) {
        numberOfLocalInterfaces = aNumberOfLocalInterfaces;
    }

    /**
     * @return the numberOfstaticMethods
     */
    public static int getNumberOfstaticMethods() {
        return numberOfstaticMethods;
    }

    /**
     * @param aNumberOfstaticMethods the numberOfstaticMethods to set
     */
    public static void setNumberOfstaticMethods(int aNumberOfstaticMethods) {
        numberOfstaticMethods = aNumberOfstaticMethods;
    }

    /**
     * @return the numberOfstaticFields
     */
    public static int getNumberOfstaticFields() {
        return numberOfstaticFields;
    }

    /**
     * @param aNumberOfstaticFields the numberOfstaticFields to set
     */
    public static void setNumberOfstaticFields(int aNumberOfstaticFields) {
        numberOfstaticFields = aNumberOfstaticFields;
    }
}

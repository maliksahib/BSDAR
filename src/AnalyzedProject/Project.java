/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package AnalyzedProject;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Project {

    private static ArrayList<File> projectJavaFilesPath = new ArrayList<File>();
    private static ArrayList<File> projectJavaPackagesPath = new ArrayList<File>();
    private static String projectPath;
    private static String projectSourceFolderPath;
    private static String projectName=null;

    /**
     * @return the projectJavaFilesPath
     */
    public static ArrayList<File> getProjectJavaFilesPath() {
        return projectJavaFilesPath;
    }

    /**
     * @param aProjectJavaFilesPath the projectJavaFilesPath to set
     */
    public static void setProjectJavaFilesPath(ArrayList<File> aProjectJavaFilesPath) {
        projectJavaFilesPath = aProjectJavaFilesPath;
    }

    /**
     * @return the projectPath
     */
    public static String getProjectPath() {
        return projectPath;
    }

    /**
     * @param aProjectPath the projectPath to set
     */
    public static void setProjectPath(String aProjectPath) {
        projectPath = aProjectPath.replace("\\", "/");
    }

    /**
     * @return the projectJavaPackagesPath
     */
    public static ArrayList<File> getProjectJavaPackagesPath() {
        return projectJavaPackagesPath;
    }

    /**
     * @param aProjectJavaPackagesPath the projectJavaPackagesPath to set
     */
    public static void setProjectJavaPackagesPath(ArrayList<File> aProjectJavaPackagesPath) {
        projectJavaPackagesPath = aProjectJavaPackagesPath;
    }

    /**
     * @return the projectSourceFolderPath
     */
    public static String getProjectSourceFolderPath() {
        return projectSourceFolderPath;
    }

    /**
     * @param projectSourceFolderPath the projectSourceFolderPath to set
     */
    public static void setProjectSourceFolderPath(String aprojectSourceFolderPath) {
        projectSourceFolderPath = aprojectSourceFolderPath;
    }

    /**
     * @return the projectName
     */
    public static String getProjectName() {
        return projectName;
    }

    /**
     * @param aProjectName the projectName to set
     */
    public static void setProjectName(String aProjectName) {
        projectName = aProjectName;
    }

    public static void setProjectEmpty() {
        projectJavaFilesPath = new ArrayList<File>();
        projectJavaPackagesPath = new ArrayList<File>();
        projectPath = null;
        projectSourceFolderPath = null;
        projectName = null;
    }
}

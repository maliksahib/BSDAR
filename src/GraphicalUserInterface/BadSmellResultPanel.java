/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package GraphicalUserInterface;

import AnalyzedProject.BadSmells;
import AnalyzedProject.DetectionFlag;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

/**
 *
 * @author MHAWAN
 */
public class BadSmellResultPanel extends javax.swing.JPanel {

    /**
     * Creates new form BadSmellResultPanel
     */
    public BadSmellResultPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToolBar1.setRollover(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Refactoring Suggesation:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Apply the “Extract Method” refactoring technique to get rid of “Long Method” bad smell.\nPreprocessing is needed if the new method has a long parameter list after applying\n the “Extract Method” refactoring technique. The occurrence of long parameter list\n is due to the presence of temporary variables. Use “Replace Temp with Query” refactoring\n technique to eliminate temporary variables. The long parameter list can be made short\n by using “Introduce Parameter Object” or “Replace Method with Method Object.”");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.add(jPanel1);

        jTabbedPane1.addTab("Long Method Bad Smell", jToolBar1);

        jToolBar2.setRollover(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Refactoring suggestions :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("To remove “Long Parameter List” bad smell, following two ways can be used:\n•\tIf the parameters are replaceable by generating a call to an existing object, use\n\t“Replace Parameter with Method.”\n•\tIf the parameter list lacks a common logical object, use “Introduce Parameter Object”\n\n");
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 783, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar2.add(jPanel2);

        jTabbedPane1.addTab("Long Parameter List Bad Smell", jToolBar2);

        jToolBar3.setRollover(true);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Refactoring Suggesations:");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Polymorphism should be used for the removal of switch case bad smell. This can be achieved by\n creating an inheritance structure. Use the “Extract Method” refactoring technique to extract each \nswitch case into individual methods and then apply “Move Method” technique to move each one of the\n methods into respective classes. Apply “Replace Type Code with Subclasses” technique to achieve\n inheritance. After doing this, apply “Replace Conditional with Polymorphism”.");
        jScrollPane6.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane6)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );

        jToolBar3.add(jPanel3);

        jTabbedPane1.addTab("Switch Statement Bad Smell", jToolBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables

    public void setBadSmellTabs() {
        if (DetectionFlag.isLongMethodFlag()) {
            jToolBar1.setVisible(true);
         //   jTabbedPane1.getTabComponentAt(0).setVisible(true);
            //JOptionPane.showMessageDialog(jTextArea2, "1");
        } else {
           // jTabbedPane1.getTabComponentAt(0).setVisible(false);
            jToolBar1.setVisible(false);
            // JOptionPane.showMessageDialog(jTextArea2, "2");
        }
        if (DetectionFlag.isLongParameterListFlag()) {
            jToolBar2.setVisible(true);
            // JOptionPane.showMessageDialog(jTextArea2, "3");
        } else {
            jToolBar2.hide();
            jToolBar2.setVisible(false);
            //       JOptionPane.showMessageDialog(jTextArea2, "4");
        }
        if (DetectionFlag.isSwitchStatementFlag()) {
            jToolBar3.setVisible(true);
            // JOptionPane.showMessageDialog(jTextArea2, "3");
        } else {
            jToolBar3.hide();
            jToolBar3.setVisible(false);
            //       JOptionPane.showMessageDialog(jTextArea2, "4");
        }
    }

    public void setBadSmellResultTable() {
        if (DetectionFlag.isLongMethodFlag()) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    setLongMethodResultTable();
                }
            });

        }
        if (DetectionFlag.isLongParameterListFlag()) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    setLongParameterListResultTable();
                }
            });

        }
        if (DetectionFlag.isSwitchStatementFlag()) {
            SwingUtilities.invokeLater(new Runnable() {

                public void run() {
                    setSwitchStatementResultTable();
                }
            });

        }
    }

    private void setLongMethodResultTable() {
        ArrayList<String> longMethodSmell = BadSmells.getLongMethodBadSmells();
        String[][] longMethods = new String[longMethodSmell.size()][4];
        int counter = 0;
        for (String smell : longMethodSmell) {

            longMethods[counter] = smell.split("\t");
            //   System.out.println(longMethods[counter][0]+"\t\t"+longMethods[counter][1]+"\t\t"+longMethods[counter][2]+"\t\t"+longMethods[counter][3]);
            counter++;
        }
        String[] tableHeader = {"Package Name", "Class Name", "Method Name", "Number Of Lines"};
        TableModel model = new TableModel(longMethods, tableHeader);
        jTable1.setModel(model);

    }

    private void setLongParameterListResultTable() {
        ArrayList<String> longParameterListSmell = BadSmells.getLongParameterListBadSmells();
        String[][] longParameterList = new String[longParameterListSmell.size()][4];
        int counter = 0;
        for (String smell : longParameterListSmell) {
            //  System.out.println(smell);
            longParameterList[counter] = smell.split("\t");
            counter++;
        }
        String[] tableHeader = {"Package Name", "Class Name", "Method Name", "Number Of Parameters"};
        TableModel model1 = new TableModel(longParameterList, tableHeader);
        jTable2.setModel(model1);
        model1.fireTableStructureChanged();
        model1.fireTableDataChanged();
    }

    private void setSwitchStatementResultTable() {
        ArrayList<String> switchStatementSmells = BadSmells.getSwitchStatementBadSmells();
        String[][] switchStatementSmell = new String[switchStatementSmells.size()][5];
        int counter = 0;
        for (String smell : switchStatementSmells) {
            System.out.println(smell);
            switchStatementSmell[counter] = smell.split("\t");
            //  System.out.println(longMethods[counter][0]+"\t\t"+longMethods[counter][1]+"\t\t"+longMethods[counter][2]+"\t\t"+longMethods[counter][3]);
            counter++;
        }
        String[] tableHeader = {"Package Name", "Class Name", "Method Name", "Switch Statement", "Switch Case No"};
        TableModel model1 = new TableModel(switchStatementSmell, tableHeader);
        jTable3.setModel(model1);
        model1.fireTableStructureChanged();
        model1.fireTableDataChanged();

    }
}
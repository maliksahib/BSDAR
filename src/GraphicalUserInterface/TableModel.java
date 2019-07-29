/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package GraphicalUserInterface;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MHAWAN
 */
public class TableModel extends AbstractTableModel{
    
    private String[][] data;
    private String[] columnNames;

    public TableModel(String[][] data,String[] columnNames)
    {
        this.data=data;
        this.columnNames=columnNames;
    }
    
    @Override
    public int getRowCount() {
         return data.length;
    }

    @Override
    public int getColumnCount() {
      return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
  return data[rowIndex][columnIndex];
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }


}

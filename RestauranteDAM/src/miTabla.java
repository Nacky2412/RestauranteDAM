import javax.swing.table.AbstractTableModel;

public class miTabla extends AbstractTableModel {
	private String[][] rows;
	private String[] columns;
	
	public miTabla(String[][] _r, String[] _c) {
		columns = _c;
		rows = _r;
	}
	
    public boolean isCellEditable(int row, int column){  
        return false;  
    }

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
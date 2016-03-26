package com.polymorphic_row;

import java.util.List;
import java.util.ArrayList;

public class Row {
	private List<AbstractColumnValue> columns = new ArrayList<AbstractColumnValue>();

	public List<AbstractColumnValue> getColumns() {
		return this.columns;
	}

	public void addColumn(AbstractColumnValue value) {
		this.columns.add(value);
	}
}

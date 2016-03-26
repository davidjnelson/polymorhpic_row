package com.polymorphic_row;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
		Row row = new Row();
		row.addColumn(new DateColumnValue(new Date()));
		row.addColumn(new IntegerColumnValue(100));
		row.addColumn(new StringColumnValue("Hello Parametric and Inheritance Polymorphic World!"));

		for(AbstractColumnValue column : row.getColumns()) {
			System.out.println(column.getValue());
		}
    }
}

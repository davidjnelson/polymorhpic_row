# polymorphic_row

A simple example in java of how to use both parameteric and inheritance polymorphism in a list to model something like an excel spreadsheet with arbitrary types.

## Example

`
		Row row = new Row();
		row.addColumn(new DateColumnValue(new Date()));
		row.addColumn(new IntegerColumnValue(100));
		row.addColumn(new StringColumnValue("Hello Parametric and Inheritance Polymorphic World!"));

		for(AbstractColumnValue column : row.getColumns()) {
			System.out.println(column.getValue());
		}
`

package com.polymorphic_row;

abstract class AbstractColumnValue<T> {
	private T value;

	protected AbstractColumnValue(T value) {
		this.value = value;
	}

	protected T getValue() {
		return this.value;
	}
}

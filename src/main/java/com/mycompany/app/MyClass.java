package com.mycompany.app;

public class MyClass<T> {

	private T val;

	public void aff(){
		System.out.println(val);
	}
	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}
}

package factory;


import pack.Packing;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
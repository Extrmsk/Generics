package com.lemanov.generics;

public class ShippingOrder<K, V> {
	
	private K k;
	private V v;
	
	public ShippingOrder (K key, V value) {
		this.k = key;
		this.v = value;
	}

}

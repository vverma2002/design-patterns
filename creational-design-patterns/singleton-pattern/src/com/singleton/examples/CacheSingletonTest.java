package com.singleton.examples;

class CacheSingletonTest {
	public static void main(String[] args) {
		CacheSingleton cs = CacheSingleton.getInstance();
		cs.setObject("key1", "Value1");
		System.out.println(cs.getObject("key1"));
	}
}
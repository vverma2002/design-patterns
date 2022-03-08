package com.singleton.examples;

class Client {
	public static void main(String[] args) {

		// CacheSingleton cs1 = new CacheSingleton();
		// System.out.println(cs1);
		// CacheSingleton cs2 = new CacheSingleton();
		// System.out.println(cs2);

		// new
		CacheSingleton cs1 = CacheSingleton.getInstance();
		System.out.println(cs1);
		CacheSingleton cs2 = CacheSingleton.getInstance();
		System.out.println(cs2);

		cs1.setObject("key1", "Value1");
		System.out.println(cs1.getObject("key1"));
	}
}
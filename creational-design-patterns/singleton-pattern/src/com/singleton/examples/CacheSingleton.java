package com.singleton.examples;

import java.util.HashMap;
import java.util.Map;

public class CacheSingleton {

	/////////////// Makes this class as singleton ////////////////
	private CacheSingleton() {
	}

	private static class CacheSingletonHelper {
		private static final CacheSingleton INSTANCE = new CacheSingleton();
	}

	public static CacheSingleton getInstance() {
		return CacheSingletonHelper.INSTANCE;
	}
	///////////////////////////////////////////////////

	private final Map<String, Object> map = new HashMap<>();

	public void setObject(String key, Object object) {
		map.put(key, object);
	}

	public Object getObject(String key) {
		return map.get(key);
	}

}

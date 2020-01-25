package com.jiayee.singleton.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * A singleton manager / registry. Unexplored: Load predetermined list of classes so that we do not
 * need to call getInstance on every individual singleton by ourselves in Main.
 */
public class SingletonRegistry {
  private static Map<Class, Singleton> singletons = new LinkedHashMap<>();

  static void register(final Singleton singleton) {
    singletons.put(singleton.getClass(), singleton);
  }

  public static Optional<Singleton> lookup(final Class clazz) {
    return Optional.ofNullable(singletons.getOrDefault(clazz, null));
  }
}

package com.jiayee.behavioralpatterns.iterator;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MySimpleMap<K, V> implements MyAbstractMap<K, V> {
  private final Map<K, V> map = new HashMap<>();

  @Override
  public void put(final K key, final V value) {
    map.put(key, value);
  }

  @Override
  public V get(K key) {
    return map.getOrDefault(key, null);
  }

  @Override
  public Entry<K, V> entry(K key) {
    return new AbstractMap.SimpleEntry<>(key, get(key));
  }

  @Override
  public List<K> keys() {
    return null;
  }

  @Override
  public List<V> values() {
    return null;
  }
}

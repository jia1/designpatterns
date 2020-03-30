package com.jiayee.behavioralpatterns.iterator;

import java.util.List;
import java.util.Map.Entry;

public interface MyAbstractMap<K, V> {
  void put(final K key, final V value);

  V get(final K key);

  Entry<K, V> entry(final K key);

  List<K> keys();

  List<V> values();
}

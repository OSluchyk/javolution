/*
 * Javolution - Java(TM) Solution for Real-Time and Embedded Systems
 * Copyright (C) 2012 - Javolution (http://javolution.org/)
 * All rights reserved.
 * 
 * Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 */
package org.javolution.util.internal.map;

import org.javolution.util.AbstractMap;
import org.javolution.util.AbstractSet;
import org.javolution.util.function.Equality;
import org.javolution.util.function.Order;

/**
 * An unmodifiable view over a map.
 */
public final class UnmodifiableMapImpl<K, V> extends AbstractMap<K, V> {

    private static final long serialVersionUID = 0x700L; // Version.
    private static final String ERROR_MSG = "Unmodifiable View.";
    private final AbstractMap<K, V> inner;

    public UnmodifiableMapImpl(AbstractMap<K, V> inner) {
        this.inner = inner;
    }

    @Override
    public AbstractSet<Entry<K, V>> entrySet() {
        return inner.entrySet().unmodifiable();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException(ERROR_MSG);
    }

    @Override
    public Entry<K, V> getEntry(K key) {
        return inner.getEntry(key);
    }

    @Override
    public Entry<K, V> removeEntry(K key) {
        throw new UnsupportedOperationException(ERROR_MSG);
    }

    @Override
    public Order<? super K> keyOrder() {
        return inner.keyOrder();
    }

    @Override
    public Equality<? super V> valuesEquality() {
        return inner.valuesEquality();
    }

    @Override
    public V updateValue(Entry<K, V> entry, V newValue) {
        throw new UnsupportedOperationException(ERROR_MSG);
    }

    @Override
    public V put(K key, V value) {
        throw new UnsupportedOperationException(ERROR_MSG);
    }

}

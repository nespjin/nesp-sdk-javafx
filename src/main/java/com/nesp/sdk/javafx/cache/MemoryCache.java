package com.nesp.sdk.javafx.cache;

import java.util.*;

/**
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2021/11/13 下午12:41
 * Description:
 **/
public final class MemoryCache implements Cache {

    private final Map<String, Object> mDataMap;

    public MemoryCache() {
        mDataMap = new WeakHashMap<>();
    }

    @Override
    public void putBoolean(final String key, final boolean value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putByte(final String key, final byte value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putShort(final String key, final short value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putInt(final String key, final int value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putLong(final String key, final long value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putFloat(final String key, final float value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putDouble(final String key, final double value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putString(final String key, final String value) {
        mDataMap.put(key, value);
    }

    @Override
    public void putStringSet(final String key, final Set<String> value) {
        mDataMap.put(key, value);
    }

    @Override
    public Boolean getBoolean(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Boolean) {
            return (Boolean) value;
        } else {
            return null;
        }
    }

    @Override
    public Byte getByte(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Byte) {
            return (Byte) value;
        } else {
            return null;
        }
    }

    @Override
    public Short getShort(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Short) {
            return (Short) value;
        } else {
            return null;
        }
    }

    @Override
    public Integer getInt(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Integer) {
            return (Integer) value;
        } else {
            return null;
        }
    }

    @Override
    public Long getLong(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Long) {
            return (Long) value;
        } else {
            return null;
        }
    }

    @Override
    public Float getFloat(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Float) {
            return (Float) value;
        } else {
            return null;
        }
    }

    @Override
    public Double getDouble(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Double) {
            return (Double) value;
        } else {
            return null;
        }
    }

    @Override
    public String getString(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof String) {
            return (String) value;
        } else {
            return null;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public Set<String> getStringSet(final String key) {
        final Object value = mDataMap.getOrDefault(key, null);
        if (value instanceof Set) {
            return (Set<String>) value;
        } else {
            return null;
        }
    }

    @Override
    public Map<String, Object> getAll() {
        return mDataMap;
    }

    @Override
    public boolean remove(final String key) {
        return mDataMap.remove(key) != null;
    }

    @Override
    public boolean contains(final String key) {
        return mDataMap.containsKey(key);
    }

    @Override
    public Set<String> keys() {
        return mDataMap.keySet();
    }

    @Override
    public List<Object> values() {
        return Collections.singletonList(mDataMap.values());
    }
}

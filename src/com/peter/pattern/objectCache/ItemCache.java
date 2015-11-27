package com.peter.pattern.objectCache;

import java.util.Vector;

public class ItemCache {
    private final static int Max_cache_size = 5;
    Vector cacheVector;

    public ItemCache() {
        cacheVector = new Vector();
    }

    public String getItem(String code) {
        String barCode = null;
        int pos = cacheVector.indexOf(code);
        if (pos != -1)
            barCode = (String) cacheVector.get(pos);
        return barCode;
    }

    public void addItem(String code) {
        // if the max limit is reached
        // remove the LRU item
        if (cacheVector.size() == Max_cache_size) {
            cacheVector.remove(0);
        }
        cacheVector.add(code);
    }
}

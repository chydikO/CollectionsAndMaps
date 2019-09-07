package ua.com.foxminded.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import ua.com.foxminded.util.CollectionUtil;

public class MapsModel implements ModelInterface {

    private Map<Integer, Integer> map;
    private int capacity;

    private long startTime;
    private long stopTime;
    private long elapsedTimeAdd;
    private long elapsedTimeByKey;
    private long elapsedTimeRemoving;

    private final static Random RANDOM = new Random();

    public MapsModel(Map<Integer, Integer> map, int capacity) {
        if (map.getClass() == HashMap.class) {
            this.map = new HashMap<Integer, Integer>();
            this.capacity = capacity;
        } else if (map.getClass() == TreeMap.class) {
            this.map = new TreeMap<Integer, Integer>();
            this.capacity = capacity;
        }
        fillCollections();
        adding();
        searchByKey();
        removing();
    }

    @Override
    public void fillCollections() {
        for (int i = 0; i < capacity; i++) {
            map.put(new Integer(i), CollectionUtil.randomValue(this.capacity));
        }
        //map.putAll(hashMap);
    }

    private void adding() {
        startTime = System.nanoTime();
        map.put(map.size() + 1, NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeAdd = elapsedTimeCalculate();
    }

    private void searchByKey() {
        startTime = System.nanoTime();
        map.get(NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeByKey = elapsedTimeCalculate();
    }

    private void removing() {
        startTime = System.nanoTime();
        map.remove(NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeRemoving = elapsedTimeCalculate();
    }

    private long elapsedTimeCalculate() {
        //to convert to milliseconds we must divide the result in nanoseconds by 1.000.000.
        return stopTime - startTime;
    }

    public long getElapsedTimeAdd() {
        return elapsedTimeAdd;
    }

    public long getElapsedTimeByKey() {
        return elapsedTimeByKey;
    }

    public long getElapsedTimeRemoving() {
        return elapsedTimeRemoving;
    }
}

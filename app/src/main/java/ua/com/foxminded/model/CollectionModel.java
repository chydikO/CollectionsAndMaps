package ua.com.foxminded.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.Getter;
import lombok.Setter;
import ua.com.foxminded.util.CollectionUtil;

/**
 * Collections (ArrayList, LinkedList, CopyOnWriteArrayList):
 *  * Input: number of element to compare. I would recommend (1’000’000 - 10’000’000)
 *  * Output: grid with 8x3=24 cell (time in milliseconds):
 *  * Adding in the beginning;
 *  * Adding in the middle;
 *  * Adding in the end;
 *  * Search by value;
 *  * Removing in the beginning;
 *  * Removing in the middle;
 *  * Removing in the end.
 */

@Getter
@Setter

public class CollectionModel implements ModelInterface {

    private List<Integer> collection;
    private Integer capacity;

    private Long startTime;
    private Long stopTime;

    private Long elapsedTimeAddingInTheBeginning;
    private Long elapsedTimeAddingInTheMiddle;
    private Long elapsedTimeAddingInTheEnd;
    private Long elapsedTimeSearchByValue;
    private Long elapsedTimeRemovingInTheBeginning;
    private Long elapsedTimeRemovingInTheMiddle;
    private Long elapsedTimeRemovingInTheEnd;


    public CollectionModel(List<Integer> object, Integer capacity) {
        this.capacity = capacity;
        if (object instanceof ArrayList) {
            this.collection = (ArrayList<Integer>)object;
        } else if (object instanceof LinkedList) {
            this.collection = (LinkedList<Integer>)object;
        } else if (object instanceof CopyOnWriteArrayList) {
            this.collection = (CopyOnWriteArrayList<Integer>)object;
        }
    }

    void run() {
        //TODO если коллекция заполнена - не заполнять ее
        if (this.collection.isEmpty()) {
            fillCollections();
        }
        addingInTheBeginning();
        addingInTheMiddle();
        addingInTheEnd();
        searchByValue();
        removingInTheBeginning();
        removingInTheMiddle();
        removingInTheEnd();
        //collection = null;
    }

    @Override
    public void fillCollections() {
        if (collection.isEmpty()) {
            for (int i = 0; i < capacity; i++) {
                collection.add(CollectionUtil.randomValue(this.capacity));
            }
        }
        //map.putAll(hashMap);
    }

    private Long elapsedTimeCalculate() {
        return stopTime - startTime;
    }

    private void addingInTheBeginning() {
        startTime = System.nanoTime();
        collection.add( 0, NUMBER_FOR_OPERATION);//.add( 0, NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeAddingInTheBeginning = elapsedTimeCalculate();
    }

    private void addingInTheMiddle() {
        startTime = System.nanoTime();
        collection.add(this.collection.size()/2 , NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeAddingInTheMiddle = elapsedTimeCalculate();
    }

    private void addingInTheEnd() {
        startTime = System.nanoTime();
        collection.add(this.collection.size() , NUMBER_FOR_OPERATION);
        stopTime = System.nanoTime();
        elapsedTimeAddingInTheEnd = elapsedTimeCalculate();
    }

    private void searchByValue() {
        startTime = System.nanoTime();
        for (Integer value: collection) {
            if (value.equals(NUMBER_FOR_OPERATION)) {
                stopTime = System.nanoTime();
            }
        }
        elapsedTimeSearchByValue = elapsedTimeCalculate();
    }

    private void removingInTheBeginning() {
        startTime = System.nanoTime();
        collection.remove(0);
        stopTime = System.nanoTime();
        elapsedTimeRemovingInTheBeginning = elapsedTimeCalculate();
    }

    private void removingInTheMiddle() {
        startTime = System.nanoTime();
        collection.remove(this.collection.size() / 2 - 1);
        stopTime = System.nanoTime();
        elapsedTimeRemovingInTheMiddle = elapsedTimeCalculate();
    }

    private void removingInTheEnd() {
        startTime = System.nanoTime();
        collection.remove(this.collection.size() - 1);
        stopTime = System.nanoTime();
        elapsedTimeRemovingInTheEnd = elapsedTimeCalculate();
    }
}

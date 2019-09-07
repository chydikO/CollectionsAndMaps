package ua.com.foxminded;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import ua.com.foxminded.contener.ModelContainer;
import ua.com.foxminded.model.MapsModel;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void ModelTest() {
        int capacity = 10_000_000;

        ArrayList<ModelContainer> list = new ArrayList<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>(capacity);
        MapsModel mapsModel1 = new MapsModel(hashMap, capacity);

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        MapsModel mapsModel2 = new MapsModel(treeMap, capacity);

        ModelContainer modelContainer1 = new ModelContainer(mapsModel1);
        ModelContainer modelContainer2 = new ModelContainer(mapsModel2);

        mapsModel1.getElapsedTimeAdd();
        mapsModel2.getElapsedTimeAdd();

        mapsModel1.getElapsedTimeByKey();
        mapsModel2.getElapsedTimeByKey();

        mapsModel1.getElapsedTimeRemoving();
        mapsModel2.getElapsedTimeRemoving();


        list.add(modelContainer1);
        list.add(modelContainer2);

        System.out.println((list.get(0).getModelContainer()).getClass());

        System.out.printf("fef");
/*

       CollectionModel[] collectionModels = new CollectionModel[3];
        //(ArrayList, LinkedList, CopyOnWriteArrayList)
        ArrayList<Integer> arrayList = new ArrayList<>();
        CollectionModel collectionModel1 = new CollectionModel(arrayList, capacity);
        collectionModel1.run();
        collectionModels[0] = collectionModel1;
        System.out.println("collectionModel1");

        LinkedList<Integer> linkedList = new LinkedList<>();
        CollectionModel collectionModel2 = new CollectionModel(linkedList, capacity);
        collectionModel2.run();
        collectionModels[1] = collectionModel2;
        System.out.println("collectionModel2");

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(collectionModel1.getCollection());
        CollectionModel collectionModel3 = new CollectionModel(copyOnWriteArrayList, copyOnWriteArrayList.size());
        collectionModel3.run();
        collectionModels[2] = collectionModel3;
        System.out.println("collectionModel3");
        */
        System.out.printf("fef");

    }
}
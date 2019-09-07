package ua.com.foxminded.util;

import java.util.Random;

public class CollectionUtil {
    private final static Random RANDOM = new Random();

    public static Integer randomValue(Integer capacity) {
        return Integer.valueOf(RANDOM.nextInt(((capacity - 1) + 1) + 1));
    }
}

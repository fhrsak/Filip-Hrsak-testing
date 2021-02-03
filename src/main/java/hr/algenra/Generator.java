package hr.algenra;

import java.util.Random;

public class Generator {

    private static Random instance = null;
    private Generator()
    {

    }

    public static Random getInstance() {
        if (instance == null) {
            instance = new Random();
        }
        return instance;
    }
}

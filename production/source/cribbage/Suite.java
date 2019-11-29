package cribbage;

import java.util.HashMap;
import java.util.Map;

public enum Suite {
    HEART("H"), DIAMONDS("D"), CLUBS("C"), SPADES("S");

    private static class Mapping {
        static Map<String, Suite> SUITE_MAP = new HashMap<>();
    }

    private Suite(String character) {
        Suite.Mapping.SUITE_MAP.put(character, this);
    }

    public static Suite findSuite (String character) {
        Suite suite= Mapping.SUITE_MAP.get(character);
        /*if(suite == null) {
            throw new IllegalStateException(String.format("Unsupported type %s.", character));
        }*/
        return suite;
    }
}

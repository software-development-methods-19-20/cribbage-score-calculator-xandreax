package cribbage;

import java.util.HashMap;
import java.util.Map;

public enum Rank {
    ACE("A"), ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"),
    SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("0"), JACK("J"),
    QUEEN("Q"), KING("K");

    private static class Mapping {
        static Map<String, Rank> RANK_MAP = new HashMap<>();
    }

    private Rank(String character) {
        Mapping.RANK_MAP.put(character, this);
    }

    public static Rank findRank(String character) {
        Rank rank = Mapping.RANK_MAP.get(character);
        /*if(rank == null) {
            throw new IllegalStateException(String.format("Unsupported type %s.", character));
        }*/
        return rank;
    }
}
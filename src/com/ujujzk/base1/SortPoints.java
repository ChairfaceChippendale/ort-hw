package com.ujujzk.base1;


import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class SortPoints {

    public static void main(String[] args) {

        Collection<Point> points = makePopulatedPointList (100);

        Collections.sort((List) points);
        printCollection (points);

    }

    private static void printCollection(Collection collection) {
        for (Object e : collection) {
            System.out.println(e);
        }
    }

    private static Collection<Point> makePopulatedPointList(int count) {
        Random r = new Random();

        Collection<Point> points = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            points.add(new Point(r.nextInt(100), r.nextInt(100)));
        }
        return points;
    }

}

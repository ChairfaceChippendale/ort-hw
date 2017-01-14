package com.ujujzk.base1;


public class Point implements Comparable{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getSum () {
        return x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ";" + y + ")" ;
    }

    @Override
    public int compareTo(Object o) {
        Point other = (Point) o;
        if (other.getSum() > this.getSum()) {
            return -1;
        } else if (other.getSum() < this.getSum()){
            return 1;
        } else {
            return 0;
        }
    }
}

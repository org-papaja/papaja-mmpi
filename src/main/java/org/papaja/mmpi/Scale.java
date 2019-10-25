package org.papaja.mmpi;

abstract public class Scale {

    protected int[] divisions = new int[]{};
    protected int   start     = 0;

    public int getHigh() {
        return divisions.length;
    }

}

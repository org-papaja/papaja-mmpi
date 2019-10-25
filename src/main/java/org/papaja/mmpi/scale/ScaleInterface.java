package org.papaja.mmpi.scale;

public interface ScaleInterface {

    default int getRatio(int steps) {
        return 0;
    }

}

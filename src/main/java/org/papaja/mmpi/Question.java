package org.papaja.mmpi;

import org.papaja.mmpi.scale.Scale;

public class Question {

    private int   number;
    private Scale scale;

    public Question(int number, Scale scale) {
        this.number = number;
        this.scale = scale;
    }

}

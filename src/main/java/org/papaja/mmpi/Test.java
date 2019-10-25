package org.papaja.mmpi;

import org.papaja.mmpi.scale.Scale;

public class Test {

    public static void main(String[] args) {
//        System.out.println(Scale.SCALE_1.getRatio(4));
//        System.out.println(Scale.SCALE_2.getRatio(6));

        Answers answers = new Answers();

        answers.increase(Scale.SCALE_1);
        answers.increase(Scale.SCALE_1);
        answers.increase(Scale.SCALE_1);

        System.out.println(answers.getRate(Scale.SCALE_1));
    }

}

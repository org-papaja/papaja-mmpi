package org.papaja.mmpi.scale;

import org.papaja.mmpi.Sex;

import java.util.EnumMap;

public enum Scale {

    SCALE_A(new EnumMap<Sex, int[]>(Sex.class) {{
        put(Sex.M, new int[] {2, 3, 2, 2, 3});
        put(Sex.F, new int[] {2, 3, 2, 2, 3});
    }}),


    SCALE_L(new int[] {2, 3, 2, 2, 3}),
    SCALE_F(new int[] {2, 3, 2, 2, 3}),
    SCALE_K(new int[] {2, 3, 2, 2, 3}),
    SCALE_0(new int[] {2, 3, 2, 2, 3}),
    SCALE_1(new int[] {2, 3, 2, 2, 3}),
    SCALE_2(new int[] {2, 2, 2, 2, 2, 4, 3, 1}),
    SCALE_3(new int[] {2, 3, 2, 2, 3}),
    SCALE_4(new int[] {2, 3, 2, 2, 3}),
    SCALE_5(new int[] {2, 3, 2, 2, 3}),
    SCALE_6(new int[] {2, 3, 2, 2, 3}),
    SCALE_7(new int[] {2, 3, 2, 2, 3}),
    SCALE_8(new int[] {2, 3, 2, 2, 3}),
    SCALE_9(new int[] {2, 3, 2, 2, 3});

    protected int[] ratio;

    Scale(EnumMap<Sex, int[]> map) {

    }

//    Scale(int[] ratio) {
//        this.ratio = ratio;
//    }

    public int getRatio(int steps) {
        int ratio = 0;

        for (int i = 0; i < steps; i++) {
            ratio += this.ratio[i];
        }

        return ratio;
    }

}

package com.github.mikephil.charting.data;

import vlp;

public class BarEntry extends Entry {
    public float[] a;
    public vlp[] b;
    public float c;
    public float d;

    public BarEntry(float f, float[] arr_f) {
        float f2;
        float f1 = 0.0f;
        for(int v1 = 0; v1 < arr_f.length; ++v1) {
            f1 += arr_f[v1];
        }
        super(f, f1);
        this.a = arr_f;
        if(arr_f == null) {
            this.c = 0.0f;
            this.d = 0.0f;
            f2 = 0.0f;
        }
        else {
            f2 = 0.0f;
            float f3 = 0.0f;
            for(int v2 = 0; v2 < arr_f.length; ++v2) {
                float f4 = arr_f[v2];
                if((f4 <= 0.0f)) {
                    f2 += Math.abs(f4);
                }
                else {
                    f3 += f4;
                }
            }
            this.c = f2;
            this.d = f3;
        }
        float[] arr_f1 = this.a;
        if(arr_f1 != null && arr_f1.length != 0) {
            this.b = new vlp[arr_f1.length];
            float f5 = -f2;
            float f6 = 0.0f;
            for(int v = 0; true; ++v) {
                vlp[] arr_vlp = this.b;
                if(v >= arr_vlp.length) {
                    break;
                }
                float f7 = arr_f1[v];
                if((f7 < 0.0f)) {
                    float f8 = f5 - f7;
                    arr_vlp[v] = new vlp(f5, f8);
                    f5 = f8;
                }
                else {
                    float f9 = f7 + f6;
                    arr_vlp[v] = new vlp(f6, f9);
                    f6 = f9;
                }
            }
        }
    }
}


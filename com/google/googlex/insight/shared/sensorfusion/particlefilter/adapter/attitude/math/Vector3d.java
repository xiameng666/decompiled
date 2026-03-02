package com.google.googlex.insight.shared.sensorfusion.particlefilter.adapter.attitude.math;

public class Vector3d {
    public static final Vector3d a;
    public double b;
    public double c;
    public double d;

    static {
        Vector3d.a = new Vector3d(1.0, 0.0);
    }

    public Vector3d() {
    }

    public Vector3d(double f, double f1) {
        this.b = f;
        this.c = 0.0;
        this.d = f1;
    }
}


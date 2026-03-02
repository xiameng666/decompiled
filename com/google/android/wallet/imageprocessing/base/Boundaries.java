package com.google.android.wallet.imageprocessing.base;

public class Boundaries {
    public final Edge a;
    public final Edge b;
    public final Edge c;
    public final Edge d;

    public Boundaries(Edge edge0, Edge edge1, Edge edge2, Edge edge3) {
        this.a = edge0;
        this.b = edge1;
        this.c = edge2;
        this.d = edge3;
    }
}


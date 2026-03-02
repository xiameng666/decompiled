package com.google.android.wallet.imageprocessing.base;

import android.graphics.PointF;

public class Quadrilateral {
    public final PointF bottomLeft;
    public final PointF bottomRight;
    public final PointF topLeft;
    public final PointF topRight;

    public Quadrilateral(PointF pointF0, PointF pointF1, PointF pointF2, PointF pointF3) {
        this.topLeft = pointF0;
        this.topRight = pointF1;
        this.bottomRight = pointF2;
        this.bottomLeft = pointF3;
    }
}


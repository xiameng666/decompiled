package com.google.android.gms.intrusiondetection.storage.database;

import caeg;
import caej;
import caeq;
import omn;

public abstract class IntrusionDetectionEventDatabase extends omn {
    public static final caeg m;
    public static volatile IntrusionDetectionEventDatabase n;

    static {
        IntrusionDetectionEventDatabase.m = new caeg();
    }

    public abstract caej u();

    public abstract caeq v();
}


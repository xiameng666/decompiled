package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import gged_interceptors;
import gozu;
import gozv;
import gpal;
import havx;
import hawd;
import hbsr;
import hbss;
import hbsu;
import hbsw;
import java.util.List;

public class BarcodeRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gozu gozu0 = gozv.b(hbsw.class);
        gozu0.b(new gpal(hawd.class, 1, 0));
        gozu0.b = new hbsr();
        gozv gozv0 = gozu0.a();
        gozu gozu1 = gozv.b(hbsu.class);
        gozu1.b(new gpal(hbsw.class, 1, 0));
        gozu1.b(new gpal(havx.class, 1, 0));
        gozu1.b(new gpal(hawd.class, 1, 0));
        gozu1.b = new hbss();
        return gged_interceptors.m(gozv0, gozu1.a());
    }
}


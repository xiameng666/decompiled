package com.google.mlkit.vision.text.internal;

import com.google.firebase.components.ComponentRegistrar;
import gged_interceptors;
import gozu;
import gozv;
import gpal;
import havx;
import hawd;
import hbxo;
import hbxp;
import hbxt;
import hbxu;
import java.util.List;

public class TextRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gozu gozu0 = gozv.b(hbxp.class);
        gozu0.b(new gpal(hawd.class, 1, 0));
        gozu0.b = new hbxt();
        gozv gozv0 = gozu0.a();
        gozu gozu1 = gozv.b(hbxo.class);
        gozu1.b(new gpal(hbxp.class, 1, 0));
        gozu1.b(new gpal(havx.class, 1, 0));
        gozu1.b = new hbxu();
        return gged_interceptors.m(gozv0, gozu1.a());
    }
}


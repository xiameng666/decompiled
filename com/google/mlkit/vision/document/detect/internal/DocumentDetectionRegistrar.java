package com.google.mlkit.vision.document.detect.internal;

import com.google.firebase.components.ComponentRegistrar;
import gged_interceptors;
import gozu;
import gozv;
import gpal;
import hawd;
import hbuy;
import hbvb;
import java.util.List;

public class DocumentDetectionRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gozu gozu0 = gozv.b(hbvb.class);
        gozu0.b(new gpal(hawd.class, 1, 0));
        gozu0.b = new hbuy();
        return gged_interceptors.l(gozu0.a());
    }
}


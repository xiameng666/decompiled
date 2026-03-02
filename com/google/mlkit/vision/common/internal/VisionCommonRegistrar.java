package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import gged_interceptors;
import gozu;
import gozv;
import gpal;
import hbty;
import hbtz;
import hbua;
import java.util.List;

public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gozu gozu0 = gozv.b(hbtz.class);
        gozu0.b(new gpal(hbty.class, 2, 0));
        gozu0.b = new hbua();
        return gged_interceptors.l(gozu0.a());
    }
}


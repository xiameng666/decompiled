package com.google.mlkit.vision.document.enhance.internal;

import com.google.firebase.components.ComponentRegistrar;
import gged_interceptors;
import gozu;
import gozv;
import gpal;
import hawd;
import hbvi;
import hbvk;
import java.util.List;

public class DocumentEnhancementRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        gozu gozu0 = gozv.b(hbvk.class);
        gozu0.b(new gpal(hawd.class, 1, 0));
        gozu0.b = new hbvi();
        return gged_interceptors.l(gozu0.a());
    }
}


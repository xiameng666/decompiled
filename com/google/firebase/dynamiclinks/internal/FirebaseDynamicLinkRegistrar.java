package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.components.ComponentRegistrar;
import goot;
import gope;
import gozu;
import gozv;
import gozx;
import gpal;
import gpcc;
import java.util.Arrays;
import java.util.List;

public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        gozu gozu0 = gozv.b(gpcc.class);
        gozu0.b(new gpal(goot.class, 1, 0));
        gozu0.b(new gpal(gope.class, 0, 1));
        gozu0.b = (gozx gozx0) -> {
            goot goot0 = (goot)gozx0.e(goot.class);
            gozx0.b(gope.class);
            throw null;
        };
        return Arrays.asList(new gozv[]{gozu0.a()});
    }
}


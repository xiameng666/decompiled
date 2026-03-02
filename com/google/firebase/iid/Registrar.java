package com.google.firebase.iid;

import com.google.firebase.components.ComponentRegistrar;
import goot;
import gozu;
import gozv;
import gozx;
import gpal;
import gper;
import gpeu;
import gpev;
import gpez;
import gpfp;
import gpfq;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        gozu gozu0 = gozv.b(FirebaseInstanceId.class);
        gozu0.b(new gpal(goot.class, 1, 0));
        gozu0.b(new gpal(gpfq.class, 0, 1));
        gozu0.b(new gpal(gper.class, 0, 1));
        gozu0.b(new gpal(gpez.class, 1, 0));
        gozu0.b = (gozx gozx0) -> {
            goot goot0 = (goot)gozx0.e(goot.class);
            gozx0.b(gpfq.class);
            gozx0.b(gper.class);
            gpez gpez0 = (gpez)gozx0.e(gpez.class);
            throw null;
        };
        gozu0.c(1);
        gozv gozv0 = gozu0.a();
        gozu gozu1 = gozv.b(gpev.class);
        gozu1.b(new gpal(FirebaseInstanceId.class, 1, 0));
        gozu1.b = (gozx gozx0) -> {
            FirebaseInstanceId firebaseInstanceId0 = (FirebaseInstanceId)gozx0.e(FirebaseInstanceId.class);
            return new gpeu();
        };
        return Arrays.asList(new gozv[]{gozv0, gozu1.a(), gpfp.a("fire-iid", "21.1.1")});
    }
}


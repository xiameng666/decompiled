package com.google.firebase.auth;

import com.google.firebase.components.ComponentRegistrar;
import goot;
import gozk;
import gozp;
import gozu;
import gozv;
import gozx;
import gpal;
import gpfp;
import java.util.Arrays;
import java.util.List;

public class FirebaseAuthRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        gozv[] arr_gozv = new gozv[2];
        gozu gozu0 = new gozu(FirebaseAuth.class, new Class[]{gozp.class});
        gozu0.b(new gpal(goot.class, 1, 0));
        gozu0.b = (gozx gozx0) -> {
            goot goot0 = (goot)gozx0.e(goot.class);
            return new gozk();
        };
        gozu0.c(2);
        arr_gozv[0] = gozu0.a();
        arr_gozv[1] = gpfp.a("fire-auth", "24.0.2");
        return Arrays.asList(arr_gozv);
    }
}


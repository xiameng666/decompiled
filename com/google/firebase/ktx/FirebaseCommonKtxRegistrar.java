package com.google.firebase.ktx;

import com.google.firebase.components.ComponentRegistrar;
import gopf;
import gopg;
import goph;
import gopi;
import gozu;
import gozv;
import gpal;
import gpay;
import gpfc;
import gpfd;
import gpfe;
import gpff;
import ibni;
import ibpo;
import iccd;
import java.util.List;
import java.util.concurrent.Executor;

@ibni
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        gozv[] arr_gozv = new gozv[4];
        gozu gozu0 = gozv.a(new gpay(gopf.class, iccd.class));
        gozu0.b(new gpal(new gpay(gopf.class, Executor.class), 1, 0));
        gozu0.b = gpfc.a;
        arr_gozv[0] = gozu0.a();
        gozu gozu1 = gozv.a(new gpay(goph.class, iccd.class));
        gozu1.b(new gpal(new gpay(goph.class, Executor.class), 1, 0));
        gozu1.b = gpfd.a;
        arr_gozv[1] = gozu1.a();
        gozu gozu2 = gozv.a(new gpay(gopg.class, iccd.class));
        gozu2.b(new gpal(new gpay(gopg.class, Executor.class), 1, 0));
        gozu2.b = gpfe.a;
        arr_gozv[2] = gozu2.a();
        gozu gozu3 = gozv.a(new gpay(gopi.class, iccd.class));
        gozu3.b(new gpal(new gpay(gopi.class, Executor.class), 1, 0));
        gozu3.b = gpff.a;
        arr_gozv[3] = gozu3.a();
        return ibpo.g(arr_gozv);
    }
}


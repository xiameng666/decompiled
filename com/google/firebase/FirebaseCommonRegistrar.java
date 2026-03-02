package com.google.firebase;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import goot;
import gooy;
import gooz;
import gopa;
import gopb;
import gopf;
import gozu;
import gozv;
import gpal;
import gpay;
import gpem;
import gpen;
import gpeo;
import gpeq;
import gper;
import gpfj;
import gpfm;
import gpfp;
import gpfq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String s) {
        return s.replace(' ', '_').replace('/', '_');
    }

    @Override  // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        List list0 = new ArrayList();
        gozu gozu0 = gozv.b(gpfq.class);
        gozu0.b(new gpal(gpfm.class, 2, 0));
        gozu0.b = new gpfj();
        list0.add(gozu0.a());
        gpay gpay0 = new gpay(gopf.class, Executor.class);
        gozu gozu1 = new gozu(gpen.class, new Class[]{gpeq.class, gper.class});
        gozu1.b(new gpal(Context.class, 1, 0));
        gozu1.b(new gpal(goot.class, 1, 0));
        gozu1.b(new gpal(gpeo.class, 2, 0));
        gozu1.b(new gpal(gpfq.class, 1, 1));
        gozu1.b(new gpal(gpay0, 1, 0));
        gozu1.b = new gpem();
        list0.add(gozu1.a());
        list0.add(gpfp.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        list0.add(gpfp.a("fire-core", "21.0.0_1p"));
        list0.add(gpfp.a("device-name", FirebaseCommonRegistrar.a(Build.PRODUCT)));
        list0.add(gpfp.a("device-model", FirebaseCommonRegistrar.a(Build.DEVICE)));
        list0.add(gpfp.a("device-brand", FirebaseCommonRegistrar.a(Build.BRAND)));
        list0.add(gpfp.b("android-target-sdk", new gooy()));
        list0.add(gpfp.b("android-min-sdk", new gooz()));
        list0.add(gpfp.b("android-platform", new gopa()));
        list0.add(gpfp.b("android-installer", new gopb()));
        return list0;
    }
}


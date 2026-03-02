package com.google.android.gms.icing.service;

import MoreObjects;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import batl;
import bbcu;
import bwmx;
import bwne;
import bwts;
import bwua;
import bwvo;
import bwyp;
import bwzn;
import bxam;
import bxav;
import cjtn;
import cjug;
import cjuo;
import cjup;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;
import ggnj;
import gltq;
import hubn;

public class IndexChimeraService extends Service implements cjuo {
    public static final int a;
    private static final ggfp b;
    private bxav c;

    static {
        IndexChimeraService.b = ggfp.O(Integer.valueOf(21), Integer.valueOf(30), Integer.valueOf(33), Integer.valueOf(0x20), Integer.valueOf(36), Integer.valueOf(66), new Integer[]{((int)78)});
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(this.c != null) {
            String s = getServiceRequest0.f;
            String s1 = getServiceRequest0.p;
            bbcu bbcu0 = (bbcu)MoreObjects.firstNonNull(bbcu.b(getServiceRequest0.d), bbcu.a);
            int v = Binder.getCallingUid();
            int v1 = getServiceRequest0.e;
            String s2 = getServiceRequest0.i == null ? null : getServiceRequest0.i.getString("ComponentName");
            this.c().h(new bxam(this, gltq.u, s, cjtn0, s, bbcu0, v1, v, s2, s1));
            return;
        }
        bwne.a("IndexService is unavailable on this device");
        cjtn0.a(16, new Bundle());
    }

    public final bwmx b() {
        batl.s(this.c);
        return this.c.a();
    }

    public final bwzn c() {
        batl.s(this.c);
        return this.c.c;
    }

    public final void d(bwua bwua0, cjtn cjtn0, cjug cjug0) {
        try {
            bwts bwts0 = this.b().r;
            Object object0 = bwua0.e;
            synchronized(object0) {
                int v1 = 1;
                int v2 = !bwua0.b.equals("com.google.android.gms") || !(bwua0.g == null ? false : bwua0.g.contains(" getStringResource threw a NPE")) ? 0 : 1;
                String s = bwua0.g;
                if(s == null) {
                    v1 = v2;
                }
                else if(v2 == 0) {
                    throw new bwvo(s);
                }
            }
            if(v1 != 0 && bwts0 != null) {
                bwts0.d("b28339005");
            }
            this.e(cjtn0, 0, cjug0);
        }
        catch(bwvo bwvo0) {
            bwne.i("Failed to check resources for package %s, %s", bwua0.b, bwvo0);
            this.e(cjtn0, 10, cjug0);
        }
    }

    public final void e(cjtn cjtn0, int v, cjug cjug0) {
        try {
            if(v == 0) {
                batl.s(cjug0);
                cjtn0.c(cjug0);
                return;
            }
            cjtn0.a(v, new Bundle());
        }
        catch(Throwable throwable0) {
            bwne.j(throwable0, "Service broker callback failed", new Object[0]);
            this.b().r.d("postinit_failed");
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if(!"com.google.android.gms.icing.INDEX_SERVICE".equals(intent0.getAction())) {
            Log.w("IndexChimeraService", "incompatible service action: " + intent0.getAction());
            return null;
        }
        return new cjup(this, IndexChimeraService.b, ggnj.a, null, 1, ggnj.a, this, null, false);
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        bwne.b("%s: IndexService onCreate", "main");
        if(hubn.i()) {
            this.c = bxav.c(this.getApplicationContext());
            this.b();
            bwyp.b(this);
        }
        super.onCreate();
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        bwne.b("%s: IndexService onDestroy", "main");
        bxav bxav0 = this.c;
        if(bxav0 != null) {
            bxav0.b();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        bwne.d("%s: IndexService: onStartCommand with %s", "main", intent0);
        if(intent0 != null && "com.google.android.gms.icing.INDEX_SERVICE".equals(intent0.getAction())) {
            intent0.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
            this.startService(intent0);
        }
        return 2;
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        bwne.b("%s: Unbind", "main");
        return false;
    }
}


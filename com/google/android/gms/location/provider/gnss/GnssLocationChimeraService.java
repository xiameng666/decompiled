package com.google.android.gms.location.provider.gnss;

import android.content.Context;
import android.content.Intent;
import android.location.provider.LocationProviderBase.OnFlushCompleteCallback;
import android.location.provider.ProviderRequest;
import android.os.IBinder;
import android.util.SparseArray;
import bbcu;
import bboh;
import bbpd;
import cmpf;
import cmpl;
import cnsd;
import cnsf;
import cnsg;
import cnsh;
import cnsj;
import cnsm;
import cnsn;
import cnso;
import cnsp;
import cnsr;
import cnvc;
import cnvw;
import cnvz;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import evtn;
import evuf;
import gftb;
import glzd;
import gmap;
import gmbu;
import hunn;
import hyys;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GnssLocationChimeraService extends Service {
    public static final bboh a;
    public cnsm b;

    static {
        GnssLocationChimeraService.a = bboh.b("GnssShim", bbcu.g);
    }

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        cnsm cnsm0 = this.b;
        if(cnsm0 != null) {
            printWriter0.println("Flags:");
            bbpd bbpd0 = new bbpd(printWriter0, "  ");
            bbpd0.b();
            cmpl.a(bbpd0);
            bbpd0.println("tensorgps_location_provider_enabled: " + hyys.c());
            printWriter0.println("Active delegate: " + (cnsm0.d == cnsm0.b ? "chipset" : "bluestar") + (cnsm0.c == null ? "" : " and tensorgps"));
            cnsj cnsj0 = cnsm0.a;
            if(cnsj0 != null) {
                cmpf cmpf0 = ((cnsg)cnsj0).e;
                if(cmpf0 != null) {
                    cmpf0.g(printWriter0, arr_s);
                }
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        Context context0 = ModuleManager.createSubmoduleContext(this, "gnss_location_provider");
        gftb.check(context0);
        cnvz cnvz0 = cnvz.c();
        long v = hunn.a.e().h();
        AtomicInteger atomicInteger0 = new AtomicInteger();
        cnvc cnvc0 = new cnvc(atomicInteger0);
        cnsn cnsn0 = new cnsn(this, context0);
        gmbu.t(glzd.f(cnvz0.f(new cnvw(System.currentTimeMillis(), v, atomicInteger0)), cnvc0, gmap.a), cnsn0, gmap.a);
        if(this.b == null) {
            cnsm cnsm0 = new cnsm(context0);
            this.b = cnsm0;
            cnsm0.d = cnsm0.a(ProviderRequest.EMPTY_REQUEST);
            cnsj cnsj0 = cnsm0.a;
            if(cnsj0 != null) {
                cnsf cnsf0 = new cnsf(((cnsg)cnsj0));
                ((cnsg)cnsj0).c.execute(cnsf0);
            }
            cnsj cnsj1 = cnsm0.c;
            if(cnsj1 != null && !((cnsr)cnsj1).c.get() && !((cnsr)cnsj1).f) {
                ((cnsr)cnsj1).f = true;
                if(((cnsr)cnsj1).e == null) {
                    ((cnsr)cnsj1).e = new evuf(((cnsr)cnsj1).a);
                }
                evtn evtn0 = ((cnsr)cnsj1).e;
                if(evtn0 != null) {
                    evtn0.b(((cnsr)cnsj1).d).A(new cnsp(((cnsr)cnsj1)));
                }
            }
        }
        return this.b.getBinder();
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        cnsm cnsm0 = this.b;
        if(cnsm0 != null) {
            cnsj cnsj0 = cnsm0.a;
            if(cnsj0 != null) {
                cnsd cnsd0 = new cnsd(((cnsg)cnsj0));
                ((cnsg)cnsj0).c.execute(cnsd0);
            }
            ((cnsh)cnsm0.b).c.removeUpdates(((cnsh)cnsm0.b).d);
            ArrayList arrayList0 = new ArrayList();
            SparseArray sparseArray0 = ((cnsh)cnsm0.b).a;
            synchronized(sparseArray0) {
                for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
                    arrayList0.add(((LocationProviderBase.OnFlushCompleteCallback)sparseArray0.valueAt(v1)));
                }
                sparseArray0.clear();
            }
            int v2 = arrayList0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((LocationProviderBase.OnFlushCompleteCallback)arrayList0.get(v3)).onFlushComplete();
            }
            cnsj cnsj1 = cnsm0.c;
            if(cnsj1 != null && !((cnsr)cnsj1).c.get() && ((cnsr)cnsj1).f) {
                ((cnsr)cnsj1).f = false;
                evtn evtn0 = ((cnsr)cnsj1).e;
                if(evtn0 != null) {
                    evtn0.c(((cnsr)cnsj1).d).A(new cnso());
                }
            }
            this.b = null;
        }
        super.onDestroy();
    }
}


package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import bjgx;
import bjgy;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.report.d;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.client.k;
import com.google.android.gms.ads.internal.util.client.l;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class f extends bjgy {
    private com.google.android.gms.ads.internal.report.f a;

    public f() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override  // bjgy
    protected final Object a(IBinder iBinder0) {
        return ap.asInterface(iBinder0);
    }

    public final an b(Context context0, AdSizeParcel adSizeParcel0, String s, e e0, int v) {
        s.c(context0);
        if(((Boolean)s.bw.g()).booleanValue()) {
            try {
                ObjectWrapper objectWrapper0 = new ObjectWrapper(context0);
                IBinder iBinder0 = ((aq)l.b(context0, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.client.e())).newAdManagerByType(objectWrapper0, adSizeParcel0, s, e0, 253434000, v);
                if(iBinder0 == null) {
                    return null;
                }
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return (iInterface0 instanceof an) ? ((an)iInterface0) : new al(iBinder0);
            }
            catch(k | RemoteException | NullPointerException exception0) {
                com.google.android.gms.ads.internal.report.f f0 = d.a(context0);
                this.a = f0;
                f0.e(exception0, "AdManagerCreator.newAdManagerByDynamiteLoader");
                h.o("#007 Could not call remote method.", exception0);
                return null;
            }
        }
        try {
            ObjectWrapper objectWrapper1 = new ObjectWrapper(context0);
            IBinder iBinder1 = ((aq)this.c(context0)).newAdManagerByType(objectWrapper1, adSizeParcel0, s, e0, 253434000, v);
            if(iBinder1 == null) {
                return null;
            }
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return (iInterface1 instanceof an) ? ((an)iInterface1) : new al(iBinder1);
        }
        catch(RemoteException | bjgx exception1) {
            h.e("Could not create remote AdManager.", exception1);
            return null;
        }
    }
}


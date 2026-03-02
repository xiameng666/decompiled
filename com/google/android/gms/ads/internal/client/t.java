package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import bjia;
import com.google.android.gms.ads.internal.flag.j;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.client.l;

abstract class t {
    private static final ay a;

    static {
        ay ay0 = null;
        try {
            Object object0 = s.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if(!(object0 instanceof IBinder)) {
                h.k("ClientApi class is not an instance of IBinder.");
            }
            else if(((IBinder)object0) != null) {
                IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                ay0 = (iInterface0 instanceof ay) ? ((ay)iInterface0) : new ay(((IBinder)object0));
            }
        }
        catch(Exception unused_ex) {
            h.k("Failed to instantiate ClientApi class.");
        }
        t.a = ay0;
    }

    protected abstract Object a();

    protected abstract Object b();

    protected abstract Object c(ay arg1);

    public final Object d(Context context0) {
        Object object0;
        boolean z;
        int v1;
        int v = 0;
        if(f.n(context0)) {
            v1 = 0;
        }
        else {
            h.d("Google Play Services is not available.");
            v1 = 1;
        }
        int v2 = bjia.a(context0, "com.google.android.gms.ads.dynamite") <= l.a(context0) ? 1 : 0;
        com.google.android.gms.ads.internal.config.s.c(context0);
        if(((Boolean)j.a.d()).booleanValue()) {
            z = false;
        }
        else if(((Boolean)j.b.d()).booleanValue()) {
            z = true;
            v = 1;
        }
        else {
            v = v1 | v2 ^ 1;
            z = false;
        }
        if(v == 0) {
            Object object1 = this.f();
            if(object1 == null && u.d().nextInt(((Long)com.google.android.gms.ads.internal.flag.s.a.d()).intValue()) == 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putString("action", "dynamite_load");
                bundle0.putInt("is_missing", 1);
                u.b().k(context0, u.c().a, bundle0);
            }
            object0 = object1 == null ? this.e() : object1;
        }
        else {
            object0 = this.e();
            if(object0 == null && !z) {
                object0 = this.f();
                return object0 == null ? this.a() : object0;
            }
        }
        return object0 == null ? this.a() : object0;
    }

    private final Object e() {
        ay ay0 = t.a;
        if(ay0 != null) {
            try {
                return this.c(ay0);
            }
            catch(RemoteException remoteException0) {
                h.m("Cannot invoke local loader using ClientApi class.", remoteException0);
                return null;
            }
        }
        h.k("ClientApi class cannot be loaded.");
        return null;
    }

    private final Object f() {
        try {
            return this.b();
        }
        catch(RemoteException remoteException0) {
            h.m("Cannot invoke remote loader.", remoteException0);
            return null;
        }
    }
}


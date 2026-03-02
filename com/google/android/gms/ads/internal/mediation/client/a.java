package com.google.android.gms.ads.internal.mediation.client;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;

public final class a extends d {
    @Override  // com.google.android.gms.ads.internal.mediation.client.e
    public final boolean a(String s) {
        try {
            return com.google.android.gms.ads.mediation.a.class.isAssignableFrom(Class.forName(s, false, a.class.getClassLoader()));
        }
        catch(Throwable unused_ex) {
            h.k(a.a(s, "Could not load custom event implementation class as Adapter: ", ", assuming old custom event implementation."));
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.e
    public final boolean c(String s) {
        try {
            return com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(s, false, a.class.getClassLoader()));
        }
        catch(Throwable unused_ex) {
            h.k(a.a(s, "Could not load custom event implementation class: ", ", trying Adapter implementation class."));
            return false;
        }
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.e
    public final f d(String s) {
        try {
            Class class0 = Class.forName(s, false, a.class.getClassLoader());
            if(c.class.isAssignableFrom(class0)) {
                return new f(((c)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            if(com.google.android.gms.ads.mediation.a.class.isAssignableFrom(class0)) {
                return new f(((com.google.android.gms.ads.mediation.a)class0.getDeclaredConstructor(null).newInstance(null)));
            }
            h.k(a.a(s, "Could not instantiate mediation adapter: ", " (not a valid adapter)."));
        }
        catch(Throwable unused_ex) {
        }
        try {
            h.d("Reflection failed, retrying using direct instantiation");
            if("com.google.ads.mediation.admob.AdMobAdapter".equals(s)) {
                return new f(new AdMobAdapter());
            }
            if("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(s)) {
                return new f(new CustomEventAdapter());
            }
        }
        catch(Throwable throwable0) {
            h.m(a.a(s, "Could not instantiate mediation adapter: ", ". "), throwable0);
        }
        throw new RemoteException();
    }

    @Override  // com.google.android.gms.ads.internal.mediation.client.e
    public final com.google.android.gms.ads.internal.mediation.client.rtb.f e(String s) {
        try {
            return new com.google.android.gms.ads.internal.mediation.client.rtb.f(((com.google.android.gms.ads.mediation.rtb.a)Class.forName(s, false, com.google.android.gms.ads.internal.mediation.client.rtb.h.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null)));
        }
        catch(Throwable unused_ex) {
            throw new RemoteException();
        }
    }
}


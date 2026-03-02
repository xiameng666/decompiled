package com.google.android.gms.ads.identifier.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import azql;
import bbmq;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.identifier.settings.b;
import com.google.android.gms.chimera.modules.adid.AppContextProvider;
import hosu;
import hosz;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import wby;
import wbz;

public final class c extends wby implements d {
    private final b a;
    private final Context b;

    public c() {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public c(byte[] arr_b) {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Context context0 = AppContextProvider.a();
        this.b = context0;
        this.a = b.c(context0);
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final Bundle a() {
        int v = Binder.getCallingUid();
        azql.c(this.b).e(v);
        Map map0 = this.a.a().getAll();
        HashMap hashMap0 = new HashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getValue();
            if((object1 instanceof Boolean)) {
                hashMap0.put(((String)map$Entry0.getKey()), ((Boolean)object1));
            }
        }
        Bundle bundle0 = new Bundle();
        for(Object object2: hashMap0.entrySet()) {
            bundle0.putBoolean(((String)((Map.Entry)object2).getKey()), ((Boolean)((Map.Entry)object2).getValue()).booleanValue());
        }
        return bundle0;
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final String b(String s) {
        Context context0 = this.b;
        bbmq.M(context0, s);
        azql.c(context0).d(s);
        c.k(s);
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.ads.cache.ClearCacheIntentOperation", "com.google.android.gms.ads.cache.CLEAR");
        if(intent0 != null) {
            context0.startService(intent0);
        }
        return this.a.e();
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final String c() {
        int v = Binder.getCallingUid();
        return this.a.f(v);
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final String d(int v) {
        azql.c(this.b).e(Binder.getCallingUid());
        return this.a.f(v);
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final String e(String s, boolean z) {
        String s5;
        String s3;
        String s2;
        bbmq.M(this.b, s);
        azql.c(this.b).d(s);
        c.k(s);
        if(z) {
            b b0 = this.a;
            synchronized(b0.b) {
                if(b0.m()) {
                    String s1 = b0.g();
                    if(!s1.isEmpty()) {
                        return s1;
                    }
                }
                s2 = b0.h();
                s3 = b.d();
            }
            return b0.i(true, b0.o(), s2, s3);
        }
        b b1 = this.a;
        synchronized(b1.b) {
            if(!b1.m()) {
                String s4 = b1.h();
                if(!s4.isEmpty()) {
                    return s4;
                }
            }
            s5 = b1.h();
            if(s5.isEmpty()) {
                s5 = UUID.randomUUID().toString();
            }
        }
        return b1.i(false, b1.o(), s5, "");
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final void f(int v) {
        int v1 = Binder.getCallingUid();
        azql.c(this.b).e(v1);
        synchronized(this.a.b) {
            this.a.a().edit().remove(String.valueOf(v)).apply();
            this.a.k();
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        boolean z = false;
        switch(v) {
            case 1: {
                String s = this.c();
                parcel1.writeNoException();
                parcel1.writeString(s);
                return true;
            }
            case 2: {
                wbz.i(parcel0);
                c.gr(parcel0);
                boolean z1 = this.j();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z1));
                return true;
            }
            case 3: {
                String s1 = parcel0.readString();
                c.gr(parcel0);
                String s2 = this.b(s1);
                parcel1.writeNoException();
                parcel1.writeString(s2);
                return true;
            }
            case 4: {
                String s3 = parcel0.readString();
                boolean z2 = wbz.i(parcel0);
                c.gr(parcel0);
                this.h(s3, z2);
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s4 = parcel0.readString();
                boolean z3 = wbz.i(parcel0);
                c.gr(parcel0);
                String s5 = this.e(s4, z3);
                parcel1.writeNoException();
                parcel1.writeString(s5);
                return true;
            }
            case 6: {
                boolean z4 = this.i();
                parcel1.writeNoException();
                parcel1.writeInt(((int)z4));
                return true;
            }
            case 7: {
                if(hosz.c()) {
                    int v1 = Binder.getCallingUid();
                    azql.c(this.b).e(v1);
                    z = this.a.l();
                }
                parcel1.writeNoException();
                parcel1.writeInt(((int)z));
                return true;
            }
            case 8: {
                int v2 = parcel0.readInt();
                boolean z5 = wbz.i(parcel0);
                c.gr(parcel0);
                this.g(v2, z5);
                parcel1.writeNoException();
                return true;
            }
            case 9: {
                int v3 = parcel0.readInt();
                c.gr(parcel0);
                this.f(v3);
                parcel1.writeNoException();
                return true;
            }
            case 10: {
                Bundle bundle0 = this.a();
                parcel1.writeNoException();
                wbz.g(parcel1, bundle0);
                return true;
            }
            case 11: {
                int v4 = parcel0.readInt();
                c.gr(parcel0);
                String s6 = this.d(v4);
                parcel1.writeNoException();
                parcel1.writeString(s6);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final void g(int v, boolean z) {
        int v1 = Binder.getCallingUid();
        azql.c(this.b).e(v1);
        synchronized(this.a.b) {
            this.a.a().edit().putBoolean(String.valueOf(v), z).apply();
            this.a.k();
        }
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final void h(String s, boolean z) {
        bbmq.M(this.b, s);
        azql.c(this.b).d(s);
        c.k(s);
        this.a.p(z, 2);
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final boolean i() {
        return this.a.m();
    }

    @Override  // com.google.android.gms.ads.identifier.internal.d
    public final boolean j() {
        int v = Binder.getCallingUid();
        return this.a.n(v);
    }

    private static void k(String s) {
        if(s.equals("com.google.android.gms") || hosu.a.e().p().b.contains(s)) {
            return;
        }
        throw new SecurityException(String.format("Calling package not allowed: \'%s\'.", s));
    }
}


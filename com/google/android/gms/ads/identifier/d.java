package com.google.android.gms.ads.identifier;

import a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import azox;
import azpn;
import azqi;
import azqj;
import batl;
import bbic;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class d {
    azox a;
    com.google.android.gms.ads.identifier.internal.d b;
    boolean c;
    final Object d;
    b e;
    final long f;
    private static final Object g;
    private static volatile d h;
    private final Context i;

    static {
        d.g = new Object();
    }

    public d(Context context0) {
        this.d = new Object();
        batl.s(context0);
        this.i = context0.getApplicationContext();
        this.c = false;
        this.f = 30000L;
    }

    public static c a(Context context0) {
        return d.b(context0, -1);
    }

    public static c b(Context context0, int v) {
        int v8;
        c c0;
        d d0 = d.h;
        if(d0 == null) {
            synchronized(d.g) {
                d0 = d.h;
                if(d0 == null) {
                    Log.d("AdvertisingIdClient", "Creating AdvertisingIdClient");
                    d0 = new d(context0);
                    d.h = d0;
                }
            }
        }
        Log.d("AdvertisingIdClient", "AdvertisingIdClient already created.");
        if(f.a == null) {
            synchronized(f.b) {
                if(f.a == null) {
                    f.a = new f(context0);
                }
            }
        }
        int v3 = v == -1 ? 35401 : 35402;
        f f0 = f.a;
        long v4 = SystemClock.elapsedRealtime();
        try {
            batl.k("Calling this from your main thread can lead to deadlock");
            synchronized(d0) {
                d0.d();
                batl.s(d0.a);
                batl.s(d0.b);
                try {
                    c0 = new c((v == -1 ? d0.b.c() : d0.b.d(v)), d0.b.j());
                }
                catch(RemoteException remoteException0) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", remoteException0);
                    throw new IOException("Remote exception", remoteException0);
                }
            }
            synchronized(d0.d) {
                b b0 = d0.e;
                if(b0 != null) {
                    b0.a.countDown();
                    try {
                        d0.e.join();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
                long v6 = d0.f;
                if(v6 > 0L) {
                    d0.e = new b(d0, v6);
                }
            }
            long v7 = SystemClock.elapsedRealtime() - v4;
            d0.e(c0, v7, null);
            f0 = f0;
            f0.a(v3, 0, v4, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v4)));
            Log.i("AdvertisingIdClient", a.D(v7, "GetInfoInternal elapse ", "ms"));
            return c0;
        }
        catch(Throwable throwable0) {
            d0.e(null, -1L, throwable0);
            if((throwable0 instanceof IOException)) {
                v8 = 1;
            }
            else if((throwable0 instanceof azqi)) {
                v8 = 9;
            }
            else if((throwable0 instanceof azqj)) {
                v8 = 16;
            }
            else if((throwable0 instanceof IllegalStateException)) {
                v8 = 8;
            }
            else {
                v8 = -1;
            }
            f0.a(v3, v8, v4, System.currentTimeMillis(), ((int)(SystemClock.elapsedRealtime() - v4)));
            throw throwable0;
        }
    }

    public final void c() {
        batl.k("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            try {
                Context context0 = this.i;
                if(context0 == null || this.a == null) {
                    return;
                }
                if(this.c) {
                    bbic.a().b(context0, this.a);
                }
            }
            catch(Throwable throwable0) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", throwable0);
            }
        }
        this.c = false;
        this.b = null;
        this.a = null;
    }

    final void d() {
        com.google.android.gms.ads.identifier.internal.d d0;
        synchronized(this) {
            if(!this.c) {
                try {
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is not bounded. Starting to bind it...");
                    batl.k("Calling this from your main thread can lead to deadlock");
                    synchronized(this) {
                        if(!this.c) {
                            Context context0 = this.i;
                            try {
                                context0.getPackageManager().getPackageInfo("com.android.vending", 0);
                            }
                            catch(PackageManager.NameNotFoundException unused_ex) {
                                throw new azqi(9);
                            }
                            switch(azpn.d.m(context0)) {
                                case 0: 
                                case 2: {
                                    azox azox0 = new azox();
                                    Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
                                    intent0.setPackage("com.google.android.gms");
                                    try {
                                        if(bbic.a().d(context0, intent0, azox0, 1)) {
                                            goto label_21;
                                        }
                                        throw new IOException("Connection failure");
                                    }
                                    catch(Throwable throwable0) {
                                        throw new IOException(throwable0);
                                    }
                                label_21:
                                    this.a = azox0;
                                    try {
                                        IBinder iBinder0 = azox0.b(10000L, TimeUnit.MILLISECONDS);
                                        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                        d0 = (iInterface0 instanceof com.google.android.gms.ads.identifier.internal.d) ? ((com.google.android.gms.ads.identifier.internal.d)iInterface0) : new com.google.android.gms.ads.identifier.internal.b(iBinder0);
                                    }
                                    catch(InterruptedException unused_ex) {
                                        throw new IOException("Interrupted exception");
                                    }
                                    catch(Throwable throwable1) {
                                        throw new IOException(throwable1);
                                    }
                                    this.b = d0;
                                    this.c = true;
                                    break;
                                }
                                default: {
                                    throw new IOException("Google Play services not available");
                                }
                            }
                        }
                    }
                    Log.d("AdvertisingIdClient", "AdvertisingIdClient is bounded");
                    if(!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    goto label_45;
                }
                catch(Exception exception0) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", exception0);
                }
                throw new IOException("AdvertisingIdClient cannot reconnect.");
            }
        label_45:
        }
    }

    final void e(c c0, long v, Throwable throwable0) {
        if(Math.random() <= 0.0) {
            HashMap hashMap0 = new HashMap();
            String s = "1";
            hashMap0.put("app_context", "1");
            if(c0 != null) {
                if(!c0.b) {
                    s = "0";
                }
                hashMap0.put("limit_ad_tracking", s);
                String s1 = c0.a;
                if(s1 != null) {
                    hashMap0.put("ad_id_size", Integer.toString(s1.length()));
                }
            }
            if(throwable0 != null) {
                hashMap0.put("error", throwable0.getClass().getName());
            }
            hashMap0.put("tag", "AdvertisingIdClient");
            hashMap0.put("time_spent", Long.toString(v));
            new com.google.android.gms.ads.identifier.a(this, hashMap0).start();
        }
    }

    @Override
    protected final void finalize() {
        this.c();
        super.finalize();
    }
}


package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import bbdg;
import bbpd;
import bxd;
import ccmq;
import clht;
import cnme;
import cnmf;
import com.google.android.chimera.Service;
import gftb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;

public class LocationPersistentChimeraService extends Service {
    public static WeakReference a;
    public final bxd b;
    private Handler c;

    static {
        LocationPersistentChimeraService.a = new WeakReference(null);
    }

    public LocationPersistentChimeraService() {
        this.b = new bxd();
    }

    public static void a(String s, cnmf cnmf0) {
        synchronized(LocationPersistentChimeraService.class) {
            if(cnmf0 == null) {
                return;
            }
            LocationPersistentChimeraService locationPersistentChimeraService0 = (LocationPersistentChimeraService)LocationPersistentChimeraService.a.get();
            if(locationPersistentChimeraService0 == null) {
                Log.w("LocationPersistentSvc", "unable to register client - no service");
                return;
            }
            locationPersistentChimeraService0.c.post(new cnme(locationPersistentChimeraService0, s, cnmf0));
        }
    }

    private static void b(LocationPersistentChimeraService locationPersistentChimeraService0) {
        boolean z = true;
        synchronized(LocationPersistentChimeraService.class) {
            gftb.q(Looper.myLooper() == Looper.getMainLooper());
            LocationPersistentChimeraService locationPersistentChimeraService1 = (LocationPersistentChimeraService)LocationPersistentChimeraService.a.get();
            if(locationPersistentChimeraService1 != null) {
                if(Looper.myLooper() != Looper.getMainLooper()) {
                    z = false;
                }
                gftb.q(z);
                bxd bxd0 = locationPersistentChimeraService1.b;
                for(Object object0: bxd0.values()) {
                    ((cnmf)object0).b();
                }
                bxd0.clear();
            }
            LocationPersistentChimeraService.a = new WeakReference(locationPersistentChimeraService0);
        }
    }

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        bbpd bbpd0 = new bbpd(printWriter0, "  ");
        for(Object object0: this.b.entrySet()) {
            printWriter0.print(((String)((Map.Entry)object0).getKey()));
            printWriter0.println(":");
            bbpd0.b();
            ((cnmf)((Map.Entry)object0).getValue()).d(bbpd0);
            bbpd0.a();
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.iX);
        super.onCreate();
        this.c = new clht();
        LocationPersistentChimeraService.b(this);
        Intent intent0 = new Intent("com.google.android.gms.location.persistent.REGISTER");
        intent0.setPackage("com.google.android.gms");
        this.sendBroadcast(intent0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        LocationPersistentChimeraService.b(null);
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        return 1;
    }
}


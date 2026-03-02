package com.google.android.gms.smartdevice.d2d;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import baun;
import cjup;
import cjvl;
import clht;
import com.google.android.chimera.Service;
import epzy;
import eqbt;
import eqvg;
import erpi;
import erqc;
import ggnj;

public class SourceDeviceChimeraService extends Service {
    public Handler a;
    public eqbt b;
    public eqvg c;
    public cjvl d;
    private static final baun e;
    private cjup f;

    static {
        SourceDeviceChimeraService.e = new erqc(new String[]{"D2D", "SourceDeviceChimeraService"});
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        SourceDeviceChimeraService.e.j("onBind()", new Object[0]);
        return "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START".equals(intent0.getAction()) ? this.f : null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        SourceDeviceChimeraService.e.j("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread0 = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread0.start();
        handlerThread0.getLooper();
        this.a = new clht(handlerThread0.getLooper());
        epzy epzy0 = new epzy(this);
        this.f = new cjup(this, 75, ggnj.a, 3, epzy0);
        this.d = new cjvl(this);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        SourceDeviceChimeraService.e.j("onDestroy()", new Object[0]);
        eqbt eqbt0 = this.b;
        if(eqbt0 != null) {
            eqbt0.n();
        }
        erpi.a(this.a);
        super.onDestroy();
    }
}


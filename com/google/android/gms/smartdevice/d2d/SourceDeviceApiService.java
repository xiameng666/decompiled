package com.google.android.gms.smartdevice.d2d;

import android.os.Handler;
import android.os.HandlerThread;
import barf;
import baun;
import cjtg;
import cjtn;
import clht;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GetServiceRequest;
import epvj;
import eqbt;
import eqvg;
import erpi;
import erpq;
import erqc;
import ggnj;

public class SourceDeviceApiService extends cjtg {
    Handler a;
    private static final baun b;
    private eqbt c;
    private eqvg d;

    static {
        SourceDeviceApiService.b = new erqc(new String[]{"D2D", "SourceDeviceApiService"});
    }

    public SourceDeviceApiService() {
        super(75, "com.google.android.gms.smartdevice.d2d.SourceDeviceService.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        SourceDeviceApiService sourceDeviceApiService0;
        SourceDeviceApiService.b.h("onGetService.", new Object[0]);
        String s = getServiceRequest0.f;
        boolean z = erpq.c(s, this.getPackageManager());
        new barf(s).a();
        Feature[] arr_feature = getServiceRequest0.k;
        if(arr_feature != null && arr_feature.length != 0) {
            if(arr_feature[0].equals(epvj.a)) {
                if(this.d == null) {
                    sourceDeviceApiService0 = this;
                    sourceDeviceApiService0.d = new eqvg(this.l, sourceDeviceApiService0, erpq.b(s, this), s, getServiceRequest0.p);
                }
                else {
                    sourceDeviceApiService0 = this;
                }
                cjtn0.c(sourceDeviceApiService0.d);
            }
            return;
        }
        if(this.c == null) {
            this.c = new eqbt(this.l, this, this.a, z, s, getServiceRequest0.p);
        }
        cjtn0.c(this.c);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        SourceDeviceApiService.b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread0 = new HandlerThread("SourceDeviceBackground", 10);
        handlerThread0.start();
        handlerThread0.getLooper();
        this.a = new clht(handlerThread0.getLooper());
    }

    @Override  // cjtg
    public final void onDestroy() {
        SourceDeviceApiService.b.j("onDestroy()", new Object[0]);
        eqbt eqbt0 = this.c;
        if(eqbt0 != null) {
            eqbt0.n();
        }
        erpi.a(this.a);
        super.onDestroy();
    }
}


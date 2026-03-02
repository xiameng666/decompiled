package com.google.android.gms.smartdevice.directtransfer;

import a;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import baun;
import bblp;
import cjtg;
import cjtn;
import cjts;
import cjvl;
import clht;
import com.google.android.gms.common.internal.GetServiceRequest;
import eqsz;
import eqte;
import erpi;
import erpq;
import erqc;
import ggfp;
import ggnj;
import hygx;

public class TargetDirectTransferApiService extends cjtg {
    Handler a;
    private static final baun b;
    private eqte c;

    static {
        TargetDirectTransferApiService.b = new erqc(new String[]{"D2D", "TargetDirectTransferApiService"});
    }

    public TargetDirectTransferApiService() {
        super(0xD3, "com.google.android.gms.smartdevice.directtransfer.TargetDirectTransferService.START", ggnj.a, 3, 9);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        TargetDirectTransferApiService targetDirectTransferApiService0;
        String s = getServiceRequest0.f;
        PackageManager packageManager0 = this.getPackageManager();
        boolean z = erpq.b(s, this);
        boolean z1 = erpq.a(s, ggfp.H(hygx.c().split(",")), packageManager0);
        if(hygx.l() && !z && !z1) {
            TargetDirectTransferApiService.b.f(a.a(s, "callingPackage: ", " is not authorized"), new Object[0]);
            throw new SecurityException(s + " is not authorized");
        }
        if(this.c == null) {
            cjvl cjvl0 = this.l;
            Handler handler0 = this.a;
            boolean z2 = erpq.c(s, packageManager0);
            String s1 = getServiceRequest0.p;
            targetDirectTransferApiService0 = this;
            targetDirectTransferApiService0.c = new eqte(new cjts(this, cjvl0, new bblp(1, 10)), targetDirectTransferApiService0, handler0, z, z2, s, s1);
        }
        else {
            targetDirectTransferApiService0 = this;
        }
        cjtn0.c(targetDirectTransferApiService0.c);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        TargetDirectTransferApiService.b.j("onCreate()", new Object[0]);
        HandlerThread handlerThread0 = new HandlerThread("TargetDeviceBackground", 10);
        handlerThread0.start();
        handlerThread0.getLooper();
        this.a = new clht(handlerThread0.getLooper());
    }

    @Override  // cjtg
    public final void onDestroy() {
        TargetDirectTransferApiService.b.j("onDestroy()", new Object[0]);
        eqte eqte0 = this.c;
        if(eqte0 != null) {
            eqte.a.h("onDestroy()", new Object[0]);
            eqte0.a();
            eqsz eqsz0 = new eqsz(eqte0);
            eqte0.b.post(eqsz0);
        }
        erpi.a(this.a);
        super.onDestroy();
    }
}


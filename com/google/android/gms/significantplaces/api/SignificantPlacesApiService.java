package com.google.android.gms.significantplaces.api;

import android.os.Binder;
import cclw;
import cjar;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import epgc;
import epgd;
import epgj;
import ephb;
import ibpu;
import ibuq;
import icbb;
import icck;
import iccl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class SignificantPlacesApiService extends cjtg {
    public epgj a;
    private final icck b;

    public SignificantPlacesApiService() {
        super(396, "com.google.android.gms.significantplaces.api.START", ibpu.a, 0, 9, epgd.a);
        this.b = iccl.b(cclw.f);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        epgj epgj0 = this.a;
        if(epgj0 == null) {
            ibuq.j("significantPlacesImpl");
            epgj0 = null;
        }
        cjts cjts0 = this.l();
        ibuq.e(cjtn0.b, "getClientType(...)");
        int v = Binder.getCallingUid();
        int v1 = Binder.getCallingPid();
        cjtn0.c(new ephb(this, epgj0, cjts0, cjar.b(cjtn0.b, getServiceRequest0, v, v1), epgd.a));
    }

    @Override  // cjtg
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        ibuq.f(fileDescriptor0, "fd");
        ibuq.f(printWriter0, "writer");
        ibuq.f(arr_s, "args");
        icbb.c(new epgc(this, printWriter0, null));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        this.a = new epgj(this, this.b);
    }

    @Override  // cjtg
    public final void onDestroy() {
        iccl.i(this.b);
        super.onDestroy();
    }
}


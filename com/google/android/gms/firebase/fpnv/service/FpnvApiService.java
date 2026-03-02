package com.google.android.gms.firebase.fpnv.service;

import bpyo;
import bpyt;
import bpyw;
import bpzd;
import bpzf;
import bpzu;
import bpzv;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import ibuq;
import java.util.Collections;

public final class FpnvApiService extends bpzf {
    public bpyw a;
    public bpyo b;
    public bpyt c;
    public bpzv d;

    public FpnvApiService() {
        super(429, "com.google.android.gms.firebase.fpnv.service.START", Collections.EMPTY_SET, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        bpyt bpyt1;
        bpyo bpyo1;
        bpyw bpyw1;
        ibuq.f(getServiceRequest0, "request");
        cjts cjts0 = this.l();
        if(this.d == null) {
            ibuq.j("fpnvImpl");
        }
        String s = getServiceRequest0.f;
        ibuq.e(s, "getCallingPackage(...)");
        bpyw bpyw0 = this.a;
        if(bpyw0 == null) {
            ibuq.j("fpnvGrpcClient");
            bpyw1 = null;
        }
        else {
            bpyw1 = bpyw0;
        }
        bpyo bpyo0 = this.b;
        if(bpyo0 == null) {
            ibuq.j("timeClient");
            bpyo1 = null;
        }
        else {
            bpyo1 = bpyo0;
        }
        bpyt bpyt0 = this.c;
        if(bpyt0 == null) {
            ibuq.j("tokenManager");
            bpyt1 = null;
        }
        else {
            bpyt1 = bpyt0;
        }
        bpzu bpzu0 = new bpzu(s, this, bpyw1, bpyo1, bpyt1);
        String s1 = getServiceRequest0.f;
        ibuq.e(s1, "getCallingPackage(...)");
        cjtn0.c(new bpzd(cjts0, bpzu0, s1, getServiceRequest0.p));
    }
}


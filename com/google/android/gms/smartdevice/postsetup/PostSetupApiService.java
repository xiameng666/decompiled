package com.google.android.gms.smartdevice.postsetup;

import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import eqvy;
import erpq;
import ggnj;

public class PostSetupApiService extends cjtg {
    private eqvy a;

    public PostSetupApiService() {
        super(190, "com.google.android.gms.smartdevice.postsetup.PostSetupService.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        PostSetupApiService postSetupApiService0;
        String s = getServiceRequest0.f;
        this.getPackageManager();
        if(this.a == null) {
            postSetupApiService0 = this;
            postSetupApiService0.a = new eqvy(this.l, postSetupApiService0, erpq.b(s, this), s, getServiceRequest0.p);
        }
        else {
            postSetupApiService0 = this;
        }
        cjtn0.c(postSetupApiService0.a);
    }
}


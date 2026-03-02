package com.google.android.gms.smartdevice.setup.auth;

import bbrg;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import erhy;
import erqc;
import ggnj;
import gmcg;
import gmcn;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SecondDeviceAuthChimeraService extends cjtg {
    public static final erqc a;
    private erhy b;

    static {
        SecondDeviceAuthChimeraService.a = new erqc(new String[]{"setup", "SecondDeviceAuthChimeraService"});
    }

    public SecondDeviceAuthChimeraService() {
        gmcg gmcg0 = gmcn.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bbrg("SecondDeviceAuthChimeraService", -2)));
        super(new int[]{275}, new String[]{"com.google.android.gms.smartdevice.setup.auth.SecondDeviceAuth.START"}, ggnj.a, 0, gmcg0, null);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        SecondDeviceAuthChimeraService.a.d("onGetService().", new Object[0]);
        if(this.b == null) {
            this.b = new erhy(this, this.l(), getServiceRequest0.f, getServiceRequest0.p);
        }
        cjtn0.c(this.b);
    }

    @Override  // cjtg
    public final void onDestroy() {
        erhy erhy0 = this.b;
        if(erhy0 != null) {
            erhy0.a.d();
            this.b = null;
        }
        super.onDestroy();
    }
}


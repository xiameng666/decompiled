package com.google.android.gms.auth.account.service;

import adff;
import adgz;
import android.content.Intent;
import android.os.IBinder;
import bbmq;
import cjtn;
import cjuo;
import cjup;
import cjvl;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class WorkAccountChimeraService extends Service implements cjuo {
    private adff a;
    private adgz b;

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        if(!bbmq.Y(this) && (s == null || !this.a.e(s))) {
            throw new SecurityException("Can\'t manage work accounts: " + s);
        }
        cjtn0.d(this.b, null);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        IBinder iBinder0;
        WorkAccountChimeraService workAccountChimeraService0;
        __monitor_enter(this);
        try {
            if(intent0.getAction() != null) {
                workAccountChimeraService0 = this;
                iBinder0 = new cjup(workAccountChimeraService0, 120, ggnj.a, 3, this);
                goto label_12;
            }
            goto label_14;
        }
        catch(Throwable throwable0) {
            workAccountChimeraService0 = this;
            goto label_10;
        }
        try {
            iBinder0 = new cjup(workAccountChimeraService0, 120, ggnj.a, 3, this);
            goto label_12;
        label_10:
            __monitor_exit(workAccountChimeraService0);
        }
        catch(Throwable throwable0) {
            goto label_10;
        }
        throw throwable0;
    label_12:
        __monitor_exit(workAccountChimeraService0);
        return iBinder0;
    label_14:
        __monitor_exit(this);
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new adgz(this, new cjvl(this));
        this.a = (adff)adff.a.b();
    }
}


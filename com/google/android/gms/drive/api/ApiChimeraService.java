package com.google.android.gms.drive.api;

import android.content.Intent;
import android.os.IBinder;
import bbql;
import bhhl;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class ApiChimeraService extends cjtg {
    public ApiChimeraService() {
        super(new int[]{11}, new String[]{"com.google.android.gms.drive.ApiService.START", "com.google.android.gms.drive.ApiService.STOP", "com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT"}, ggnj.a, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        this.l().b(new bhhl(getServiceRequest0.f, bbql.d(getServiceRequest0.h), cjtn0));
    }

    @Override  // cjtg
    public final IBinder onBind(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            return !"com.google.android.gms.drive.ApiService.STOP".equals(s) && !"com.google.android.gms.drive.ApiService.RESET_AFTER_BOOT".equals(s) ? super.onBind(intent0) : null;
        }
        return super.onBind(null);
    }
}


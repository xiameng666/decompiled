package com.google.android.gms.aliro.service;

import android.content.Intent;
import android.os.IBinder;
import avza;
import com.google.android.chimera.Service;

public class AliroNfcApduService extends avza {
    @Override  // avza
    public final IBinder onBind(Intent intent0) {
        Service service0 = this.b;
        if(service0 == null) {
            return null;
        }
        this.i(intent0);
        return service0.onBind(intent0);
    }
}


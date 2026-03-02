package com.google.android.gms.drivingmode;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import bhlq;
import bhmj;
import bhmq;
import com.google.android.chimera.BoundService;

public class DrivingModeManagerService extends BoundService {
    private bhlq a;

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        bhlq bhlq0 = new bhlq(this.getApplicationContext());
        this.a = bhlq0;
        if(!bhlq0.b) {
            bhlq0.b = true;
            bhlq0.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(bhlq0);
        }
        IBinder iBinder0 = new bhmj(this.getApplicationContext());
        return ((Binder)iBinder0).getInterfaceDescriptor() == null ? iBinder0 : new bhmq(((Binder)iBinder0));
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        bhlq bhlq0 = this.a;
        if(bhlq0.b) {
            bhlq0.b = false;
            Thread.setDefaultUncaughtExceptionHandler(bhlq0.a);
        }
        return false;
    }
}


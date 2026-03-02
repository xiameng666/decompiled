package com.google.android.location.settings;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;
import bbpd;
import bhir;
import cniy;
import com.google.android.gms.location.ActivityTransitionResult;
import evql;
import fuxo;
import fuxp;
import fuxq;
import fuxr;
import fuyt;
import fxzk;
import humy;
import hups;
import huue;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import jwe;

public class DrivingConditionChimeraProvider extends fxzk {
    private fuxr b;

    @Override  // fxzk
    protected final String a() {
        return "com.google.android.location.settings.DrivingConditionProvider";
    }

    public final void b(boolean z) {
        this.f(z, "Driving State");
        if(!hups.d()) {
            this.e();
        }
    }

    @Override  // fxzk
    protected final void c(int v) {
        if(huue.i() && v == 3) {
            Log.i("DrivingCondProvider", "For DRIVING_MODE_TRIGGER onConditionEnabled is noop");
            return;
        }
        fuxr fuxr0 = this.b;
        if(fuxr0 != null) {
            Intent intent0 = fuxq.a(fuxr0.a);
            PendingIntent pendingIntent0 = PendingIntent.getService(fuxr0.a, 0, intent0, 0x2000000);
            evql evql0 = new cniy(fuxr0.a).c(pendingIntent0);
            evql0.b(new fuxo(fuxr0.c));
            evql0.A(new fuxp(fuxr0.c));
            this.b = null;
        }
        fuyt.a(this).n(false, v);
    }

    @Override  // fxzk
    protected final void d(int v) {
        if(huue.i() && v == 3) {
            Log.i("DrivingCondProvider", "For DRIVING_MODE_TRIGGER onConditionEnabled is noop");
            return;
        }
        if(this.b == null) {
            this.b = new fuxr(this, this);
        }
        fuyt.a(this).n(true, v);
    }

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(huue.l()) {
            bbpd bbpd0 = new bbpd(printWriter0, "  ");
            bbpd0.println();
            bhir.a().b(bbpd0);
        }
    }

    @Override  // com.google.android.chimera.ConditionProviderService
    public final IBinder onBind(Intent intent0) {
        IBinder iBinder0 = super.onBind(intent0);
        if(hups.d()) {
            if(huue.l()) {
                jwe.b(this, bhir.a(), new IntentFilter("com.google.android.location.internal.CAR_DND_LOGGING"), 4);
            }
            return iBinder0;
        }
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        fuxr fuxr0 = this.b;
        if(fuxr0 != null && intent0 != null && intent0.getAction() != null && ActivityTransitionResult.b(intent0)) {
            int v2 = humy.h() ? intent0.getIntExtra("AR_AUDIO_FUSION_RESULT", -1) : -1;
            ActivityTransitionResult activityTransitionResult0 = ActivityTransitionResult.a(intent0);
            switch(fuxr0.b.a(activityTransitionResult0, v2) - 1) {
                case 1: {
                    fuxr0.d.b(true);
                    return 2;
                }
                case 2: {
                    fuxr0.d.b(false);
                    return 2;
                }
                default: {
                    return 2;
                }
            }
        }
        return 2;
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        if(huue.l()) {
            this.unregisterReceiver(bhir.a());
        }
        return false;
    }
}


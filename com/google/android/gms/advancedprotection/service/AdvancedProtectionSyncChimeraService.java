package com.google.android.gms.advancedprotection.service;

import abjg;
import abko;
import android.content.Intent;
import android.os.IBinder;
import bbdg;
import ccil;
import ccim;
import ccmq;
import com.google.android.chimera.Service;
import ibuq;
import java.util.concurrent.Executor;

public final class AdvancedProtectionSyncChimeraService extends Service {
    public static final int a;
    private ccim b;
    private abko c;

    static {
        abjg.a("AdvancedProtectionSyncChimeraService");
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.wQ);
        this.b = ccil.a(this);
        this.c = new abko(this);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        ccim ccim0 = this.b;
        abko abko0 = null;
        if(ccim0 == null) {
            ibuq.j("advancedProtectionManager");
            ccim0 = null;
        }
        abko abko1 = this.c;
        if(abko1 == null) {
            ibuq.j("aapmCallback");
        }
        else {
            abko0 = abko1;
        }
        ccim0.c(abko0);
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        ccim ccim0 = this.b;
        abko abko0 = null;
        if(ccim0 == null) {
            ibuq.j("advancedProtectionManager");
            ccim0 = null;
        }
        Executor executor0 = this.getMainExecutor();
        ibuq.e(executor0, "getMainExecutor(...)");
        abko abko1 = this.c;
        if(abko1 == null) {
            ibuq.j("aapmCallback");
        }
        else {
            abko0 = abko1;
        }
        ccim0.a(executor0, abko0);
        return 1;
    }
}


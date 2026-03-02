package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.content.Intent;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import craz;
import crji;
import crkt;
import crpg;
import crph;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

public class ChimeraPackageMeasurementTaskService extends GmsTaskChimeraService implements crpg {
    private crph a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        if(cllr0.a.hashCode() == 0x532E9558 && cllr0.a.equals("Measurement.PackageMeasurementTaskService.UPLOAD_TASK_TAG")) {
            crkt crkt0 = crkt.i(this);
            crji crji0 = crkt0.aJ();
            if(crkt0.c.a) {
                crji0.k.a("Device ChimeraPackageMeasurementTaskService called.");
                AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
                __monitor_enter(atomicBoolean0);
                int v = FIN.finallyOpen$NT();
                this.d().d(new craz(crkt0, crji0, atomicBoolean0));
                try {
                    for(long v1 = System.currentTimeMillis(); !atomicBoolean0.get() && v1 < 30000L + v1; v1 = System.currentTimeMillis()) {
                        atomicBoolean0.wait(30000L + v1 - v1);
                    }
                    FIN.finallyExec$NT(v);
                }
                catch(InterruptedException unused_ex) {
                    crji0.f.a("Interrupted in onRunTask while uploading");
                    FIN.finallyCodeBegin$NT(v);
                }
                return 0;
            }
            crji0.c.a("TaskService called on client side.");
        }
        return 2;
    }

    @Override  // crpg
    public final boolean b(int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // crpg
    public final void c(JobParameters jobParameters0) {
        throw new UnsupportedOperationException();
    }

    private final crph d() {
        if(this.a == null) {
            this.a = new crph(this);
        }
        return this.a;
    }

    @Override  // crpg
    public final void iK(Intent intent0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        super.onCreate();
        this.d().b();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onDestroy() {
        this.d().c();
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final void onRebind(Intent intent0) {
        this.d();
        crph.f(intent0);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final boolean onUnbind(Intent intent0) {
        this.d();
        crph.h(intent0);
        super.onUnbind(intent0);
        return false;
    }
}


package com.google.android.gms.learning.training.background;

import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import bbdg;
import cbyw;
import cbzh;
import ccdi;
import ccdn;
import ccdp;
import ccds;
import ccel;
import ccfl;
import ccgv;
import cchc;
import ccmq;
import cllr;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import fmzu;
import fmzv;
import fnaa;
import java.util.logging.Level;

public class TrainingGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final fnaa a;
    private fmzu b;
    private cbzh c;
    private volatile ccel d;

    static {
        TrainingGcmTaskChimeraService.a = fmzv.b("brella", "TrainingService");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.gA);
        return 0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final IBinder onBind(Intent intent0) {
        ccel ccel0;
        if("com.google.android.gms.learning.training.background.START".equals(intent0.getAction())) {
            try {
                ccel0 = (ccel)ccdp.a(this, "com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl", new cchc());
            }
            catch(ccdn ccdn0) {
                TrainingGcmTaskChimeraService.a.h(ccdn0, "LoadingException during onCreate");
                goto label_16;
            }
            try {
                ccel0.d(new ObjectWrapper(this));
            }
            catch(RemoteException remoteException0) {
                TrainingGcmTaskChimeraService.a.h(remoteException0, "RemoteException during onCreate");
            }
            try {
                ccel0.c("gms", new ccgv());
                ccel0.i(new ccds(this.getApplicationContext(), ((cbyw)this.b.c(cbyw.class))));
            }
            catch(RemoteException remoteException1) {
                TrainingGcmTaskChimeraService.a.h(remoteException1, "RemoteException during setHttpUrlConnectionFactory");
            }
            this.d = ccel0;
        label_16:
            if(this.d != null) {
                try {
                    return this.d.b(intent0);
                }
                catch(RemoteException remoteException2) {
                    TrainingGcmTaskChimeraService.a.h(remoteException2, "RemoteException in IInAppTrainingService.onBind");
                }
            }
            return new ccdi("No IInAppTrainingService implementation found");
        }
        this.c.c(1601);
        return super.onBind(intent0);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onCreate() {
        TrainingGcmTaskChimeraService.a.c(Level.INFO, TrainingGcmTaskChimeraService.a.a, null, "onCreate()", new Object[0]);
        super.onCreate();
        ccfl.a();
        fmzu fmzu0 = fmzu.b(this.getApplicationContext());
        this.b = fmzu0;
        this.c = (cbzh)fmzu0.c(cbzh.class);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final void onDestroy() {
        if(this.d != null) {
            try {
                this.d.e();
            }
            catch(RemoteException remoteException0) {
                TrainingGcmTaskChimeraService.a.h(remoteException0, "RemoteException in IInAppTrainingService.onDestroy");
            }
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final void onRebind(Intent intent0) {
        if(this.d != null) {
            try {
                this.d.f(intent0);
            }
            catch(RemoteException remoteException0) {
                TrainingGcmTaskChimeraService.a.h(remoteException0, "RemoteException in IInAppTrainingService.onRebind");
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onTrimMemory(int v) {
        if(this.d != null) {
            try {
                this.d.g(v);
            }
            catch(RemoteException remoteException0) {
                TrainingGcmTaskChimeraService.a.h(remoteException0, "RemoteException in IInAppTrainingService.onTrimMemory");
            }
        }
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final boolean onUnbind(Intent intent0) {
        if(this.d != null) {
            try {
                return this.d.h(intent0);
            }
            catch(RemoteException remoteException0) {
                TrainingGcmTaskChimeraService.a.h(remoteException0, "RemoteException in IInAppTrainingService.onUnbind");
            }
        }
        super.onUnbind(intent0);
        return false;
    }
}


package com.google.android.gms.location.provider.network;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import bbdg;
import bblp;
import bbnp;
import bbpd;
import ccmq;
import cnrn;
import cntb;
import cntc;
import cntd;
import cntj;
import com.google.android.chimera.Service;
import com.google.android.chimera.config.ModuleManager;
import j..util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class NetworkLocationChimeraService extends Service {
    private cnrn a;

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        cnrn cnrn0 = this.a;
        if(cnrn0 != null) {
            bbpd bbpd0 = new bbpd(printWriter0, "  ");
            ((cntb)((cntj)cnrn0).b.a).f(bbpd0);
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if(!bbnp.d(this)) {
            if(this.a == null) {
                try {
                    cntj cntj0 = new cntj(((Context)Objects.requireNonNull(ModuleManager.createSubmoduleContext(this, "network_location_provider"))));
                    this.a = cntj0;
                    bblp bblp0 = new bblp(1, 9);
                    cntc cntc0 = new cntc(cntj0);
                    cntj0.b.f(bblp0, cntc0);
                }
                catch(NoClassDefFoundError unused_ex) {
                    return null;
                }
                return this.a.getBinder();
            }
            return this.a.getBinder();
        }
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ccmq.a().a(bbdg.iX);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        cnrn cnrn0 = this.a;
        if(cnrn0 != null) {
            cntd cntd0 = new cntd();
            ((cntj)cnrn0).b.e(cntd0);
            this.a = null;
        }
        super.onDestroy();
    }
}


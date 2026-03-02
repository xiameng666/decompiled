package com.google.android.gms.icing.appindexing.service;

import android.content.Intent;
import android.os.IBinder;
import bbdg;
import bwne;
import bwrm;
import bxav;
import ccmq;
import cjup;
import com.google.android.chimera.Service;
import ggnj;
import hubn;
import hubu;

public class AppIndexingChimeraService extends Service {
    private bxav a;
    private boolean b;
    private String c;

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        if(!"com.google.android.gms.icing.APP_INDEXING_SERVICE".equals(intent0.getAction())) {
            bwne.b("Incompatible action: %s", intent0.getAction());
            return null;
        }
        bwrm bwrm0 = new bwrm(this.a, this.b, this.c);
        return new cjup(this, 0x71, ggnj.a, 3, bwrm0);
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.nk);
        if(hubn.i()) {
            this.a = bxav.c(this.getApplicationContext());
            this.b = hubu.a.b().I();
            this.c = hubu.a.b().a();
        }
        super.onCreate();
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        bxav bxav0 = this.a;
        if(bxav0 != null) {
            bxav0.b();
        }
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        return false;
    }
}


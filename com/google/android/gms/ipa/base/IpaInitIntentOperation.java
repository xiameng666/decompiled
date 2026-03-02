package com.google.android.gms.ipa.base;

import android.content.Context;
import android.content.Intent;
import avzf;
import bbcu;
import bbdg;
import bbic;
import bbmq;
import bboh;
import cajs;
import cakd;
import cakj;
import cakk;
import came;
import cank;
import ccmq;
import com.google.android.gms.ipa.mediastoreindexer.MediastoreCorporaInstantIndexingBoundService;
import ggtj;
import huhz;

public class IpaInitIntentOperation extends avzf {
    public static final int a;
    private static final String[] b;
    private static final bboh c;

    static {
        IpaInitIntentOperation.b = new String[]{"com.google.android.gms.ipa.base.IpaGcmTaskService"};
        IpaInitIntentOperation.c = bboh.b("GmscoreIpa", bbcu.ee);
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        if(huhz.n()) {
            new cank(this.getApplicationContext().getSharedPreferences("MediastoreIndexerSharedPrefs", 0)).f();
        }
        if(huhz.j() && huhz.a.h().F()) {
            this.getApplicationContext();
            cajs cajs0 = cajs.c();
            if(cajs0 != null) {
                cakk.a().b(new cakd(cajs0));
            }
        }
        String s = IpaInitIntentOperation.b[0];
        try {
            bbmq.G(this, s, true);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            ((ggtj)((ggtj)IpaInitIntentOperation.c.i()).ar(0x1760)).R("Component %s invalid: %s", s, illegalArgumentException0.getMessage());
            cakj.a().c(6);
        }
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        IpaGcmTaskChimeraService.d(this.getBaseContext());
        if(!huhz.l()) {
            Context context0 = this.getApplicationContext();
            Intent intent1 = MediastoreCorporaInstantIndexingBoundService.getStartIntent(context0, "com.google.android.gms.ipa.mediastoreindexer.PERSISTENT_START");
            if(intent1 == null) {
                ((ggtj)MediastoreCorporaInstantIndexingBoundService.a.i()).x("Service intent not available.");
                return;
            }
            came came0 = new came(context0);
            bbic.a().d(context0, intent1, came0, 1);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.uY);
    }
}


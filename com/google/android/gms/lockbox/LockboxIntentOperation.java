package com.google.android.gms.lockbox;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import azts;
import bbcu;
import bbib;
import bblp;
import bboh;
import com.google.android.chimera.IntentOperation;
import cova;
import covb;
import covg;
import covh;
import evql;
import faig;
import faik;
import gmcg;
import hvad;
import hvaq;

public class LockboxIntentOperation extends IntentOperation {
    public static final bboh a;
    public covb b;
    public faik c;
    final gmcg d;
    private bbib e;

    static {
        LockboxIntentOperation.a = bboh.b("LockboxIntentOp", bbcu.A);
    }

    public LockboxIntentOperation() {
        this.d = new bblp(1, 10);
    }

    public final void a(long v) {
        bbib bbib0 = this.e;
        long v1 = SystemClock.elapsedRealtime() + v;
        Intent intent0 = new Intent("com.google.android.gms.lockbox.CHECK_OPT_IN");
        bbib0.d("LockboxIntentOp", 3, v1, IntentOperation.getPendingIntent(this, LockboxIntentOperation.class, intent0, 0, 0x2000000), "com.google.android.gms");
    }

    public static void b(Context context0) {
        Intent intent0 = IntentOperation.getStartIntent(context0, LockboxIntentOperation.class, "com.google.android.gms.lockbox.CHECK_OPT_IN");
        if(intent0 != null) {
            context0.startService(intent0);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if(!hvad.c()) {
            return;
        }
        this.b = new covb(this);
        this.e = new bbib(this);
        this.c = new azts(this, new faig());
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hvad.c()) {
            covb covb0 = this.b;
            long v = SystemClock.elapsedRealtime();
            if(covb.a < 0L || v - covb.a > hvaq.a.b().a()) {
                covb.a = v;
                if(covb0.a()) {
                    new cova(covb0.b).h("");
                }
            }
            try {
                covh covh0 = new covh(this);
                if(!hvad.a.b().c()) {
                    evql evql0 = covh0.a.c.cn("LB_AS");
                    covg covg0 = new covg(covh0);
                    evql0.s(covh0.a.d, covg0);
                }
            }
            catch(IllegalStateException unused_ex) {
            }
        }
    }
}


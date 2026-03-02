package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import adga;
import adge;
import adgf;
import amdo;
import android.content.Intent;
import android.util.Log;
import bblp;
import com.google.android.chimera.IntentOperation;
import gakj;
import gakk;
import java.util.Locale;

public class BufferedLogsUploadIntentOperation extends IntentOperation {
    public gakj a;
    public adge b;
    private gakk c;
    private gakk d;

    private final void a(gakk gakk0, String s) {
        new bblp(1, 9).execute(new amdo(this, gakk0, s));
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        gakj gakj0 = gakj.a(this.getApplicationContext());
        gakk gakk0 = new gakk(this.getApplicationContext(), "ANDROID_AUTH");
        gakk gakk1 = new gakk(this.getApplicationContext(), "KIDS_SUPERVISION");
        adge adge0 = adgf.f(this.getApplicationContext());
        this.a = gakj0;
        this.c = gakk0;
        this.d = gakk1;
        this.b = adge0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 == null) {
            Log.w("Auth", String.format(Locale.US, "[BufferedLogsUploadIntentOperation] null intent"));
            return;
        }
        if(!"com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished".equals(intent0.getAction())) {
            Log.w("Auth", String.format(Locale.US, "[BufferedLogsUploadIntentOperation] Unknown action"));
            return;
        }
        gakk gakk0 = this.c == null ? new gakk(this.getApplicationContext(), "ANDROID_AUTH") : this.c;
        this.c = gakk0;
        this.a(gakk0, adga.b(this.getApplicationContext()));
        gakk gakk1 = this.d == null ? new gakk(this.getApplicationContext(), "KIDS_SUPERVISION") : this.d;
        this.d = gakk1;
        this.a(gakk1, adga.c(this.getApplicationContext()));
    }
}


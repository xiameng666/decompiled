package com.google.android.gms.thunderbird.config.reporters;

import a;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ewmr;
import ewnk;
import ewnl;
import ewsj;
import gfqx;
import hzay;
import j..util.Objects;
import java.io.IOException;

public class AbstractSmsReporter.SmsRequest.1 extends TracingBroadcastReceiver {
    final String a;
    final ewnk b;

    public AbstractSmsReporter.SmsRequest.1(ewnl ewnl0, Context context0, String s, ewnk ewnk0) {
        this.a = s;
        this.b = ewnk0;
        Objects.requireNonNull(ewnl0);
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(this.getResultCode() == -1) {
            synchronized(ewsj.b) {
                Long long0 = SystemClock.elapsedRealtime();
                ewsj.b.put(this.a, long0);
            }
            ewmr ewmr0 = new ewmr(true, this.getResultCode(), gfqx.a, null);
            this.b.c(ewmr0);
            return;
        }
        String s = "sms failed with error: " + this.getResultCode();
        if(hzay.a.o().aQ()) {
            int v1 = intent0.getIntExtra("errorCode", 0);
            if(v1 != 0) {
                ewmr ewmr1 = ewmr.c(this.getResultCode(), v1, new IOException(a.W(v1, s, " [", "]")));
                this.b.c(ewmr1);
                return;
            }
            ewmr ewmr2 = ewmr.b(this.getResultCode(), new IOException(s));
            this.b.c(ewmr2);
            return;
        }
        ewmr ewmr3 = ewmr.b(this.getResultCode(), new IOException(s));
        this.b.c(ewmr3);
    }
}


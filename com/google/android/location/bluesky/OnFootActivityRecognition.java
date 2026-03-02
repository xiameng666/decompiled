package com.google.android.location.bluesky;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import cmmn;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.ActivityTransitionResult;
import fvjx;
import java.util.concurrent.atomic.AtomicBoolean;

public class OnFootActivityRecognition extends TracingBroadcastReceiver {
    public final cmmn a;
    public final Context b;
    public final fvjx c;
    public PendingIntent d;
    public final AtomicBoolean e;

    public OnFootActivityRecognition(cmmn cmmn0, Context context0, fvjx fvjx0) {
        super("OnFootActivityRecognition");
        this.e = new AtomicBoolean(false);
        this.a = cmmn0;
        this.b = context0;
        this.c = fvjx0;
    }

    public final void b() {
        this.e.set(false);
        PendingIntent pendingIntent0 = this.d;
        if(pendingIntent0 == null) {
            return;
        }
        this.a.c(pendingIntent0);
        this.b.unregisterReceiver(this);
        this.d = null;
    }

    public final boolean c() {
        return this.d == null ? false : this.c.d();
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(intent0 != null && ActivityTransitionResult.b(intent0)) {
            ActivityTransitionResult activityTransitionResult0 = ActivityTransitionResult.a(intent0);
            this.c.b(activityTransitionResult0);
        }
    }
}


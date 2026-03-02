package com.google.android.gms.smartdevice.d2d;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import eqcx;
import eqcy;
import eqsl;
import java.util.ArrayDeque;
import java.util.Queue;

public class TargetAccountImportController.ChallengeIntentHelper extends ResultReceiver {
    public final Context a;
    public final Queue b;
    public final eqsl c;
    public final eqcy d;
    public boolean e;

    public TargetAccountImportController.ChallengeIntentHelper(Context context0, Handler handler0, eqsl eqsl0, eqcy eqcy0) {
        super(handler0);
        this.b = new ArrayDeque();
        this.a = context0;
        this.c = eqsl0;
        this.d = eqcy0;
    }

    @Override  // android.os.ResultReceiver
    protected final void onReceiveResult(int v, Bundle bundle0) {
        super.onReceiveResult(v, bundle0);
        eqcx.a.j("Received result from challenge %d", new Object[]{v});
        PendingIntent pendingIntent0 = (PendingIntent)this.b.poll();
        if(pendingIntent0 == null) {
            this.c.a();
            this.e = false;
            return;
        }
        this.d.f(pendingIntent0);
    }
}


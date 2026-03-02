package com.google.android.location.fused;

import cjnn;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fvxm;

public final class FusionEngine.FlushAlarmManager..ExternalSyntheticLambda0 implements GmsAlarmManagerCompat.OnAlarmListener {
    public final fvxm a;
    public final Runnable b;

    public FusionEngine.FlushAlarmManager..ExternalSyntheticLambda0(fvxm fvxm0, Runnable runnable0) {
        this.a = fvxm0;
        this.b = runnable0;
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        this.a.c = null;
        this.b.run();
    }
}


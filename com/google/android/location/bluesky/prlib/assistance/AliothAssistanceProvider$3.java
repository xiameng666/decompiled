package com.google.android.location.bluesky.prlib.assistance;

import cjnn;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import fvev;
import j..util.Objects;

public class AliothAssistanceProvider.3 implements GmsAlarmManagerCompat.OnAlarmListener {
    final fvev a;

    public AliothAssistanceProvider.3(fvev fvev0) {
        Objects.requireNonNull(fvev0);
        this.a = fvev0;
        super();
    }

    @Override  // com.google.android.gms.libs.platform.GmsAlarmManagerCompat$OnAlarmListener
    public final void a(cjnn cjnn0) {
        fvev fvev0 = this.a;
        if(cjnn0 == fvev0.b) {
            fvev0.f();
        }
    }
}


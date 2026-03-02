package com.google.android.location.bluesky.prlib.assistance;

import android.location.Location;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import fvev;
import j..util.Objects;

public class AliothAssistanceProvider.1 extends TracingLocationListener {
    final fvev a;

    public AliothAssistanceProvider.1(fvev fvev0) {
        Objects.requireNonNull(fvev0);
        this.a = fvev0;
        super("alioth_assistance_provider");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingLocationListener
    protected final void b(Location location0) {
        if(!Objects.equals(location0.getProvider(), "gps")) {
            return;
        }
        this.a.a.set(location0);
        this.a.h();
    }
}


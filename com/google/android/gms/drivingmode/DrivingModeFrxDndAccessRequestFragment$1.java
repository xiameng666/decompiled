package com.google.android.gms.drivingmode;

import android.content.Context;
import android.content.Intent;
import bhkw;
import bhkx;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import j..util.Objects;

public class DrivingModeFrxDndAccessRequestFragment.1 extends TracingBroadcastReceiver {
    final bhkx a;

    public DrivingModeFrxDndAccessRequestFragment.1(bhkx bhkx0) {
        Objects.requireNonNull(bhkx0);
        this.a = bhkx0;
        super("car_setup");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        this.a.a.i(new bhkw(this.a));
    }
}


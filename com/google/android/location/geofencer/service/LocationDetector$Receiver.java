package com.google.android.location.geofencer.service;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.LocationAvailability;
import fwjx;
import gzkq;
import j..util.Objects;

public final class LocationDetector.Receiver extends TracingBroadcastReceiver {
    final fwjx a;

    public LocationDetector.Receiver(fwjx fwjx0) {
        Objects.requireNonNull(fwjx0);
        this.a = fwjx0;
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(TextUtils.equals(intent0.getAction(), gzkq.a("com.google.android.location.internal.action.GEOFENCER_LOCATION_RESULT"))) {
            try {
                Location location0 = (Location)intent0.getParcelableExtra("com.google.android.location.LOCATION");
                if(location0 != null) {
                    this.a.d(location0);
                }
                if(LocationAvailability.b(intent0)) {
                    LocationAvailability locationAvailability0 = LocationAvailability.a(intent0);
                    if(locationAvailability0 != null) {
                        this.a.c(locationAvailability0);
                    }
                }
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }
}


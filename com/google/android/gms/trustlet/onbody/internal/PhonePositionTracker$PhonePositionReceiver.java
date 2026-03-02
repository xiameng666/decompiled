package com.google.android.gms.trustlet.onbody.internal;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import ezkz;
import j..util.Objects;

public class PhonePositionTracker.PhonePositionReceiver extends TracingBroadcastReceiver {
    final ezkz a;

    public PhonePositionTracker.PhonePositionReceiver(ezkz ezkz0) {
        Objects.requireNonNull(ezkz0);
        this.a = ezkz0;
        super("trustlet_onbody");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        if(!ActivityRecognitionResult.g(intent0)) {
            intent0.getExtras();
            return;
        }
        ezkz ezkz0 = this.a;
        long v = SystemClock.elapsedRealtime();
        ezkz0.i = v;
        if(v >= ezkz0.g + 10000L) {
            ActivityRecognitionResult activityRecognitionResult0 = ActivityRecognitionResult.c(intent0);
            if(activityRecognitionResult0.b >= ezkz0.j && ezkz0.f) {
                DetectedActivity detectedActivity0 = activityRecognitionResult0.d();
                boolean z = true;
                int v1 = 0;
                switch(detectedActivity0.a()) {
                    case 5: {
                        if(detectedActivity0.e <= 50) {
                            z = false;
                        }
                        break;
                    }
                    case 9: {
                        int v2 = detectedActivity0.e > 50 ? 1 : 0;
                        if(detectedActivity0.e > 50) {
                            z = false;
                        }
                        v1 = v2;
                        break;
                    }
                    default: {
                        return;
                    }
                }
                long v3 = activityRecognitionResult0.b;
                if(z) {
                    ezkz0.b.set(-1L);
                    ezkz0.d.n();
                }
                else if(v1 != 0) {
                    ezkz0.j = v3;
                    ezkz0.b.compareAndSet(-1L, v3);
                    ezkz0.b.get();
                    if(v3 - ezkz0.b.get() >= 0L) {
                        ezkz0.d.m();
                    }
                }
                if(ezkz0.h != null && ezkz0.h.isPowerSaveMode() && ezkz0.f) {
                    ezkz0.d.k("On-body_detection_is_disabled_in_power_saving_mode");
                }
            }
        }
    }
}


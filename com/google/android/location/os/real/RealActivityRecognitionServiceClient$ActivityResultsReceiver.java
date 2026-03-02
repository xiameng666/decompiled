package com.google.android.location.os.real;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.ActivityRecognitionResult;
import fuzs;
import fwvb;
import humr;
import humv;
import j..util.Objects;

public class RealActivityRecognitionServiceClient.ActivityResultsReceiver extends TracingBroadcastReceiver {
    public RealActivityRecognitionServiceClient.ActivityResultsReceiver(fwvb fwvb0) {
        Objects.requireNonNull(fwvb0);
        super("location");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        fuzs fuzs0;
        ActivityRecognitionResult activityRecognitionResult0 = ActivityRecognitionResult.c(intent0);
        if(activityRecognitionResult0 != null && humv.g()) {
            synchronized(fuzs.class) {
                fuzs0 = fuzs.a;
            }
            if(fuzs0 != null) {
                fuzs0.b(activityRecognitionResult0, false);
                synchronized(fuzs0) {
                    humv humv0 = humv.a;
                    if(humv0.d().R() && fuzs0.i) {
                        fwvb fwvb0 = fuzs0.j;
                        if(fuzs0.c.c() - fuzs0.f > humv0.d().r() && fuzs0.e && !fuzs0.c()) {
                            fwvb0.a();
                            long v1 = humr.b();
                            fuzs0.g = v1;
                            fwvb0.b(v1);
                        }
                        else if(!fuzs0.e && fuzs0.c()) {
                            fwvb0.a();
                            long v2 = humr.c();
                            fuzs0.g = v2;
                            fwvb0.b(v2);
                        }
                    }
                }
            }
        }
    }
}


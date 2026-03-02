package com.google.android.gms.ads.signalsdk;

import abaq;
import abbc;
import abbm;
import android.content.Intent;
import android.os.IBinder;
import cjtg;
import cjtn;
import com.google.android.gms.ads.internal.util.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.concurrent.c;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public class SignalSdkChimeraService extends cjtg {
    public SignalSdkChimeraService() {
        super(203, "com.google.android.gms.ads.service.SDK_SIGNAL", Collections.singleton("android.permission.INTERNET"), 3, 10);
        this.setWantIntentExtras(true);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        abaq abaq0 = (abaq)abbm.f(this);
        cjtn0.c(new l(abbc.b(abaq0.a), new VersionInfoParcel(0xF1B18AD, 0xF1B18AD), ((String)abaq0.o.get()), c.a(), ((ScheduledExecutorService)abaq0.k.get()), ((ab)abaq0.l.get()), abaq0.c()));
    }

    @Override  // cjtg
    public final IBinder onBind(Intent intent0) {
        return intent0.getBooleanExtra("non_gms", false) ? abbm.f(this).a() : super.onBind(intent0);
    }
}


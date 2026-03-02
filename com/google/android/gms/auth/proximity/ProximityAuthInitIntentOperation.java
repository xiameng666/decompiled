package com.google.android.gms.auth.proximity;

import albt;
import alhm;
import alhq;
import android.content.Context;
import android.content.Intent;
import avzf;
import bbmq;
import com.google.android.gms.auth.proximity.exo.ExoChimeraService;
import com.google.android.gms.auth.proximity.firstparty.CryptauthDeviceSyncGcmTaskService;
import com.google.android.gms.auth.proximity.multidevice.BetterTogetherUnifiedSetupIntentOperation;
import com.google.android.gms.auth.proximity.phonehub.PhoneHubChimeraService;
import hpzm;
import j..util.Objects;

public class ProximityAuthInitIntentOperation extends avzf {
    private static final String[] a;

    static {
        ProximityAuthInitIntentOperation.a = new String[]{"com.google.android.gms.auth.proximity.phonehub.PhoneHubService"};
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        bbmq.G(this, ProximityAuthInitIntentOperation.a[0], true);
        if(albt.c()) {
            bbmq.G(this, "com.google.android.gms.auth.proximity.exo.ExoService", true);
        }
        if(!hpzm.L()) {
            bbmq.G(this, "com.google.android.gms.auth.proximity.phonehub.PhoneHubNotificationListenerService", hpzm.F());
        }
        bbmq.L("com.google.android.gms.auth.proximity.phonehub.NotificationOptInActivity", 0);
        if((v & 2) <= 0) {
            Context context0 = this.getApplicationContext();
            context0.startService(new Intent().setClassName(context0, "com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationService").putExtra("EXTRA_IS_INIT_INTENT", true));
        }
        CryptauthDeviceSyncGcmTaskService.f(this.getApplicationContext());
        this.startService(((Intent)Objects.requireNonNull(alhq.a(this.getBaseContext(), false))));
        this.startService(BetterTogetherUnifiedSetupIntentOperation.a(this.getBaseContext()));
        this.startService(PhoneHubChimeraService.a(this.getBaseContext()));
        if(albt.c()) {
            this.startService(ExoChimeraService.a(this, "ProximityAuth init"));
        }
        alhm.a(this.getBaseContext()).a();
    }
}


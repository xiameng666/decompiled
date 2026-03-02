package com.google.android.gms.auth.proximity.firstparty;

import alej;
import alek;
import alen;
import android.accounts.Account;
import android.content.Intent;
import baun;
import bbmn;
import com.google.android.chimera.IntentOperation;
import hpyz;

public class DeviceSyncV2SyncFinishedIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        DeviceSyncV2SyncFinishedIntentOperation.a = new baun("ProximityAuth", new String[]{"DeviceSyncV2FeatureIntentOperation"});
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!"com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FINISHED".equals(intent0.getAction())) {
            return;
        }
        if(!hpyz.j()) {
            DeviceSyncV2SyncFinishedIntentOperation.a.m("Received v2 sync finished broadcast but v2 registration is turned off!", new Object[0]);
            return;
        }
        String s = intent0.getStringExtra("account_name");
        Account account0 = new Account(s, "com.google");
        if(!bbmn.m(this, account0)) {
            DeviceSyncV2SyncFinishedIntentOperation.a.m("Invalid account: %s", new Object[]{s});
            return;
        }
        if(hpyz.g()) {
            alen.a(this, account0);
            return;
        }
        int v = intent0.getIntExtra("invocation_reason", 0);
        try {
            alej.a(this).a(account0, v);
        }
        catch(alek unused_ex) {
            DeviceSyncV2SyncFinishedIntentOperation.a.m("Failed to sync v1 devices.", new Object[0]);
            CryptauthDeviceSyncGcmTaskService.g(this.getApplicationContext(), account0);
            alen.a(this, account0);
        }
    }
}


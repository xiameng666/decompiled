package com.google.android.gms.auth.proximity.firstparty;

import ajcr;
import alej;
import alek;
import alen;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import baun;
import bbmn;
import com.google.android.chimera.IntentOperation;
import hpyw;

public class CryptauthDevicesSyncedIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        CryptauthDevicesSyncedIntentOperation.a = new baun("ProximityAuth", new String[]{"CryptauthDevicesSyncedIntentOperation"});
    }

    public CryptauthDevicesSyncedIntentOperation() {
    }

    CryptauthDevicesSyncedIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if("com.google.android.gms.auth.authzen.DEVICE_SYNC_FINISHED".equals(intent0.getAction())) {
            String s = intent0.getStringExtra("permit_id");
            Account account0 = null;
            if(s == null) {
                CryptauthDevicesSyncedIntentOperation.a.m("No permit ID was found from intent.", new Object[0]);
            }
            else {
                String s1 = s.substring(34);
                for(Object object0: bbmn.h(this, "com.google.android.gms")) {
                    Account account1 = (Account)object0;
                    if(ajcr.a(account1.name).equals(s1)) {
                        account0 = account1;
                    }
                }
                if(account0 == null) {
                    CryptauthDevicesSyncedIntentOperation.a.m("Invalid account: %s", new Object[]{s1});
                }
            }
            if(hpyw.g()) {
                CryptauthDeviceSyncGcmTaskService.f(this.getApplicationContext());
                int v = intent0.getIntExtra("invocation_reason", 0);
                if(hpyw.a.f().k() && v == 4) {
                    alen.a(this, account0);
                    return;
                }
                try {
                    alej.a(this).b(account0, v);
                }
                catch(alek unused_ex) {
                    CryptauthDevicesSyncedIntentOperation.a.m("Failed to sync devices.", new Object[0]);
                    if(account0 != null) {
                        CryptauthDeviceSyncGcmTaskService.g(this.getApplicationContext(), account0);
                        return;
                    }
                }
                return;
            }
            alen.a(this, account0);
        }
    }
}


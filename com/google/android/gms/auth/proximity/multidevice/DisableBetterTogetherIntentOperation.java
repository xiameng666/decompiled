package com.google.android.gms.auth.proximity.multidevice;

import alfr;
import algg;
import aliu;
import android.content.Context;
import android.content.Intent;
import baun;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import ggia;
import hpyz;
import java.util.List;

public class DisableBetterTogetherIntentOperation extends IntentOperation {
    public static final int a;
    private static final baun b;

    static {
        DisableBetterTogetherIntentOperation.b = new baun("ProximityAuth", new String[]{"DisableBetterTogether"});
    }

    public DisableBetterTogetherIntentOperation() {
    }

    public DisableBetterTogetherIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        aliu aliu0 = new aliu();
        String s = intent0.getStringExtra("EXTRA_ACCOUNT_NAME");
        if(s == null) {
            aliu0.o(1);
            return;
        }
        SyncedCryptauthDevice syncedCryptauthDevice0 = alfr.b(this, s);
        if(syncedCryptauthDevice0 == null) {
            DisableBetterTogetherIntentOperation.b.m("Can\'t disable Better Together because synced metadata is null.", new Object[0]);
            aliu0.o(2);
            return;
        }
        List list0 = syncedCryptauthDevice0.m;
        if(hpyz.f()) {
            algg.b(list0, s, this);
        }
        else {
            for(Object object0: list0) {
                algg.b(ggia.d(new String[]{((String)object0)}), s, this);
            }
        }
        aliu0.o(0);
    }
}


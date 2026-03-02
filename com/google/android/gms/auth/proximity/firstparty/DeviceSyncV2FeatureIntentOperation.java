package com.google.android.gms.auth.proximity.firstparty;

import alfa;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import baun;
import bbmn;
import com.google.android.chimera.IntentOperation;
import ghgc;
import ghjc;
import gqus;
import hpyz;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class DeviceSyncV2FeatureIntentOperation extends IntentOperation {
    private static final baun a;
    private final alfa b;

    static {
        DeviceSyncV2FeatureIntentOperation.a = new baun("ProximityAuth", new String[]{"DeviceSyncV2FeatureIntentOperation"});
    }

    public DeviceSyncV2FeatureIntentOperation() {
        this.b = new alfa();
    }

    DeviceSyncV2FeatureIntentOperation(Context context0, alfa alfa0) {
        this.attachBaseContext(context0);
        this.b = alfa0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s2;
        if("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE".equals(intent0.getAction()) && hpyz.i()) {
            String s = intent0.getStringExtra("account_name");
            Account account0 = new Account(s, "com.google");
            if(!bbmn.m(this, account0)) {
                DeviceSyncV2FeatureIntentOperation.a.m("Invalid account: %s", new Object[]{s});
                return;
            }
            String s1 = intent0.getStringExtra("feature_name");
            gqus[] arr_gqus = gqus.values();
            for(int v = 0; true; ++v) {
                if(v >= arr_gqus.length) {
                    DeviceSyncV2FeatureIntentOperation.a.m("Couldn\'t retrieve feature name from hashed value", new Object[0]);
                    s2 = gqus.a.name();
                    break;
                }
                gqus gqus0 = arr_gqus[v];
                Charset charset0 = Charset.forName("UTF-8");
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
                byteBuffer0.putLong(ghgc.a.c(gqus0.name(), charset0).c());
                if(ghjc.e.g().o(byteBuffer0.array()).equals(s1)) {
                    s2 = gqus0.name();
                    break;
                }
            }
            this.b.a(this, account0, s2);
        }
    }
}


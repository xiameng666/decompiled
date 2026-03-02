package com.google.android.gms.auth.proximity.multidevice;

import alfr;
import algg;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import ggia;
import gqus;

public class SetFeatureEnabledIntentOperation extends IntentOperation {
    public SetFeatureEnabledIntentOperation() {
    }

    public SetFeatureEnabledIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    public static Intent a(Context context0, String s, gqus gqus0, boolean z) {
        Intent intent0 = IntentOperation.getStartIntent(context0, SetFeatureEnabledIntentOperation.class, "com.google.android.gms.auth.proximity.multidevice.SET_FEATURE_ENABLED");
        intent0.putExtra("EXTRA_ACCOUNT_NAME", s);
        intent0.putExtra("EXTRA_FEATURE_NAME", gqus0.name());
        intent0.putExtra("EXTRA_ENABLED", z);
        return intent0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        String s = intent0.getStringExtra("EXTRA_ACCOUNT_NAME");
        String s1 = intent0.getStringExtra("EXTRA_FEATURE_NAME");
        boolean z = intent0.getBooleanExtra("EXTRA_ENABLED", false);
        if(s != null && alfr.b(this, s) != null) {
            algg.d(ggia.d(new String[]{s1}), z, s, this, true);
        }
    }
}


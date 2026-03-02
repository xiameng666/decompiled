package com.google.android.gms.googlehelp.service;

import android.content.Intent;
import android.text.TextUtils;
import bbcu;
import bboh;
import btnq;
import btti;
import btxj;
import com.google.android.chimera.IntentOperation;

public class ClearHelpHistoryChimeraIntentOperation extends IntentOperation {
    public static final int a;

    static {
        bboh.b("gH_ClearHelpHistoryISvc", bbcu.aw);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getStringExtra("app_package_name");
            if(!TextUtils.isEmpty(s)) {
                btti btti0 = new btti(this);
                btnq btnq0 = new btnq(this);
                btxj btxj0 = new btxj(this, s);
                btti0.d(s);
                btti0.close();
                btnq0.i(s);
                btnq0.close();
                btxj0.d();
                btxj0.close();
            }
        }
    }
}


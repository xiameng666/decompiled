package com.google.android.location.quake.ealert;

import android.content.Intent;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import fxjt;
import fxkh;
import huqb;

public class ArwEAlertSettingChangeIntentOperation extends IntentOperation {
    static {
        bboh.c("EAlert", bbcu.g, "SetChngIOp");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.jj);
        if(intent0 != null && "com.google.android.settings.ARW_EALERT_SETTING_CHANGED".equals(intent0.getAction())) {
            if(huqb.E()) {
                fxjt fxjt0 = fxjt.c;
                if(fxjt0 != null) {
                    fxjt0.a();
                }
            }
            else {
                fxkh fxkh0 = fxkh.c;
                if(fxkh0 != null) {
                    fxkh0.a();
                }
            }
        }
    }
}


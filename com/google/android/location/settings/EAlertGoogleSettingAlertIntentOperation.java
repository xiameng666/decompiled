package com.google.android.location.settings;

import android.content.Intent;
import batl;
import com.google.android.chimera.IntentOperation;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import fxhk;
import fxjt;
import fxmp;
import j..util.Objects;

public final class EAlertGoogleSettingAlertIntentOperation extends IntentOperation {
    private final fxhk a;

    public EAlertGoogleSettingAlertIntentOperation() {
        this.a = new fxhk(fxjt.b());
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.location.EALERT_GOOGLE_SETTING_DEBUG")) {
            EAlertUxArgs eAlertUxArgs0 = fxmp.b(intent0.getExtras());
            batl.t(eAlertUxArgs0, "eAlertUxArgs cannot be null for debug");
            switch(eAlertUxArgs0.k) {
                case 3: {
                    this.a.c(eAlertUxArgs0);
                    return;
                }
                case 4: {
                    this.a.b(eAlertUxArgs0);
                    return;
                }
                case 5: {
                    this.a.f(eAlertUxArgs0);
                    return;
                }
                case 6: {
                    this.a.d(eAlertUxArgs0);
                    return;
                }
                case 7: {
                    this.a.e(eAlertUxArgs0);
                    return;
                }
                default: {
                    throw new AssertionError("Unknown Alert");
                }
            }
        }
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.location.EALERT_GOOGLE_SETTING_ALERT_DEMO")) {
            EAlertUxArgs eAlertUxArgs1 = fxmp.b(intent0.getExtras());
            batl.t(eAlertUxArgs1, "eAlertUxArgs cannot be null for demo");
            Intent intent1 = IntentOperation.getStartIntent(this, "com.google.android.location.ealert.EAlertTalkToNodeIntentOperation", "com.google.android.gms.location.EALERT_TALK_TO_WEAR");
            batl.s(intent1);
            intent1.putExtra("EALERT_PATH_TO_TALK_ARG", "/ealert_take_action");
            intent1.putExtra("EALERT_UX_EXTRA", "EALERT_DEMO");
            intent1.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs1);
            fxmp.d(intent1, fxjt.b());
            this.startService(intent1);
        }
    }
}


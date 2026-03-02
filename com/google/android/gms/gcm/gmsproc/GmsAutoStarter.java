package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import bsln;
import bsog;
import bsvn;
import bsvo;
import cljp;
import com.google.android.chimera.IntentOperation;
import j..util.Objects;

public class GmsAutoStarter extends IntentOperation {
    public static void a(Context context0, Intent intent0) {
        bsln.i(context0);
        String s = intent0.getAction();
        if(Objects.equals(s, "com.google.android.checkin.CHECKIN_COMPLETE") && !intent0.getBooleanExtra("success", true)) {
            return;
        }
        if(Objects.equals(s, "com.google.android.gms.gcm.REGISTERED")) {
            bsvo bsvo0 = bsvo.a(context0);
            bsvo.d(bsog.b(bsvo0.a));
            bsvo0.b();
            return;
        }
        bsvn.d(context0, true, cljp.a(context0));
        bsvo.a(context0).b();
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        GmsAutoStarter.a(this, intent0);
    }
}


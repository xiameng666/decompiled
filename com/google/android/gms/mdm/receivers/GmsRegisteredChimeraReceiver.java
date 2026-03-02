package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import bbnp;
import com.google.android.chimera.IntentOperation;
import cqjv;
import hlud;

public class GmsRegisteredChimeraReceiver extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!bbnp.d(this)) {
            cqjv.c();
            Intent intent1 = cqjv.a(this, false, hlud.h);
            if(intent1 != null) {
                this.startService(intent1);
            }
        }
    }
}


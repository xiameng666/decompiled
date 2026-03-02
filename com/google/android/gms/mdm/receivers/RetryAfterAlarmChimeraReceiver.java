package com.google.android.gms.mdm.receivers;

import android.content.Context;
import android.content.Intent;
import bblp;
import com.google.android.chimera.BroadcastReceiver;
import cqjl;

public class RetryAfterAlarmChimeraReceiver extends BroadcastReceiver {
    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Context context1 = context0.getApplicationContext();
        new bblp(1, 9).execute(new cqjl(this, context1));
    }
}


package com.google.android.gms.inappreach.receiver;

import android.content.Context;
import android.content.Intent;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import esah;
import ggtj;
import hufv;

public final class GcmChimeraBroadcastReceiver extends esah {
    private static final String b = "com.google.android.gms.inappreach.receiver.GcmChimeraBroadcastReceiver";
    private static final bboh d;

    static {
        GcmChimeraBroadcastReceiver.d = bboh.b(GcmChimeraBroadcastReceiver.class.getName(), bbcu.fh);
    }

    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(!hufv.d()) {
            return;
        }
        Intent intent1 = IntentOperation.getStartIntent(context0, PushIntentOperation.class, "com.google.android.gms.inappreach.intents.HANDLE_GCM_PUSH");
        if(intent1 != null) {
            intent1.putExtras(intent0);
        }
        if(intent1 == null) {
            ((ggtj)((ggtj)GcmChimeraBroadcastReceiver.d.j()).ar(5806)).B("Failed creating service intent for \'%s\'", PushIntentOperation.a);
            return;
        }
        WakefulBroadcastReceiver.startWakefulService(context0, intent1);
    }
}


package com.google.android.gms.cast.rcn;

import android.content.Intent;
import atyb;
import avbc;
import avbd;
import avjh;
import com.google.android.chimera.IntentOperation;
import gkfo;
import j..util.Objects;

public class RemoteControlNotificationMediaIntentOperation extends IntentOperation {
    private static final avjh a;

    static {
        RemoteControlNotificationMediaIntentOperation.a = new avjh("RCNIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.cast.rcn.ACTION_CLICK")) {
            avbd avbd0 = CastRemoteControlNotificationChimeraService.c;
            avjh avjh0 = RemoteControlNotificationMediaIntentOperation.a;
            avjh0.m("RCN ACTION_CLICK received via Intent Operation.");
            if(avbd0 == null) {
                avjh0.d("Received ACTION_CLICK before controllerManager was initialized.", new Object[0]);
                return;
            }
            avbc avbc0 = avbd0.a(intent0.getStringExtra("extra_device_id"));
            if(avbc0 != null) {
                avjh avjh1 = avbc.a;
                avjh1.m("handleClickAction is called");
                Intent intent1 = (Intent)intent0.getParcelableExtra("extra_intent_to_launch");
                if(intent1 == null) {
                    avjh1.d("No intent embedded in the content intent.", new Object[0]);
                    return;
                }
                if(avbc0.c.s()) {
                    intent1.setFlags(0x10000000);
                }
                avbc0.b.startActivity(intent1);
                int v = gkfo.a(intent0.getIntExtra("extra_click_result_code", 0));
                if(v != 0) {
                    atyb atyb0 = avbc0.d.a.f.a();
                    avbc0.d.a.ai(avbc0.d.b, ((long)avbc0.d.c), atyb0, avbc0.d.d, v);
                }
            }
        }
    }
}


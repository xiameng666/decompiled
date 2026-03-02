package com.google.android.gms.notifications.registration.service.operations;

import android.content.Context;
import android.content.Intent;
import bbdg;
import ccmq;
import djwn;
import djwv;
import hekb;
import hfuh;
import hvsr;
import hvsy;
import ibuq;

public final class BlockStateChangeIntentOperation extends djwv {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.eK);
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null) {
                switch(s.hashCode()) {
                    case 452039370: {
                        if(s.equals("android.app.action.APP_BLOCK_STATE_CHANGED") && new hfuh(hvsy.c().c, hvsr.a).contains(hekb.k)) {
                            Context context0 = this.getApplicationContext();
                            ibuq.e(context0, "getApplicationContext(...)");
                            ibuq.f(context0, "context");
                            djwn.a(context0, "RE_REGISTER_APP_BLOCK_STATE");
                            return;
                        }
                        break;
                    }
                    case 0x3012FFD0: {
                        if(s.equals("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
                            goto label_15;
                        }
                        break;
                    }
                    case 0x45DAF6B0: {
                        if(s.equals("android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED")) {
                        label_15:
                            if(new hfuh(hvsy.c().c, hvsr.a).contains(hekb.l)) {
                                Context context1 = this.getApplicationContext();
                                ibuq.e(context1, "getApplicationContext(...)");
                                ibuq.f(context1, "context");
                                djwn.a(context1, "RE_REGISTER_CHANNEL_BLOCK_STATE");
                                return;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}


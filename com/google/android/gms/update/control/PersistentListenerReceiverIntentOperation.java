package com.google.android.gms.update.control;

import android.content.Intent;
import baun;
import com.google.android.chimera.IntentOperation;
import ezwu;
import ezxn;
import fabk;
import j..util.Objects;

public class PersistentListenerReceiverIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        PersistentListenerReceiverIntentOperation.a = fabk.d("PersistentListenerReceiverIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!ezwu.b(this)) {
            PersistentListenerReceiverIntentOperation.a.h("System update management not enabled in this context. Ignoring intent: %s", new Object[]{intent0});
            return;
        }
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.update.HANDLE_ACTION_BROADCAST")) {
            String s = intent0.getStringExtra("original_action");
            if(s != null) {
                ezxn ezxn0 = (ezxn)ezxn.b.b();
                if(s.equals("android.intent.action.SCREEN_ON")) {
                    ezxn0.a(13);
                    return;
                }
                PersistentListenerReceiverIntentOperation.a.m("Received unexpected action broadcast: %s", new Object[]{s});
            }
        }
    }
}


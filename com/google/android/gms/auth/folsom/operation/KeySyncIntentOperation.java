package com.google.android.gms.auth.folsom.operation;

import ajwd;
import akbi;
import akbl;
import akbm;
import akbn;
import akbo;
import akdv;
import akea;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import baun;
import bbdg;
import bblp;
import bboh;
import ccmq;
import com.google.android.chimera.IntentOperation;
import hpuq;

public class KeySyncIntentOperation extends IntentOperation {
    public static final baun a;
    public static final bboh b;

    static {
        KeySyncIntentOperation.a = akea.a("KeySyncIntentOperation");
        KeySyncIntentOperation.b = akea.b("KeySyncIntentOperation");
    }

    public KeySyncIntentOperation() {
    }

    public KeySyncIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    public static int a(Account account0, int v) {
        akbm akbm0 = new akbm();
        akbm0.a = account0;
        akbm0.b = v == 18 ? akbn.i : akbn.g;
        akbo akbo0 = akbm0.a();
        try {
            new akbl(akbo0).s();
            return 2;
        }
        catch(akbi akbi0) {
            KeySyncIntentOperation.a.g("Failed to sync with FolsomSyncManager", akbi0, new Object[0]);
            return 1;
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.mM);
        if(!akdv.b) {
            Object[] arr_object = {intent0.getAction()};
            KeySyncIntentOperation.a.h("Build is lower than P. No need to handle action=[%s]", arr_object);
            return;
        }
        if(!hpuq.c()) {
            KeySyncIntentOperation.a.m("auth_folsom_is_folsom_enabled is not enabled.", new Object[0]);
            return;
        }
        String s = intent0.getAction();
        KeySyncIntentOperation.a.d("onHandleIntent. action: %s", new Object[]{s});
        if("android.security.action.RECOVERABLE_KEYSTORE_SNAPSHOT".equals(s)) {
            new bblp(1, 10).execute(new ajwd(this));
        }
    }
}


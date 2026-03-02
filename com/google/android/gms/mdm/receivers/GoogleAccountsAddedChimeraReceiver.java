package com.google.android.gms.mdm.receivers;

import android.content.Intent;
import cqix;
import cqjm;
import cqjv;

public class GoogleAccountsAddedChimeraReceiver extends AccountsChangedChimeraReceiver {
    private static boolean a;

    public static boolean a() {
        synchronized(GoogleAccountsAddedChimeraReceiver.class) {
        }
        return GoogleAccountsAddedChimeraReceiver.a;
    }

    public static void b() {
        synchronized(GoogleAccountsAddedChimeraReceiver.class) {
            GoogleAccountsAddedChimeraReceiver.a = true;
        }
    }

    @Override  // com.google.android.gms.mdm.receivers.AccountsChangedChimeraReceiver
    public final void onHandleIntent(Intent intent0) {
        if(GoogleAccountsAddedChimeraReceiver.a() && "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent0.getAction()) && intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            cqjv.c();
            cqix.k.d(Integer.valueOf(1));
            cqjm.c(this, System.currentTimeMillis() + 60000L);
        }
    }
}


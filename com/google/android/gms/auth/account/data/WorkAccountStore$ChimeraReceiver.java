package com.google.android.gms.auth.account.data;

import acyv;
import adqe;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import com.google.android.chimera.BroadcastReceiver;
import java.util.List;

public class WorkAccountStore.ChimeraReceiver extends BroadcastReceiver {
    @Override  // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent0.getAction()) && intent0.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED")) {
            acyv acyv0 = (acyv)acyv.a.b();
            List list0 = adqe.c(intent0);
            SharedPreferences.Editor sharedPreferences$Editor0 = acyv0.b.edit();
            for(Object object0: list0) {
                Account account0 = (Account)object0;
                if("com.google.work".equals(account0.type)) {
                    sharedPreferences$Editor0.remove(account0.name);
                }
            }
            sharedPreferences$Editor0.apply();
        }
    }
}


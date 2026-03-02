package com.google.android.gms.auth.account.be;

import acvp;
import adla;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import gftb;
import java.util.Locale;

public class RemoveAccountChimeraIntentService extends TracingIntentService {
    public RemoveAccountChimeraIntentService() {
        super("RemoveAccountIntentService");
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        Account account0 = (Account)intent0.getParcelableExtra("account");
        if(account0 == null) {
            Log.wtf("Auth", String.format(Locale.US, "[RemoveAccountChimeraIntentService] account was not provided."));
            return;
        }
        acvp.a(((adla)adla.a.b()).b, account0);
    }

    public static Intent b(Context context0, Account account0) {
        Intent intent0 = new Intent();
        gftb.check(context0);
        return intent0.setClassName(context0, "com.google.android.gms.auth.account.be.RemoveAccountIntentService").putExtra("account", account0).setData(Uri.parse(("intent://com.google.android.gms.auth.account.be.RemoveAccountChimeraIntentService?accountName=" + account0.name)));
    }
}


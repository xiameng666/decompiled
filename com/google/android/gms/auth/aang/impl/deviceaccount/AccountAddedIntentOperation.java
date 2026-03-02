package com.google.android.gms.auth.aang.impl.deviceaccount;

import acse;
import adcp;
import adqe;
import android.content.Intent;
import batl;
import baun;
import com.google.android.chimera.IntentOperation;
import hoyw;
import iapl;
import java.io.IOException;
import java.security.KeyStoreException;
import java.util.List;
import org.json.JSONException;

public final class AccountAddedIntentOperation extends IntentOperation {
    private static final baun a;
    private adcp b;

    static {
        AccountAddedIntentOperation.a = new baun("Auth", new String[]{"AccountAddedIntentOperation"});
    }

    public AccountAddedIntentOperation() {
        this(((adcp)adcp.a.b()));
    }

    public AccountAddedIntentOperation(adcp adcp0) {
        this.b = adcp0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(hoyw.a.b().f()) {
            String s = intent0.getAction();
            batl.s(s);
            if(s.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                List list0 = adqe.a(intent0);
                if(list0 != null && !list0.isEmpty()) {
                    try {
                        AccountAddedIntentOperation.a.h("Registering device id after account added", new Object[0]);
                        this.b.c(this);
                    }
                    catch(IOException | iapl | acse | KeyStoreException | JSONException exception0) {
                        AccountAddedIntentOperation.a.g("Failed to register device account", exception0, new Object[0]);
                    }
                }
            }
        }
    }
}


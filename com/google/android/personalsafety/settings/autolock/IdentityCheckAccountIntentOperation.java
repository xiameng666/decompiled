package com.google.android.personalsafety.settings.autolock;

import android.accounts.Account;
import android.content.Intent;
import android.provider.Settings.Secure;
import avzf;
import bbcu;
import bboh;
import cchj;
import ggtj;
import ibuq;

public final class IdentityCheckAccountIntentOperation extends avzf {
    private static final bboh a;

    static {
        IdentityCheckAccountIntentOperation.a = bboh.b("IdentityCheckAccount", bbcu.fc);
    }

    @Override  // avzf
    protected final void c(Intent intent0) {
        ibuq.f(intent0, "intent");
        if(this.f()) {
            this.e(true);
            return;
        }
        this.e(false);
    }

    private final void e(boolean z) {
        if(!Settings.Secure.putInt(this.getContentResolver(), "mandatory_biometrics_requirements_satisfied", ((int)z))) {
            ((ggtj)IdentityCheckAccountIntentOperation.a.j()).x("Unable to put new value for identity check switch in Settings.Secure.");
        }
    }

    private final boolean f() {
        Account[] arr_account = cchj.b(this).p("com.google");
        ibuq.e(arr_account, "getAccountsByType(...)");
        return arr_account.length != 0;
    }

    @Override  // avzf
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        super.onHandleIntent(intent0);
        if(ibuq.m(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
            if(intent0.getCategories() != null && intent0.getCategories().contains("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
                this.e(true);
                return;
            }
            if(!this.f()) {
                this.e(false);
            }
        }
    }
}


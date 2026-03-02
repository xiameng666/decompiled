package com.google.android.gms.autofill.operation;

import android.content.Intent;
import anmo;
import aoef;
import apas;
import bbcu;
import bboh;
import com.google.android.chimera.IntentOperation;
import gmap;
import gmbu;
import hqaz;
import j..util.Objects;

public final class AccountWarmUpOperation extends IntentOperation {
    public static final bboh a;

    static {
        AccountWarmUpOperation.a = bboh.b("AccountWarmUpOperation", bbcu.cD);
    }

    private final void a(int v) {
        apas apas0 = anmo.a(this).j();
        if(!apas0.n()) {
            return;
        }
        gmbu.t(apas0.q(v), new aoef(this), gmap.a);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        hqaz hqaz0 = hqaz.a;
        if(hqaz0.b().a()) {
            if(Objects.equals(intent0.getAction(), "com.google.android.setupwizard.SETUP_WIZARD_FINISHED")) {
                this.a(8);
            }
        }
        else if(hqaz0.b().b() && Objects.equals(intent0.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && intent0.getCategories().contains("com.google.android.gms.auth.category.ACCOUNT_ADDED")) {
            this.a(7);
        }
    }
}


package com.google.android.gms.auth.api.phone.operation;

import aicz;
import android.content.Intent;
import avzc;
import awkv;
import bbcu;
import bbdi;
import bbmz;
import bboh;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import ggtj;
import hppk;
import hsas;

public final class AutofillSettingsIntentOperation extends avzc {
    private static final bboh a;

    static {
        AutofillSettingsIntentOperation.a = bboh.b("AutofillSettingsIntentOperation", bbcu.cD);
    }

    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(hppk.e()) {
            if(!aicz.b(this)) {
                ((ggtj)AutofillSettingsIntentOperation.a.h()).x("Don\'t create settings item, since device doesn\'t have telephony feature");
                return null;
            }
        }
        else if(hppk.d() && !aicz.c(this)) {
            if(hppk.j()) {
                ((ggtj)AutofillSettingsIntentOperation.a.h()).x("Don\'t create settings item, since device doesn\'t support messaging");
            }
            return null;
        }
        Intent intent0 = hppk.i() ? this.f("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS_V31") : this.f("com.google.android.gms.auth.api.phone.ACTION_AUTOFILL_SETTINGS");
        String s = !hppk.i() || !hsas.g() ? "SMS verification codes" : "Verification codes by SMS";
        bbdi bbdi0 = bbmz.b(this);
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 8, s, awkv.ak, bbdi0);
        googleSettingsItem0.p = "Automatically fill in verification codes you receive by text message";
        return googleSettingsItem0;
    }
}


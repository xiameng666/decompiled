package com.google.android.gms.tapandpay.settings;

import android.accounts.Account;
import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hywc;
import hywf;
import ibuq;

public final class TapAndPayEnvironmentSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem c(Account account0) {
        if(hywf.c() && hywc.d()) {
            Intent intent0 = new Intent().setClassName(this, "com.google.android.gms.tapandpay.settings.TapAndPayEnvironmentSettingsActivity");
            ibuq.e(intent0, "setClassName(...)");
            GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 4, 0x7F153362, awkv.be, bbdi.gi);  // string:tp_tapandpay_environment_setting_title "TapAndPay Environment"
            googleSettingsItem0.e = true;
            googleSettingsItem0.j = false;
            return googleSettingsItem0;
        }
        return null;
    }
}


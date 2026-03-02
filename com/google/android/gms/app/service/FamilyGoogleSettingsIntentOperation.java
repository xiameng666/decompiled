package com.google.android.gms.app.service;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import avzc;
import awkv;
import bbdg;
import bbdi;
import ccmq;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class FamilyGoogleSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem c(Account account0) {
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(new Intent().setComponent(new ComponentName(this, "com.google.android.libraries.families.FamilyActivity")).putExtra("appId", 14).putExtra("flowType", 3).putExtra("utmSource", "googlesettings").putExtra("utmMedium", "allservices"), 11, 0x7F150866, awkv.aZ, bbdi.dn);  // string:common_google_settings_family_group "Family group"
        googleSettingsItem0.j = false;
        googleSettingsItem0.e = true;
        return googleSettingsItem0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.dr);
    }
}


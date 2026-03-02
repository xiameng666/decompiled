package com.google.android.gms.auth.api.credentials.yolo.ui;

import aert;
import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class CredentialsSettingsChimeraActivity.SettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(((Boolean)aert.a.b()).booleanValue()) {
            GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(new Intent("com.google.android.gms.settings.CREDENTIALS_SETTINGS"), 4, 0x7F150861, awkv.s, bbdi.bZ);  // string:common_google_settings_credentials_title "Smart Lock for Passwords"
            googleSettingsItem0.e = true;
            return googleSettingsItem0;
        }
        return null;
    }
}


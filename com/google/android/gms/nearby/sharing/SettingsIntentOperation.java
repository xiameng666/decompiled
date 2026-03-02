package com.google.android.gms.nearby.sharing;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import bbmz;
import cjan;
import cmfd;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hvpy;

public class SettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!ModuleInitializer.a(this)) {
            return null;
        }
        Intent intent0 = this.f("com.google.android.gms.settings.SHARING");
        if(hvpy.c()) {
            intent0.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", cmfd.d.f).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
        }
        bbdi bbdi0 = bbmz.b(this);
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 6, "Quick Share", awkv.Q, bbdi0);
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.p = "Share files and media with other Android and Chromebook devices over a secure Bluetooth connection or WiFi";
        googleSettingsItem0.m = "NearbySharingSettings";
        String[] arr_s = this.getResources().getStringArray(0x7F03006D);  // array:sharing_index_settings_keywords
        for(int v = 0; v < arr_s.length; ++v) {
            googleSettingsItem0.a(arr_s[v]);
        }
        return googleSettingsItem0;
    }
}


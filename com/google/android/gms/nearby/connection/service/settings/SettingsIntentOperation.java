package com.google.android.gms.nearby.connection.service.settings;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import bbmz;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class SettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!ModuleInitializer.a()) {
            return null;
        }
        Intent intent0 = new Intent().setPackage("com.google.android.gms").setClassName("com.google.android.gms", "com.google.android.gms.nearby.connection.service.settings.SettingsCollapsingToolbarActivity");
        bbdi bbdi0 = bbmz.b(this);
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 6, "Nearby connections", awkv.aw, bbdi0);
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.p = "Allow apps to automatically find and connect to nearby devices";
        googleSettingsItem0.m = "NearbyConnectionsSettings";
        String[] arr_s = this.getResources().getStringArray(0x7F030022);  // array:connections_index_settings_keywords
        for(int v = 0; v < arr_s.length; ++v) {
            googleSettingsItem0.a(arr_s[v]);
        }
        return googleSettingsItem0;
    }
}


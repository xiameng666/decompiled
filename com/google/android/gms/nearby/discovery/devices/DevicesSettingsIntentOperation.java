package com.google.android.gms.nearby.discovery.devices;

import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import cumz;
import gxvd;

public class DevicesSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!gxvd.d(this, cumz.f(this))) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(this.f("com.google.android.gms.settings.DEVICES").putExtra("caller", 2), 6, 0x7F15081B, awkv.O, bbdi.R);  // string:common_devices "Devices"
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.m = "NearbyDevicesSettings";
        String[] arr_s = this.getResources().getStringArray(0x7F030026);  // array:devices_index_settings_keywords
        for(int v = 0; v < arr_s.length; ++v) {
            googleSettingsItem0.a(arr_s[v]);
        }
        googleSettingsItem0.p = "Find and connect to devices near your phone, such as Bluetooth speakers";
        return googleSettingsItem0;
    }
}


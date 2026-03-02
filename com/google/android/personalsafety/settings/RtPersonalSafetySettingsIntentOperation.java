package com.google.android.personalsafety.settings;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import bbmn;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import eicd;
import ggtj;
import hrtd;

public class RtPersonalSafetySettingsIntentOperation extends avzc {
    private Boolean a;

    public RtPersonalSafetySettingsIntentOperation() {
        this.a = null;
    }

    @Override  // avzc
    public final GoogleSettingsItem b() {
        ((ggtj)((ggtj)eicd.a.h()).ar(0x4D38)).X("Displaying Google Setting item %b, %b, %b ", Boolean.valueOf(hrtd.aj()), Boolean.valueOf(hrtd.U()), Boolean.valueOf(this.e()));
        if(hrtd.aj() && hrtd.U() && this.e()) {
            GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(new Intent("com.google.android.personalsafety.settings.PERSONAL_SAFETY_SETTINGS").setPackage("com.google.android.gms"), 10, "Unknown tracker alerts", awkv.aF, bbdi.fp);
            googleSettingsItem0.e = true;
            googleSettingsItem0.p = "Get a notification if an unknown tracker is detected traveling with you";
            googleSettingsItem0.j = true;
            googleSettingsItem0.m = "RtPersonalSafetySettingsIndexKey";
            String[] arr_s = this.getResources().getStringArray(0x7F030042);  // array:rt_index_settings_keywords
            for(int v = 0; v < arr_s.length; ++v) {
                googleSettingsItem0.a(arr_s[v]);
            }
            return googleSettingsItem0;
        }
        return null;
    }

    private final boolean e() {
        if(this.a == null) {
            this.a = Boolean.valueOf(bbmn.x(this.getApplicationContext()));
        }
        return this.a != null && this.a.booleanValue();
    }
}


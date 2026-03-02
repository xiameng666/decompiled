package com.google.android.gms.auth.proximity.multidevice;

import allr;
import android.content.Context;
import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import bbmz;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hpzt;

public class BetterTogetherGoogleSettingsIntentOperation extends avzc {
    public BetterTogetherGoogleSettingsIntentOperation() {
    }

    public BetterTogetherGoogleSettingsIntentOperation(Context context0) {
        this.attachBaseContext(context0);
    }

    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!hpzt.a.b().r() && !this.i()) {
            return null;
        }
        Intent intent0 = allr.a(this);
        bbdi bbdi0 = bbmz.b(this);
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 6, 0x7F15052F, awkv.i, bbdi0);  // string:better_together_app_name "Chromebook"
        googleSettingsItem0.p = "Access your phone\'s features on your Chromebook";
        googleSettingsItem0.e = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.j = true;
        googleSettingsItem0.m = "BetterTogetherGoogleSettingsIntentOperation";
        return googleSettingsItem0;
    }
}


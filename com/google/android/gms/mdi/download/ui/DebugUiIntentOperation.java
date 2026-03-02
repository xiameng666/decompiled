package com.google.android.gms.mdi.download.ui;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import huck;

public class DebugUiIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        Intent intent0 = new Intent("com.google.android.gms.mdi.download.ui.DEBUG_UI").setPackage("com.google.android.gms");
        int v = huck.a.b().m();
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 2, 0x7F15182C, awkv.L, bbdi.eH);  // string:mdd_debug_ui_title "MDD Debug"
        googleSettingsItem0.f = v ^ 1;
        return googleSettingsItem0;
    }
}


package com.google.android.gms.permissions.operations;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hxhr;
import ibuq;

public final class SecurityDebugSettingsOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        Intent intent0 = new Intent("com.google.android.gms.permissions.SECURITY_DEBUG_ACTIVITY").setPackage("com.google.android.gms");
        ibuq.e(intent0, "setPackage(...)");
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 2, "Security Debug", awkv.bt, bbdi.fo);
        googleSettingsItem0.g = hxhr.a.b().a();
        return googleSettingsItem0;
    }
}


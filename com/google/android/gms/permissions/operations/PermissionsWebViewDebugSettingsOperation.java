package com.google.android.gms.permissions.operations;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hxho;
import ibuq;

public final class PermissionsWebViewDebugSettingsOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        Intent intent0 = new Intent("com.google.android.gms.permissions.PERMISSIONS_WEBVIEW_DEBUG_ACTIVITY").setPackage("com.google.android.gms");
        ibuq.e(intent0, "setPackage(...)");
        boolean z = hxho.a.b().a();
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 2, "Permissions WebView Debug", awkv.bo, bbdi.fo);
        googleSettingsItem0.g = z;
        return googleSettingsItem0;
    }
}


package com.google.android.gms.gcm;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class GcmDiagnosticIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        return new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.gcm.GcmDiagnostics").setFlags(0x10000000), 2, "GCM Diagnostics", awkv.B, bbdi.dM);
    }
}


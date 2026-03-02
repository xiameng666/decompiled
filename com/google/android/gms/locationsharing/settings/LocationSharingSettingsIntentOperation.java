package com.google.android.gms.locationsharing.settings;

import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class LocationSharingSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(new Intent().setClassName(this, "com.google.android.gms.locationsharing.activity.LocationSharingRedirectActivity"), -1, "Google Location Sharing", awkv.aK, bbdi.et);
        googleSettingsItem0.l = true;
        googleSettingsItem0.j = true;
        return googleSettingsItem0;
    }
}


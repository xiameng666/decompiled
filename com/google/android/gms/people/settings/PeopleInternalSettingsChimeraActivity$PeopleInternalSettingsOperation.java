package com.google.android.gms.people.settings;

import android.content.Intent;
import avzc;
import awkv;
import bajn;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;

public class PeopleInternalSettingsChimeraActivity.PeopleInternalSettingsOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(new Intent("com.google.android.gms.people.settings.INTERNAL_SETTINGS").setPackage("com.google.android.gms"), 2, "People debug", awkv.U, bbdi.X);
        googleSettingsItem0.f = true;
        googleSettingsItem0.g = ((Boolean)bajn.e.i()).booleanValue();
        return googleSettingsItem0;
    }
}


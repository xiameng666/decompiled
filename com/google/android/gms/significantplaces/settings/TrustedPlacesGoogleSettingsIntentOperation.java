package com.google.android.gms.significantplaces.settings;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import ibuq;

public final class TrustedPlacesGoogleSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem c(Account account0) {
        if(!this.i()) {
            return null;
        }
        Intent intent0 = new Intent("com.google.android.gms.significantplaces.settings.TRUSTED_PLACES_SETTINGS").setComponent(new ComponentName(this, "com.google.android.gms.significantplaces.settings.TrustedPlacesListActivity"));
        ibuq.e(intent0, "setComponent(...)");
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 12, "Trusted places", awkv.bn, bbdi.fW);
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.m = "TrustedPlacesSettingsIndexKey";
        return googleSettingsItem0;
    }
}


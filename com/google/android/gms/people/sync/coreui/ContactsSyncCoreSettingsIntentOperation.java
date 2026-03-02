package com.google.android.gms.people.sync.coreui;

import android.content.Intent;
import android.net.Uri.Builder;
import avzc;
import awkv;
import bbdi;
import bbmz;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hwyp;

public class ContactsSyncCoreSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!hwyp.o()) {
            return null;
        }
        Intent intent0 = new Intent().setClassName(this, "com.google.android.gms.people.sync.coreui.ContactsSyncCoreActivity");
        intent0.putExtra("android.intent.extra.REFERRER", new Uri.Builder().scheme("android-app").authority("com.google.android.gms.settings").build());
        bbdi bbdi0 = bbmz.b(this);
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 4, 0x7F152566, awkv.r, bbdi0);  // string:people_google_contacts_sync_title "Google Contacts sync"
        googleSettingsItem0.e = true;
        googleSettingsItem0.p = "Sync your contacts across multiple devices";
        if(this.i()) {
            googleSettingsItem0.j = true;
            googleSettingsItem0.m = "SyncCore";
            googleSettingsItem0.l = true;
            String[] arr_s = this.getResources().getStringArray(0x7F03003C);  // array:people_contacts_sync_core_settings_search_keywords
            for(int v = 0; v < arr_s.length; ++v) {
                googleSettingsItem0.a(arr_s[v]);
            }
        }
        return googleSettingsItem0;
    }
}


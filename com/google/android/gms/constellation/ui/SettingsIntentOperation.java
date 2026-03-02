package com.google.android.gms.constellation.ui;

import android.content.Context;
import android.content.Intent;
import avzc;
import awkv;
import baun;
import bbdi;
import bbmz;
import bcrd;
import bcrh;
import bcrm;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hrfp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SettingsIntentOperation extends avzc {
    private static final baun a;
    private final bcrm b;

    static {
        SettingsIntentOperation.a = bcrh.a("settings_operation");
    }

    public SettingsIntentOperation() {
        this.b = bcrm.t(new bcrd(UUID.randomUUID().toString()));
    }

    @Override  // avzc
    public final List a() {
        Context context0 = this.getBaseContext().getApplicationContext();
        List list0 = new ArrayList();
        if(hrfp.f()) {
            try {
                int v1 = this.b.f();
                if(!hrfp.a.c().g() || v1 != 0) {
                    goto label_9;
                }
                goto label_13;
            }
            catch(SecurityException securityException0) {
                SettingsIntentOperation.a.g("Error fetching subscription count", securityException0, new Object[0]);
            }
        label_9:
            SettingsIntentOperation.a.j("Displaying device-level Phone Number Verification consent options", new Object[0]);
            Intent intent0 = new Intent().setClassName(context0, "com.google.android.gms.constellation.ui.ConstellationConsentSettingActivity");
            bbdi bbdi0 = bbmz.b(this);
            list0.add(new GoogleSettingsItem(intent0, 5, 0x7F1505D7, awkv.p, bbdi0));  // string:c11n_device_phone_number_verification_consent_activity_label "Phone number 
                                                                                       // verification"
        }
    label_13:
        if(hrfp.e()) {
            SettingsIntentOperation.a.j("Displaying settings", new Object[0]);
            Intent intent1 = new Intent().setClassName(context0, "com.google.android.gms.constellation.ui.ConstellationDebugActivity");
            bbdi bbdi1 = bbmz.b(this);
            list0.add(new GoogleSettingsItem(intent1, 2, 0x7F1505D5, awkv.o, bbdi1));  // string:c11n_debug_activity_title "Verified phone numbers"
        }
        int v2 = list0.size();
        for(int v = 0; v < v2; ++v) {
            ((GoogleSettingsItem)list0.get(v)).p = "Control how your device verifies its own phone number";
        }
        return list0.isEmpty() ? null : list0;
    }
}


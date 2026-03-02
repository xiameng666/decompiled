package com.google.android.gms.mdm.settings;

import android.content.Context;
import android.content.Intent;
import avzc;
import awkv;
import bbdi;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import cqnf;
import hxwm;

public class QrlGoogleSettingsIntentOperation extends avzc {
    @Override  // android.content.ContextWrapper
    public final void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
    }

    @Override  // avzc
    public final GoogleSettingsItem b() {
        if(!hxwm.m()) {
            return null;
        }
        if(this.i()) {
            boolean z = cqnf.f(this);
            Boolean.valueOf(z).getClass();
            if(z) {
                Intent intent0 = cqnf.b(this);
                if(intent0 == null) {
                    return null;
                }
                GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 12, "Remote Lock", awkv.bf, bbdi.fp);
                googleSettingsItem0.p = "If this device is lost or stolen, you can lock it using your phone number";
                googleSettingsItem0.j = true;
                googleSettingsItem0.m = "QrlSettingsIndexKey";
                String[] arr_s = this.getResources().getStringArray(0x7F030029);  // array:fmd_quick_remote_lock_settings_keywords
                for(int v = 0; v < arr_s.length; ++v) {
                    googleSettingsItem0.a(arr_s[v]);
                }
                return googleSettingsItem0;
            }
        }
        return null;
    }
}


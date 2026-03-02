package com.google.android.gms.multidevice.ui.link;

import android.accounts.Account;
import android.content.Intent;
import awkv;
import bbdi;
import bbmq;
import bboh;
import cjan;
import cmfd;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import cssn;
import cszy;
import cszz;
import ctac;
import ctbn;
import cuiu;
import cuki;
import cume;
import ggtj;
import hvmz;
import ibuk;
import ibuq;
import icbb;
import java.util.List;

public final class LinkDevicesSettingsIntentOperation extends cuki {
    public ctbn a;
    public cszz b;
    private static final bboh c;

    static {
        LinkDevicesSettingsIntentOperation.c = cume.a(new ibuk(LinkDevicesSettingsIntentOperation.class));
    }

    @Override  // avzc
    public final GoogleSettingsItem c(Account account0) {
        if(hvmz.f() && !((Boolean)icbb.c(new cuiu(this, null))).booleanValue() && !bbmq.Q(this.getApplicationContext())) {
            cszz cszz0 = this.b;
            if(cszz0 == null) {
                ibuq.j("featureItemRegistry");
                cszz0 = null;
            }
            List list0 = cszy.a(cszz0);
            if(!list0.isEmpty()) {
                Intent intent0 = cssn.a();
                intent0.putExtra("EXTRA_SETTINGS_INTENT_SOURCE", "SETTINGS_NAVIGATION");
                intent0.removeExtra("EXTRA_SHOW_WARNING_TO_FINISH_SETUP");
                if(hvmz.g()) {
                    intent0.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", cmfd.d.f).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
                }
                GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 6, 0x7F151942, awkv.aV, bbdi.eT);  // string:multidevice_cross_devices_title "Cross-device services"
                googleSettingsItem0.d = 0;
                googleSettingsItem0.j = true;
                googleSettingsItem0.l = true;
                googleSettingsItem0.m = "multidevice_settings_indexing_key";
                googleSettingsItem0.a("Cross-device services");
                String[] arr_s = this.getResources().getStringArray(0x7F030034);  // array:multidevice_searchable_keywords
                for(int v = 0; v < arr_s.length; ++v) {
                    googleSettingsItem0.a(arr_s[v]);
                }
                for(Object object0: list0) {
                    ctac ctac0 = (ctac)object0;
                    if(ctac0.f() != 0) {
                        googleSettingsItem0.a(this.getString(ctac0.f()));
                    }
                    if(ctac0.d() != 0) {
                        String[] arr_s1 = this.getResources().getStringArray(ctac0.d());
                        for(int v1 = 0; v1 < arr_s1.length; ++v1) {
                            googleSettingsItem0.a(arr_s1[v1]);
                        }
                    }
                }
                return googleSettingsItem0;
            }
            ((ggtj)LinkDevicesSettingsIntentOperation.c.h()).x("Not showing settings item. EligibleXdFeatureItems list is empty.");
        }
        return null;
    }
}


package com.google.android.gms.mobiledataplan.ui;

import android.content.Intent;
import avzc;
import awkv;
import bbcu;
import bbdg;
import bbdi;
import bbmz;
import bboh;
import ccmq;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import crvw;
import csli;
import cslm;
import hvko;
import java.util.logging.Level;

public class SettingsIntentOperation extends avzc {
    static final int[] a;
    private static final bboh b;

    static {
        SettingsIntentOperation.a = new int[]{0x7F151863, 0x7F152602, 0x7F1525DA, 0x7F151864, 0x7F15185D, 0x7F151858, 0x7F151859, 0x7F15186B, 0x7F15185A, 0x7F15185F, 0x7F151860, 0x7F151869, 0x7F151866, 0x7F151865, 0x7F151857, 0x7F15186A, 0x7F150877, 0x7F150885, 0x7F150835, 0x7F15185E, 0x7F151862, 0x7F15185C, 0x7F151867, 0x7F151855, 0x7F151868, 0x7F151856, 0x7F151854, 0x7F151853, 0x7F151852, 0x7F151861, 0x7F15185B};  // string:mdp_keyword_mobile "mobile"
        SettingsIntentOperation.b = bboh.b("MobileDataPlan", bbcu.ck);
    }

    @Override  // avzc
    public final GoogleSettingsItem b() {
        boolean z = cslm.i(this);
        boolean z1 = hvko.Q();
        Level level0 = cslm.h();
        SettingsIntentOperation.b.g(level0).W("Creating MobileDataPlan Settings item, show UI: %b, disable for non eSIM: %b", z1, z);
        if(z1 && !z) {
            Intent intent0 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING_TO_ACTIVITY").setClassName(this, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
            int v = hvko.a.q().af() ? 0x7F1518A6 : 0x7F1518A4;  // string:mobile_data_plan_settings_item_title "Device plans"
            bbdi bbdi0 = bbmz.b(this);
            GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(intent0, 0, v, awkv.N, bbdi0);
            googleSettingsItem0.e = false;
            googleSettingsItem0.g = true;
            googleSettingsItem0.l = false;
            googleSettingsItem0.p = "Manage and purchase device plans";
            googleSettingsItem0.j = true;
            googleSettingsItem0.m = "MobileDataPlanSettingsActivity";
            googleSettingsItem0.l = true;
            int[] arr_v = SettingsIntentOperation.a;
            for(int v1 = 0; v1 < 0x1F; ++v1) {
                googleSettingsItem0.a(this.getString(arr_v[v1]));
            }
            String s = crvw.c().r(csli.g(this));
            if(s != null) {
                googleSettingsItem0.a(s);
            }
            return googleSettingsItem0;
        }
        return null;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.pX);
    }
}


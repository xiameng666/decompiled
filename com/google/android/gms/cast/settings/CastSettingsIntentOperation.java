package com.google.android.gms.cast.settings;

import android.content.Context;
import avfg;
import avgb;
import avzc;
import awkv;
import bbdi;
import bbmz;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import hqqy;
import java.util.ArrayList;
import java.util.List;

public class CastSettingsIntentOperation extends avzc {
    @Override  // avzc
    public final List a() {
        GoogleSettingsItem googleSettingsItem2;
        GoogleSettingsItem googleSettingsItem1;
        List list0 = new ArrayList();
        Context context0 = this.getApplicationContext();
        GoogleSettingsItem googleSettingsItem0 = null;
        if(avgb.m(context0)) {
            String s = avgb.l(context0) ? "Cast to other devices" : "Cast options";
            googleSettingsItem1 = new GoogleSettingsItem(avfg.y(), 6, s, awkv.l, bbdi.cC);
            googleSettingsItem1.j = true;
            googleSettingsItem1.l = true;
            googleSettingsItem1.m = "CastSettingsChimeraActivity";
            googleSettingsItem1.e = false;
        }
        else {
            googleSettingsItem1 = null;
        }
        Context context1 = this.getApplicationContext();
        if(avgb.l(context1)) {
            String s1 = avgb.m(context1) ? "Cast to this device" : "Cast options";
            googleSettingsItem2 = new GoogleSettingsItem(avgb.b(), 6, s1, awkv.aG, bbdi.cC);
            googleSettingsItem2.j = true;
            googleSettingsItem2.l = true;
            googleSettingsItem2.m = "CastSettingsChimeraActivity";
            googleSettingsItem2.e = false;
        }
        else {
            googleSettingsItem2 = null;
        }
        this.getApplicationContext();
        if(hqqy.a.b().c()) {
            googleSettingsItem0 = new GoogleSettingsItem(avgb.a("CastDebugSettingsPref"), 2, "Cast Debug", awkv.k, bbdi.cC);
        }
        if(googleSettingsItem1 != null) {
            list0.add(googleSettingsItem1);
        }
        if(googleSettingsItem2 != null) {
            list0.add(googleSettingsItem2);
        }
        if(googleSettingsItem0 != null) {
            list0.add(googleSettingsItem0);
        }
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            GoogleSettingsItem googleSettingsItem3 = (GoogleSettingsItem)list0.get(v);
            googleSettingsItem3.o = bbmz.b(this).a();
            googleSettingsItem3.p = "Display content from your phone on other devices with Google Cast";
        }
        return list0;
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }
}


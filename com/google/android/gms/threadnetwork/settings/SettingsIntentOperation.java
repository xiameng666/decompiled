package com.google.android.gms.threadnetwork.settings;

import a;
import android.content.Intent;
import avzc;
import awkv;
import bbcu;
import bbdg;
import bbdi;
import bboh;
import ccmq;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import ewio;
import hzaf;
import ibni;
import ibuq;

public final class SettingsIntentOperation extends avzc {
    private static final bboh a;

    static {
        SettingsIntentOperation.a = bboh.b("SettingsIntentOperation", bbcu.eW);
    }

    @Override  // avzc
    @ibni
    public final GoogleSettingsItem b() {
        if(!hzaf.c()) {
            return null;
        }
        GoogleSettingsItem googleSettingsItem0 = new GoogleSettingsItem(ewio.a(), 6, "Thread networks", awkv.bk, bbdi.gq);
        googleSettingsItem0.j = true;
        googleSettingsItem0.l = true;
        googleSettingsItem0.p = "Thread networks control center";
        googleSettingsItem0.m = "ThreadNetworksSettings";
        return googleSettingsItem0;
    }

    @Override  // avzc
    public final void onHandleIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        ccmq.a().a(bbdg.oz);
        try {
            super.onHandleIntent(intent0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.ae(SettingsIntentOperation.a.j(), "Invalid intent", illegalArgumentException0);
        }
    }
}


package com.google.android.gms.adsidentity.init;

import android.content.Intent;
import android.safetycenter.SafetyCenterManager;
import avzf;
import bbdg;
import bbmq;
import bbqa;
import ccmq;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;

public class ModuleInitializer extends avzf {
    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        AppContextProvider.a();
        bbmq.L("com.google.android.gms.adsidentity.settings.AdsIdentitySettingsActivity", 1);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        AppContextProvider.a();
        int v1 = 0;
        if(bbqa.d()) {
            SafetyCenterManager safetyCenterManager0 = (SafetyCenterManager)AppContextProvider.a().getSystemService(SafetyCenterManager.class);
            if(safetyCenterManager0 != null && safetyCenterManager0.isSafetyCenterEnabled()) {
                v1 = 1;
            }
        }
        bbmq.J("com.google.android.gms.adsidentity.settings.AdsIdentityIaSettingsActivity", ((boolean)(v1 ^ 1)));
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ccmq.a().a(bbdg.uf);
    }
}


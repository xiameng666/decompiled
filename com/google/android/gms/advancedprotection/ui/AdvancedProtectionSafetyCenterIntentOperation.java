package com.google.android.gms.advancedprotection.ui;

import abjg;
import abmj;
import android.content.Intent;
import bbdg;
import ccmq;
import com.google.android.chimera.IntentOperation;
import ibpg;
import ibuq;
import icbb;

public final class AdvancedProtectionSafetyCenterIntentOperation extends IntentOperation {
    static {
        abjg.a("AdvancedProtectionSafetyCenterIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.wT);
        if(intent0 != null && ibuq.m(intent0.getAction(), "android.safetycenter.action.REFRESH_SAFETY_SOURCES")) {
            String[] arr_s = intent0.getStringArrayExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCE_IDS");
            if(arr_s != null && ibpg.e(arr_s).contains("AdvancedProtection")) {
                icbb.c(new abmj(this, intent0, null));
            }
        }
    }
}


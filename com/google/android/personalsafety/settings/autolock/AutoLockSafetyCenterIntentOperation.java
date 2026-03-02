package com.google.android.personalsafety.settings.autolock;

import android.content.Intent;
import bbdg;
import bbqa;
import ccmq;
import com.google.android.chimera.IntentOperation;
import eicd;
import fzhz;
import fzkr;
import ggtj;
import ibpg;
import ibuq;

public final class AutoLockSafetyCenterIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        ccmq.a().a(bbdg.vY);
        if(bbqa.c() && fzkr.a(this) && intent0 != null && ibuq.m(intent0.getAction(), "android.safetycenter.action.REFRESH_SAFETY_SOURCES")) {
            String[] arr_s = intent0.getStringArrayExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCE_IDS");
            if(arr_s != null && ibpg.e(arr_s).contains("GoogleAutoLock") && !fzhz.a(this, intent0.getStringExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCES_BROADCAST_ID"))) {
                ((ggtj)eicd.a.h()).x("Could not set auto lock entry in safety center");
            }
        }
    }
}


package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import android.safetycenter.SafetyCenterManager;
import android.safetycenter.SafetyEvent.Builder;
import android.safetycenter.SafetySourceData;
import bbcu;
import bboh;
import bbqa;
import cjmf;
import com.google.android.chimera.IntentOperation;
import cqnf;
import cqqo;
import cqqp;
import gftb;
import gged_interceptors;
import ggtj;

public final class FmdSafetyCenterIntentOperation extends IntentOperation {
    private static final String a = "FmdSafetyCenterIntentOperation";
    private static final bboh b;
    private Context c;
    private SafetyCenterManager d;
    private cqqo e;

    static {
        FmdSafetyCenterIntentOperation.b = bboh.b("FmdSafetyCenterIntentOperation", bbcu.dX);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context context0 = this.getApplicationContext();
        cqnf cqnf0 = new cqnf(this.getApplicationContext());
        gftb.check(context0);
        this.c = context0;
        if(bbqa.c()) {
            this.e = new cqqo(context0, cqnf0);
            this.d = (SafetyCenterManager)context0.getSystemService(SafetyCenterManager.class);
        }
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(bbqa.c() && intent0 != null && intent0.getAction() != null && this.d != null) {
            if(this.c == null || cjmf.d(this.c, "android.permission.SEND_SAFETY_CENTER_UPDATE") != 0) {
                ((ggtj)FmdSafetyCenterIntentOperation.b.i()).B("No SEND_SAFETY_CENTER_UPDATE permission but should for intent %s", intent0.getAction());
            }
            else if(this.d.isSafetyCenterEnabled()) {
                switch(intent0.getAction()) {
                    case "android.location.MODE_CHANGED": 
                    case "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE": {
                        cqqp.a(this.d, this.e, FmdSafetyCenterIntentOperation.b);
                        return;
                    }
                    case "android.safetycenter.action.REFRESH_SAFETY_SOURCES": {
                        goto label_8;
                    }
                }
                ((ggtj)FmdSafetyCenterIntentOperation.b.j()).B("onHandleIntent called with an unexpected intent action: %s", intent0.getAction());
                return;
            label_8:
                String[] arr_s = intent0.getStringArrayExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCE_IDS");
                if(arr_s != null && arr_s.length != 0 && gged_interceptors.k(arr_s).contains("GoogleFindMyDevice")) {
                    String s = intent0.getStringExtra("android.safetycenter.extra.REFRESH_SAFETY_SOURCES_BROADCAST_ID");
                    SafetySourceData safetySourceData0 = this.e.a();
                    this.d.setSafetySourceData("GoogleFindMyDevice", safetySourceData0, new SafetyEvent.Builder(200).setRefreshBroadcastId(s).build());
                }
            }
        }
    }
}


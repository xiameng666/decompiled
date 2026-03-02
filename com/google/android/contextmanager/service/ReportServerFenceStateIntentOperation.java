package com.google.android.contextmanager.service;

import a;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import xpa;
import xsa;
import xth;
import xtz;
import xub;
import xvg;
import xxe;
import yev;

public class ReportServerFenceStateIntentOperation extends IntentOperation {
    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if("com.google.android.contextmanager.REPORT_SERVER_FENCE_STATE".equals(intent0.getAction())) {
            xtz xtz0 = xxe.A();
            if(!intent0.hasExtra("client_info_package_name") || !intent0.hasExtra("client_info_account_name") || !intent0.hasExtra("client_info_module_id") || !intent0.hasExtra("context_fence_key")) {
                goto label_13;
            }
            String s = xvg.b(intent0.getStringExtra("client_info_package_name"), intent0.getStringExtra("client_info_account_name"), intent0.getStringExtra("client_info_module_id"), intent0.getStringExtra("context_fence_key"));
            xub xub0 = xtz0.b;
            xsa xsa0 = xub0.a(s);
            if(xsa0 != null) {
                xpa xpa0 = xsa0.m();
                if(xpa0 != null) {
                    xvg xvg0 = xub0.b(s);
                    if(xvg0 != null) {
                        new yev(xpa0, xvg0).a();
                        return;
                    label_13:
                        a.ag(xth.a.i(), "[%s] Server fence state reporting intent is not valid.", "FenceManager", 'r');
                    }
                }
            }
        }
    }
}


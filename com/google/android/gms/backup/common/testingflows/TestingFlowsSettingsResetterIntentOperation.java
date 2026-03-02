package com.google.android.gms.backup.common.testingflows;

import android.content.Intent;
import android.provider.Settings.Secure;
import aqjl;
import aqql;
import aqxa;
import baun;
import com.google.android.chimera.IntentOperation;
import gfuy;
import hqlq;

public class TestingFlowsSettingsResetterIntentOperation extends IntentOperation {
    private static final baun a;

    static {
        TestingFlowsSettingsResetterIntentOperation.a = aqql.a("TestingFlowsSettingsResetterIntentOperation");
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        hqlq.e();
        if(hqlq.d()) {
            String s = intent0.getAction();
            gfuy.e(s);
            if(!s.equals("android.intent.action.BOOT_COMPLETED")) {
                TestingFlowsSettingsResetterIntentOperation.a.m("Received unexpected intent: %s", new Object[]{s});
                return;
            }
            if(aqjl.a.i(this)) {
                TestingFlowsSettingsResetterIntentOperation.a.h("B&R testing flows are enabled, resetting to disabled", new Object[0]);
                try {
                    Settings.Secure.putInt(this.getContentResolver(), "backup_enable_testing_flows", 0);
                    aqxa.k(this);
                }
                catch(SecurityException securityException0) {
                    TestingFlowsSettingsResetterIntentOperation.a.g("Permission denied to write secure setting backup_enable_testing_flows", securityException0, new Object[0]);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    TestingFlowsSettingsResetterIntentOperation.a.g("Invalid argument for secure setting backup_enable_testing_flows", illegalArgumentException0, new Object[0]);
                }
            }
        }
    }
}


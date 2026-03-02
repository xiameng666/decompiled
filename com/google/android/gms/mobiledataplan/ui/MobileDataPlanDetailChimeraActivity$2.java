package com.google.android.gms.mobiledataplan.ui;

import android.content.Context;
import android.content.Intent;
import bboh;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import ggtj;
import hvko;
import j..util.Objects;
import xob;

class MobileDataPlanDetailChimeraActivity.2 extends TracingBroadcastReceiver {
    final xob a;

    public MobileDataPlanDetailChimeraActivity.2(Context context0, xob xob0) {
        this.a = xob0;
        super(context0);
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        bboh bboh0 = MobileDataPlanDetailChimeraActivity.j;
        ((ggtj)bboh0.h()).B("Received eSIM package %s", intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
        if(Objects.equals(intent0.getAction(), "com.google.android.gms.phenotype.COMMITTED") && Objects.equals(intent0.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.mobile_data_plan")) {
            ((ggtj)bboh0.h()).B("Received phenotype update for eSIM activation, showing MDP: %s", Boolean.valueOf(hvko.Q()));
            if(hvko.Q()) {
                ((ggtj)bboh0.h()).x("eSIM returning to main UI.");
                Intent intent1 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
                intent1.addFlags(0x14008000);
                intent1.setClassName(this.a, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                this.a.startActivity(intent1);
                this.a.finishAffinity();
            }
        }
    }
}


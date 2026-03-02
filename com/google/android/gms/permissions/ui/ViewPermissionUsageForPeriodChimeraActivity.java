package com.google.android.gms.permissions.ui;

import android.content.Intent;
import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import ehrf;
import ehrh;
import ehri;
import ehrj;
import ggtj;
import j..util.Objects;

public final class ViewPermissionUsageForPeriodChimeraActivity extends ehrf {
    private static final bboh j;
    private static final ehrh k;

    static {
        bboh bboh0 = bboh.b("ViewPermissionUsageForPeriodChimeraActivity", bbcu.dO);
        ViewPermissionUsageForPeriodChimeraActivity.j = bboh0;
        ehrj ehrj0 = new ehrj();
        Objects.requireNonNull(ehrj0);
        ViewPermissionUsageForPeriodChimeraActivity.k = new ehrh(bboh0, "permissions_period", new ehri(ehrj0));
    }

    @Override  // ehrf
    protected final ehrh a() {
        return ViewPermissionUsageForPeriodChimeraActivity.k;
    }

    @Override  // ehrf
    protected final void l(Intent intent0) {
        String[] arr_s = intent0.getStringArrayExtra("android.intent.extra.ATTRIBUTION_TAGS");
        if(arr_s == null || arr_s.length == 0) {
            ((ggtj)ViewPermissionUsageForPeriodChimeraActivity.j.j()).x("attribution tags missing in intent");
        }
        long v = intent0.getLongExtra("android.intent.extra.START_TIME", -1L);
        int v1 = Long.compare(v, 0L);
        if(v1 <= 0) {
            ((ggtj)ViewPermissionUsageForPeriodChimeraActivity.j.j()).x("start time missing in intent");
        }
        long v2 = intent0.getLongExtra("android.intent.extra.END_TIME", -1L);
        int v3 = Long.compare(v2, 0L);
        if(v3 <= 0) {
            ((ggtj)ViewPermissionUsageForPeriodChimeraActivity.j.j()).x("end time missing in intent");
        }
        if(v1 > 0 && v3 > 0 && v > v2) {
            ((ggtj)ViewPermissionUsageForPeriodChimeraActivity.j.j()).x("start time is greater than end time in intent");
        }
    }

    @Override  // ehrf
    public final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.bL);
        super.onCreate(bundle0);
    }
}


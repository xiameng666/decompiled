package com.google.android.gms.googlehelp.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bbcu;
import bboh;
import btnt;
import cljp;
import clkn;
import clko;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import ggtj;
import htkd;
import htrm;

public class InvalidateGcmTokenGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final bboh a;

    static {
        InvalidateGcmTokenGcmTaskChimeraService.a = bboh.b("gH_GcmHeartbeatsService", bbcu.aw);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        String s = cllr0.a;
        if(!TextUtils.equals(s, "HEARTBEAT")) {
            ((ggtj)InvalidateGcmTokenGcmTaskChimeraService.a.j()).B("Unrecognized task tag: %s", s);
            return 0;
        }
        InvalidateGcmTokenGcmTaskChimeraService.d(this);
        int v = cllr0.b.getInt("REMAINING");
        if(v > 0) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("REMAINING", v - 1);
            clkn clkn0 = new clkn();
            clkn0.j = "com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService";
            clkn0.t("HEARTBEAT");
            clkn0.e(htkd.a.o().q(), htkd.a.o().p());
            clkn0.u = bundle0;
            clkn0.v(1);
            clkn0.p = true;
            clko clko0 = clkn0.a();
            cljp.a(this).f(clko0);
        }
        return 0;
    }

    public static void d(Context context0) {
        Intent intent0 = new Intent("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
        if(btnt.a(htrm.d())) {
            intent0.setPackage("com.google.android.gms");
        }
        intent0.setPackage("com.google.android.gms");
        context0.sendBroadcast(intent0);
    }
}


package com.google.android.gms.ocr.service;

import android.os.Bundle;
import android.util.Log;
import cljp;
import clkn;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import dkmm;
import gclb;
import ggdy;
import gged_interceptors;
import glwy;
import glyq;
import gmbu;
import hrvh;
import hvud;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class ModelCleanUpTaskService extends GmsTaskBoundService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        Bundle bundle0 = cllr0.b;
        if(bundle0 == null) {
            Log.e("CCOCR2.service", "Null clean up task params.");
            return 2;
        }
        int[] arr_v = bundle0.getIntArray("clean_up_type");
        if(arr_v != null) {
            gclb gclb0 = dkmm.a(bundle0.getInt("model_type"));
            ggdy ggdy0 = new ggdy();
            if(glwy.k(arr_v, 1)) {
                ggdy0.i(gclb0.b());
            }
            if(glwy.k(arr_v, 2)) {
                ggdy0.i(gclb0.a());
            }
            if(glwy.k(arr_v, 4)) {
                ggdy0.i(gclb0.e());
            }
            gged_interceptors gged0 = ggdy0.h();
            if(gged0.isEmpty()) {
                return 2;
            }
            try {
                ((glyq)gmbu.e(gged0)).u();
                return 0;
            }
            catch(ExecutionException | InterruptedException exception0) {
                Log.e("CCOCR2.service", "", exception0);
                return 2;
            }
        }
        int v = bundle0.getInt("clean_up_type", 0);
        gclb gclb1 = dkmm.a(bundle0.getInt("model_type"));
        ggdy ggdy1 = new ggdy();
        if((v & 1) != 0) {
            ggdy1.i(gclb1.b());
        }
        if((v & 2) != 0) {
            ggdy1.i(gclb1.a());
        }
        if((v & 4) != 0) {
            ggdy1.i(gclb1.e());
        }
        gged_interceptors gged1 = ggdy1.h();
        if(gged1.isEmpty()) {
            return 2;
        }
        try {
            ((glyq)gmbu.e(gged1)).u();
            return 0;
        }
        catch(ExecutionException | InterruptedException exception1) {
            Log.e("CCOCR2.service", "", exception1);
            return 2;
        }
    }

    public static void d(cljp cljp0, int[] arr_v, int v) {
        long v1 = hvud.a.c().a();
        Bundle bundle0 = new Bundle();
        if(hrvh.a.i().ah()) {
            int v3 = 0;
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                v3 |= arr_v[v2];
            }
            bundle0.putInt("clean_up_type", v3);
        }
        else {
            bundle0.putIntArray("clean_up_type", arr_v);
        }
        bundle0.putInt("model_type", v);
        clkn clkn0 = new clkn();
        clkn0.w(ModelCleanUpTaskService.class.getName());
        clkn0.e(v1 / 2L, v1);
        clkn0.g(2);
        clkn0.u = bundle0;
        clkn0.t("type_" + Arrays.toString(arr_v));
        clkn0.v(1);
        cljp0.f(clkn0.a());
    }
}


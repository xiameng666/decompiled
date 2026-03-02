package com.google.android.gms.security.safebrowsing;

import android.util.Log;
import android.util.SparseArray;
import bbdg;
import bbnk;
import ccmq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import eljl;
import ellj;
import elqj;
import gged_interceptors;
import ggqk;
import hxuv;
import j..util.Objects;

public class SafeBrowsingGmsTaskBoundService extends GmsTaskBoundService {
    public static final int a = 0;
    private static final String b = "SafeBrowsingGmsTaskBoundService";

    static {
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.jK);
        String s = cllr0.a;
        if(s.equals("update_list")) {
            gged_interceptors gged0 = gged_interceptors.l(Integer.valueOf(16));
            try(eljl eljl0 = eljl.a(this, bbnk.a)) {
                long v = eljl.c.toMillis();
                if(eljl0.j.block(v)) {
                    SparseArray sparseArray0 = new SparseArray();
                    ggqk ggqk0 = gged0.E();
                    while(true) {
                        if(!ggqk0.hasNext()) {
                            break;
                        }
                        Object object0 = ggqk0.next();
                        sparseArray0.put(((Integer)object0).intValue(), eljl0.h.e(((Integer)object0).intValue()));
                    }
                    elqj elqj0 = eljl0.c(sparseArray0, "com.google.android.gms", false);
                    if(elqj0 != null) {
                        eljl0.f(elqj0, 0L);
                    }
                }
                else {
                    Log.e(eljl.a, "couldn\'t updateOnDeviceListsFromServer. Lists are not loaded");
                }
                if(hxuv.a.e().i()) {
                    ((ellj)Objects.requireNonNull(eljl0.k.g)).b();
                }
            }
            return 0;
        }
        Log.w(SafeBrowsingGmsTaskBoundService.b, "Unknown action: " + s);
        return 2;
    }
}


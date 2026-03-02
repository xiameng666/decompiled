package com.google.android.places.service;

import bblp;
import cjtg;
import cjtn;
import cjts;
import cnpb;
import com.google.android.gms.common.internal.GetServiceRequest;
import fzqz;
import fzrr;
import fzrt;
import ggfp;
import ggnj;
import gmcg;
import hxnh;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

public class PlaceDetectionChimeraService extends cjtg {
    private final gmcg a;

    public PlaceDetectionChimeraService() {
        Set set0 = Collections.singleton("android.permission-group.LOCATION");
        int v = hxnh.c() ? 0 : 3;
        ggfp ggfp0 = hxnh.c() ? ggfp.G(hxnh.a.b().b().b) : ggnj.a;
        super(67, "com.google.android.gms.location.places.PlaceDetectionApi", set0, v, 10, ggfp0);
        ThreadPoolExecutor.DiscardPolicy threadPoolExecutor$DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        this.a = bblp0;
        if((bblp0 instanceof bblp)) {
            bblp0.setRejectedExecutionHandler(threadPoolExecutor$DiscardPolicy0);
        }
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjts cjts0 = this.l();
        fzrr fzrr0 = new fzrr(this, getServiceRequest0.f);
        cjtn0.c(new cnpb(new fzrt(2), fzrr0, cjts0, fzqz.a()));
    }

    @Override  // cjtg
    public final void onDestroy() {
        super.onDestroy();
        this.a.shutdown();
    }
}


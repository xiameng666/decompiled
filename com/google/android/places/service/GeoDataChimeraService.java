package com.google.android.places.service;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import bblp;
import cjpa;
import cjpd;
import cjqh;
import cjtg;
import cjtn;
import cnpe;
import com.google.android.gms.common.internal.GetServiceRequest;
import fzrt;
import ggfp;
import ggnj;
import gmcg;
import hxnh;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import jwe;

public class GeoDataChimeraService extends cjtg {
    private final gmcg a;
    private fzrt b;
    private BroadcastReceiver c;

    public GeoDataChimeraService() {
        Set set0 = Collections.singleton("android.permission-group.LOCATION");
        int v = hxnh.c() ? 0 : 3;
        ggfp ggfp0 = hxnh.c() ? ggfp.G(hxnh.a.b().a().b) : ggnj.a;
        super(65, "com.google.android.gms.location.places.GeoDataApi", set0, v, 10, ggfp0);
        ThreadPoolExecutor.DiscardPolicy threadPoolExecutor$DiscardPolicy0 = new ThreadPoolExecutor.DiscardPolicy();
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        this.a = bblp0;
        if((bblp0 instanceof bblp)) {
            bblp0.setRejectedExecutionHandler(threadPoolExecutor$DiscardPolicy0);
        }
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new cnpe(this.l(), this, getServiceRequest0.f, this.b));
    }

    public final void c() {
        cjpa cjpa0 = cjqh.a(this, "places", "GEO_DATA_SERVICE_STORE", 0).c();
        cjpa0.h("LOCALE", Locale.getDefault().toLanguageTag());
        cjpd.g(cjpa0);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        String s = cjpd.c(cjqh.a(this, "places", "GEO_DATA_SERVICE_STORE", 0), "LOCALE", null);
        if(s == null || !Locale.getDefault().toLanguageTag().equals(s)) {
            this.c();
        }
        GeoDataChimeraService.1 geoDataChimeraService$10 = new GeoDataChimeraService.1(this);
        this.c = geoDataChimeraService$10;
        jwe.b(this, geoDataChimeraService$10, new IntentFilter("android.intent.action.LOCALE_CHANGED"), 2);
        this.b = new fzrt(1);
    }

    @Override  // cjtg
    public final void onDestroy() {
        super.unregisterReceiver(this.c);
        super.onDestroy();
        this.a.shutdown();
    }
}


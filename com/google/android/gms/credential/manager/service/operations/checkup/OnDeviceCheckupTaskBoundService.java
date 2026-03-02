package com.google.android.gms.credential.manager.service.operations.checkup;

import android.content.Context;
import bayn;
import bbcu;
import bbdg;
import bbmn;
import bboh;
import bghy;
import bghz;
import bgia;
import bgib;
import bgmu;
import bgor;
import ccmq;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import evrg;
import fhra;
import ggch;
import gged_interceptors;
import ggtj;
import glzd;
import gmap;
import gmbu;
import gmcd;

public class OnDeviceCheckupTaskBoundService extends GmsTaskBoundService {
    public static final int a;
    private static final bboh b;
    private bgia c;

    static {
        OnDeviceCheckupTaskBoundService.b = bboh.b("OnDeviceCheckupTaskBoundService", bbcu.cX);
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.ah);
        Context context0 = this.getApplicationContext();
        ccmq.a().a(bbdg.ah);
        String s = cllr0.a;
        if(!"PeriodicOnDeviceCheckup".equals(s)) {
            ((ggtj)OnDeviceCheckupTaskBoundService.b.j()).B("Unknown tag: %s, do not run on device checkup.", s);
            return gmbu.i(Integer.valueOf(2));
        }
        if(this.c == null) {
            this.c = new bgia(context0, new bgor(context0), new bgmu(context0, bayn.f(context0)));
        }
        bgia bgia0 = this.c;
        gged_interceptors gged0 = ggch.j(bbmn.h(bgia0.a, "com.google.android.gms")).l(new bghy(bgia0)).n();
        return glzd.f(fhra.b(evrg.e(gged0).c(new bghz(gged0))), new bgib(), gmap.a);
    }
}


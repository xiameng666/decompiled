package com.google.android.gms.adsidentity.service;

import abbv;
import abcb;
import abdy;
import abdz;
import abea;
import android.content.Context;
import bbdg;
import ccmq;
import cljp;
import cllr;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import glyq;
import glzd;
import gmap;
import gmcd;
import hotp;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class AdsidentityStorageGmsTaskBoundService extends GmsTaskBoundService {
    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.uf);
        Context context0 = AppContextProvider.a();
        abbv abbv0 = abbv.a(context0);
        try {
            abea.b();
            gmcd gmcd0 = abea.a().a();
            abdz abdz0 = new abdz();
            gmap gmap0 = gmap.a;
            List list0 = (List)((glyq)glzd.f(gmcd0, abdz0, gmap0)).u();
            if(list0.isEmpty()) {
                cljp.a(context0).d("AdsidentityStorageTask", AdsidentityStorageGmsTaskBoundService.class.getName());
                return 0;
            }
            for(Object object0: list0) {
                abcb abcb0 = (abcb)object0;
                if(System.currentTimeMillis() - abcb0.c > hotp.a.d().b()) {
                    abea.b();
                    String s = abcb0.b;
                    ((glyq)abea.a().b(new abdy(s), gmap0)).u();
                    abbv0.d("Request exceeds TTL and is cleaned up from ProtoDataStore. Request creation timestamp: %s", new Object[]{((long)abcb0.c)});
                }
            }
            return 0;
        }
        catch(InterruptedException | ExecutionException exception0) {
            abbv0.b(exception0);
            return 2;
        }
    }
}


package com.google.android.gms.udc.service;

import acse;
import acso;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import aqcr;
import azts;
import batf;
import batl;
import bbmn;
import bbqr;
import bcso;
import bcsz;
import cljp;
import cllr;
import cmar;
import cmbj;
import cmbm;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import evrg;
import ezmv;
import ezqu;
import ezqz;
import ezry;
import ezso;
import ezsp;
import ezsq;
import eztb;
import ezth;
import fktu;
import ggtl;
import glyq;
import hfub;
import hzdj;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UdcContextInitChimeraService extends GmsTaskChimeraService {
    private static final ggtl a;

    static {
        UdcContextInitChimeraService.a = ezqu.c();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        int v3;
        int v1;
        String s = cllr0.a;
        if(!"UdcContextRegistrationOneOff".equals(s) && !"UdcContextRegistrationPeriodic".equals(s) && ("UdcSyncOneOff".equals(s) || "UdcSyncPeriodic".equals(s) || "UdcTestSync".equals(s))) {
            Context context0 = this.getApplicationContext();
            if(context0.getSharedPreferences("UdcCtxMgrPrefs", 0).getBoolean("UdcCtxMgrPrefsReg", false)) {
                Iterator iterator0 = bbmn.h(context0, "com.google.android.gms").iterator();
                int v;
                for(v = 0; true; v |= UdcContextInitChimeraService.d(context0, ((Account)object0)) ^ 1) {
                    v1 = 1;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                }
                if(v == 0) {
                    context0.getSharedPreferences("UdcCtxMgrPrefs", 0).edit().putBoolean("UdcCtxMgrPrefsReg", false).commit();
                    v1 = 0;
                }
            }
            else {
                v1 = 0;
            }
            fktu fktu0 = "UdcTestSync".equals(s) ? new fktu(ezmv.b, 2) : ezry.b(this).b.a(s);
            hfub hfub0 = fktu0.a;
            if(hfub0 == ezmv.b) {
                int v2 = fktu0.b;
                ezsp ezsp0 = v2 == 3 ? ezsp.b : ezsp.a;
                cmbm cmbm0 = ezry.g(this);
                hzdj hzdj0 = hzdj.a;
                if(hzdj0.l().R()) {
                    ezso ezso0 = new ezso(ezsq.b(this), ezsp0);
                    Executor executor0 = ezry.f(this);
                    v3 = cmbm0.n(cmbm0.o(((ezmv)hfub0), new cmbj(ezso0), v2, executor0));
                }
                else {
                    cmar cmar0 = cmbm0.l(((ezmv)hfub0));
                    v3 = cmar0.a(cmar0.b(new ezqz(this, ezsp0), v2, ezry.f(this)), v2);
                }
                if(hzdj0.l().P() && "UdcTestSync".equals(s) && v3 == 0) {
                    for(Object object1: bbmn.h(this.getApplicationContext(), "com.google.android.gms")) {
                        Account account0 = (Account)object1;
                        try {
                            ((glyq)ezth.a.a(account0).e()).u();
                        }
                        catch(ExecutionException executionException0) {
                            UdcContextInitChimeraService.a.i().ar(0x4482).R("ExecutionException while refreshing FACS Cache client-side cache for account \'%s\'! %s", account0.name, executionException0);
                            return 2;
                        }
                        catch(InterruptedException interruptedException0) {
                            UdcContextInitChimeraService.a.i().ar(0x4483).R("InterruptedException while refreshing FACS Cache client-side cache for account \'%s\'! %s", account0.name, interruptedException0);
                            return 2;
                        }
                    }
                    return 0;
                }
                return v3;
            }
            return v1;
        }
        cljp.a(this).d(s, "com.google.android.gms.udc.service.UdcContextInitService");
        return 2;
    }

    private static final boolean d(Context context0, Account account0) {
        int v;
        Intent intent0 = IntentOperation.getStartIntent(context0, "com.google.android.gms.udc.intentoperation.UdcContextListenerIntentOperation", "com.google.android.gms.udc.CONTEXT_CHANGED");
        intent0.putExtra("UdcAccountName", account0.name);
        bcso bcso0 = new bcso();
        bcso0.b(10002);
        bcso0.a();
        try {
            String s = eztb.b(context0, acso.e(context0, account0.name));
            v = bbqr.d(s) ? account0.hashCode() : s.hashCode();
        }
        catch(acse | IOException unused_ex) {
            v = account0.hashCode();
        }
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, intent0, 0x2000000);
        azts azts0 = new azts(context0, aqcr.c(account0), null);
        try {
            UdcContextInitChimeraService.a.h().ar(0x4486).x("Unregistering with contextmanager");
            batl.s(pendingIntent0);
            bcsz bcsz0 = new bcsz(azts0.D, pendingIntent0);
            azts0.D.c(bcsz0);
            evrg.o(batf.c(bcsz0), hzdj.b(), TimeUnit.MILLISECONDS);
            return true;
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            UdcContextInitChimeraService.a.i().s(exception0).ar(0x4488).x("context manager (un)subscription failed");
            return false;
        }
    }
}


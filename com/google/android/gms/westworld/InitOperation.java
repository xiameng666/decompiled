package com.google.android.gms.westworld;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ayux;
import ayuy;
import ayvf;
import azts;
import bbcu;
import bbnp;
import bboh;
import bbqa;
import cljp;
import clkm;
import clkq;
import clks;
import clkz;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import einq;
import faig;
import ffnp;
import ffnr;
import ffoe;
import ffok;
import ffom;
import ffoo;
import ffop;
import ffoq;
import ffoz;
import ffpx;
import frli;
import glyq;
import gmap;
import gobf;
import gobv;
import gocc;
import hftr;
import hrwa;
import hrzj;
import iabs;
import iaby;
import igyu;
import java.security.SecureRandom;
import java.util.concurrent.ExecutionException;

public class InitOperation extends ffok {
    public PendingIntent a;
    public ayvf b;
    public ffnr c;
    public ffoe d;

    static {
        bboh.b("WestworldInitOperation", bbcu.ea);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        int v4;
        int v1;
        Context context0 = AppContextProvider.b();
        if(!ffom.a() && (v & 14) != 0) {
            azts azts0 = new azts(AppContextProvider.b(), new faig());
            if(!hrzj.c()) {
                ffoz.s(context0);
            }
            if(!iaby.a.g().t()) {
                try {
                    frli frli0 = ffpx.c(context0);
                    igyu igyu0 = (igyu)frli0.a().get();
                    v1 = (igyu0.b & 1) == 0 ? -1 : igyu0.c;
                    if(v1 < 0) {
                        long v2 = iaby.c() * iaby.c();
                        v1 = new SecureRandom().nextInt(((int)v2));
                        ((glyq)frli0.b(new ffop(v1), gmap.a)).u();
                    }
                }
                catch(ExecutionException | InterruptedException unused_ex) {
                    goto label_24;
                }
                einq einq0 = new einq(context0);
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gobf.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gobf gobf0 = (gobf)hftp0.b_message;
                gobf0.b |= 1;
                gobf0.c = (long)v1;
                gobf gobf1 = (gobf)hftp0.N_build();
                hftr hftr0 = (hftr)((ProtoLiteMessage)gobv.a).v_newBuilder();
                hftr0.n(gobf.f, gobf1);
                einq0.cC("com.google.android.platform.adservices", ((gobv)((ProtoLiteBuilder)hftr0).N_build()), gobf1.toBytesArray()).A(new ffoo());
            }
        label_24:
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gocc.a).v_newBuilder();
            if(bbqa.d() && bbnp.m(context0)) {
                int v3 = ffoz.p(azts0) ? 2 : 1;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gocc gocc0 = (gocc)hftp1.b_message;
                gocc0.b |= 1;
                gocc0.c = (long)v3;
            }
            try {
                v4 = ffoz.x(context0);
                if(!hftp1.b_message.isImmutable()) {
                    goto label_35;
                }
                goto label_36;
            }
            catch(ExecutionException | InterruptedException unused_ex) {
                goto label_44;
            }
        label_35:
            hftp1.ensureMutable();
        label_36:
            gocc gocc1 = (gocc)hftp1.b_message;
            gocc1.b |= 2;
            gocc1.d = v4;
            einq einq1 = new einq(context0);
            gocc gocc2 = (gocc)hftp1.N_build();
            hftr hftr1 = (hftr)((ProtoLiteMessage)gobv.a).v_newBuilder();
            hftr1.n(gocc.e, gocc2);
            einq1.cC("com.google.android.westworld", ((gobv)((ProtoLiteBuilder)hftr1).N_build()), gocc2.toBytesArray()).A(new ffoq());
        label_44:
            cljp cljp0 = cljp.a(context0);
            clks clks0 = new clks();
            clks0.w(AppSpecificPropertyRegistrationTask.a);
            clks0.q("WestworldAppSpecificPropertyRegistration");
            clks0.v(1);
            clks0.l(false);
            clks0.a = clkz.j;
            cljp0.f(clks0.a());
            ayux ayux0 = this.b.d("InitOperationEnter");
            ayuy ayuy0 = ayvf.b;
            ayux0.a(0L, 1L, ayuy0);
            if(ffoz.o()) {
                this.b.d("InitOperationEnabled").a(0L, 1L, ayuy0);
                ffnp.d(context0, this.b, this.c, this.d);
                ffoz.t(iabs.b(), context0);
            }
            try {
                MetadataAlarmOperation.a(context0, this.b, this.a);
            }
            finally {
                this.b.h();
            }
            cljp cljp1 = cljp.a(context0);
            if(!iaby.a.g().v()) {
                cljp1.c("com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService");
            }
            else if(hrwa.a.b().I()) {
                clks clks1 = new clks();
                clks1.w("com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService");
                clks1.t("com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService");
                clks1.v(2);
                clks1.a = clkz.l;
                clks1.l(false);
                clks1.e();
                clks1.j();
                cljp1.f(clks1.a());
            }
            else {
                clkq clkq0 = new clkq();
                clkq0.t("com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService");
                clkq0.w("com.google.android.gms.westworld.perfetto.PerfettoScheduledCleanupService");
                clkq0.p = true;
                clkq0.v(1);
                clkq0.r(true);
                clkq0.i(true);
                clkq0.j(clkm.l);
                cljp1.f(clkq0.a());
            }
            if(!iaby.k()) {
                cljp1.c("com.google.android.gms.westworld.perfetto.PerfettoScheduledUploadService");
            }
        }
    }
}


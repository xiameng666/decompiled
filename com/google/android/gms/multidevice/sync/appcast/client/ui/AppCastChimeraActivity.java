package com.google.android.gms.multidevice.sync.appcast.client.ui;

import android.os.Bundle;
import bboh;
import ctho;
import cthp;
import ctii;
import ctij;
import ctil;
import ctim;
import ctip;
import ctjv;
import ctnb;
import dho;
import dii;
import dls;
import dlv;
import dmv;
import dmw;
import ggtj;
import gol;
import gop;
import goz;
import gsb;
import gui;
import guo;
import gze;
import gzk;
import hei;
import hew;
import hey;
import hfc;
import hvnj;
import iau;
import ibth;
import ibtw;
import ibuk;
import ibuq;
import icbb;
import icnl;
import icnm;
import iej;
import lpt;
import ltd;
import xnf;

public final class AppCastChimeraActivity extends ctip {
    public final bboh e;
    public cthp f;
    public final icnl g;
    private String i;

    public AppCastChimeraActivity() {
        this.e = ctnb.a("AppCast", new ibuk(this.getClass()));
        this.g = icnm.a(null);
    }

    public final void a(goz goz0, int v) {
        goz goz1 = goz0.ao(1356740800);
        if((((v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v) & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            gui gui0 = ltd.b(this.g, goz1);
            hey hey0 = hfc.e;
            hfc hfc0 = dls.w(hey0);
            iau iau0 = dii.a(dho.c, hei.m, goz1, 0);
            long v1 = gol.c(goz1);
            gzk gzk0 = goz1.ak();
            hfc hfc1 = hew.c(goz1, hfc0);
            ibth ibth0 = iej.a;
            goz1.O();
            if(goz1.x) {
                goz1.t(ibth0);
            }
            else {
                goz1.T();
            }
            int v2 = (int)(v1 ^ v1 >>> 0x20);
            guo.b(goz1, iau0, iej.e);
            guo.b(goz1, gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(goz1.x || !ibuq.m(goz1.j(), Integer.valueOf(v2))) {
                Integer integer0 = v2;
                goz1.P(integer0);
                goz1.p(integer0, ibtw0);
            }
            guo.a(goz1, iej.g);
            guo.b(goz1, hfc1, iej.c);
            dlv.a(dmv.b(dls.w(hey0), dmw.e(goz1)), goz1);
            goz1.M(0xAEABF816);
            if(AppCastChimeraActivity.c(gui0) != null && this.i != null) {
                String s = hvnj.c() + "?signaling=webview&package_name=" + this.i;
                ctho ctho0 = AppCastChimeraActivity.c(gui0);
                if(ctho0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                goz1.M(5004770);
                boolean z = goz1.Z(this);
                Object object0 = goz1.j();
                if(z || object0 == gop.a) {
                    object0 = new ctii(this);
                    goz1.P(object0);
                }
                goz1.x();
                ctjv.a(s, ctho0, ((ibth)object0), goz1, 0);
            }
            goz1.x();
            goz1.z();
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new ctij(this, v);
        }
    }

    private static final ctho c(gui gui0) {
        return (ctho)gui0.a();
    }

    @Override  // ctip
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(!hvnj.d()) {
            ((ggtj)this.e.j()).x("AppCast feature is disabled, shutting down activity");
            this.finish();
            return;
        }
        if(!this.getIntent().hasExtra("deviceId")) {
            ((ggtj)this.e.j()).x("Launch intent is missing device ID");
            this.finish();
            return;
        }
        if(!this.getIntent().hasExtra("packageName")) {
            ((ggtj)this.e.j()).x("Launch intent must include a packageName");
            this.finish();
            return;
        }
        icbb.b(lpt.a(this), null, null, new ctil(this, null), 3);
        this.i = this.getIntent().getStringExtra("packageName");
        xnf.a(this, new gze(0x37338917, true, new ctim(this)));
    }
}


package com.google.android.gms.notifications.registration.ui;

import android.os.Bundle;
import android.text.format.DateFormat;
import bbdg;
import bbse;
import bbsh;
import bbsj;
import cclw;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.notifications.registration.data.ChimeGmsAccountDatabase;
import djtp;
import djts;
import djuc;
import djxf;
import djxg;
import djxh;
import djxi;
import djxj;
import djxl;
import djxt;
import frli;
import gmcd;
import hfwn;
import hfyn;
import ibnx;
import ibpo;
import ibrl;
import ibrx;
import ibuq;
import ibzk;
import icbb;
import icck;
import iccl;
import icpu;
import java.util.Locale;
import jys;
import kex;

@GmsCoreVeId(0x3FBAC)
public final class NotificationsRegistrationDebugChimeraActivity extends djxt {
    public djts j;
    public ChimeGmsAccountDatabase k;
    public final icck l;
    public final bbsj m;
    public final bbsj n;
    public frli o;
    private final bbsj r;
    private final bbsj s;

    public NotificationsRegistrationDebugChimeraActivity() {
        this.l = iccl.b(cclw.b);
        this.r = new bbsj(this);
        this.m = new bbsj(this);
        this.n = new bbsj(this);
        this.s = new bbsj(this);
    }

    public final Object a(ibrl ibrl0) {
        djxi djxi0;
        if((ibrl0 instanceof djxi)) {
            djxi0 = (djxi)ibrl0;
            int v = djxi0.c;
            if((v & 0x80000000) == 0) {
                djxi0 = new djxi(this, ibrl0);
            }
            else {
                djxi0.c = v - 0x80000000;
            }
        }
        else {
            djxi0 = new djxi(this, ibrl0);
        }
        Object object0 = djxi0.a;
        Object object1 = ibrx.a;
        switch(djxi0.c) {
            case 0: {
                ibnx.b(object0);
                ChimeGmsAccountDatabase chimeGmsAccountDatabase0 = this.k;
                if(chimeGmsAccountDatabase0 == null) {
                    ibuq.j("chimeGmsAccountDatabase");
                    chimeGmsAccountDatabase0 = null;
                }
                djuc djuc0 = chimeGmsAccountDatabase0.u();
                djxi0.c = 1;
                object0 = djuc0.a(djxi0);
                return object0 == object1 ? object1 : ibpo.aK(((Iterable)object0), "\n", null, null, new djxh(), 30);
            }
            case 1: {
                ibnx.b(object0);
                return ibpo.aK(((Iterable)object0), "\n", null, null, new djxh(), 30);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object l(ibrl ibrl0) {
        djxj djxj0;
        if((ibrl0 instanceof djxj)) {
            djxj0 = (djxj)ibrl0;
            int v = djxj0.c;
            if((v & 0x80000000) == 0) {
                djxj0 = new djxj(this, ibrl0);
            }
            else {
                djxj0.c = v - 0x80000000;
            }
        }
        else {
            djxj0 = new djxj(this, ibrl0);
        }
        Object object0 = djxj0.a;
        Object object1 = ibrx.a;
        switch(djxj0.c) {
            case 0: {
                ibnx.b(object0);
                frli frli0 = this.o;
                if(frli0 == null) {
                    ibuq.j("registrationDataStore");
                    frli0 = null;
                }
                gmcd gmcd0 = frli0.a();
                ibuq.e(gmcd0, "getData(...)");
                djxj0.c = 1;
                object0 = icpu.c(gmcd0, djxj0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s = DateFormat.getBestDateTimePattern(Locale.getDefault(), "EEE, MMM d H:mm:ss");
        hfwn hfwn0 = ((djtp)object0).e;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        return ibzk.b(("\n          " + DateFormat.format(s, hfyn.b(hfwn0)) + "\n          Reason: " + ((djtp)object0).f + "\n        "));
    }

    // Detected as a lambda impl.
    public final void m() {
        djxl djxl0 = new djxl(this, null);
        icbb.b(this.l, null, null, djxl0, 3);
    }

    @Override  // djxt
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.eM);
        super.onCreate(bundle0);
        this.setTitle("Notifications Registration");
        if(jys.d()) {
            kex.b(this.findViewById(0x102000A), new djxf());
        }
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        this.m();
    }

    @Override  // avyp
    protected final void q(bbsh bbsh0) {
        bbse bbse0 = null;
        bbse bbse1 = bbsh0 == null ? null : bbsh0.a;
        bbsj bbsj0 = this.r;
        bbsj0.o(0);
        bbsj0.s("Register");
        bbsj0.q("Registers all accounts on the device");
        bbsj0.n(new djxg(this));
        if(bbse1 != null) {
            bbse1.k(bbsj0);
        }
        if(bbsh0 != null) {
            bbse0 = bbsh0.L("Registration Status", 0);
        }
        bbsj bbsj1 = this.s;
        bbsj1.o(0);
        bbsj1.s("Refresh");
        bbsj1.q("Reloads the data below");
        bbsj1.n((/* MISSING LAMBDA PARAMETER */, /* MISSING LAMBDA PARAMETER */) -> {
            djxl djxl0 = new djxl(this, null);
            icbb.b(this.l, null, null, djxl0, 3);
        });
        if(bbse0 != null) {
            bbse0.k(bbsj1);
        }
        bbsj bbsj2 = this.m;
        bbsj2.s("Last Successful Registration");
        if(bbse0 != null) {
            bbse0.k(bbsj2);
        }
        bbsj bbsj3 = this.n;
        bbsj3.s("Accounts Status");
        if(bbse0 != null) {
            bbse0.k(bbsj3);
        }
    }

    @Override  // avyp
    public final void r() {
    }
}


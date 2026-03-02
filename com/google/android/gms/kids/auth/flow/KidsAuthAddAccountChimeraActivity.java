package com.google.android.gms.kids.auth.flow;

import acp;
import adt;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import bbdg;
import bboh;
import capu;
import capv;
import caqe;
import caqf;
import caqg;
import caqj;
import caqk;
import caql;
import caqm;
import caqn;
import caqo;
import caqp;
import cart;
import cash;
import casm;
import cbdy;
import cbfc;
import cclw;
import ccmq;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyju;
import gged_interceptors;
import ggtj;
import gvka;
import huix;
import ibnx;
import ibom;
import ibrl;
import ibrt;
import ibrx;
import ibuq;
import icbb;
import icbd;
import lpt;
import xni;

@GmsCoreVeId(0x3FAD9)
public final class KidsAuthAddAccountChimeraActivity extends xni {
    public static final bboh j;
    public ibrt k;
    public Context l;
    public cash m;
    public cart n;
    public final acp o;
    public cbdy p;
    public capu q;
    private final acp r;
    private caqf s;

    static {
        KidsAuthAddAccountChimeraActivity.j = capv.a("KidsAuthAddAccountChimeraActivity");
    }

    public KidsAuthAddAccountChimeraActivity() {
        this.r = this.registerForActivityResult(new adt(), new caqn(this));
        this.o = this.registerForActivityResult(new adt(), new caqj(this));
    }

    public final Context a() {
        Context context0 = this.l;
        if(context0 != null) {
            return context0;
        }
        ibuq.j("context");
        return null;
    }

    public final Object g(Bundle bundle0, ibrl ibrl0) {
        caqk caqk0;
        if((ibrl0 instanceof caqk)) {
            caqk0 = (caqk)ibrl0;
            int v = caqk0.c;
            if((v & 0x80000000) == 0) {
                caqk0 = new caqk(this, ibrl0);
            }
            else {
                caqk0.c = v - 0x80000000;
            }
        }
        else {
            caqk0 = new caqk(this, ibrl0);
        }
        Object object0 = caqk0.a;
        Object object1 = ibrx.a;
        switch(caqk0.c) {
            case 0: {
                ibnx.b(object0);
                cbfc.a(gvka.H);
                if(bundle0 != null) {
                    cbfc.a(gvka.L);
                    this.n();
                    return ibom.a;
                }
                cash cash0 = this.m;
                if(cash0 == null) {
                    ibuq.j("supervisionBinaryIntentBuilder");
                    cash0 = null;
                }
                Intent intent0 = this.getIntent();
                ibuq.e(intent0, "getIntent(...)");
                caqk0.c = 1;
                object0 = cash0.b(intent0, caqk0);
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
        if(((Intent)object0) == null) {
            ((ggtj)KidsAuthAddAccountChimeraActivity.j.j()).x("No suitable activity for add account was found.");
            cbfc.a(gvka.M);
            this.n();
            return ibom.a;
        }
        this.r.b(((Intent)object0));
        cbfc.a(gvka.I);
        return ibom.a;
    }

    public final Object l(Bundle bundle0, ibrl ibrl0) {
        caql caql0;
        if((ibrl0 instanceof caql)) {
            caql0 = (caql)ibrl0;
            int v = caql0.c;
            if((v & 0x80000000) == 0) {
                caql0 = new caql(this, ibrl0);
            }
            else {
                caql0.c = v - 0x80000000;
            }
        }
        else {
            caql0 = new caql(this, ibrl0);
        }
        Object object0 = caql0.a;
        Object object1 = ibrx.a;
        switch(caql0.c) {
            case 0: {
                ibnx.b(object0);
                caql0.d = bundle0;
                caql0.c = 1;
                ibrt ibrt0 = this.k;
                if(ibrt0 == null) {
                    ibuq.j("blockingContext");
                    ibrt0 = null;
                }
                object0 = icbd.a(ibrt0, new caqm(this, null), caql0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_25;
            }
            case 1: {
                bundle0 = caql0.d;
                ibnx.b(object0);
            label_25:
                if(((Boolean)object0).booleanValue()) {
                    caql0.d = null;
                    caql0.c = 2;
                    return this.g(bundle0, caql0) != object1 ? ibom.a : object1;
                }
                casm.a(this, false);
                fyju fyju0 = new fyju(this, 0x7F160DA5);  // style:ThemeOverlay.GoogleMaterial.MaterialAlertDialog
                fyju0.N(0x7F152F40);  // string:sps_account_addition_dialog_title "Check back later"
                fyju0.C(0x7F152F3F);  // string:sps_account_addition_dialog_message "You can add more accounts once supervision 
                                      // is ready"
                fyju0.L(0x7F1508A8, new caqg());  // string:common_ok "OK"
                fyju0.J((/* MISSING LAMBDA PARAMETER */) -> {
                    this.setResult(0);
                    this.finish();
                });
                fyju0.I((/* MISSING LAMBDA PARAMETER */) -> {
                    this.setResult(0);
                    this.finish();
                });
                fyju0.create().show();
                return ibom.a;
            }
            case 2: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final Object m(ibrl ibrl0) {
        caqp caqp0;
        if((ibrl0 instanceof caqp)) {
            caqp0 = (caqp)ibrl0;
            int v = caqp0.c;
            if((v & 0x80000000) == 0) {
                caqp0 = new caqp(this, ibrl0);
            }
            else {
                caqp0.c = v - 0x80000000;
            }
        }
        else {
            caqp0 = new caqp(this, ibrl0);
        }
        Object object0 = caqp0.a;
        Object object1 = ibrx.a;
        switch(caqp0.c) {
            case 0: {
                ibnx.b(object0);
                if(huix.a.b().k()) {
                    cbdy cbdy0 = this.p;
                    if(cbdy0 == null) {
                        ibuq.j("accountRepository");
                        cbdy0 = null;
                    }
                    caqp0.c = 1;
                    object0 = cbdy0.b(caqp0);
                    if(object0 != object1) {
                        return ((gged_interceptors)object0).isEmpty() ? Boolean.valueOf(true) : Boolean.valueOf(false);
                    }
                    return object1;
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                ibnx.b(object0);
                return ((gged_interceptors)object0).isEmpty() ? Boolean.valueOf(true) : Boolean.valueOf(false);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    // Detected as a lambda impl.
    public final void n() {
        this.setResult(0);
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.mA);
        super.onCreate(bundle0);
        if(!ibuq.m(this.getCallingPackage(), "com.google.android.gms")) {
            ((ggtj)KidsAuthAddAccountChimeraActivity.j.j()).B("Expecting to receive intent from GMS Core, received from: %s", this.getCallingPackage());
            this.n();
            return;
        }
        if(!ibuq.m(this.getIntent().getAction(), "com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT")) {
            ((ggtj)KidsAuthAddAccountChimeraActivity.j.j()).B("Expecting to receive intent with action to add account, received: %s", this.getIntent().getAction());
            this.n();
            return;
        }
        if(this.s == null) {
            caqe caqe0 = new caqe();
            Context context0 = this.getApplication().getApplicationContext();
            ibuq.e(context0, "getApplicationContext(...)");
            caqe0.b(context0);
            caqe0.c(cclw.d);
            caqe0.a = lpt.a(this);
            this.s = caqe0.a();
        }
        caqf caqf0 = this.s;
        if(caqf0 != null) {
            this.k = caqf0.b;
            this.l = caqf0.a;
            this.m = caqf0.a();
            this.n = new cart(caqf0.a);
            this.p = caqf0.b();
            this.q = new capu();
        }
        icbb.b(lpt.a(this), null, null, new caqo(this, bundle0, null), 3);
    }
}


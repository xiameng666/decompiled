package com.google.android.gms.identitycredentials.ui;

import abn;
import aca;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.ui.platform.ComposeView;
import bbqa;
import bxvp;
import bxzl;
import bxzt;
import byah;
import bygc;
import bygd;
import byge;
import bygf;
import bygg;
import bygh;
import bygi;
import bygk;
import bygl;
import bygm;
import bylv;
import byny;
import byof;
import byom;
import bysi;
import bysj;
import byvt;
import byvv;
import gop;
import goz;
import gqe;
import gsb;
import gui;
import gze;
import ibnn;
import ibth;
import ibts;
import ibtw;
import ibuk;
import ibuq;
import isq;
import lsd;
import ltd;
import xob;

public final class CredentialChooserChimeraActivity extends xob {
    private final ibnn j;

    public CredentialChooserChimeraActivity() {
        byge byge0 = new byge(this);
        this.j = new lsd(new ibuk(byof.class), new bygl(this), byge0, new bygm(this));
    }

    public final byof a() {
        return (byof)this.j.a();
    }

    public final void b() {
        this.finish();
        if(!bbqa.d()) {
            this.overridePendingTransition(0, 0);
        }
    }

    public final void c(goz goz0, int v) {
        goz goz1 = goz0.ao(0x32A1AF7A);
        int v1 = (v & 6) == 0 ? (goz1.Z(this) ? 4 : 2) | v : v;
        if((v1 & 3) == 2 && goz1.ac()) {
            goz1.G();
        }
        else {
            bxvp bxvp0 = new bxvp();
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new bygc(this);
                goz1.P(object0);
            }
            goz1.x();
            aca aca0 = abn.a(bxvp0, ((ibts)object0), goz1);
            gui gui0 = ltd.b(this.a().b, goz1);
            byom byom0 = CredentialChooserChimeraActivity.g(gui0);
            byvv byvv0 = null;
            bxzt bxzt0 = byom0 == null ? null : byom0.e;
            goz1.M(-1633490746);
            int v2 = goz1.Z(byom0) | goz1.Z(this);
            Object object1 = goz1.j();
            if(v2 != 0 || object1 == gop.a) {
                object1 = new bygh(byom0, this, null);
                goz1.P(object1);
            }
            goz1.x();
            gqe.f(bxzt0, ((ibtw)object1), goz1);
            bysj bysj0 = byom0 == null ? null : byom0.a;
            byny byny0 = byom0 == null ? null : byom0.g;
            if(byom0 != null) {
                byvv0 = byom0.b;
            }
            if(byny0 != null && byny0.a == null) {
                goz1.M(0xD8F88D2);
                goz1.x();
                this.b();
            }
            else if(byny0 != null) {
                goz1.M(227662909);
                ibuq.c(byny0.a);
                this.f(byny0.a, goz1, v1 << 3 & 0x70);
                goz1.x();
            }
            else if(byom0 != null && bysj0 != null && (!bysj0.e.isEmpty() || !bysj0.d.f && bysj0.h != null)) {
                goz1.M(0xD950D42);
                bysi.b(this.a(), bysj0, aca0, byom0.d, goz1, 584);
                goz1.x();
            }
            else if(byom0 != null && byvv0 != null && (!byvv0.c.a.isEmpty() || !byvv0.c.b.isEmpty() || byvv0.c.c != null && !byvv0.b.b)) {
                goz1.M(0xD9AE3EB);
                byvt.h(this.a(), byvv0, aca0, byom0.d, goz1, 584);
                goz1.x();
            }
            else {
                goz1.M(0xD9EFDAE);
                goz1.x();
                if(CredentialChooserChimeraActivity.g(gui0) != null) {
                    Log.e("CredentialSelector", "UI wasn\'t able to render neither get nor create flow");
                    Intent intent0 = this.a().b();
                    if(intent0 != null) {
                        this.setResult(-1, intent0);
                    }
                    this.b();
                }
            }
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bygd(this, v);
        }
    }

    public final void f(String s, goz goz0, int v) {
        goz goz1 = goz0.ao(0x227190AE);
        int v1 = (v & 6) == 0 ? (goz1.X(s) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (goz1.Z(this) ? 0x20 : 16);
        }
        if((v1 & 19) == 18 && goz1.ac()) {
            goz1.G();
        }
        else {
            String s1 = isq.d(0x7F15283C, new Object[]{s}, goz1);  // string:request_cancelled_by "Request cancelled by %1$s"
            goz1.M(5004770);
            boolean z = goz1.Z(this);
            Object object0 = goz1.j();
            if(z || object0 == gop.a) {
                object0 = new bygf(this);
                goz1.P(object0);
            }
            goz1.x();
            bylv.a(s1, null, ((ibth)object0), true, goz1, 0xC00, 2);
            bxzl.i(this.a().a(), byah.c);
        }
        gsb gsb0 = goz1.af();
        if(gsb0 != null) {
            gsb0.d = new bygg(this, s, v);
        }
    }

    private static final byom g(gui gui0) {
        return (byom)gui0.a();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(bbqa.d()) {
            this.overrideActivityTransition(0, 0, 0);
            this.overrideActivityTransition(1, 0, 0);
        }
        else {
            this.overridePendingTransition(0, 0);
        }
        this.getOnBackPressedDispatcher().c(this, new bygi(this.a(), this));
        ComposeView composeView0 = new ComposeView(this, null, 0, 6, null);
        composeView0.a(new gze(1801542457, true, new bygk(this)));
        this.setContentView(composeView0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        ibuq.f(intent0, "intent");
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        this.a().w(intent0, this, System.currentTimeMillis());
    }
}


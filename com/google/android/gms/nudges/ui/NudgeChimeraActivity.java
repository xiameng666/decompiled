package com.google.android.gms.nudges.ui;

import android.os.Bundle;
import cmhi;
import com.google.android.gms.nudges.NudgeRequest;
import dkdo;
import dkdp;
import dkdr;
import dkdw;
import dkdx;
import dkdy;
import dked;
import dkgv;
import dkgx;
import gze;
import hvte;
import ibnn;
import ibnz;
import ibuk;
import icbb;
import lpt;
import lsd;
import qfk;
import xnc;
import xnf;

public final class NudgeChimeraActivity extends dked {
    public cmhi e;
    public final ibnn f;
    public boolean g;
    public qfk h;
    public dkgx i;
    private final ibnn k;

    public NudgeChimeraActivity() {
        this.k = new ibnz(new dkdo(this));
        dkdp dkdp0 = new dkdp(this);
        this.f = new lsd(new ibuk(dkgv.class), new dkdx(this), dkdp0, new dkdy(this));
    }

    public final NudgeRequest a() {
        return (NudgeRequest)this.k.a();
    }

    @Override  // dked
    protected final void onCreate(Bundle bundle0) {
        xnc.a(this);
        super.onCreate(bundle0);
        if(hvte.d()) {
            this.h = qfk.a.a(this);
            icbb.b(lpt.a(this), null, null, new dkdr(this, null), 3);
            xnf.a(this, new gze(0x134C89DB, true, new dkdw(this)));
            return;
        }
        this.finish();
    }
}


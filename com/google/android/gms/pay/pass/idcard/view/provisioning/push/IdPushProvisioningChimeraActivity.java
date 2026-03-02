package com.google.android.gms.pay.pass.idcard.view.provisioning.push;

import a;
import android.os.Bundle;
import bbcu;
import bbdg;
import bboh;
import ca;
import ccmq;
import dlmk;
import dolg;
import doli;
import doml;
import duvf;
import duvo;
import duvp;
import duvr;
import duvs;
import duwt;
import etgl;
import evql;
import ibuq;
import xni;

public final class IdPushProvisioningChimeraActivity extends xni implements doli, doml {
    public dolg j;
    public boolean k;
    public etgl l;
    public static final int m;
    private static final bboh n;
    private duwt o;

    static {
        IdPushProvisioningChimeraActivity.n = bboh.b("Pay", bbcu.cZ);
    }

    // Detected as a lambda impl.
    public final void a(Exception exception0) {
        a.ae(IdPushProvisioningChimeraActivity.n.i(), "Error in IdPushProvisioningActivity", exception0);
        this.setResult(0);
        this.supportFinishAfterTransition();
    }

    @Override  // doli
    public final dolg ap() {
        return this.j;
    }

    @Override  // doml
    public final void b(String s) {
        this.j = null;
        evql evql0 = this.m().cQ(s);
        evql0.b(new duvs(new duvr(this)));
        evql0.A((Exception exception0) -> {
            a.ae(IdPushProvisioningChimeraActivity.n.i(), "Error in IdPushProvisioningActivity", exception0);
            this.setResult(0);
            this.supportFinishAfterTransition();
        });
    }

    public final void g() {
        if(this.j == null) {
            this.l();
            return;
        }
        if(this.o == null) {
            this.o = new duwt();
            ca ca0 = new ca(this.getSupportFragmentManager());
            ca0.G(0x1020002, new duwt());
            ca0.a();
        }
    }

    public final void l() {
        evql evql0 = this.m().j();
        evql0.b(new duvp(new duvo(this)));
        evql0.A((Exception exception0) -> {
            a.ae(IdPushProvisioningChimeraActivity.n.i(), "Error in IdPushProvisioningActivity", exception0);
            this.setResult(0);
            this.supportFinishAfterTransition();
        });
    }

    public final etgl m() {
        etgl etgl0 = this.l;
        if(etgl0 != null) {
            return etgl0;
        }
        ibuq.j("firstPartyTapAndPayClient");
        return null;
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        ccmq.a().a(bbdg.s);
        super.onCreate(bundle0);
        new duvf(new dlmk(this)).inject(this);
    }

    @Override  // xoi
    protected final void onResume() {
        super.onResume();
        this.g();
    }
}


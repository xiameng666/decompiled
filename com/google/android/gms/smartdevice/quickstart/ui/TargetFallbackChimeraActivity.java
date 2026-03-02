package com.google.android.gms.smartdevice.quickstart.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import bagr;
import bagv;
import bagw;
import baun;
import bbqa;
import ca;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import com.google.android.gms.smartdevice.d2d.FallbackAccount;
import du;
import eqoc;
import eqsh;
import eqxo;
import eray;
import erco;
import erei;
import eriy;
import eriz;
import erja;
import erpa;
import erqc;
import fncv;
import fncw;
import fncy;
import gjiz;
import gjld;
import hpbc;
import java.util.ArrayList;
import java.util.List;
import xnj;

@GmsCoreVeId(0x3FDB0)
public class TargetFallbackChimeraActivity extends xnj implements eriz {
    private static final baun h;
    private eray i;
    private int j;

    static {
        TargetFallbackChimeraActivity.h = new erqc(new String[]{"TargetFallbackChimeraActivity"});
    }

    public final void k() {
        this.i.w(5);
        du du0 = this.l();
        if((du0 instanceof erja)) {
            ((erja)du0).z();
        }
    }

    private final du l() {
        return this.gy().g(0x7F0B14C5);  // id:fragment_container
    }

    @Override  // xnz
    public final void onBackPressed() {
        this.k();
    }

    @Override  // xnj
    public final void onConfigurationChanged(Configuration configuration0) {
        TargetFallbackChimeraActivity.h.d("onConfigurationChanged()", new Object[0]);
        super.onConfigurationChanged(configuration0);
        du du0 = this.l();
        if((du0 instanceof erja)) {
            ((erja)du0).y();
        }
    }

    @Override  // xnj
    protected final void onCreate(Bundle bundle0) {
        if(!bagw.a(this)) {
            TargetFallbackChimeraActivity.h.m("Invalid caller, finishing activity.", new Object[0]);
            this.finishAndRemoveTask();
            return;
        }
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(hpbc.c()) {
            bagr.a(this);
        }
        bagv.g(this);
        this.setContentView(0x7F0E09E1);  // layout:smartdevice_fragment_container
        if(bundle0 == null) {
            List list0 = ((fncw)new fncy().j(intent0)).a;
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                arrayList0.add(new FallbackAccount(((fncv)object0).b, ((fncv)object0).c, ""));
            }
            this.j = arrayList0.size();
            erja erja0 = eriy.a(arrayList0);
            ca ca0 = new ca(this.gy());
            if(!erpa.b(this) && !erei.f(this.getApplicationContext(), ca0)) {
                ca0.B(0x7F0100D4, 0x7F0100D5, 0x7F0100D2, 0x7F0100D3);  // anim:sud_slide_next_in
            }
            ca0.G(0x7F0B14C5, erja0);  // id:fragment_container
            ca0.w(null);
            ca0.b();
        }
        if(bbqa.c()) {
            this.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, new erco(this));
        }
        long v = eqxo.a(this);
        TargetFallbackChimeraActivity.h.h("onCreate(): SessionId: %d; Is deferred SUW: %b", new Object[]{v, Boolean.valueOf(eqsh.w(this))});
        eray eray0 = eray.i(this);
        this.i = eray0;
        eray0.b = v;
        eray0.c = gjld.d;
    }

    @Override  // eriz
    public final void y(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((eqoc)hftv0).c = 5;
        ((eqoc)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqoc eqoc0 = (eqoc)hftp0.b_message;
        eqoc0.b |= 2;
        eqoc0.d = v;
        eqoc eqoc1 = (eqoc)hftp0.N_build();
        this.i.n(10599, eqoc1);
        this.setResult(0);
        this.finish();
    }

    @Override  // eriz
    public final void z(List list0) {
        int v = this.j - list0.size();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjiz.a).v_newBuilder();
        int v1 = this.j;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjiz gjiz0 = (gjiz)hftp0.b_message;
        gjiz0.b |= 1;
        gjiz0.c = v1;
        int v2 = list0.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjiz)hftv0).b |= 2;
        ((gjiz)hftv0).d = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjiz gjiz1 = (gjiz)hftp0.b_message;
        gjiz1.b |= 4;
        gjiz1.e = v;
        gjiz gjiz2 = (gjiz)hftp0.N_build();
        this.i.l(gjiz2);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(((FallbackAccount)object0).b);
        }
        Intent intent0 = new Intent();
        intent0.putStringArrayListExtra("accounts", arrayList0);
        this.setResult(-1, intent0);
        this.finish();
    }
}


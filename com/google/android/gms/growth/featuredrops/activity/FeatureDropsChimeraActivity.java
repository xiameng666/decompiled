package com.google.android.gms.growth.featuredrops.activity;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.os.Bundle;
import android.widget.Toast;
import bbdg;
import bvnd;
import bvne;
import bwef;
import ccmq;
import hgnj;
import htwh;

public class FeatureDropsChimeraActivity extends bvnd {
    public static final String p;

    static {
        FeatureDropsChimeraActivity.p = bwef.b(FeatureDropsChimeraActivity.class);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgnj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnj.b(((hgnj)hftp0.b_message));
        hgnj hgnj0 = (hgnj)hftp0.N_build();
    }

    private final boolean M() {
        return htwh.a.b().f() ? this.I("should_skip_server_query") : false;
    }

    @Override  // bvvt
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ccmq.a().a(bbdg.fZ);
    }

    @Override  // bvvt
    protected final int v() {
        return this.u.c() ? 0x7F0E0333 : 0x7F0E037A;  // layout:error_page
    }

    @Override  // bvvt
    protected final int w() {
        return this.u.c() ? 0x7F0B1294 : 0x7F0B1390;  // id:error_page_container
    }

    @Override  // bvvt
    protected final boolean x() {
        return this.M();
    }

    @Override  // bvvt
    protected final void y() {
        if(this.M()) {
            Toast.makeText(this, "skipping server query", 0).show();
            this.q(null);
            return;
        }
        this.H();
        this.l.execute(new bvne(this));
    }
}


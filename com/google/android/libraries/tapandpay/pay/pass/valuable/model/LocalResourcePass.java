package com.google.android.libraries.tapandpay.pay.pass.valuable.model;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import gfqx;
import gfsx;
import ggna;
import gumi;
import guuy;
import guvb;
import guvk;
import guvv;
import guwd;
import guwf;
import guzc;
import gveu;

public final class LocalResourcePass extends Valuable {
    public LocalResourcePass(guzc guzc0, gfsx gfsx0, long v, long v1, boolean z, boolean z1, boolean z2, int v2, gfsx gfsx1, boolean z3, guwd guwd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gveu gveu0 = (gveu)hftp0.b_message;
        guzc0.getClass();
        gveu0.c = guzc0;
        gveu0.b = 12;
        super(((gveu)hftp0.N_build()), guwf.m, guzc0.c, (guzc0.d == null ? guvk.a : guzc0.d), guvb.a, (guzc0.e == null ? guvv.a : guzc0.e), (guzc0.f == null ? guuy.a : guzc0.f), (guzc0.g == null ? gumi.a : guzc0.g), ggna.a, gfsx0, v, v1, z, z1, z2, v2, gfsx1, ggna.a, ggna.a, z3, guwd0, gfqx.a);
    }
}


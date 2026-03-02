package com.google.android.libraries.tapandpay.pay.pass.valuable.model;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import gfqx;
import gfsx;
import gged_interceptors;
import ggna;
import gtyf;
import gumi;
import guuy;
import guvb;
import guvk;
import guvv;
import guwd;
import guwf;
import guxg;
import gveu;

public final class Flight extends Valuable {
    public Flight(guxg guxg0, gfsx gfsx0, long v, long v1, boolean z, boolean z1, boolean z2, int v2, gfsx gfsx1, gged_interceptors gged0, boolean z3, guwd guwd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gveu gveu0 = (gveu)hftp0.b_message;
        guxg0.getClass();
        gveu0.c = guxg0;
        gveu0.b = 5;
        super(((gveu)hftp0.N_build()), guwf.g, guxg0.c, (guxg0.d == null ? guvk.a : guxg0.d), (guxg0.e == null ? guvb.a : guxg0.e), (guxg0.f == null ? guvv.a : guxg0.f), (guxg0.g == null ? guuy.a : guxg0.g), (guxg0.o == null ? gumi.a : guxg0.o), gged_interceptors.l((guxg0.m == null ? gtyf.a : guxg0.m)), gfsx0, v, v1, z, z1, z2, v2, gfsx1, ggna.a, gged0, z3, guwd0, gfqx.a);
    }
}


package com.google.android.libraries.tapandpay.pay.pass.valuable.model;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import gfqx;
import gfsx;
import gged_interceptors;
import ggna;
import gumi;
import guuy;
import guvb;
import guvk;
import guvv;
import guwd;
import guwf;
import guze;
import gveu;

public class LoyaltyCard extends Valuable {
    public LoyaltyCard(guze guze0, gfsx gfsx0, long v, long v1, boolean z, boolean z1, boolean z2, int v2, gfsx gfsx1, gged_interceptors gged0, boolean z3, guwd guwd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gveu gveu0 = (gveu)hftp0.b_message;
        guze0.getClass();
        gveu0.c = guze0;
        gveu0.b = 1;
        super(((gveu)hftp0.N_build()), guwf.b, guze0.c, (guze0.d == null ? guvk.a : guze0.d), (guze0.e == null ? guvb.a : guze0.e), (guze0.f == null ? guvv.a : guze0.f), (guze0.i == null ? guuy.a : guze0.i), (guze0.h == null ? gumi.a : guze0.h), ggna.a, gfsx0, v, v1, z, z1, z2, v2, gfsx1, ggna.a, gged0, z3, guwd0, gfqx.a);
    }
}


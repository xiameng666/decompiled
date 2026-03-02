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
import guyb;
import gveu;

public class GiftCard extends Valuable {
    public GiftCard(guyb guyb0, gfsx gfsx0, long v, long v1, boolean z, boolean z1, boolean z2, int v2, gfsx gfsx1, gged_interceptors gged0, boolean z3, guwd guwd0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gveu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gveu gveu0 = (gveu)hftp0.b_message;
        guyb0.getClass();
        gveu0.c = guyb0;
        gveu0.b = 2;
        super(((gveu)hftp0.N_build()), guwf.c, guyb0.c, (guyb0.d == null ? guvk.a : guyb0.d), (guyb0.e == null ? guvb.a : guyb0.e), (guyb0.f == null ? guvv.a : guyb0.f), (guyb0.j == null ? guuy.a : guyb0.j), (guyb0.i == null ? gumi.a : guyb0.i), ggna.a, gfsx0, v, v1, z, z1, z2, v2, gfsx1, ggna.a, gged0, z3, guwd0, gfqx.a);
    }
}


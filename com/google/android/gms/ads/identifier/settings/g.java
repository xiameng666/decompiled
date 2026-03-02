package com.google.android.gms.ads.identifier.settings;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import gfsi;
import grtg;

public final class g implements gfsi {
    public final byte[] a;
    public final byte[] b;

    public g(byte[] arr_b, byte[] arr_b1) {
        this.a = arr_b;
        this.b = arr_b1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grtg.a).v_newBuilder();
        ByteString hfsf0 = ByteString.A(((String)object0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grtg)hftp0.b_message).c = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((grtg)hftp0.b_message).d = hfsf1;
        ByteString hfsf2 = ByteString.copyFrom(this.b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grtg grtg0 = (grtg)hftp0.b_message;
        grtg0.b |= 1;
        grtg0.e = hfsf2;
        return (grtg)hftp0.N_build();
    }
}


package com.google.android.gms.ads.adinfo;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import com.google.ads.afma.proto2api.b;
import com.google.android.gms.ads.identifier.c;
import gfsi;

public final class a implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)b.a).v_newBuilder();
        String s = ((c)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((b)hftv0).d |= 0x2000000;
        ((b)hftv0).n = s;
        boolean z = ((c)object0).b;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((b)hftv1).d |= 0x8000000;
        ((b)hftv1).p = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((b)hftp0.b_message).o = 5;
        ((b)hftp0.b_message).d |= 0x4000000;
        return (b)hftp0.N_build();
    }
}


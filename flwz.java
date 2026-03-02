public final class flwz {
    public static fmfh a(hnrx hnrx0) {
        fmfg fmfg0 = fmfh.a();
        fmfg0.c(hnrx0.d);
        fmfg0.f(hnrx0.e);
        fmfg0.d(hnrx0.c.toByteArray());
        fmfg0.e(hnrx0.g);
        if((hnrx0.b & 1) != 0) {
            fmfg0.b(flwp.a((hnrx0.f == null ? hjie.a : hnrx0.f)));
        }
        return fmfg0.a();
    }

    public static hnrx b(fmfh fmfh0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnrx.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(fmfh0.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hnrx)hftv0).c = hfsf0;
        int v = fmfh0.c;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hnrx)hftv1).d = v;
        int v1 = fmfh0.b;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((hnrx)hftv2).e = v1;
        String s = fmfh0.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnrx hnrx0 = (hnrx)hftp0.b_message;
        s.getClass();
        hnrx0.g = s;
        gfsx gfsx0 = fmfh0.d;
        if(gfsx0.i()) {
            hjie hjie0 = flwp.b(((Integer)gfsx0.d()).intValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnrx hnrx1 = (hnrx)hftp0.b_message;
            hjie0.getClass();
            hnrx1.f = hjie0;
            hnrx1.b |= 1;
        }
        return (hnrx)hftp0.N_build();
    }
}


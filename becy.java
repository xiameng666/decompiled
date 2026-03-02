public final class becy {
    public static final gqwt a(gqsp gqsp0, String s) {
        ibuq.f(gqsp0, "<this>");
        ibuq.f(s, "sessionId");
        switch(gqsp0.ordinal()) {
            case 0x9D: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxr.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gqxr gqxr0 = (gqxr)hftp1.b_message;
                s.getClass();
                gqxr0.b |= 1;
                gqxr0.c = s;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqwt gqwt0 = (gqwt)hftp0.b_message;
                gqxr gqxr1 = (gqxr)hftp1.N_build();
                gqxr1.getClass();
                gqwt0.e = gqxr1;
                gqwt0.b |= 0x200;
                return (gqwt)hftp0.N_build();
            }
            case 0xA1: {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqwt.a).v_newBuilder();
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gqxn.a).v_newBuilder();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gqxn gqxn0 = (gqxn)hftp3.b_message;
                s.getClass();
                gqxn0.b |= 0x4000;
                gqxn0.j = s;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gqwt gqwt1 = (gqwt)hftp2.b_message;
                gqxn gqxn1 = (gqxn)hftp3.N_build();
                gqxn1.getClass();
                gqwt1.g = gqxn1;
                gqwt1.b |= 0x20000;
                return (gqwt)hftp2.N_build();
            }
            default: {
                return null;
            }
        }
    }

    public static final gqxs b(gqsm gqsm0, gqsp gqsp0) {
        ibuq.f(gqsm0, "<this>");
        ibuq.f(gqsp0, "category");
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (gqxs)hftv0;
    }

    public static final gqxs c(gqtg gqtg0, gqsp gqsp0) {
        ibuq.f(gqtg0, "<this>");
        ibuq.f(gqsp0, "category");
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqsn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqsn)hftp0.b_message).c = (int)gqtg0.ak;
        ((gqsn)hftp0.b_message).b = 9;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqsn gqsn0 = (gqsn)hftp0.N_build();
        gqsn0.getClass();
        gqxs0.d = gqsn0;
        gqxs0.b |= 2;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hftr0).N_build();
        ibuq.e(hftv0, "build(...)");
        return (gqxs)hftv0;
    }
}


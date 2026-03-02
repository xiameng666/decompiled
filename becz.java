public final class becz {
    private final becu a;

    public becz(becu becu0) {
        this.a = becu0;
    }

    public final void a(gqsm gqsm0, gqsp gqsp0) {
        ibuq.f(gqsm0, "action");
        ibuq.f(gqsp0, "category");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        gqxs gqxs0 = becy.b(gqsm0, gqsp0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs0.getClass();
        gqxt0.c = gqxs0;
        gqxt0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.d(((gqxt)hftv0));
    }

    public final void b(gqtg gqtg0, gqsp gqsp0) {
        ibuq.f(gqtg0, "action");
        ibuq.f(gqsp0, "category");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        gqxs gqxs0 = becy.c(gqtg0, gqsp0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs0.getClass();
        gqxt0.c = gqxs0;
        gqxt0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        this.d(((gqxt)hftv0));
    }

    public final void c(gqsm gqsm0, gqsp gqsp0, String s) {
        ibuq.f(gqsm0, "action");
        ibuq.f(gqsp0, "category");
        ibuq.f(s, "sessionId");
        gqwt gqwt0 = becy.a(gqsp0, s);
        if(gqwt0 != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gqxt)hftp0.b_message).e = gqwt0;
            ((gqxt)hftp0.b_message).b |= 8;
            gqxs gqxs0 = becy.b(gqsm0, gqsp0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqxt gqxt0 = (gqxt)hftp0.b_message;
            gqxs0.getClass();
            gqxt0.c = gqxs0;
            gqxt0.b |= 1;
            ProtoLiteMessage hftv0 = hftp0.N_build();
            ibuq.e(hftv0, "build(...)");
            this.d(((gqxt)hftv0));
        }
    }

    public final void d(gqxt gqxt0) {
        this.a.a(gqxt0);
    }
}


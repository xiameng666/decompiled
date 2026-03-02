final class dxdh extends dxdc {
    public static final dxdh a;

    static {
        dxdh.a = new dxdh();
    }

    @Override  // dxdc
    public final void a(hbsn hbsn0, ProtoLiteBuilder hftp0) {
        ibuq.f(hbsn0, "from");
        ibuq.f(hftp0, "to");
        String s = hbsn0.c();
        if(s == null) {
            s = "";
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfir hfir0 = (hfir)hftp0.b_message;
        hfir0.b |= 4;
        hfir0.e = s;
    }

    @Override  // dxdc
    public final void b(hbsn hbsn0, ProtoLiteBuilder hftp0) {
        ibuq.f(hbsn0, "from");
        ibuq.f(hftp0, "to");
        hfit hfit0 = dxdi.a(Integer.valueOf(hbsn0.a()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).c = hfit0.q;
        ((hfir)hftp0.b_message).b |= 1;
    }

    @Override  // dxdc
    public final void c(hbsn hbsn0, ProtoLiteBuilder hftp0) {
        ibuq.f(hbsn0, "from");
        ibuq.f(hftp0, "to");
        ByteString hfsf0 = dxdi.c(hbsn0.e(), hbsn0.d(), hbsn0.c());
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hfir hfir0 = (hfir)hftp0.b_message;
        hfir0.b |= 2;
        hfir0.d = hfsf0;
    }

    @Override  // dxdc
    public final void d(hbsn hbsn0, ProtoLiteBuilder hftp0) {
        ibuq.f(hbsn0, "from");
        ibuq.f(hftp0, "to");
        hfiv hfiv0 = dxdi.b(Integer.valueOf(hbsn0.b()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).f = hfiv0.o;
        ((hfir)hftp0.b_message).b |= 16;
    }

    @Override  // dxdc
    public final ProtoLiteBuilder e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfir.a).v_newBuilder();
        ibuq.e(hftp0, "newBuilder(...)");
        hfit hfit0 = hfit.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).c = hfit0.q;
        ((hfir)hftp0.b_message).b |= 1;
        ByteString hfsf0 = ByteString.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hfsf0.getClass();
        ((hfir)hftv0).b |= 2;
        ((hfir)hftv0).d = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hfir)hftv1).b |= 4;
        ((hfir)hftv1).e = "";
        hfiv hfiv0 = hfiv.a;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfir)hftp0.b_message).f = hfiv0.o;
        ((hfir)hftp0.b_message).b |= 16;
        return hftp0;
    }
}


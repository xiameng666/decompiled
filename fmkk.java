import j..util.Objects;

public final class fmkk implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnuq.a).v_newBuilder();
        flxe flxe0 = new flxe(hftp0);
        flbl.b(((fmgt)object0).c, flxe0);
        Objects.requireNonNull(hftp0);
        flxf flxf0 = new flxf(hftp0);
        flbl.b(((fmgt)object0).b, flxf0);
        String s = ((fmgt)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq0 = (hnuq)hftp0.b_message;
        s.getClass();
        hnuq0.c = s;
        hnrp hnrp0 = flwo.a(((fmgt)object0).d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq1 = (hnuq)hftp0.b_message;
        hnrp0.getClass();
        hnuq1.e = hnrp0;
        hnuq1.b |= 1;
        hjie hjie0 = flwp.b(((fmgt)object0).e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq2 = (hnuq)hftp0.b_message;
        hjie0.getClass();
        hnuq2.f = hjie0;
        hnuq2.b |= 2;
        hjie hjie1 = flwp.b(((fmgt)object0).f);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hnuq hnuq3 = (hnuq)hftp0.b_message;
        hjie1.getClass();
        hnuq3.g = hjie1;
        hnuq3.b |= 4;
        hjie hjie2 = flwp.b(((fmgt)object0).g);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hjie2.getClass();
        ((hnuq)hftv0).h = hjie2;
        ((hnuq)hftv0).b |= 16;
        boolean z = ((fmgt)object0).h;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hnuq)hftp0.b_message).i = z;
        return (hnuq)hftp0.N_build();
    }
}


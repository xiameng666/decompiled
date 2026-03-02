import j..time.Instant;

public final class aqkb implements ibts {
    public final String a;
    public final Instant b;
    public final aqfv c;

    public aqkb(String s, Instant instant0, aqfv aqfv0) {
        this.a = s;
        this.b = instant0;
        this.c = aqfv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        aqhv aqhv1;
        ibuq.c(((aqdq)object0));
        aqdq aqdq0 = aqkn.a(((aqdq)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)aqdq0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)aqdq0));
        aqds aqds0 = aqdr.a(hftp0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)aqep.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        long v = this.b.toEpochMilli();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        aqfv aqfv0 = this.c;
        aqep aqep0 = (aqep)hftp1.b_message;
        aqep0.b |= 1;
        aqep0.c = v;
        ibuq.f(aqfv0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        String s = this.a;
        ((aqep)hftp1.b_message).d = aqfv0.e;
        ((aqep)hftp1.b_message).b |= 2;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        aqhv aqhv0 = (aqhv)aqds0.b().get(s);
        aqds0.b();
        if(aqhv0 == null) {
        label_32:
            aqhx aqhx1 = aqhw.a(((ProtoLiteMessage)aqhv.a).v_newBuilder());
            aqhx1.c();
            aqhx1.b(((aqep)hftv0));
            aqhv1 = aqhx1.a();
        }
        else {
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)aqhv0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)aqhv0));
            aqhx aqhx0 = aqhw.a(hftp2);
            aqhx0.c();
            aqhx0.b(((aqep)hftv0));
            aqhv1 = aqhx0.a();
            if(aqhv1 == null) {
                goto label_32;
            }
        }
        ibuq.f(s, "key");
        ibuq.f(aqhv1, "value");
        ProtoLiteBuilder hftp3 = aqds0.a;
        s.getClass();
        aqhv1.getClass();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((aqdq)hftp3.b_message).b().put(s, aqhv1);
        return aqds0.a();
    }
}


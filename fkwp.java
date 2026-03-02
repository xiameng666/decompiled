import j..time.Instant;

public final class fkwp implements ibts {
    public final gssv a;

    public fkwp(gssv gssv0) {
        this.a = gssv0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((fkvt)object0), "photoUris");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkvu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.a.getClass();
        ((fkvu)hftv0).c = this.a;
        ((fkvu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkvu fkvu0 = (fkvu)hftp0.b_message;
        ((fkvt)object0).getClass();
        fkvu0.d = (fkvt)object0;
        fkvu0.b |= 2;
        if(cqao.a()) {
            Instant instant0 = Instant.now();
            ibuq.e(instant0, "instant(...)");
            hfwn hfwn0 = hfyo.b(instant0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fkvu fkvu1 = (fkvu)hftp0.b_message;
            hfwn0.getClass();
            fkvu1.e = hfwn0;
            fkvu1.b |= 4;
        }
        return (fkvu)hftp0.N_build();
    }
}


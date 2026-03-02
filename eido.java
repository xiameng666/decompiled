import j..time.Instant;

public final class eido implements gfsi {
    public final Instant a;

    public eido(Instant instant0) {
        this.a = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eiec)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eiec)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eiec eiec0 = (eiec)hftp0.b_message;
        eiec0.b |= 1;
        eiec0.c = true;
        long v = this.a.toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eiec eiec1 = (eiec)hftp0.b_message;
        eiec1.b |= 2;
        eiec1.e = v;
        return (eiec)hftp0.N_build();
    }
}


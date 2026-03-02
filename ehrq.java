import j..time.Instant;

public final class ehrq implements gfsi {
    public final Instant a;

    public ehrq(Instant instant0) {
        this.a = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehtw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ehtw)object0))));
        long v = this.a.toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehtw ehtw0 = (ehtw)hftp0.b_message;
        ehtw0.b |= 4;
        ehtw0.f = v;
        return (ehtw)hftp0.N_build();
    }
}


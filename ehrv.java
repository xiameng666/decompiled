import j..time.Instant;

public final class ehrv implements gfsi {
    public final Instant a;

    public ehrv(Instant instant0) {
        this.a = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ehtw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ehtw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehtw ehtw0 = (ehtw)hftp0.b_message;
        ehtw0.b |= 1;
        ehtw0.c = true;
        long v = this.a.toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ehtw ehtw1 = (ehtw)hftp0.b_message;
        ehtw1.b |= 2;
        ehtw1.e = v;
        return (ehtw)hftp0.N_build();
    }
}


import j..time.Instant;

public final class eiuz implements gfsi {
    public final Instant a;

    public eiuz(Instant instant0) {
        this.a = instant0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eivg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eivg)object0))));
        long v = this.a.toEpochMilli();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eivg eivg0 = (eivg)hftp0.b_message;
        eivg0.b |= 2;
        eivg0.d = v;
        return (eivg)hftp0.N_build();
    }
}


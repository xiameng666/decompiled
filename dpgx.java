import j..util.Objects;

public final class dpgx implements gfsi {
    public final long a;
    public final boolean b;

    public dpgx(long v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfvh hfvh0 = ((dpef)Objects.requireNonNull(((dpef)object0))).b;
        long v = this.a;
        dped dped0 = (dped)hfvh0.get(Long.valueOf(v));
        if(dped0 == null) {
            throw new IllegalArgumentException();
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dpef)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dpef)object0))));
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)dped0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)dped0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dped)hftp1.b_message).g = this.b;
        ((dpec)hftp0).a(v, ((dped)hftp1.N_build()));
        return (dpef)((ProtoLiteBuilder)(((dpec)hftp0))).N_build();
    }
}


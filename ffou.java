public final class ffou implements gfsi {
    public final long a;
    public final hfwn b;

    public ffou(long v, hfwn hfwn0) {
        this.a = v;
        this.b = hfwn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((igyu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((igyu)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        igyu igyu0 = (igyu)hftp0.b_message;
        igyu0.b |= 8;
        igyu0.f = (int)this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        igyu igyu1 = (igyu)hftp0.b_message;
        this.b.getClass();
        igyu1.h = this.b;
        igyu1.b |= 0x20;
        return (igyu)hftp0.N_build();
    }
}


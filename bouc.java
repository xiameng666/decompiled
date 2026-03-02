public final class bouc implements gfsi {
    public final boul a;
    public final hfwn b;
    public final fqym c;

    public bouc(boul boul0, hfwn hfwn0, fqym fqym0) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = fqym0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        fqym fqym0 = this.c;
        if(!fqym0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqym0).ensureMutable();
        }
        fqyp fqyp0 = (fqyp)fqym0.b_message;
        hfwn0.getClass();
        fqyp0.d = hfwn0;
        fqyp0.c |= 1;
        fqyp fqyp1 = (fqyp)((ProtoLiteBuilder)fqym0).N_build();
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqyp1.getClass();
        fqzl0.f = fqyp1;
        fqzl0.b |= 2;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


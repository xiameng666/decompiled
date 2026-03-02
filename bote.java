public final class bote implements gfsi {
    public final boul a;
    public final hfwn b;

    public bote(boul boul0, hfwn hfwn0) {
        this.a = boul0;
        this.b = hfwn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        hfwn0.getClass();
        fqzl0.k = hfwn0;
        fqzl0.b |= 0x40;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


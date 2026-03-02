public final class botw implements gfsi {
    public final boul a;
    public final hfwn b;
    public final fqzk c;

    public botw(boul boul0, hfwn hfwn0, fqzk fqzk0) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = fqzk0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.c));
        if(!((fqzg)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqzg)hftp0))).ensureMutable();
        }
        fqzk fqzk0 = (fqzk)((fqzg)hftp0).b_message;
        hfwn0.getClass();
        fqzk0.k = hfwn0;
        fqzk0.b |= 0x20;
        fqzk fqzk1 = (fqzk)((ProtoLiteBuilder)(((fqzg)hftp0))).N_build();
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzk1.getClass();
        fqzl0.u = fqzk1;
        fqzl0.b |= 0x2000;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


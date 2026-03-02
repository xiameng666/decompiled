public final class bouk implements gfsi {
    public final boul a;
    public final hfwn b;
    public final int c;

    public bouk(boul boul0, hfwn hfwn0, int v) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        fqzk fqzk0 = ((fqzl)object0).u;
        if(fqzk0 == null) {
            fqzk0 = fqzk.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqzk0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqzk0));
        if(!((fqzg)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqzg)hftp0))).ensureMutable();
        }
        fqzk fqzk1 = (fqzk)((fqzg)hftp0).b_message;
        fqzk1.b |= 4;
        fqzk1.f = this.c;
        if(!((fqzg)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqzg)hftp0))).ensureMutable();
        }
        fqzk fqzk2 = (fqzk)((fqzg)hftp0).b_message;
        hfwn0.getClass();
        fqzk2.k = hfwn0;
        fqzk2.b |= 0x20;
        fqzk fqzk3 = (fqzk)((ProtoLiteBuilder)(((fqzg)hftp0))).N_build();
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzk3.getClass();
        fqzl0.u = fqzk3;
        fqzl0.b |= 0x2000;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


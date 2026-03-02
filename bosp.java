public final class bosp implements gfsi {
    public final boul a;
    public final hfwn b;
    public final Iterable c;

    public bosp(boul boul0, hfwn hfwn0, Iterable iterable0) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = iterable0;
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
        ((fqzk)((fqzg)hftp0).b_message).h = hfvv.a;
        ((fqzg)hftp0).a(this.c);
        if(!((fqzg)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqzg)hftp0))).ensureMutable();
        }
        fqzk fqzk1 = (fqzk)((fqzg)hftp0).b_message;
        hfwn0.getClass();
        fqzk1.k = hfwn0;
        fqzk1.b |= 0x20;
        fqzk fqzk2 = (fqzk)((ProtoLiteBuilder)(((fqzg)hftp0))).N_build();
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzk2.getClass();
        fqzl0.u = fqzk2;
        fqzl0.b |= 0x2000;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


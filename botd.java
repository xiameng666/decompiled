public final class botd implements gfsi {
    public final boul a;
    public final hfwn b;
    public final boolean c;
    public final int d;

    public botd(boul boul0, hfwn hfwn0, int v, boolean z) {
        this.a = boul0;
        this.b = hfwn0;
        this.d = v;
        this.c = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfwn hfwn0 = this.b;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqxr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fqxr)hftv0).e = this.d - 2;
        ((fqxr)hftv0).b |= 4;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hfwn0.getClass();
        ((fqxr)hftv1).c = hfwn0;
        ((fqxr)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqxr fqxr0 = (fqxr)hftp0.b_message;
        fqxr0.b |= 2;
        fqxr0.d = this.c;
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqxr fqxr1 = (fqxr)hftp0.N_build();
        fqxr1.getClass();
        fqzl0.t = fqxr1;
        fqzl0.b |= 0x1000;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


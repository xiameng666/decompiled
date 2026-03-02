public final class botv implements gfsi {
    public final boul a;
    public final hfwn b;
    public final boolean c;

    public botv(boul boul0, hfwn hfwn0, boolean z) {
        this.a = boul0;
        this.b = hfwn0;
        this.c = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if((((fqzl)object0).b & 0x20) != 0) {
            hfwn hfwn0 = this.b;
            gfsx gfsx0 = gfsx.m(hfwn0);
            fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
            if(!fqyg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqyg0).ensureMutable();
            }
            ((fqzl)fqyg0.b_message).j = null;
            ((fqzl)fqyg0.b_message).b &= -33;
            if(!fqyg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqyg0).ensureMutable();
            }
            fqzl fqzl0 = (fqzl)fqyg0.b_message;
            hfwn0.getClass();
            fqzl0.k = hfwn0;
            fqzl0.b |= 0x40;
            if(this.c) {
                fqxm fqxm0 = ((fqzl)object0).j;
                if(fqxm0 == null) {
                    fqxm0 = fqxm.a;
                }
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxm0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)fqxm0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fqxm fqxm1 = (fqxm)hftp0.b_message;
                fqxm1.b &= -2;
                fqxm1.c = fqxm.a.c;
                if(!fqyg0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)fqyg0).ensureMutable();
                }
                fqzl fqzl1 = (fqzl)fqyg0.b_message;
                fqxm fqxm2 = (fqxm)hftp0.N_build();
                fqxm2.getClass();
                fqzl1.c();
                fqzl1.l.add(fqxm2);
            }
            return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
        }
        return (fqzl)object0;
    }
}


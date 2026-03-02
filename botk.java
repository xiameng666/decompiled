public final class botk implements gfsi {
    public final boul a;
    public final fqys b;
    public final hfwn c;
    public final gfsx d;
    public final gfsx e;

    public botk(boul boul0, fqys fqys0, hfwn hfwn0, gfsx gfsx0, gfsx gfsx1) {
        this.a = boul0;
        this.b = fqys0;
        this.c = hfwn0;
        this.d = gfsx0;
        this.e = gfsx1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gftb.r(((boolean)((((fqzl)object0).c == 22 ? 1 : 0) ^ 1)), "Cannot set LKL auto-enrollment blocker when already enrolled or opted out of LKL");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fqyt.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((fqyt)hftv0).c = this.b.o;
        ((fqyt)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfsx gfsx0 = this.d;
        hfwn hfwn0 = this.c;
        fqyt fqyt0 = (fqyt)hftp0.b_message;
        hfwn0.getClass();
        fqyt0.d = hfwn0;
        fqyt0.b |= 2;
        if(gfsx0.i()) {
            Object object1 = gfsx0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fqyt fqyt1 = (fqyt)hftp0.b_message;
            fqyt1.e = (hfwn)object1;
            fqyt1.b |= 4;
            Object object2 = this.e.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fqyt fqyt2 = (fqyt)hftp0.b_message;
            fqyt2.f = ((gtas)object2).a();
            fqyt2.b |= 8;
        }
        gfsx gfsx1 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx1);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqyt fqyt3 = (fqyt)hftp0.N_build();
        fqyt3.getClass();
        fqzl0.d = fqyt3;
        fqzl0.c = 0x1F;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


public final class both implements gfsi {
    public final boul a;
    public final gfsx b;
    public final hfwn c;
    public final fqxm d;

    public both(boul boul0, gfsx gfsx0, hfwn hfwn0, fqxm fqxm0) {
        this.a = boul0;
        this.b = gfsx0;
        this.c = hfwn0;
        this.d = fqxm0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        botc botc0 = new botc(((fqzl)object0));
        gftb.q(((Boolean)this.b.b(botc0).f(Boolean.valueOf(true))).booleanValue());
        hfwn hfwn0 = this.c;
        gfsx gfsx0 = gfsx.m(hfwn0);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        this.d.getClass();
        fqzl0.j = this.d;
        fqzl0.b |= 0x20;
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl1 = (fqzl)fqyg0.b_message;
        hfwn0.getClass();
        fqzl1.k = hfwn0;
        fqzl1.b |= 0x40;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


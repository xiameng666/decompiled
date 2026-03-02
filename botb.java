public final class botb implements gfsi {
    public final boul a;

    public botb(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gfsx gfsx0 = gfsx.m(hfyg.b(this.a.f.d()));
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfsx0);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).f = null;
        ((fqzl)fqyg0.b_message).b &= -3;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


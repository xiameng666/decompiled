public final class botg implements gfsi {
    public final boul a;

    public botg(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqxj fqxj0 = ((fqzl)object0).m;
        if(fqxj0 == null) {
            fqxj0 = fqxj.a;
        }
        if(fqxj0.c.size() == 0) {
            return (fqzl)object0;
        }
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).m = null;
        ((fqzl)fqyg0.b_message).b &= 0xFFFFFF7F;
        fqxj fqxj1 = ((fqzl)object0).m;
        if(fqxj1 == null) {
            fqxj1 = fqxj.a;
        }
        fqyg0.n(fqxj1);
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


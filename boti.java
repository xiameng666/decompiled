public final class boti implements gfsi {
    public final boul a;

    public boti(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).w = null;
        ((fqzl)fqyg0.b_message).b &= 0xFFFF7FFF;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


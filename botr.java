public final class botr implements gfsi {
    public final boul a;

    public botr(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzl0.b |= 0x4000;
        fqzl0.v = true;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


public final class boss implements gfsi {
    public final boul a;

    public boss(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).l = hfvv.a;
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


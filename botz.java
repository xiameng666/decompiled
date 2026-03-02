public final class botz implements gfsi {
    public final boul a;

    public botz(boul boul0) {
        this.a = boul0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((fqzl)object0).c == 0x1F) {
            fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
            if(!fqyg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)fqyg0).ensureMutable();
            }
            fqzl fqzl0 = (fqzl)fqyg0.b_message;
            if(fqzl0.c == 0x1F) {
                fqzl0.c = 0;
                fqzl0.d = null;
            }
            return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
        }
        return (fqzl)object0;
    }
}


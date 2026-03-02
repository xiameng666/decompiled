import j..util.Collection.-EL;

public final class boug implements gfsi {
    public final boul a;
    public final gsyz b;

    public boug(boul boul0, gsyz gsyz0) {
        this.a = boul0;
        this.b = gsyz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(((fqzl)object0).l).filter(new bosv(this.b)).collect(ggaf.a);
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).l = hfvv.a;
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzl0.c();
        hfrj.E(gged0, fqzl0.l);
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


import java.util.List;

public final class bouf implements gfsi {
    public final boul a;
    public final List b;

    public bouf(boul boul0, List list0) {
        this.a = boul0;
        this.b = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        ((fqzl)fqyg0.b_message).n = hfvv.a;
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqzl0.b();
        hfrj.E(this.b, fqzl0.n);
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}


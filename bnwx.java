import java.util.List;

public final class bnwx implements glzn {
    public final bnxf a;
    public final List b;

    public bnwx(bnxf bnxf0, List list0) {
        this.a = bnxf0;
        this.b = list0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        fqzt fqzt0 = (fqzt)((ProtoLiteMessage)fqzu.a).v_newBuilder();
        fqzt0.k(((Iterable)object0));
        fqzt0.a(this.b);
        fqzu fqzu0 = (fqzu)((ProtoLiteBuilder)fqzt0).N_build();
        return gdta.g(this.a.b.g(fqzu0)).h(new bnwy(fqzu0), gmap.a);
    }
}


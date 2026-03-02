import j..util.DesugarCollections;

public final class ejkv implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejkd)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejkd)object0))));
        gged_interceptors gged0 = ejlh.e(DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ejkd)((ejka)hftp0).b_message).b)).entrySet(), ejlh.c);
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((ejka)hftp0).a(((String)gged0.get(v1)));
        }
        return (ejkd)((ProtoLiteBuilder)(((ejka)hftp0))).N_build();
    }
}


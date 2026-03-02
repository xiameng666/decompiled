public final class cyur implements gfsi {
    public final long a;

    public cyur(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyez)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyez)object0))));
        for(int v = 0; v < ((cyez)((cyey)hftp0).b_message).b.size(); ++v) {
            long v1 = ((cyey)hftp0).a(v).c;
            if(this.a == v1) {
                ((cyey)hftp0).m(v);
                return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
            }
        }
        return (cyez)((ProtoLiteBuilder)(((cyey)hftp0))).N_build();
    }
}


public final class fuxy implements gfsi {
    public final boolean a;

    public fuxy(boolean z) {
        this.a = z;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gwkg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gwkg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gwkg)hftp0.b_message).c = (this.a ? 3 : 4) - 2;
        return (gwkg)hftp0.N_build();
    }
}


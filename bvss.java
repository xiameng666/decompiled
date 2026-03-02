public final class bvss implements gfsi {
    public final String a;

    public bvss(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqe)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((gqqe)object0))));
        String s = this.a;
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gqqe)hftp0.b_message).b().remove(s);
        return (gqqe)hftp0.N_build();
    }
}


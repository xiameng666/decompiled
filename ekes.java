public final class ekes implements gfsi {
    public final String a;

    public ekes(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        String s = this.a;
        s.getClass();
        if(!((ejxp)object0).b.containsKey(s)) {
            return (ejxp)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejxp)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejxp)object0))));
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejxp ejxp0 = (ejxp)hftp0.b_message;
        hfvh hfvh0 = ejxp0.b;
        if(!hfvh0.b) {
            ejxp0.b = hfvh0.a();
        }
        ejxp0.b.remove(s);
        return (ejxp)hftp0.N_build();
    }
}


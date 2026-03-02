import j..util.Objects;

public final class cyvf implements gfsi {
    public final cywx a;

    public cyvf(cywx cywx0) {
        this.a = cywx0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyxn)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyxn)object0))));
        Objects.requireNonNull(hftp0);
        cyus.d(new cyva(hftp0), new cyvb(), new cyvc(hftp0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cyxn cyxn0 = (cyxn)hftp0.b_message;
        this.a.getClass();
        cyxn0.b();
        cyxn0.c.add(this.a);
        return (cyxn)hftp0.N_build();
    }
}


import j..util.Objects;

public final class cyvg implements gfsi {
    public final cyxl a;

    public cyvg(cyxl cyxl0) {
        this.a = cyxl0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cyxn)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cyxn)object0))));
        Objects.requireNonNull(hftp0);
        cyus.d(new cyvi(hftp0), new cyvj(), new cyvk(hftp0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        cyxn cyxn0 = (cyxn)hftp0.b_message;
        this.a.getClass();
        cyxn0.c();
        cyxn0.b.add(this.a);
        return (cyxn)hftp0.N_build();
    }
}


public final class dxxl implements gfsi {
    public final hhki a;

    public dxxl(hhki hhki0) {
        this.a = hhki0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hhkj)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hhkj)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhkj hhkj0 = (hhkj)hftp0.b_message;
        hhkj0.b = this.a.a();
        return (hhkj)hftp0.N_build();
    }
}


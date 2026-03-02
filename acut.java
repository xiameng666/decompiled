public final class acut implements gfsi {
    public final Iterable a;

    public acut(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adrv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((adrv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((adrv)hftp0.b_message).b = hfvv.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        adrv adrv0 = (adrv)hftp0.b_message;
        hfuo hfuo0 = adrv0.b;
        if(!hfuo0.c()) {
            adrv0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, adrv0.b);
        return (adrv)hftp0.N_build();
    }
}


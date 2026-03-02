public final class aywg implements gfsi {
    public final aywh a;

    public aywg(aywh aywh0) {
        this.a = aywh0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ayvz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ayvz)object0))));
        String s = this.a.a.a;
        s.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ayvz)hftp0.b_message).b().remove(s);
        return (ayvz)hftp0.N_build();
    }
}


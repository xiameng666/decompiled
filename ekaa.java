public final class ekaa implements gfsi {
    public final Boolean a;

    public ekaa(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        boolean z = this.a.booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        ejyo0.b |= 0x40000;
        ejyo0.r = z;
        return (ejyo)hftp0.N_build();
    }
}


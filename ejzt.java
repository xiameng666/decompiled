public final class ejzt implements gfsi {
    public final Boolean a;

    public ejzt(Boolean boolean0) {
        this.a = boolean0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ejyo)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ejyo)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ejyo ejyo0 = (ejyo)hftp0.b_message;
        ejyo0.b |= 0x80;
        ejyo0.f = true;
        return (ejyo)hftp0.N_build();
    }
}


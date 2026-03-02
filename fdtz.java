public final class fdtz implements gfsi {
    public final hfwn a;

    public fdtz(hfwn hfwn0) {
        this.a = hfwn0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fesu)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fesu)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesu fesu0 = (fesu)hftp0.b_message;
        fesu0.b |= 1;
        fesu0.c = true;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fesu fesu1 = (fesu)hftp0.b_message;
        this.a.getClass();
        fesu1.d = this.a;
        fesu1.b |= 2;
        return (fesu)hftp0.N_build();
    }
}


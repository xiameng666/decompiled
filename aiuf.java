public final class aiuf implements gfsi {
    public final ProtoLiteBuilder a;

    public aiuf(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvj wvj0 = (wvj)hftp0.b_message;
        wvj0.b |= 8;
        wvj0.f = true;
        return (wvj)hftp0.N_build();
    }
}


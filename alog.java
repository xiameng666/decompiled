public final class alog implements gfsi {
    public final altc a;

    public alog(altc altc0) {
        this.a = altc0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Void void0 = (Void)object0;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((altc)hftp0.b_message).b = false;
        return (altc)hftp0.N_build();
    }
}


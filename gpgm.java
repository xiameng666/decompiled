public final class gpgm extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gpgm() {
        super(((ProtoLiteMessage)gpgo.a));
    }

    public final void a(ProtoLiteBuilder hftp0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        gpgo gpgo0 = (gpgo)this.b_message;
        gpgq gpgq0 = (gpgq)hftp0.N_build();
        gpgq0.getClass();
        gpgo0.b();
        gpgo0.e.add(gpgq0);
    }
}


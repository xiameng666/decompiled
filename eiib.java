public final class eiib implements glzn {
    public final fqdw a;
    public final ProtoLiteBuilder b;

    public eiib(ProtoLiteBuilder hftp0, fqdw fqdw0) {
        this.b = hftp0;
        this.a = fqdw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = frai.h(((ByteString)object0));
        ProtoLiteBuilder hftp0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwhg gwhg0 = (gwhg)hftp0.b_message;
        s.getClass();
        gwhg0.b |= 0x40;
        gwhg0.j = s;
        return this.a.b();
    }
}


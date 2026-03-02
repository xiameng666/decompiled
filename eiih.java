public final class eiih implements glzn {
    public final fqdw a;
    public final ProtoLiteBuilder b;

    public eiih(ProtoLiteBuilder hftp0, fqdw fqdw0) {
        this.b = hftp0;
        this.a = fqdw0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = ((ByteString)object0).toStringUtf8().trim();
        ProtoLiteBuilder hftp0 = this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwhg gwhg0 = (gwhg)hftp0.b_message;
        s.getClass();
        gwhg0.b |= 0x20;
        gwhg0.i = s;
        return this.a.c();
    }
}


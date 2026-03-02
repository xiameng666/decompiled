public final class byfz {
    private final ProtoLiteBuilder a;

    public byfz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final byfq a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (byfq)hftv0;
    }

    public final void b(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        byfq byfq0 = (byfq)hftp0.b_message;
        byfq0.b |= 1;
        byfq0.c = hfsf0;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        byfq byfq0 = (byfq)hftp0.b_message;
        s.getClass();
        byfq0.b |= 4;
        byfq0.e = s;
    }

    public final void d(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        byfq byfq0 = (byfq)hftp0.b_message;
        byfq0.b |= 2;
        byfq0.d = hfsf0;
    }
}


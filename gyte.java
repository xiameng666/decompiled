public final class gyte {
    private final ProtoLiteBuilder a;

    public gyte(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gyqv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gyqv)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 16;
        gyqv0.g = v;
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 8;
        gyqv0.f = z;
    }

    public final void d(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 2;
        gyqv0.d = z;
    }

    public final void e(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 4;
        gyqv0.e = z;
    }

    public final void f(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyqv gyqv0 = (gyqv)hftp0.b_message;
        gyqv0.b |= 0x20;
        gyqv0.h = v;
    }

    public final void g(gzat gzat0) {
        ibuq.f(gzat0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gyqv)hftp0.b_message).c = gzat0.j;
        ((gyqv)hftp0.b_message).b |= 1;
    }
}


public final class ftop {
    private final ProtoLiteBuilder a;

    public ftop(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final fton a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (fton)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fton fton0 = (fton)hftp0.b_message;
        s.getClass();
        fton0.b |= 4;
        fton0.e = s;
    }

    public final void c(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fton fton0 = (fton)hftp0.b_message;
        fton0.b |= 2;
        fton0.d = v;
    }

    public final void d(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fton fton0 = (fton)hftp0.b_message;
        s.getClass();
        fton0.b |= 1;
        fton0.c = s;
    }

    public final void e() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fton fton0 = (fton)hftp0.b_message;
        fton0.b |= 0x20;
        fton0.h = true;
    }
}


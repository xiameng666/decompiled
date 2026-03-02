public final class epni {
    public final ProtoLiteBuilder a;

    public epni(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final epng a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (epng)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s.getClass();
        epng0.b |= 0x20;
        epng0.h = s;
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s.getClass();
        epng0.b |= 16;
        epng0.g = s;
    }

    public final void d(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s.getClass();
        epng0.b |= 8;
        epng0.f = s;
    }

    public final void e(hjij hjij0) {
        ibuq.f(hjij0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        hjij0.getClass();
        epng0.d = hjij0;
        epng0.b |= 2;
    }

    public final void f(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s.getClass();
        epng0.b |= 0x40;
        epng0.i = s;
    }

    public final void g(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        s.getClass();
        epng0.b |= 1;
        epng0.c = s;
    }

    public final void h(float f) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        epng epng0 = (epng)hftp0.b_message;
        epng0.b |= 4;
        epng0.e = f;
    }
}


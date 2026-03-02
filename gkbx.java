public final class gkbx {
    private final ProtoLiteBuilder a;

    public gkbx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjdg a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjdg)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        s.getClass();
        gjdg0.b |= 1;
        gjdg0.g = s;
    }

    public final void c(hkoy hkoy0) {
        ibuq.f(hkoy0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.d = hkoy0.a();
        gjdg0.c = 5;
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.b |= 2;
        gjdg0.h = v;
    }

    public final void e(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.b |= 4;
        gjdg0.i = s;
    }

    public final void f(hjnd hjnd0) {
        ibuq.f(hjnd0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdg gjdg0 = (gjdg)hftp0.b_message;
        gjdg0.d = hjnd0.a();
        gjdg0.c = 6;
    }
}


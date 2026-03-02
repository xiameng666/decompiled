public final class giog {
    private final ProtoLiteBuilder a;

    public giog(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkas a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkas)hftv0;
    }

    public final void b(gkaq gkaq0) {
        ibuq.f(gkaq0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkas)hftp0.b_message).c = gkaq0.e;
        ((gkas)hftp0.b_message).b |= 1;
    }

    public final void c(gkao gkao0) {
        ibuq.f(gkao0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkas gkas0 = (gkas)hftp0.b_message;
        gkao0.getClass();
        gkas0.g = gkao0;
        gkas0.b |= 16;
    }

    public final void d(gkar gkar0) {
        ibuq.f(gkar0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkas gkas0 = (gkas)hftp0.b_message;
        gkar0.getClass();
        gkas0.e = gkar0;
        gkas0.b |= 4;
    }

    public final void e(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkas gkas0 = (gkas)hftp0.b_message;
        gkas0.b |= 2;
        gkas0.d = v;
    }

    public final void f(gkao gkao0) {
        ibuq.f(gkao0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkas gkas0 = (gkas)hftp0.b_message;
        gkao0.getClass();
        gkas0.h = gkao0;
        gkas0.b |= 0x20;
    }

    public final void g(gkar gkar0) {
        ibuq.f(gkar0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkas gkas0 = (gkas)hftp0.b_message;
        gkar0.getClass();
        gkas0.f = gkar0;
        gkas0.b |= 8;
    }
}


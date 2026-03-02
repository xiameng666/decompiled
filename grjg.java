public final class grjg {
    public final ProtoLiteBuilder a;

    public grjg(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final grje a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grje)hftv0;
    }

    public final void b(grjy grjy0) {
        ibuq.f(grjy0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje0 = (grje)hftp0.b_message;
        grjy0.getClass();
        grje0.e = grjy0;
        grje0.b |= 4;
    }

    public final void c(grjy grjy0) {
        ibuq.f(grjy0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje0 = (grje)hftp0.b_message;
        grjy0.getClass();
        grje0.f = grjy0;
        grje0.b |= 8;
    }

    public final void d(grjy grjy0) {
        ibuq.f(grjy0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grje grje0 = (grje)hftp0.b_message;
        grjy0.getClass();
        grje0.d = grjy0;
        grje0.b |= 2;
    }
}


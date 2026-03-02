public final class ftmk {
    public final ProtoLiteBuilder a;

    public ftmk(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftmi a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftmi)hftv0;
    }

    public final void b(ftlx ftlx0) {
        ibuq.f(ftlx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftmi ftmi0 = (ftmi)hftp0.b_message;
        ftlx0.getClass();
        ftmi0.d = ftlx0;
        ftmi0.c = 68;
    }

    public final void c(ftmc ftmc0) {
        ibuq.f(ftmc0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftmi ftmi0 = (ftmi)hftp0.b_message;
        ftmc0.getClass();
        ftmi0.d = ftmc0;
        ftmi0.c = 14;
    }
}


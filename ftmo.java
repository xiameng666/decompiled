public final class ftmo {
    public final ProtoLiteBuilder a;

    public ftmo(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ftmc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ftmc)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftmc)hftp0.b_message).b = s;
    }

    public final void c(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftmc)hftp0.b_message).d = s;
    }

    public final void d() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftmc.b(((ftmc)hftp0.b_message));
    }
}


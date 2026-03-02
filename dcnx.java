public final class dcnx {
    public final ProtoLiteBuilder a;

    public dcnx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dckc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dckc)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dckc dckc0 = (dckc)hftp0.b_message;
        dckc0.b |= 8;
        dckc0.f = v;
    }

    public final void c(dckb dckb0) {
        ibuq.f(dckb0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dckc)hftp0.b_message).d = dckb0.f;
        ((dckc)hftp0.b_message).b |= 2;
    }

    public final void d(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dckc dckc0 = (dckc)hftp0.b_message;
        s.getClass();
        dckc0.b |= 1;
        dckc0.c = s;
    }
}


public final class gjlo {
    public final ProtoLiteBuilder a;

    public gjlo(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjma a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjma)hftv0;
    }

    public final void b(gurm gurm0) {
        ibuq.f(gurm0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjma gjma0 = (gjma)hftp0.b_message;
        gjma0.c = gurm0.a();
        gjma0.b |= 1;
    }

    public final void c(gtni gtni0) {
        ibuq.f(gtni0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjma gjma0 = (gjma)hftp0.b_message;
        gjma0.d = gtni0.a();
        gjma0.b |= 2;
    }

    public final void d(gjlz gjlz0) {
        ibuq.f(gjlz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjma gjma0 = (gjma)hftp0.b_message;
        gjlz0.getClass();
        gjma0.f = gjlz0;
        gjma0.b |= 8;
    }
}


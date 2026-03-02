public final class gkbz {
    private final ProtoLiteBuilder a;

    public gkbz(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjdm a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjdm)hftv0;
    }

    public final void b(gjdj gjdj0) {
        ibuq.f(gjdj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjdm)hftp0.b_message).d = gjdj0.d;
        ((gjdm)hftp0.b_message).b |= 2;
    }

    public final void c(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjdm gjdm0 = (gjdm)hftp0.b_message;
        gjdm0.b |= 4;
        gjdm0.e = s;
    }

    public final void d(gjdl gjdl0) {
        ibuq.f(gjdl0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjdm)hftp0.b_message).c = gjdl0.e;
        ((gjdm)hftp0.b_message).b |= 1;
    }
}


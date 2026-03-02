public final class hdpt {
    private final ProtoLiteBuilder a;

    public hdpt(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdqk a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdqk)hftv0;
    }

    public final void b(hdqj hdqj0) {
        ibuq.f(hdqj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdqk)hftp0.b_message).d = hdqj0.g;
        ((hdqk)hftp0.b_message).b |= 2;
    }

    public final void c(hdqm hdqm0) {
        ibuq.f(hdqm0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdqk)hftp0.b_message).c = hdqm0.f;
        ((hdqk)hftp0.b_message).b |= 1;
    }

    public final void d(hdqo hdqo0) {
        ibuq.f(hdqo0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdqk)hftp0.b_message).e = hdqo0.i;
        ((hdqk)hftp0.b_message).b |= 4;
    }

    public final void e(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdqk hdqk0 = (hdqk)hftp0.b_message;
        hdsn0.getClass();
        hdqk0.f = hdsn0;
        hdqk0.b |= 8;
    }
}


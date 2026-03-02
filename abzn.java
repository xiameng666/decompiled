public final class abzn {
    public final ProtoLiteBuilder a;

    public abzn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final abzk a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (abzk)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((abzk)hftp0.b_message).i = v;
    }

    public final void c(abzf abzf0) {
        ibuq.f(abzf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        abzk abzk0 = (abzk)hftp0.b_message;
        abzf0.getClass();
        abzk0.d = abzf0;
        abzk0.b |= 1;
    }
}


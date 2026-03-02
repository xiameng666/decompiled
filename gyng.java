public final class gyng {
    public final ProtoLiteBuilder a;

    public gyng(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gynm a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gynm)hftv0;
    }

    public final void b(gynj gynj0) {
        ibuq.f(gynj0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gynm)hftp0.b_message).s = gynj0.d;
        ((gynm)hftp0.b_message).b |= 0x1000;
    }
}


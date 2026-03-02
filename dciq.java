public final class dciq {
    public final ProtoLiteBuilder a;

    public dciq(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dcjr a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dcjr)hftv0;
    }

    public final void b(float f) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjr dcjr0 = (dcjr)hftp0.b_message;
        dcjr0.b |= 1;
        dcjr0.c = f;
    }
}


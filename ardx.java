public final class ardx {
    private final cmec a;

    public ardx(cmec cmec0) {
        ibuq.f(cmec0, "gmsCoreMetrics");
        super();
        this.a = cmec0;
    }

    public final void a(hgvs hgvs0) {
        ibuq.f(hgvs0, "eventType");
        hgvq hgvq0 = (hgvq)((ProtoLiteMessage)hgvu.a).v_newBuilder();
        ibuq.f(hgvq0, "builder");
        ibuq.f(hgvs0, "value");
        if(!hgvq0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hgvq0).ensureMutable();
        }
        ((hgvu)hgvq0.b_message).c = hgvs0.k;
        ((hgvu)hgvq0.b_message).b |= 1;
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)hgvq0).N_build();
        ibuq.e(hftv0, "build(...)");
        this.b(((hgvu)hftv0));
    }

    public final void b(hgvu hgvu0) {
        ibuq.f(hgvu0, "earlyIndexingInfo");
        if(!hqhz.a.b().a()) {
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgvp.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(hgvu0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgvp hgvp0 = (hgvp)hftp0.b_message;
        hgvu0.getClass();
        hgvp0.c = hgvu0;
        hgvp0.b |= 1;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hgvp)hftv0), "interactionMetadata");
        cmgo cmgo0 = cmgn.a(((ProtoLiteMessage)cmft.a).v_newBuilder());
        cmds cmds0 = cmdr.a(((ProtoLiteMessage)cmer.a).v_newBuilder());
        ibuq.f(((hgvp)hftv0), "value");
        ProtoLiteBuilder hftp1 = cmds0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        cmer cmer0 = (cmer)hftp1.b_message;
        ((hgvp)hftv0).getClass();
        cmer0.d = (hgvp)hftv0;
        cmer0.b |= 2;
        cmgo0.b(cmds0.a());
        cmft cmft0 = cmgo0.a();
        fhvq fhvq0 = fhwp.c();
        this.a.f(0x40FE2, cmft0, fhvq0);
    }
}


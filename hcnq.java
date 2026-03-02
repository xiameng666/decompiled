public final class hcnq {
    private final hftr a;

    public hcnq(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcnr a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcnr)hftv0;
    }

    public final void b(String s) {
        ibuq.f(s, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcnr hcnr0 = (hcnr)hftr0.b_message;
        s.getClass();
        hcnr0.b |= 1;
        hcnr0.c = s;
    }
}


public final class hcjr {
    private final hftr a;

    public hcjr(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcjo a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcjo)hftv0;
    }

    public final void b(ByteString hfsf0) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcjo hcjo0 = (hcjo)hftr0.b_message;
        hcjo0.b = 1;
        hcjo0.c = hfsf0;
    }
}


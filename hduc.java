public final class hduc {
    private final hftr a;

    public hduc(hftr hftr0) {
        this.a = hftr0;
    }

    public final hdud a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdud)hftv0;
    }

    public final void b(int v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdud hdud0 = (hdud)hftr0.b_message;
        hdud0.b |= 1;
        hdud0.c = v;
    }
}


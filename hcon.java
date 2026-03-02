public final class hcon {
    public final hftr a;

    public hcon(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcos a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcos)hftv0;
    }

    public final void b(long v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcos hcos0 = (hcos)hftr0.b_message;
        hcos0.b |= 1;
        hcos0.c = v;
    }

    public final void c(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void d(hcoj hcoj0) {
        ibuq.f(hcoj0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcos hcos0 = (hcos)hftr0.b_message;
        hcoj0.getClass();
        hcos0.d = hcoj0;
        hcos0.b |= 4;
    }
}


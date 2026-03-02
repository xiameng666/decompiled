public final class dcnm {
    public final ProtoLiteBuilder a;

    public dcnm(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dcjv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dcjv)hftv0;
    }

    public final void b(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjv dcjv0 = (dcjv)hftp0.b_message;
        dcjv0.b |= 16;
        dcjv0.g = v;
    }

    public final void c(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjv dcjv0 = (dcjv)hftp0.b_message;
        dcjv0.b |= 0x20;
        dcjv0.h = z;
    }

    public final void d(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjv dcjv0 = (dcjv)hftp0.b_message;
        dcjv0.b |= 8;
        dcjv0.f = v;
    }

    public final void e(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjv dcjv0 = (dcjv)hftp0.b_message;
        s.getClass();
        dcjv0.b |= 1;
        dcjv0.c = s;
    }

    public final void f(dcju dcju0) {
        ibuq.f(dcju0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjv)hftp0.b_message).d = dcju0.f;
        ((dcjv)hftp0.b_message).b |= 2;
    }
}


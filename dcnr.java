public final class dcnr {
    public final ProtoLiteBuilder a;

    public dcnr(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dcjy a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dcjy)hftv0;
    }

    public final void b(dciz dciz0) {
        ibuq.f(dciz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp0.b_message;
        dciz0.getClass();
        dcjy0.e = dciz0;
        dcjy0.b |= 4;
    }

    public final void c(dcjr dcjr0) {
        ibuq.f(dcjr0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        dcjy dcjy0 = (dcjy)hftp0.b_message;
        dcjr0.getClass();
        dcjy0.h = dcjr0;
        dcjy0.b |= 0x40;
    }

    public final void d(dcjx dcjx0) {
        ibuq.f(dcjx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((dcjy)hftp0.b_message).c = dcjx0.i;
        ((dcjy)hftp0.b_message).b |= 1;
    }
}


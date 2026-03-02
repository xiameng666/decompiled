public final class hdpx {
    public final ProtoLiteBuilder a;

    public hdpx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdtc a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdtc)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtc hdtc0 = (hdtc)hftp0.b_message;
        hdtc0.b |= 4;
        hdtc0.e = v;
    }

    public final void c(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtc hdtc0 = (hdtc)hftp0.b_message;
        hdtc0.b |= 1;
        hdtc0.c = s;
    }

    public final void d(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtc hdtc0 = (hdtc)hftp0.b_message;
        hdsn0.getClass();
        hdtc0.g = hdsn0;
        hdtc0.b |= 16;
    }

    public final void e(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdtc hdtc0 = (hdtc)hftp0.b_message;
        hdsn0.getClass();
        hdtc0.d = hdsn0;
        hdtc0.b |= 2;
    }

    public final void f(hdsz hdsz0) {
        ibuq.f(hdsz0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdtc)hftp0.b_message).l = hdsz0.f;
        ((hdtc)hftp0.b_message).b |= 0x200;
    }

    public final void g(hdsx hdsx0) {
        ibuq.f(hdsx0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hdtc)hftp0.b_message).i = hdsx0.i;
        ((hdtc)hftp0.b_message).b |= 0x40;
    }
}


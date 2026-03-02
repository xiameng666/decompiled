public final class hdrs {
    public final ProtoLiteBuilder a;

    public hdrs(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdrz a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdrz)hftv0;
    }

    public final void b(hdju hdju0) {
        ibuq.f(hdju0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdrz hdrz0 = (hdrz)hftp0.b_message;
        hdju0.getClass();
        hdrz0.d = hdju0;
        hdrz0.c = 4;
    }

    public final void c(hdrf hdrf0) {
        ibuq.f(hdrf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdrz hdrz0 = (hdrz)hftp0.b_message;
        hdrf0.getClass();
        hdrz0.e = hdrf0;
        hdrz0.b |= 1;
    }

    public final void d(hdtf hdtf0) {
        ibuq.f(hdtf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdrz hdrz0 = (hdrz)hftp0.b_message;
        hdtf0.getClass();
        hdrz0.f = hdtf0;
        hdrz0.b |= 2;
    }
}


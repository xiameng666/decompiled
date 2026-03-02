public final class eilp {
    final eijg a;
    final eicb b;

    public eilp(eijg eijg0, eicb eicb0) {
        this.a = eijg0;
        this.b = eicb0;
        super();
    }

    public final void a(gwhm gwhm0) {
        if(gwhl.a(gwhm0.c) == 7) {
            switch(gwhm0.f) {
                case 5: {
                    this.b.q(24);
                    return;
                }
                case 6: {
                    this.b.q(25);
                }
            }
        }
    }

    public final void b(gwhm gwhm0) {
        if((gwhm0.b & 2) != 0 && (gwhm0.b & 8) != 0) {
            eijg eijg0 = this.a;
            gwha gwha0 = eijg0.c(gwhm0.e);
            if(gwha0 != null) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gwha0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gwha0));
                gwhg gwhg0 = gwhm0.d == null ? gwhg.a : gwhm0.d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gwha gwha1 = (gwha)hftp0.b_message;
                gwhg0.getClass();
                gwha1.i = gwhg0;
                gwha1.b |= 0x80;
                eijg0.g(((gwha)hftp0.N_build()));
            }
        }
    }
}


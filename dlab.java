import android.accounts.Account;

public final class dlab implements dkzz {
    Account a;
    private final cczf b;
    private final String c;

    public dlab(lps lps0, dkvb dkvb0, String s, cczf cczf0) {
        this.b = cczf0;
        this.a = dkvb0.a();
        this.c = s;
        dlaa dlaa0 = new dlaa(this);
        dkvb0.b.g(lps0, dlaa0);
    }

    @Override  // dkzz
    public final void a() {
        this.h(dlab.i(gqsm.dT));
    }

    @Override  // dkzz
    public final void b(boolean z) {
        this.h(dlab.i((z ? gqsm.dZ : gqsm.dY)));
    }

    @Override  // dkzz
    public final void c(boolean z, gqrf gqrf0) {
        this.h(dlab.i((z ? gqsm.eb : gqsm.ea)));
        switch(gqrf0.ordinal()) {
            case 2: {
                this.h(dlab.i(gqsm.ed));
                return;
            }
            case 3: {
                this.h(dlab.i(gqsm.ec));
            }
        }
    }

    @Override  // dkzz
    public final void d(int v, boolean z, Long long0, dkww dkww0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gqwh)hftv0).b |= 1;
        ((gqwh)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gqwh)hftv1).j = (z ? 3 : 2) - 1;
        ((gqwh)hftv1).b |= 0x80;
        String s = this.c;
        if(s != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqwh gqwh0 = (gqwh)hftp0.b_message;
            gqwh0.b |= 2;
            gqwh0.d = s;
        }
        if(long0 != null) {
            hfwn hfwn0 = hfyn.h(long0.longValue());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqwh gqwh1 = (gqwh)hftp0.b_message;
            hfwn0.getClass();
            gqwh1.e = hfwn0;
            gqwh1.b |= 4;
        }
        if(dkww0 != null) {
            if((dkww0.b & 1) != 0) {
                hfwn hfwn1 = dkww0.c == null ? hfwn.a : dkww0.c;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqwh gqwh2 = (gqwh)hftp0.b_message;
                hfwn1.getClass();
                gqwh2.f = hfwn1;
                gqwh2.b |= 8;
            }
            if((2 & dkww0.b) != 0) {
                hfwn hfwn2 = dkww0.d == null ? hfwn.a : dkww0.d;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqwh gqwh3 = (gqwh)hftp0.b_message;
                hfwn2.getClass();
                gqwh3.g = hfwn2;
                gqwh3.b |= 16;
            }
            if((dkww0.b & 4) != 0) {
                hfwn hfwn3 = dkww0.e == null ? hfwn.a : dkww0.e;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqwh gqwh4 = (gqwh)hftp0.b_message;
                hfwn3.getClass();
                gqwh4.h = hfwn3;
                gqwh4.b |= 0x20;
            }
            if((dkww0.b & 8) != 0) {
                hfwn hfwn4 = dkww0.f == null ? hfwn.a : dkww0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gqwh gqwh5 = (gqwh)hftp0.b_message;
                hfwn4.getClass();
                gqwh5.i = hfwn4;
                gqwh5.b |= 0x40;
            }
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqvy gqvy0 = (gqvy)hftp2.b_message;
        gqwh gqwh6 = (gqwh)hftp0.N_build();
        gqwh6.getClass();
        gqvy0.g = gqwh6;
        gqvy0.b |= 16;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqvy gqvy1 = (gqvy)hftp2.N_build();
        gqvy1.getClass();
        gqxs0.k = gqvy1;
        gqxs0.b |= 0x1000;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp1.b_message;
        gqxs gqxs1 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs1.getClass();
        gqxt0.c = gqxs1;
        gqxt0.b |= 1;
        this.h(((gqxt)hftp1.N_build()));
    }

    @Override  // dkzz
    public final void e(boolean z) {
        this.h(dlab.i((z ? gqsm.ef : gqsm.ee)));
    }

    @Override  // dkzz
    public final void f(boolean z, gqrn gqrn0) {
        this.h(dlab.i((z ? gqsm.eh : gqsm.eg)));
        switch(gqrn0.ordinal()) {
            case 1: {
                this.h(dlab.i(gqsm.ei));
                return;
            }
            case 3: {
                this.h(dlab.i(gqsm.ej));
            }
        }
    }

    @Override  // dkzz
    public final void g() {
        this.h(dlab.i(gqsm.dU));
    }

    private final void h(gqxt gqxt0) {
        ((cdgb)this.b).k(((ProtoLiteMessage)gqxt0), (this.a == null ? null : this.a.name));
    }

    private static gqxt i(gqsm gqsm0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.h;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs0 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs0.getClass();
        gqxt0.c = gqxs0;
        gqxt0.b |= 1;
        return (gqxt)hftp0.N_build();
    }
}


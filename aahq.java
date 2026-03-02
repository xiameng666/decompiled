public final class aahq {
    public final aahu a;
    public final aamp b;

    public aahq(aahu aahu0, aamp aamp0) {
        this.a = aahu0;
        this.b = aamp0;
    }

    public final void a(boolean z) {
        aaon aaon0 = this.a.a.b;
        aamp aamp0 = this.b;
        if(z) {
            aauf aauf0 = aaon0.a.l;
            grxw grxw0 = aamp0.f;
            grxw grxw1 = aamp0.g;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqwi.a).v_newBuilder();
            int v = grxw0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gqwi)hftv0).b |= 1;
            ((gqwi)hftv0).c = v;
            int v1 = grxw1.c;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqwi gqwi0 = (gqwi)hftp0.b_message;
            gqwi0.b |= 2;
            gqwi0.d = v1;
            int v2 = grxw0.c;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
            hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gqvy.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gqvy gqvy0 = (gqvy)hftp2.b_message;
            gqwi gqwi1 = (gqwi)hftp0.N_build();
            gqwi1.getClass();
            gqvy0.d = gqwi1;
            gqvy0.b |= 2;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs gqxs0 = (gqxs)hftr0.b_message;
            gqvy gqvy1 = (gqvy)hftp2.N_build();
            gqvy1.getClass();
            gqxs0.k = gqvy1;
            gqxs0.b |= 0x1000;
            gqvx gqvx0 = aauf0.a();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs gqxs1 = (gqxs)hftr0.b_message;
            gqvx0.getClass();
            gqxs1.i = gqvx0;
            gqxs1.b |= 0x80;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqxt gqxt0 = (gqxt)hftp1.b_message;
            gqxs gqxs2 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
            gqxs2.getClass();
            gqxt0.c = gqxs2;
            gqxt0.b |= 1;
            aauf0.e(v2, ((gqxt)hftp1.N_build()));
        }
        if(aamp0.e) {
            aaon0.h(1);
        }
    }
}


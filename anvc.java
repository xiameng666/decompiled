import dagger.internal.Factory;

public final class anvc implements Factory {
    @Override  // ibnf, ibne
    public final Object get() {
        gfsx gfsx0;
        if(anvi.a()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fjau.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fjau fjau0 = (fjau)hftp0.b_message;
            fjau0.b |= 0x20;
            fjau0.d = "GddAndroidAutofillFieldPredictions";
            String s = hqep.a.g().k();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fjau fjau1 = (fjau)hftp0.b_message;
            fjau1.b |= 0x80000;
            fjau1.h = s;
            if(hqep.b() > 0L) {
                long v = hqep.b();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                fjau fjau2 = (fjau)hftp0.b_message;
                fjau2.b |= 0x1000;
                fjau2.f = v;
            }
            anvf anvf0 = new anvf(hftp0);
            fkgs fkgs0 = new fkgs();
            fkgs0.a = new bblp(1, 10);
            fkgs0.c(anvf0);
            gfsx0 = gfsx.m(fkgs0.a());
        }
        else {
            gfsx0 = gfqx.a;
        }
        if(!anva.a()) {
            return gfqx.a;
        }
        ggek ggek0 = new ggek();
        if(gfsx0.i()) {
            Object object0 = gfsx0.d();
            ggek0.i(hggs.bd, object0);
        }
        fkim fkim0 = new fkim();
        fkim0.b = new bblp(1, 10);
        ggeo ggeo0 = ggek0.b();
        fkim0.a.m(ggeo0);
        return gfsx.m(fkim0.a());
    }
}


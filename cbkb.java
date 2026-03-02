import j..time.Duration;

public final class cbkb extends iapa {
    final gRPCMethodDescriptor a;
    final gfug b;

    public cbkb(iaku iaku0, gRPCMethodDescriptor iaoj0, gfug gfug0) {
        this.a = iaoj0;
        this.b = gfug0;
        super(iaku0);
    }

    @Override  // iapa
    public final void a(iapk iapk0, iaof_metadata iaof0) {
        gvju gvju0;
        ibuq.f(iapk0, "status");
        ibuq.f(iaof0, "trailer");
        int v = iapk0.t.r;
        gfug gfug0 = this.b;
        String s = this.a.fullMethodName_;
        Duration duration0 = gfug0.d();
        ibuq.e(duration0, "elapsed(...)");
        gvkq gvkq0 = gvkq.do;
        gvib gvib0 = gvia.a(((hftr)((ProtoLiteMessage)gvij.a).v_newBuilder()));
        gvks gvks0 = gvkr.a(((ProtoLiteMessage)gvki.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvjv.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvjv gvjv0 = (gvjv)hftp0.b_message;
        gvjv0.b |= 1;
        gvjv0.c = s;
        hfst hfst0 = hfyo.a(duration0);
        ibuq.f(hfst0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gvjv gvjv1 = (gvjv)hftp0.b_message;
        hfst0.getClass();
        gvjv1.d = hfst0;
        gvjv1.b |= 2;
        if(v == iaph.a.r) {
            gvju0 = gvju.b;
        }
        else if(v == iaph.b.r) {
            gvju0 = gvju.c;
        }
        else if(v == iaph.c.r) {
            gvju0 = gvju.d;
        }
        else if(v == iaph.d.r) {
            gvju0 = gvju.e;
        }
        else if(v == iaph.e.r) {
            gvju0 = gvju.f;
        }
        else if(v == iaph.f.r) {
            gvju0 = gvju.g;
        }
        else if(v == iaph.g.r) {
            gvju0 = gvju.h;
        }
        else if(v == iaph.h.r) {
            gvju0 = gvju.i;
        }
        else if(v == iaph.i.r) {
            gvju0 = gvju.j;
        }
        else if(v == iaph.j.r) {
            gvju0 = gvju.k;
        }
        else if(v == iaph.k.r) {
            gvju0 = gvju.l;
        }
        else if(v == iaph.l.r) {
            gvju0 = gvju.m;
        }
        else if(v == iaph.m.r) {
            gvju0 = gvju.n;
        }
        else if(v == iaph.n.r) {
            gvju0 = gvju.o;
        }
        else if(v == iaph.o.r) {
            gvju0 = gvju.p;
        }
        else if(v == iaph.p.r) {
            gvju0 = gvju.q;
        }
        else {
            gvju0 = v == iaph.q.r ? gvju.r : gvju.a;
        }
        ibuq.f(gvju0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gvjv)hftp0.b_message).e = gvju0.s;
        ((gvjv)hftp0.b_message).b |= 4;
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((gvjv)hftv0), "value");
        ProtoLiteBuilder hftp1 = gvks0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gvki gvki0 = (gvki)hftp1.b_message;
        ((gvjv)hftv0).getClass();
        gvki0.c = (gvjv)hftv0;
        gvki0.b = 0x1F;
        gvib0.c(gvks0.a());
        cbba.a(gvkq0, gvib0.a());
        gfug0.g();
        super.a(iapk0, iaof0);
    }
}


public final class cqel {
    public final gful_cronetEngineProvider a;
    public final fiyl b;
    public final int c;
    private final int d;

    public cqel(gful_cronetEngineProvider gful0, fiyl fiyl0) {
        this.a = gfus.a(gful0);
        this.b = fiyl0;
        long v = hvem.a.f().c();
        if(v != ((long)(((int)v)))) {
            throw new ArithmeticException();
        }
        this.c = (int)v;
        cdav cdav0 = hvem.d().d;
        if(cdav0 == null) {
            cdav0 = cdav.a;
        }
        this.d = (int)(1.0 / cdav0.c);
    }

    public final int a() {
        return hvem.h() ? this.d : this.c;
    }

    public final void b(int v, cqgx cqgx0) {
        if(!hvem.h() && !this.b.a(((long)this.c))) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        fkpq fkpq0 = fkpq.l;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        int v1 = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cpzt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cpzt)hftp1.b_message).e = v - 1;
        ((cpzt)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cpzr.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((cpzr)hftp2.b_message).c = cqgx0.e;
        ((cpzr)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        cpzt cpzt0 = (cpzt)hftp1.b_message;
        cpzr cpzr0 = (cpzr)hftp2.N_build();
        cpzr0.getClass();
        cpzt0.d = cpzr0;
        cpzt0.c = 3;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        cpzt cpzt1 = (cpzt)hftp1.N_build();
        cpzt1.getClass();
        fkpo1.d = cpzt1;
        fkpo1.c = 5;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((fkpn)hftv1).b |= 4;
        ((fkpn)hftv1).d = "com.google.android.gms";
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        fkpn fkpn0 = (fkpn)hftp3.b_message;
        fkpn0.b |= 16;
        fkpn0.f = "mdisync";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkpn fkpn1 = (fkpn)hftp3.N_build();
        fkpn1.getClass();
        fkpo2.f = fkpn1;
        fkpo2.b |= 2;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    public final void c(int v) {
        if(!hvem.h() && !this.b.a(((long)this.c))) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        fkpq fkpq0 = fkpq.m;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        int v1 = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cpzt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cpzt)hftp1.b_message).e = v - 1;
        ((cpzt)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        cpzt cpzt0 = (cpzt)hftp1.N_build();
        cpzt0.getClass();
        fkpo1.d = cpzt0;
        fkpo1.c = 5;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((fkpn)hftv1).b |= 4;
        ((fkpn)hftv1).d = "com.google.android.gms";
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        fkpn fkpn0 = (fkpn)hftp2.b_message;
        fkpn0.b |= 16;
        fkpn0.f = "mdisync";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkpn fkpn1 = (fkpn)hftp2.N_build();
        fkpn1.getClass();
        fkpo2.f = fkpn1;
        fkpo2.b |= 2;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    public final void d(int v) {
        if(!hvem.h() && !this.b.a(((long)this.c))) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        fkpq fkpq0 = fkpq.n;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        int v1 = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cpzt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cpzt)hftp1.b_message).e = v - 1;
        ((cpzt)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        cpzt cpzt0 = (cpzt)hftp1.N_build();
        cpzt0.getClass();
        fkpo1.d = cpzt0;
        fkpo1.c = 5;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 1;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((fkpn)hftv1).b |= 4;
        ((fkpn)hftv1).d = "com.google.android.gms";
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        fkpn fkpn0 = (fkpn)hftp2.b_message;
        fkpn0.b |= 16;
        fkpn0.f = "mdisync";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkpn fkpn1 = (fkpn)hftp2.N_build();
        fkpn1.getClass();
        fkpo2.f = fkpn1;
        fkpo2.b |= 2;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }

    public final void e(int v, cqgx cqgx0) {
        if(!hvem.h() && !this.b.a(((long)this.c))) {
            return;
        }
        fkpz fkpz0 = (fkpz)this.a.mr();
        fkpq fkpq0 = fkpq.q;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fkpo.a).v_newBuilder();
        int v1 = this.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo0 = (fkpo)hftp0.b_message;
        fkpo0.b |= 1;
        fkpo0.e = v1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)cpzt.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((cpzt)hftp1.b_message).e = v - 1;
        ((cpzt)hftp1.b_message).b |= 1;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)cpzs.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((cpzs)hftp2.b_message).c = cqgx0.e;
        ((cpzs)hftp2.b_message).b |= 1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        cpzt cpzt0 = (cpzt)hftp1.b_message;
        cpzs cpzs0 = (cpzs)hftp2.N_build();
        cpzs0.getClass();
        cpzt0.d = cpzs0;
        cpzt0.c = 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo1 = (fkpo)hftp0.b_message;
        cpzt cpzt1 = (cpzt)hftp1.N_build();
        cpzt1.getClass();
        fkpo1.d = cpzt1;
        fkpo1.c = 5;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)fkpn.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((fkpn)hftv0).b |= 2;
        ((fkpn)hftv0).c = 1;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((fkpn)hftv1).b |= 4;
        ((fkpn)hftv1).d = "com.google.android.gms";
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        fkpn fkpn0 = (fkpn)hftp3.b_message;
        fkpn0.b |= 16;
        fkpn0.f = "mdisync";
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fkpo fkpo2 = (fkpo)hftp0.b_message;
        fkpn fkpn1 = (fkpn)hftp3.N_build();
        fkpn1.getClass();
        fkpo2.f = fkpn1;
        fkpo2.b |= 2;
        fkpz0.a(fkpq0, ((fkpo)hftp0.N_build()));
    }
}


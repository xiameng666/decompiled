public final class bcsi {
    public final bcqx a;

    public bcsi(bcqx bcqx0) {
        this.a = bcqx0;
    }

    public final void a(bcrd bcrd0, hofs hofs0, gmfz gmfz0) {
        this.a.v(bcrd0, hofs0, gmfz0);
    }

    public final void b(bcrd bcrd0, gmfz gmfz0, gmfx gmfx0, String s) {
        this.a.g(bcrd0, gmfz0, gmfx0, s);
    }

    public final void c(bcrd bcrd0, hofs hofs0, gmfz gmfz0, gmfx gmfx0, String s) {
        this.a.l(bcrd0, hofs0, gmfz0, gmfx0, s);
    }

    public final void d(bcrd bcrd0, int v, gmfx gmfx0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmes.a).v_newBuilder();
        gmgb gmgb0 = gmgb.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes0 = (gmes)hftp0.b_message;
        gmes0.e = gmgb0.a();
        gmes0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmfl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gmfl)hftv0).c = 3;
        ((gmfl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gmfl)hftv1).d = v - 2;
        ((gmfl)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmfl gmfl0 = (gmfl)hftp1.b_message;
        gmfl0.f = gmfx0.a();
        gmfl0.b |= 8;
        String s1 = String.valueOf(s);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmfl gmfl1 = (gmfl)hftp1.b_message;
        s1.getClass();
        gmfl1.b |= 16;
        gmfl1.g = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes1 = (gmes)hftp0.b_message;
        gmfl gmfl2 = (gmfl)hftp1.N_build();
        gmfl2.getClass();
        gmes1.k = gmfl2;
        gmes1.b |= 0x40;
        gmes gmes2 = (gmes)hftp0.N_build();
        this.a.y(bcrd0, gmes2);
    }

    public final void e(bcrd bcrd0, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmes.a).v_newBuilder();
        gmgb gmgb0 = gmgb.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes0 = (gmes)hftp0.b_message;
        gmes0.e = gmgb0.a();
        gmes0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmfl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gmfl)hftv0).c = 1;
        ((gmfl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gmfl)hftp1.b_message).d = v - 2;
        ((gmfl)hftp1.b_message).b |= 2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes1 = (gmes)hftp0.b_message;
        gmfl gmfl0 = (gmfl)hftp1.N_build();
        gmfl0.getClass();
        gmes1.k = gmfl0;
        gmes1.b |= 0x40;
        gmes gmes2 = (gmes)hftp0.N_build();
        this.a.y(bcrd0, gmes2);
    }

    public final void f(bcrd bcrd0, int v, long v1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmes.a).v_newBuilder();
        gmgb gmgb0 = gmgb.i;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes0 = (gmes)hftp0.b_message;
        gmes0.e = gmgb0.a();
        gmes0.b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gmfl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gmfl)hftv0).c = 2;
        ((gmfl)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gmfl)hftv1).d = v - 2;
        ((gmfl)hftv1).b |= 2;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gmfl gmfl0 = (gmfl)hftp1.b_message;
        gmfl0.b |= 4;
        gmfl0.e = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmes gmes1 = (gmes)hftp0.b_message;
        gmfl gmfl1 = (gmfl)hftp1.N_build();
        gmfl1.getClass();
        gmes1.k = gmfl1;
        gmes1.b |= 0x40;
        gmes gmes2 = (gmes)hftp0.N_build();
        this.a.y(bcrd0, gmes2);
    }
}


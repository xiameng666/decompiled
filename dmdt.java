public final class dmdt {
    private final dmgi a;

    public dmdt(dmgi dmgi0) {
        this.a = dmgi0;
    }

    public final void a(String s, String s1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hagk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hagk)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hagk)hftp1.b_message).b = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hagk hagk0 = (hagk)hftp1.N_build();
        hagk0.getClass();
        hapr0.ab = hagk0;
        hapr0.c |= 0x8000000;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }

    public final void b() {
        this.h(10, 10);
    }

    public final void c() {
        this.h(9, 12);
    }

    public final void d(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hana.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hana)hftv0).b = s;
        haey haey0 = haey.r;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hana hana0 = (hana)hftp1.b_message;
        hana0.c = haey0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp0.b_message;
        hana hana1 = (hana)hftp1.N_build();
        hana1.getClass();
        hapr0.r = hana1;
        hapr0.b |= 0x200;
        hapr hapr1 = (hapr)hftp0.N_build();
        this.a.b(hapr1);
    }

    public final void e() {
        this.h(4, 6);
    }

    public final void f(int v, int v1) {
        this.g(v, v1, 0);
    }

    public final void g(int v, int v1, int v2) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hagl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hagl)hftv0).b = v - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((hagl)hftv1).c = v1 - 2;
        if(v2 != 0) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            hagl hagl0 = (hagl)hftp0.b_message;
            if(v2 == 1) {
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
            hagl0.d = v2 - 2;
        }
        dmgi dmgi0 = this.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hapr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        hagl hagl1 = (hagl)hftp0.N_build();
        hagl1.getClass();
        hapr0.aZ = hagl1;
        hapr0.e |= 0x1000000;
        dmgi0.b(((hapr)hftp1.N_build()));
    }

    public final void h(int v, int v1) {
        this.g(v, 5, v1);
    }
}


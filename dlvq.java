public final class dlvq {
    private final dmgi a;
    private final dmdi b;

    public dlvq(dmgi dmgi0, dmdi dmdi0) {
        this.a = dmgi0;
        this.b = dmdi0;
    }

    public final void a(hjrn hjrn0, hagi hagi0) {
        hjrx hjrx0;
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hagj.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ibuq.f(hagi0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hagj hagj0 = (hagj)hftp0.b_message;
        hagj0.b = hagi0.a();
        hjry hjry0 = hjry.b(hjrn0.f) == null ? hjry.j : hjry.b(hjrn0.f);
        ibuq.e(hjry0, "getBulletinTemplate(...)");
        ibuq.f(hjry0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hagj hagj1 = (hagj)hftp0.b_message;
        hagj1.d = hjry0.a();
        int v = (hjrn0.h == null ? hjrw.a : hjrn0.h).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hagj)hftp0.b_message).c = v;
        switch(this.b.e()) {
            case 0: {
                hjrx0 = hjrx.a;
                break;
            }
            case 1: {
                hjrx0 = hjrx.b;
                break;
            }
            case 2: {
                hjrx0 = hjrx.c;
                break;
            }
            case 3: {
                hjrx0 = hjrx.d;
                break;
            }
            case 4: {
                hjrx0 = hjrx.e;
                break;
            }
            case 6: {
                hjrx0 = hjrx.f;
                break;
            }
            case 7: {
                hjrx0 = hjrx.g;
                break;
            }
            default: {
                hjrx0 = hjrx.a;
            }
        }
        ibuq.f(hjrx0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hagj hagj2 = (hagj)hftp0.b_message;
        hagj2.e = hjrx0.a();
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((hagj)hftv0), "value");
        ProtoLiteBuilder hftp1 = hafk0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hapr hapr0 = (hapr)hftp1.b_message;
        ((hagj)hftv0).getClass();
        hapr0.ax = (hagj)hftv0;
        hapr0.d |= 0x80000;
        hapr hapr1 = hafk0.a();
        this.a.b(hapr1);
    }

    public final void b(fsak fsak0) {
        ibuq.f(fsak0, "callout");
        this.a(fsak0.f, hagi.d);
    }
}


@ibnh
public final class bwgs extends bwgv {
    private final cfcj a;

    static {
        bboh.b("MetricsLogger", bbcu.fA);
    }

    public bwgs() {
        this.a = cfcj.v();
    }

    @Override  // bwgv
    public final void a(habn habn0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)habu.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        habu habu0 = (habu)hftp0.b_message;
        habu0.b |= 0x80;
        habu0.f = true;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)habt.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)habr.a).v_newBuilder();
        ibuq.f(hftp2, "builder");
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((habr)hftv0).b |= 1;
        ((habr)hftv0).e = 0x2F7C1ACDL;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        habr habr0 = (habr)hftp2.b_message;
        habr0.b |= 2;
        habr0.f = 0x2FB900AFL;
        if(!ibuq.m("1756422979", "<unknown>")) {
            long v = Long.parseLong("1756422979");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            habr habr1 = (habr)hftp2.b_message;
            habr1.b |= 4;
            habr1.g = v;
        }
        if(!ibuq.m("6291a1da-aeb5-4025-89e0-035a36d9b1f2", "<unknown>")) {
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            habr habr2 = (habr)hftp2.b_message;
            habr2.b |= 16;
            habr2.h = "6291a1da-aeb5-4025-89e0-035a36d9b1f2";
        }
        ProtoLiteMessage hftv1 = hftp2.N_build();
        ibuq.e(hftv1, "build(...)");
        ibuq.f(((habr)hftv1), "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habt habt0 = (habt)hftp1.b_message;
        ((habr)hftv1).getClass();
        habt0.c = (habr)hftv1;
        habt0.b |= 1;
        int v1 = (int)htir.a.b().a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        habt habt1 = (habt)hftp1.b_message;
        habt1.b |= 2;
        habt1.d = v1;
        ProtoLiteMessage hftv2 = hftp1.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((habt)hftv2), "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((habt)hftv2).getClass();
        ((habu)hftv3).d = (habt)hftv2;
        ((habu)hftv3).b |= 8;
        if(habn0 != null) {
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((habu)hftp0.b_message).e = habn0;
            ((habu)hftp0.b_message).b |= 16;
        }
        ProtoLiteMessage hftv4 = hftp0.N_build();
        ibuq.e(hftv4, "build(...)");
        this.a.j(((ProtoLiteMessage)(((habu)hftv4))));
    }
}


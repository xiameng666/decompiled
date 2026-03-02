public final class fdnc implements gful_cronetEngineProvider {
    public final fdnd a;
    public final fdni b;

    public fdnc(fdnd fdnd0, fdni fdni0) {
        this.a = fdnd0;
        this.b = fdni0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdom.a).v_newBuilder();
        fdni fdni0 = this.b;
        String s = fdni0.a;
        fdol fdol0 = fdoy.a(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        fdol0.getClass();
        ((fdom)hftv0).c = fdol0;
        ((fdom)hftv0).b |= 1;
        int v = fdni0.g;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdom fdom0 = (fdom)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        fdnd fdnd0 = this.a;
        fdom0.d = v - 1;
        fdom0.b |= 4;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fdop.a).v_newBuilder();
        int v1 = fdni0.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(v1 == 0) {
            throw null;
        }
        ((fdop)hftv1).d = v1 - 1;
        ((fdop)hftv1).b |= 2;
        int v2 = fdni0.e;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        fdop fdop0 = (fdop)hftp1.b_message;
        if(v2 == 0) {
            throw null;
        }
        fdop0.c = v2 - 1;
        fdop0.b |= 1;
        String s1 = fdni0.c;
        if(!gfta.c(s1)) {
            fdor fdor0 = fdnd0.b.b(s, s1);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fdop fdop1 = (fdop)hftp1.b_message;
            fdor0.getClass();
            fdop1.e = fdor0;
            fdop1.b |= 4;
        }
        int v3 = fdni0.f;
        if(v3 != 0) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((fdop)hftp1.b_message).f = v3 - 1;
            ((fdop)hftp1.b_message).b |= 8;
        }
        fdop fdop2 = (fdop)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        fdop2.getClass();
        ((fdom)hftv2).f = fdop2;
        ((fdom)hftv2).b |= 16;
        int v4 = fdni0.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdom fdom1 = (fdom)hftp0.b_message;
        fdom1.b |= 0x40;
        fdom1.h = v4;
        return fdnd.d(((fdom)hftp0.N_build()));
    }
}


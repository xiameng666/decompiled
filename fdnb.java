public final class fdnb implements gful_cronetEngineProvider {
    public final fdnd a;
    public final fdng b;

    public fdnb(fdnd fdnd0, fdng fdng0) {
        this.a = fdnd0;
        this.b = fdng0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdom.a).v_newBuilder();
        fdng fdng0 = this.b;
        fduq fduq0 = fdng0.a;
        String s = fduq0.a.b;
        fdol fdol0 = fdoy.a(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        fdol0.getClass();
        ((fdom)hftv0).c = fdol0;
        ((fdom)hftv0).b |= 1;
        int v = fdng0.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdom fdom0 = (fdom)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        fdom0.d = v - 1;
        fdom0.b |= 4;
        int v1 = fduq0.b.c().length;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdnd fdnd0 = this.a;
        fdom fdom1 = (fdom)hftp0.b_message;
        fdom1.b |= 0x40;
        fdom1.h = v1;
        fdun fdun0 = fduq0.b;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fdoi.a).v_newBuilder();
        int v2 = fdng0.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        if(v2 == 0) {
            throw null;
        }
        ((fdoi)hftv1).c = v2 - 1;
        ((fdoi)hftv1).b |= 1;
        int v3 = fdng0.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        fdoi fdoi0 = (fdoi)hftp1.b_message;
        if(v3 == 0) {
            throw null;
        }
        fdoi0.d = v3 - 1;
        fdoi0.b |= 2;
        fdor fdor0 = fdnd0.b.b(s, fdun0.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fdoi fdoi1 = (fdoi)hftp1.b_message;
        fdor0.getClass();
        fdoi1.f = fdor0;
        fdoi1.b |= 8;
        if(fdun0.d != null) {
            boolean z = Boolean.TRUE.equals(fdun0.d);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            fdoi fdoi2 = (fdoi)hftp1.b_message;
            fdoi2.b |= 4;
            fdoi2.e = z;
        }
        fdoi fdoi3 = (fdoi)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdom fdom2 = (fdom)hftp0.b_message;
        fdoi3.getClass();
        fdom2.e = fdoi3;
        fdom2.b |= 8;
        return fdnd.d(((fdom)hftp0.N_build()));
    }
}


public final class fdna implements gful_cronetEngineProvider {
    public final String a;
    public final fdog b;
    public final int c;
    public final int d;

    public fdna(String s, int v, fdog fdog0, int v1) {
        this.a = s;
        this.d = v;
        this.b = fdog0;
        this.c = v1;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fdom.a).v_newBuilder();
        fdol fdol0 = fdoy.a(this.a);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        fdol0.getClass();
        ((fdom)hftv0).c = fdol0;
        ((fdom)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((fdom)hftv1).d = this.d - 1;
        ((fdom)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        this.b.getClass();
        ((fdom)hftv2).g = this.b;
        ((fdom)hftv2).b |= 0x20;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        fdom fdom0 = (fdom)hftp0.b_message;
        fdom0.b |= 0x40;
        fdom0.h = this.c;
        return fdnd.d(((fdom)hftp0.N_build()));
    }
}


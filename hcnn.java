public final class hcnn {
    private final ProtoLiteBuilder a;

    public hcnn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hcno a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcno)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcno hcno0 = (hcno)hftp0.b_message;
        hcno0.b |= 2;
        hcno0.d = v;
    }

    public final void c() {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcno hcno0 = (hcno)hftp0.b_message;
        hcno0.b |= 1;
        hcno0.c = 3;
    }
}


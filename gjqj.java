public final class gjqj {
    public final ProtoLiteBuilder a;

    public gjqj(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjws a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjws)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjws gjws0 = (gjws)hftp0.b_message;
        gjws0.b |= 1;
        gjws0.e = v;
    }

    public final void c(long v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjws gjws0 = (gjws)hftp0.b_message;
        gjws0.b |= 2;
        gjws0.f = v;
    }

    public final void d(boolean z) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjws gjws0 = (gjws)hftp0.b_message;
        gjws0.b |= 4;
        gjws0.g = z;
    }

    public final void e(gjwr gjwr0) {
        ibuq.f(gjwr0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjws gjws0 = (gjws)hftp0.b_message;
        gjwr0.getClass();
        gjws0.d = gjwr0;
        gjws0.c = 6;
    }
}


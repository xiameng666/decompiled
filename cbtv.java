public final class cbtv implements ibts {
    public final gged_interceptors a;
    public final boolean b;

    public cbtv(gged_interceptors gged0, boolean z) {
        this.a = gged0;
        this.b = z;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gvhd gvhd0 = gvhc.a(((ProtoLiteMessage)gvhk.a).v_newBuilder());
        gvhb gvhb0 = gvha.a(((ProtoLiteMessage)gvhj.a).v_newBuilder());
        int v = this.a == null ? 0 : this.a.size();
        ProtoLiteBuilder hftp0 = gvhb0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gvhj)hftv0).b |= 1;
        ((gvhj)hftv0).c = v;
        if(this.b) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvhj gvhj0 = (gvhj)hftp0.b_message;
            gvhj0.b |= 8;
            gvhj0.e = true;
        }
        gvhd0.b(gvhb0.a());
        ((gvhy)object0).b(gvhd0.a());
        return ibom.a;
    }
}


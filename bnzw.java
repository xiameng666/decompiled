public final class bnzw implements bodh {
    public final bodi a;
    public final bntw b;

    public bnzw(bodi bodi0, bntw bntw0) {
        this.a = bodi0;
        this.b = bntw0;
    }

    @Override  // bodh
    public final Object a(gfsx gfsx0, fqzu fqzu0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtbl.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtbl)hftv0).b = 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gtbl)hftv1).c = 3;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtbl)hftp0.b_message).d = true;
        gtbl gtbl0 = (gtbl)hftp0.N_build();
        return gdta.g(this.a.r.h(gtbl0)).i(new bobq(this.a, this.b, gfsx0, fqzu0), this.a.n);
    }
}


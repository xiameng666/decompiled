import com.google.android.gms.growth.ui.webview.GrowthWebViewChimeraActivity;

public final class bvug implements gfsi {
    public final GrowthWebViewChimeraActivity a;
    public final String b;

    public bvug(GrowthWebViewChimeraActivity growthWebViewChimeraActivity0, String s) {
        this.a = growthWebViewChimeraActivity0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqpz.a).v_newBuilder();
        GrowthWebViewChimeraActivity growthWebViewChimeraActivity0 = this.a;
        String s = growthWebViewChimeraActivity0.t;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gqpz)hftv0).b |= 2;
        ((gqpz)hftv0).d = s;
        int v = growthWebViewChimeraActivity0.u;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gqpz)hftv1).b |= 4;
        ((gqpz)hftv1).e = v;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqpz gqpz0 = (gqpz)hftp0.b_message;
        this.b.getClass();
        gqpz0.b |= 8;
        gqpz0.f = this.b;
        growthWebViewChimeraActivity0.n.e(hftp0);
        bvrf bvrf0 = growthWebViewChimeraActivity0.v;
        String s1 = growthWebViewChimeraActivity0.t;
        int v1 = growthWebViewChimeraActivity0.u;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqyb.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gqyb)hftp1.b_message).d = 7;
        ((gqyb)hftp1.b_message).b |= 2;
        bvrf0.b(s1, v1, hftp1);
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)(((gqqc)object0))).jf(5, null);
        hftp2.X(((ProtoLiteMessage)(((gqqc)object0))));
        int v2 = ((gqqc)object0).c + 1;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gqqc gqqc0 = (gqqc)hftp2.b_message;
        gqqc0.b |= 1;
        gqqc0.c = v2;
        return (gqqc)hftp2.N_build();
    }
}


import android.content.Context;

public final class eqto extends eqtq {
    public eqto(Context context0) {
        super(context0);
    }

    @Override  // eqtq
    public final gscm a(gscl gscl0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsck.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gsck)hftp0.b_message).b = "";
        gsck gsck0 = (gsck)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gscm.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gscm gscm0 = (gscm)hftp1.b_message;
        gscm0.c = gqoq.a(4);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        gsck0.getClass();
        ((gscm)hftv0).d = gsck0;
        ((gscm)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gscm)hftp1.b_message).e = "smartdevice.e2e.test";
        return (gscm)hftp1.N_build();
    }

    @Override  // eqtq
    public final gsco b(gscn gscn0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gsco.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqoh.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(new byte[]{1, 2, 3});
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gqoh gqoh0 = (gqoh)hftp1.b_message;
        gqoh0.b |= 1;
        gqoh0.c = hfsf0;
        gqoh gqoh1 = (gqoh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gsco gsco0 = (gsco)hftp0.b_message;
        gqoh1.getClass();
        gsco0.c = gqoh1;
        gsco0.b |= 1;
        return (gsco)hftp0.N_build();
    }

    @Override  // eqtq
    public final gscr c(gscq gscq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gscr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gscr gscr0 = (gscr)hftp0.b_message;
        gscr0.b = gqoq.a(6);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gscr)hftv0).e = "123";
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gscr)hftv1).g = "smartdevice.e2e.test";
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gscr)hftp0.b_message).f = "http://127.0.0.1:8287/auth/fallback_url";
        return (gscr)hftp0.N_build();
    }

    @Override  // eqtq
    public final void d() {
    }
}


import android.content.Context;

public final class aqzt {
    public final Context a;
    private final aqqk b;

    public aqzt(Context context0, aqqk aqqk0) {
        this.a = context0;
        this.b = aqqk0;
    }

    public final void a(String s, int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gigd.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gigd)hftv0).c = 1;
        ((gigd)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gigd)hftv1).e = v - 1;
        ((gigd)hftv1).b |= 4;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gigd gigd0 = (gigd)hftp1.b_message;
        s.getClass();
        gigd0.b |= 2;
        gigd0.d = s;
        gigd gigd1 = (gigd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gigd1.getClass();
        ghys0.ag = gigd1;
        ghys0.d |= 0x100;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.b.a(ghys1, ghyr.at);
    }
}


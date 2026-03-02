import android.content.Context;

public final class aqqp {
    private final aqqk a;

    public aqqp(Context context0) {
        this.a = new aqqk(context0);
    }

    public final void a(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gign.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gign)hftp0.b_message).c = v - 1;
        ((gign)hftp0.b_message).b |= 1;
        gign gign0 = (gign)hftp0.N_build();
        ProtoLiteBuilder hftp1 = aqra.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gign0.getClass();
        ghys0.K = gign0;
        ghys0.c |= 0x2000;
        ghys ghys1 = (ghys)hftp1.N_build();
        this.a.a(ghys1, ghyr.R);
    }
}


import android.content.Context;

public final class arza {
    private final aqqk a;

    public arza(Context context0) {
        this.a = new aqqk(context0, null);
    }

    public final void a(ghys ghys0) {
        this.a.a(ghys0, ghyr.af);
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigi.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gigi)hftv0).c = 2;
        ((gigi)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gigi)hftp0.b_message).d = v - 1;
        ((gigi)hftp0.b_message).b |= 2;
        gigi gigi0 = (gigi)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gigi0.getClass();
        ghys0.Y = gigi0;
        ghys0.c |= 0x10000000;
        this.a(((ghys)hftp1.N_build()));
    }
}


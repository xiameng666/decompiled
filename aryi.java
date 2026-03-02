import android.content.Context;

public final class aryi {
    private final aqqk a;

    public aryi(Context context0) {
        this.a = new aqqk(context0, null);
    }

    public final void a(ghys ghys0) {
        this.a.a(ghys0, ghyr.ae);
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidu.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gidu)hftv0).c = 5;
        ((gidu)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gidu)hftp0.b_message).d = v - 1;
        ((gidu)hftp0.b_message).b |= 2;
        gidu gidu0 = (gidu)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidu0.getClass();
        ghys0.X = gidu0;
        ghys0.c |= 0x8000000;
        this.a(((ghys)hftp1.N_build()));
    }
}


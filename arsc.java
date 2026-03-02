import android.content.Context;

public final class arsc {
    public static void a(Context context0, int v) {
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gidl)hftp1.b_message).c = v - 1;
        ((gidl)hftp1.b_message).b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidl gidl0 = (gidl)hftp1.N_build();
        gidl0.getClass();
        ghys0.A = gidl0;
        ghys0.b |= 0x20000000;
        if(!hqhq.a.j().at()) {
            return;
        }
        int v1 = (int)hqlt.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys1 = (ghys)hftp0.b_message;
        ghys1.b |= 0x200000;
        ghys1.w = v1;
        new aqqk(context0).a(((ghys)hftp0.N_build()), ghyr.y);
    }
}


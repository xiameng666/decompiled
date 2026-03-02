import android.content.Context;
import android.os.UserHandle;

public final class fcru {
    private final aqqk a;

    public fcru(Context context0) {
        this.a = new aqqk(context0);
    }

    public final void a(giaq giaq0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
        int v = UserHandle.myUserId();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ghys)hftv0).b |= 2;
        ((ghys)hftv0).f = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        giaq0.getClass();
        ghys0.k = giaq0;
        ghys0.b |= 0x200;
        ghys ghys1 = (ghys)hftp0.N_build();
        this.a.a(ghys1, ghyr.f);
    }

    public final void b(int v, gico gico0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gigp.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gigp)hftv0).c = v - 1;
        boolean z = true;
        ((gigp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gigp)hftv1).d = gico0.q;
        ((gigp)hftv1).b |= 2;
        if(gico0 != gico.p) {
            z = false;
        }
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        gigp gigp0 = (gigp)hftp0.b_message;
        gigp0.b |= 4;
        gigp0.e = z;
        gigp gigp1 = (gigp)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((giaq)hftv2).e = 17;
        ((giaq)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        giaq giaq0 = (giaq)hftp1.b_message;
        gigp1.getClass();
        giaq0.n = gigp1;
        giaq0.b |= 0x4000;
        this.a(((giaq)hftp1.N_build()));
    }
}

